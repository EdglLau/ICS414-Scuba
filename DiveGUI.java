import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/  
public class DiveGUI extends JFrame {

	private JPanel contentPane;
	private JTextField depthField;
	private JTextField durationField;
	private JLabel lblDivecount;
	private JTextField surfaceField;
	private int currentDiveDepth;
	private int currentDiveDuration;
	private int nextPotentialDive;
	private int surfaceTime;
	private int diveCount;
	private char currentGroup;
	private DiveTable table1;
	private DiveTable2 table2;
	private DiveTable3 table3;

/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/ 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiveGUI frame = new DiveGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/ 
	/**
	 * Create the frame.
	 */
	public DiveGUI() {
		table1 = new DiveTable();
		table2 = new DiveTable2();
		table3 = new DiveTable3();
		currentGroup = '0';
		diveCount = 0;
		setTitle("Dive GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		depthField = new JTextField();
		depthField.setText("0");
		depthField.setBounds(122, 11, 86, 20);
		contentPane.add(depthField);
		depthField.setColumns(10);
		
		JLabel lblDiveDepth = new JLabel("Dive Depth (ft):");
		lblDiveDepth.setBounds(10, 14, 102, 14);
		contentPane.add(lblDiveDepth);
		
		JLabel lblDiveDurationmin = new JLabel("Dive Duration (min):");
		lblDiveDurationmin.setBounds(10, 41, 102, 14);
		contentPane.add(lblDiveDurationmin);
		
		durationField = new JTextField();
		durationField.setText("0");
		durationField.setBounds(122, 42, 86, 20);
		contentPane.add(durationField);
		durationField.setColumns(10);


		
		JLabel lblSurfaceTimemin = new JLabel("Surface Time");
		lblSurfaceTimemin.setBounds(10, 72, 102, 14);
		contentPane.add(lblSurfaceTimemin);
		
		surfaceField = new JTextField();
		surfaceField.setText("HH:MM");
		surfaceField.setBounds(122, 69, 86, 20);
		contentPane.add(surfaceField);
		surfaceField.setColumns(10);
		
		JButton btnCalc = new JButton("Calc");
		btnCalc.setBounds(23, 146, 89, 23);
		contentPane.add(btnCalc);
		
        btnCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                    calcDive(arg0);
            }
        });
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(122, 146, 89, 23);
		contentPane.add(btnReset);
		
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				resetCount(arg0);
			}
		});
		
		lblDivecount = new JLabel("DiveCount: " + diveCount);
		lblDivecount.setBounds(235, 14, 172, 14);
		contentPane.add(lblDivecount);
		
	}
/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/ 
	//Calculates to see if the dive is safe or not
	private void calcDive(ActionEvent bob){
		try{
			if(isTimeValid() == true){
				if(diveCount == 0){
					
					currentDiveDepth = Integer.parseInt(depthField.getText());
					currentDiveDuration = Integer.parseInt(durationField.getText());
					surfaceTime = table2.convertTime(surfaceField.getText());
					//considers any dive under 40ft to be 40ft for planning dives
					if(currentDiveDepth < 40){
						currentDiveDepth = 40;
					}
					currentDiveDepth = table1.roundUp(currentDiveDepth);
					table1.depthGroup(currentDiveDepth, currentDiveDuration);
					currentGroup = table1.getLetter();
					isSafe();
					
				}else{
					//Calculates the second dive
					
					//rounds up the next dive depth
					nextPotentialDive = table1.roundUp(Integer.parseInt(depthField.getText()));
					
					//considers any dive under 40ft to be 40ft for planning dives
					if(nextPotentialDive < 40){
						nextPotentialDive = 40;
					}
					String temp = "";
					int tempnumber = 0;
					
					//Calculates new letter based on next dive
					table2.newLetter(currentGroup, surfaceTime);
					//sets currentgroup letter to groupletter for table 3
					currentGroup = table2.getLetter();
					
					//converts the groupletter to an int because of how table 3 works
					tempnumber = table3.convertLetter(currentGroup);
					
					//converts depth to one of the int cases because of how table 3 works 				
					int tempdepth = table3.convertDepth(nextPotentialDive);
					
					//gets the RNT and AMDT and puts it in a string
					//RNT is in [0] and AMDT is in [1]
					temp = table3.getValues(tempnumber, tempdepth);
					String[] tempStorage = temp.split("\\s+");		
					
					int maximumDiveTime = 0;				
					// if AMDT is X, do not dive
					if(!tempStorage[1].equals("X")){
						
						maximumDiveTime = Integer.parseInt(tempStorage[1]);
						
						//sets currentdiveduration number to residual nitrogen time
						currentDiveDuration = Integer.parseInt(tempStorage[0]);
						
						//asks for input for the new time
						boolean done = true;
						do{
						temp = JOptionPane.showInputDialog(null, "The maximum divetime on the next dive cannot exceed " + maximumDiveTime +
								"\n Please enter your dive time");
							if(Integer.parseInt(temp) > maximumDiveTime){
								JOptionPane.showMessageDialog(null, "Divetime must be less than or equal to " + maximumDiveTime, "Warning", JOptionPane.INFORMATION_MESSAGE);
							}else{
								currentDiveDuration += Integer.parseInt(temp);
								done = false;
							}
						}while(done);
						
					
						diveCount++;
						lblDivecount.setText("DiveCount: " + diveCount);
						//sets the depth to the next dive
						currentDiveDepth = nextPotentialDive;
						
						//gets the new surface time for the next dive
						surfaceTime = table2.convertTime(surfaceField.getText());
						
						//calculates the group letter for table 3 for the next dive
						table1.depthGroup(currentDiveDepth, currentDiveDuration);
						currentGroup = table1.getLetter();
						isSafe();
					}else{
						JOptionPane.showMessageDialog(null, "Your next dive isn't safe", "Warning", JOptionPane.INFORMATION_MESSAGE);
					}
				}	
			}else{
				JOptionPane.showMessageDialog(null, "Enter valid time in the format HH:MM", "Warning", JOptionPane.INFORMATION_MESSAGE);
			}
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Only numbers please", "Input Error", JOptionPane.ERROR_MESSAGE);
		}
	}
/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/ 	
	//resets the fields and dive count back to 0
	private void resetCount(ActionEvent bill){
		diveCount = 0;
		currentDiveDepth = 0;
		currentDiveDuration = 0;
		surfaceTime = 0;
		lblDivecount.setText("DiveCount: " + diveCount);
		depthField.setText("");
		durationField.setText("");
		surfaceField.setText("HH:MM");
		
		
	}
	//if groupletter is defaulted to Z, it means that it isn't safe
	//if it is safe, divecount is incremented
	private void isSafe(){
		if(currentGroup == 'Z'){
			JOptionPane.showMessageDialog(null, "Dive is not safe", "Message", JOptionPane.INFORMATION_MESSAGE);
		}else{
			diveCount++;
			JOptionPane.showMessageDialog(null, "Dive is safe", "Message", JOptionPane.INFORMATION_MESSAGE);
			lblDivecount.setText("DiveCount: " + diveCount);
		}
	}
/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/ 	
	//checks to see if surface time is valid
	private boolean isTimeValid(){
		if(surfaceField.getText().contains(":")){
			
			if(surfaceField.getText().length() == 5){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
}