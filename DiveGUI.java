import java.awt.BorderLayout;
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
import javax.swing.JSlider;

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
		setBounds(100, 100, 447, 219);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		depthField = new JTextField();
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
		
		lblDivecount = new JLabel("DiveCount: ");
		lblDivecount.setBounds(235, 14, 172, 14);
		contentPane.add(lblDivecount);
	}
	
	private void calcDive(ActionEvent bob){
		try{
			if(diveCount == 0){
				diveCount++;
				currentDiveDepth = Integer.parseInt(depthField.getText());
				currentDiveDuration = Integer.parseInt(durationField.getText());
				surfaceTime = table2.convertTime(surfaceField.getText());
				currentDiveDepth = table1.roundUp(currentDiveDepth);
				table1.depthGroup(currentDiveDepth, currentDiveDuration);
				currentGroup = table1.getLetter();
				JOptionPane.showMessageDialog(null,currentGroup, "Letter Group", JOptionPane.INFORMATION_MESSAGE);
				lblDivecount.setText("DiveCount: " + diveCount);
			}else{
				
				nextPotentialDive = Integer.parseInt(depthField.getText());
				String temp = "";
				int tempnumber = 0;
				table2.newLetter(currentGroup, surfaceTime);
				//Group is now the new Group Letter
				currentGroup = table2.getLetter();
				
				tempnumber = table3.convertLetter(currentGroup);
				
				//converts depth to one of the int cases because of how the table works 				
				int tempdepth = table3.convertDepth(nextPotentialDive);
				
				//gets the RNT and AMDT
				temp = table3.getValues(tempnumber, tempdepth);
				String[] tempStorage = temp.split("\\s+");
				
				int maximumDiveTime = 0;
				if(!tempStorage[1].equals("X")){
				
					maximumDiveTime = Integer.parseInt(tempStorage[1]);
				JOptionPane.showMessageDialog(null, "The maximum dive time on the next dive cannot exceed " + maximumDiveTime + 
						"\n Your next dive is still safe", "Safe", JOptionPane.INFORMATION_MESSAGE);
				diveCount++;
				lblDivecount.setText("DiveCount: " + diveCount);
				//sets the depth to the next dive
				currentDiveDepth = nextPotentialDive;
				//gets the new surfacetime for the next dive
				surfaceTime = table2.convertTime(surfaceField.getText());
				}else{
					JOptionPane.showMessageDialog(null, "Your next dive isn't safe", "Warning", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Only numbers please", "Input Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void resetCount(ActionEvent bill){
		diveCount = 0;
		currentDiveDepth = 0;
		currentDiveDuration = 0;
		surfaceTime = 0;
		
	}
}
