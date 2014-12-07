/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/  
public class DiveTable2 {
	private char letterGroup;
	
	public void newLetter(char letter, int time){
        switch(letter){
        case 'A':
            groupA(time);
            break;
        case 'B':
            groupB(time);
            break;
        case 'C':
            groupC(time);
            break;
        case 'D':
            groupD(time);
            break;
        case 'E':
            groupE(time);
            break;
        case 'F':
            groupF(time);
            break;
        case 'G':
            groupG(time);
            break;
        case 'H':
            groupH(time);
            break;
        case 'I':
            groupI(time);
            break;
        case 'J':
            groupJ(time);
            break;
        case 'K':
            groupK(time);
            break;
        case 'L':
            groupL(time);
            break;
        }

    
	}
    public void groupA(int time){
    	if(time >= 10 && time <= 1440){
    		setLetter('A');
    	}
    }
    public void groupB(int time){
    	if(time >= 201){
    		setLetter('A');
    	}else if(time > 10){
    		setLetter('B');
    	}
    }
    public void groupC(int time){
    	if(time >= 290){
    		setLetter('A');
    	}else if(time >= 100){
    		setLetter('B');
    	}else if(time >= 10){
    		setLetter('C');
    	}
    }
    public void groupD(int time){
    	if(time >= 349){
    		setLetter('A');
    	}else if(time >= 159){
    		setLetter('B');
    	}else if(time >= 70){
    		setLetter('C');
    	}else if(time >= 10){
    		setLetter('D');
    	}
    }
    public void groupE(int time){
    	if(time >= 395){
    		setLetter('A');
    	}else if(time >= 205){
    		setLetter('B');
    	}else if(time >= 118){
    		setLetter('C');
    	}else if(time >= 55){
    		setLetter('D');
    	}else if(time >= 10){
    		setLetter('E');
    	}
    }
    public void groupF(int time){
    	if(time >= 426){
    		setLetter('A');
    	}else if(time >= 238){
    		setLetter('B');
    	}else if(time >= 149){
    		setLetter('C');
    	}else if(time >= 90){
    		setLetter('D');
    	}else if(time >= 46){
    		setLetter('E');
    	}else if(time >= 10){
    		setLetter('F');
    	}
    }
    public void groupG(int time){
    	if(time >= 456){
    		setLetter('A');
    	}else if(time >= 266){
    		setLetter('B');
    	}else if(time >= 179){
    		setLetter('C');
    	}else if(time >= 120){
    		setLetter('D');
    	}else if(time >= 76){
    		setLetter('E');
    	}else if(time >= 41){
    		setLetter('F');
    	}else if(time >= 10){
    		setLetter('G');
    	}
    }
    public void groupH(int time){
    	if(time >= 480){
    		setLetter('A');
    	}else if(time >= 290){
    		setLetter('B');
    	}else if(time >= 201){
    		setLetter('C');
    	}else if(time >= 144){
    		setLetter('D');
    	}else if(time >= 102){
    		setLetter('E');
    	}else if(time >= 67){
    		setLetter('F');
    	}else if(time >= 37){
    		setLetter('G');
    	}else if(time >= 10){
    		setLetter('H');
    	}
    }
    public void groupI(int time){
    	if(time >= 502){
    		setLetter('A');
    	}else if(time >= 313){
    		setLetter('B');
    	}else if(time >= 224){
    		setLetter('C');
    	}else if(time >= 165){
    		setLetter('D');
    	}else if(time >= 123){
    		setLetter('E');
    	}else if(time >= 90){
    		setLetter('F');
    	}else if(time >= 60){
    		setLetter('G');
    	}else if(time >= 34){
    		setLetter('H');
    	}else if(time >= 10){
    		setLetter('I');
    	}
    }
    public void groupJ(int time){
    	if(time >= 531){
    		setLetter('A');
    	}else if(time >= 341){
    		setLetter('B');
    	}else if(time >= 243){
    		setLetter('C');
    	}else if(time >= 185){
    		setLetter('D');
    	}else if(time >= 141){
    		setLetter('E');
    	}else if(time >= 108){
    		setLetter('F');
    	}else if(time >= 80){
    		setLetter('G');
    	}else if(time >= 55){
    		setLetter('H');
    	}else if(time >= 32){
    		setLetter('I');
    	}else if(time >= 10){
    		setLetter('J');
    	}
    }
    public void groupK(int time){
    	if(time >= 539){
    		setLetter('A');
    	}else if(time >= 349){
    		setLetter('B');
    	}else if(time >= 260){
    		setLetter('C');
    	}else if(time >= 202){
    		setLetter('D');
    	}else if(time >= 159){
    		setLetter('E');
    	}else if(time >= 124){
    		setLetter('F');
    	}else if(time >= 96){
    		setLetter('G');
    	}else if(time >= 72){
    		setLetter('H');
    	}else if(time >= 50){
    		setLetter('I');
    	}else if(time >= 29){
    		setLetter('J');
    	}else if(time >= 10){
    		setLetter('K');
    	}
    }
    public void groupL(int time){
    	if(time >= 553){
    		setLetter('A');
    	}else if(time >= 363){
    		setLetter('B');
    	}else if(time >= 276){
    		setLetter('C');
    	}else if(time >= 217){
    		setLetter('D');
    	}else if(time >= 174){
    		setLetter('E');
    	}else if(time >= 140){
    		setLetter('F');
    	}else if(time >= 110){
    		setLetter('G');
    	}else if(time >= 86){
    		setLetter('H');
    	}else if(time >= 65){
    		setLetter('I');
    	}else if(time >= 46){
    		setLetter('J');
    	}else if(time >= 27){
    		setLetter('K');
    	}else if(time >= 10){
    		setLetter('L');
    	}
    }
    
    public int convertTime(String time){
    	String[] placeHolder = time.split(":");
    	int hour = 0;
    	hour = Integer.parseInt(placeHolder[0]);
    	hour = hour * 60;
    	
    	int minutes = 0;
    	minutes = Integer.parseInt(placeHolder[1]);
    	minutes = hour + minutes;
    	
    	return minutes;
    }
    
    private void setLetter(char letter){
    	this.letterGroup = letter;
    }
    
    public char getLetter(){
    	return letterGroup;
    }
}