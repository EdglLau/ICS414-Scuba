package Divetable;

import java.util.Scanner;

/**
 * DISCLAIMER: This system is a PROTOTYPE and cannot be used to plan real dives. 
 * @author Edgar Lau
 *
 */

/**
 * DISCLAIMER: This system is a PROTOTYPE and cannot be used to plan real dives. 
 * @author Edgar Lau
 *
 */


public class DiveTable {
  private int depth;
  private int time;
  private char letter;
  private boolean warning = false;
  private int warningNum = 0;
  Scanner scanner = new Scanner(System.in);
  
  public DiveTable() {
    System.out.println("Please input depth");
    int temp = scanner.nextInt();
    depth = roundUp(temp);
    if(depth < 40) {
      depth = 40;
    }
    System.out.println("Please input time");
    time = scanner.nextInt();
    
    System.out.println(depth + " " + time);
    
    depthGroup(depth, time);
    
    System.out.println(depth + " " + time + " " + letter);
    if(letter == 'Z') {
      System.out.println("Unsafe");
    }
    
    if(warning == true) {
      System.out.println("Stop time at 15 ft: " + warningNum);
    }
  }
  
  private int roundUp(int dep) {
    int temp = dep;
    if(dep % 10 != 0) {
      temp = dep % 10;
      temp = 10 - temp;
      temp = temp + dep;
      
    }
    return temp;
    
  }
  
  private void depthGroup(int depthValue, int time) {
    switch(depthValue) {
      case 40:
        depth40(time);
        break;
      case 50:
        depth50(time);
        break;
      case 60:
        depth60(time);
        break;
      case 70:
        depth70(time);
        break;
      case 80:
        depth80(time);
        break;
      case 90:
        depth90(time);
        break;
      case 100:
        depth100(time);
        break;
      case 110:
        depth110(time);
        break;
      case 120:
        depth120(time);
        break;
      case 130:
        depth130(time);
        break;
      default:
        setLetter('Z');
        
        
    }
    
    
  }
  
  public void setDepth(int depth) {
    this.depth = depth;
  }
  
  private void depth40(int time) {
    if(time <= 5) {
      setLetter('A');
    }
    else if(time > 5 && time <= 15) {
      setLetter('B');
    }
    else if(time > 15 && time <= 25) {
      setLetter('C');
    }
    else if(time > 25 && time <= 30) {
      setLetter('D');
    }
    else if(time > 30 && time <= 40) {
      setLetter('E');
    }
    else if(time > 40 && time <= 50) {
      setLetter('F');
    }
    else if(time > 50 && time <= 70) {
      setLetter('G');
    }
    else if(time > 70 && time <= 80) {
      setLetter('H');
    }
    else if(time > 80 && time <= 100) {
      setLetter('I');
    }
    else if(time > 100 && time <= 110) {
      setLetter('J');
    }
    else if(time > 110 && time <= 130) {
      setLetter('K');
    }
    else if(time > 130 && time <= 150) {
      setLetter('L');
    }
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth50(int time) {
    if(time <= 10) {
      setLetter('B');
    }
    else if(time > 10 && time <= 15) {
      setLetter('C');
    }
    else if(time > 15 && time <= 25) {
      setLetter('D');
    }
    else if(time > 25 && time <= 30) {
      setLetter('E');
    }
    else if(time > 30 && time <= 40) {
      setLetter('F');
    }
    else if(time > 40 && time <= 50) {
      setLetter('G');
    }
    else if(time > 50 && time <= 60) {
      setLetter('H');
    }
    else if(time > 60 && time <= 70) {
      setLetter('I');
    }
    else if(time > 70 && time <= 80) {
      setLetter('J');
    }
    else if(time > 80 && time <= 100) {
      setLetter('L');
    }
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth60(int time) {
    if(time <= 10) {
      setLetter('B');
    }
    else if(time > 10 && time <= 15) {
      setLetter('C');
    }
    else if(time > 15 && time <= 20) {
      setLetter('D');
    }
    else if(time > 20 && time <= 25) {
      setLetter('E');
    }
    else if(time > 25 && time <= 30) {
      setLetter('F');
    }
    else if(time > 30 && time <= 40) {
      setLetter('G');
    }
    else if(time > 40 && time <= 50) {
      setLetter('H');
    }
    else if(time > 50 && time <= 55) {
      setLetter('I');
    }
    else if(time > 55 && time <= 60) {
      setLetter('J');
      warning = true;
      warningNum = 5;
    }
    else if(time > 60 && time <= 80) {
      setLetter('L');
      warning = true;
      warningNum = 7;
    }
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth70(int time) {
    if(time <= 5) {
      setLetter('B');
    }
    else if(time > 5 && time <= 10) {
      setLetter('C');
    }
    else if(time > 10 && time <= 15) {
      setLetter('D');
    }
    else if(time > 15 && time <= 20) {
      setLetter('E');
    }
    else if(time > 20 && time <= 30) {
      setLetter('F');
    }
    else if(time > 30 && time <= 35) {
      setLetter('G');
    }
    else if(time > 35 && time <= 40) {
      setLetter('H');
    }
    else if(time > 40 && time <= 45) {
      setLetter('I');
    }
    else if(time > 45 && time <= 50) {
      setLetter('J');
      warning = true;
      warningNum = 5;
    }
    else if(time > 50 && time <= 60) {
      setLetter('K');
      warning = true;
      warningNum = 8;
    }
    else if(time > 60 && time <= 70) {
      setLetter('L');
      warning = true;
      warningNum = 14;
    }
    
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth80(int time) {
    if(time <= 5) {
      setLetter('B');
    }
    else if(time > 5 && time <= 10) {
      setLetter('C');
    }
    else if(time > 10 && time <= 15) {
      setLetter('D');
    }
    else if(time > 15 && time <= 20) {
      setLetter('E');
    }
    else if(time > 20 && time <= 25) {
      setLetter('F');
    }
    else if(time > 25 && time <= 30) {
      setLetter('G');
    }
    else if(time > 30 && time <= 35) {
      setLetter('H');
    }
    else if(time > 35 && time <= 40) {
      setLetter('I');
      warning = true;
      warningNum = 5;
    }
    else if(time > 40 && time <= 50) {
      setLetter('K');
      warning = true;
      warningNum = 10;
    }
    else if(time > 50 && time <= 60) {
      setLetter('L');
      warning = true;
      warningNum = 17;
    }
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth90(int time) {
    if(time <= 5) {
      setLetter('B');
    }
    else if(time > 5 && time <= 10) {
      setLetter('C');
    }
    else if(time > 10 && time <= 12) {
      setLetter('D');
    }
    else if(time > 12 && time <= 15) {
      setLetter('E');
    }
    else if(time > 15 && time <= 20) {
      setLetter('F');
    }
    else if(time > 20 && time <= 25) {
      setLetter('G');
    }
    else if(time > 25 && time <= 30) {
      setLetter('H');
      warning = true;
      warningNum = 5;
    }
    else if(time > 30 && time <= 40) {
      setLetter('J');
      warning = true;
      warningNum = 7;
    }
    else if(time > 40 && time <= 50) {
      setLetter('L');
      warning = true;
      warningNum = 18;
    }
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth100(int time) {
    if(time <= 5) {
      setLetter('B');
    }
    else if(time > 5 && time <= 7) {
      setLetter('C');
    }
    else if(time > 7 && time <= 10) {
      setLetter('D');
    }
    else if(time > 10 && time <= 15) {
      setLetter('E');
    }
    else if(time > 15 && time <= 20) {
      setLetter('F');
    }
    else if(time > 20 && time <= 22) {
      setLetter('G');
    }
    else if(time > 22 && time <= 25) {
      setLetter('H');
      warning = true;
      warningNum = 5;
    }
    else if(time > 25 && time <= 40) {
      setLetter('K');
      warning = true;
      warningNum = 15;
    }
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth110(int time) {
    if(time <= 5) {
      setLetter('C');
    }
    else if(time > 5 && time <= 10) {
      setLetter('D');
    }
    else if(time > 10 && time <= 13) {
      setLetter('E');
    }
    else if(time > 13 && time <= 15) {
      setLetter('F');
    }
    else if(time > 15 && time <= 20) {
      setLetter('G');
      warning = true;
      warningNum = 5;
    }
    else if(time > 20 && time <= 30) {
      setLetter('J');
      warning = true;
      warningNum = 7;
    }
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth120 (int time) {
    if(time <= 5) {
      setLetter('C');
    }
    else if(time > 5 && time <= 10) {
      setLetter('D');
    }
    else if(time > 10 && time <= 12) {
      setLetter('E');
    }
    else if(time > 12 && time <= 15) {
      setLetter('F');
      warning = true;
      warningNum = 5;
    }
    else if(time > 15 && time <= 25) {
      setLetter('I');
      warning = true;
      warningNum = 6;
    }
    else if(time > 25 && time <= 30) {
      setLetter('J');
      warning = true;
      warningNum = 14;
    }
    else {
      setLetter('Z');
    }
    
  }
  
  private void depth130 (int time) {
    if(time <= 5) {
      setLetter('C');
    }
    else if(time > 5 && time <= 8) {
      setLetter('D');
    }
    else if(time > 8 && time <= 10) {
      setLetter('E');
      warning = true;
      warningNum = 5;
    }
    else if(time > 10 && time <= 25) {
      setLetter('J');
      warning = true;
      warningNum = 10;
    }
    else {
      setLetter('Z');
    }
    
  }
  
  /**public static void main(String args[]) {
    DiveTable dive = new DiveTable();
    
    
  }*/

  private void setLetter(char letter) {
    this.letter = letter;
  }

  

}
