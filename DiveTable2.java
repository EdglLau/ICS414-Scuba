/*
*DISCLAMIER:THIS CODE IS UNSTABLE AND UNPROVEN THEReFORE NEVER USE IT IN A 
*           ACTUAL DIVING SYSTEM
*
*
* @author Andy Omori
*/

import java.util.HashMap;
import java.util.Scanner;

public class DiveTable2
{
  private HashMap map = new HashMap<Integer, String>(); 
  private int[][] table = new int[12][12];//Creates array of 12 by 12 blocks
  
  public DiveTable2()
    {
       //A
       map.put(0, "24:00 0:10");
       map.put(1, "24:00 3:21");
       map.put(2, "24:00 4:50");
       map.put(3, "24:00 5:49");
       map.put(4, "24:00 6:35");
       map.put(5, "24:00 7:06");
       map.put(6, "24:00 7:36");
       map.put(7, "24:00 8:00");
       map.put(8, "24:00 8:22");
       map.put(9, "24:00 8:51");
       map.put(10, "24:00 8:59");
       map.put(11, "24:00 9:13");
       
       //B
       map.put(12, "Don't Dive");
       map.put(13, "3:20 0:10");
       map.put(14, "4:49 1:40");
       map.put(15, "5:48 2:39");
       map.put(16, "6:34 3:25");
       map.put(17, "7:05 3:58");
       map.put(18, "7:35 4:26");
       map.put(19, "7:59 4:50");
       map.put(20, "8:21 5:13");
       map.put(21, "8:50 5:41");
       map.put(22,"8:58 5:49");
       map.put(23, "9:12 6:03");
      
       //C 
       map.put(24, "Don't Dive");
       map.put(25, "Don't Dive");
       map.put(26, "1:39 0:10");
       map.put(27, "2:38 1:10");
       map.put(28, "3:24 1:58");
       map.put(29, "3:57 2:29");
       map.put(30, "4:25 2:59");
       map.put(31, "4:49 3:21");
       map.put(32, "5:12 3:44");
       map.put(33, "5:40 4:03");
       map.put(34, "5:48 4:20");
       map.put(35, "6:02 4:36");
       
       //D
       map.put(36, "Don't Dive");
       map.put(37, "Don't Dive");
       map.put(38, "Don't Dive");
       map.put(39, "1:09 0:10");
       map.put(40, "1:57 0:55");
       map.put(41, "2:28 1:30");
       map.put(42, "2:58 2:00");
       map.put(43, "3:20 2:24");
       map.put(44, "3:43 2:45");
       map.put(45, "4:02 3:05");
       map.put(46, "4:19 3:22");
       map.put(47, "4:35 3:37");       
      
       //E
       map.put(48, "Don't Dive");
       map.put(49, "Don't Dive");
       map.put(50, "Don't Dive");
       map.put(51, "Don't Dive");
       map.put(52, "0:54 0:10");
       map.put(53, "1:29 0:46");
       map.put(54, "1:59 1:16");
       map.put(55, "2:23 1:42");
       map.put(56,  "2:44 2:03");
       map.put(57,  "3:04 2:21");
       map.put(58, "3:21 2:39");
       map.put(59, "3:36 2:54");
 
       //F
       map.put(60, "Don't Dive");
       map.put(61, "Don't Dive");
       map.put(62, "Don't Dive");
       map.put(63, "Don't Dive");
       map.put(64, "Don't Dive");
       map.put(65, "0:45 0:10");
       map.put(66, "1:15 0:41");
       map.put(67, "1:41 1:07");
       map.put(68, "2:02 1:30");
       map.put(69, "2:20 1:48");
       map.put(70, "2:38 2:04");
       map.put(71, "2:53 2:20");

       //G
       map.put(72, "Don't Dive");
       map.put(73, "Don't Dive");
       map.put(74, "Don't Dive");
       map.put(75, "Don't Dive");
       map.put(76, "Don't Dive");
       map.put(77, "Don't Dive");
       map.put(78, "0:40 0:10");
       map.put(79, "1:06 0:37");
       map.put(80, "1:29 1:00");
       map.put(81, "1:47 1:20");
       map.put(82, "2:03 1:36");
       map.put(83, "2:19 1:50");
      
       //H
       map.put(84, "Don't Dive");
       map.put(85, "Don't Dive");
       map.put(86, "Don't Dive");
       map.put(87, "Don't Dive");
       map.put(88, "Don't Dive");
       map.put(89, "Don't Dive");
       map.put(90, "Don't Dive");
       map.put(91, "0:36 0::10");
       map.put(92, "0:59 0:34");
       map.put(93, "1:19 0:55");
       map.put(94, "1:35 1:12");
       map.put(95 ,"1:49 1:26");

       //I
       map.put(96, "Don't Dive");
       map.put(97, "Don't Dive");
       map.put(98, "Don't Dive");
       map.put(99, "Don't Dive");
       map.put(100, "Don't Dive");
       map.put(101, "Don't Dive");
       map.put(102, "Don't Dive");
       map.put(103, "Don't Dive");
       map.put(104, "0:33 0:10");
       map.put(105, "0:54 0:32");
       map.put(106, "1:11 0:50");
       map.put(107, "1:25 1:05");
        
       //J
       map.put(108, "Don't Dive");
       map.put(109, "Don't Dive");
       map.put(110, "Don't Dive");
       map.put(111, "Don't Dive");
       map.put(112, "Don't Dive");
       map.put(113, "Don't Dive");
       map.put(114, "Don't Dive");
       map.put(115, "Don't Dive");
       map.put(116, "Don't Dive");
       map.put(117, "0:32 0:10");
       map.put(118, "0:50 0:29");
       map.put(119, "1:05 0:46");
        
       //K
       map.put(120, "Don't Dive");
       map.put(121, "Don't Dive");
       map.put(122, "Don't Dive");
       map.put(123, "Don't Dive");
       map.put(124, "Don't Dive");
       map.put(125, "Don't Dive");
       map.put(126, "Don't Dive");
       map.put(127, "Don't Dive");
       map.put(128, "Don't Dive");
       map.put(129, "Don't Dive");
       map.put(130, "0:28 0:10");
       map.put(131, "0:45 0:27");
	  
       //L
       map.put(132, "Don't Dive");
       map.put(133, "Don't Dive");
       map.put(134, "Don't Dive");
       map.put(135, "Don't Dive");
       map.put(136, "Don't Dive");
       map.put(137, "Don't Dive");
       map.put(138, "Don't Dive");
       map.put(139, "Don't Dive");
       map.put(140, "Don't Dive");
       map.put(141, "Don't Dive");
       map.put(142, "Don't Dive");
       map.put(143, "0:26 0:10");
     
       int letters = 0;
       for(int x=0;x<12;x++)
       {
           for(int y=0;y<12;y++)
           {
            table[x][y] = letters;
            letters++;
           }
       }
           
    }   
  
    //Converts the x coordinate(rows) of letters A-L to a integer the program will
    // read and convert
    public int convertLetterX(char letter)
    {
        switch(letter)
        {
         case 'A':
         return 0;
         case 'B':
         return 1;
         case 'C':
         return 2;
         case 'D':
         return 3;
         case 'E':
         return 4;
         case 'F':
         return 5;
         case 'G':
         return 6;
         case 'H':
         return 7;
         case 'I':
         return 8;
         case 'J':
         return 9;
         case 'K':
         return 10;
         case 'L':
         return 11;
        }
    return 12;
    }
    
    //Converts the y coordinate(column) of letters A-L to a integer the program will
    // read and convert
    public int convertLetterY(char letter)
    {
        switch(letter)
        {
         case 'A':
         return 0;
         case 'B':
         return 1;
         case 'C':
         return 2;
         case 'D':
         return 3;
         case 'E':
         return 4;
         case 'F':
         return 5;
         case 'G':
         return 6;
         case 'H':
         return 7;
         case 'I':
         return 8;
         case 'J':
         return 9;
         case 'K':
         return 10;
         case 'L':
         return 11;
        }
    return 12;
    }
    
    

   //Gets the coordinates for time intervals
   public String getValues(int letterX, int letterY)
   {
     int x = table[letterX][letterY];//X and Y coordinates
     return (String)map.get(x); 
   }             

    
   public static void main(String[] args)
    { 
      DiveTable2 times = new DiveTable2();
	    Scanner scan = new Scanner(System.in);
        
	    System.out.println("Each group letter is assigned a specific time");
	    System.out.println("Input the Group Letter(Row) you are in from A-L");
	    String input = scan.nextLine();
	    int letter1 = times.convertLetterX(input.charAt(0));
        
	    System.out.println("Enter your time interval column letter from A-L ");
	    String input2 = scan.nextLine();
	    int letter2 = times.convertLetterY(input2.charAt(0));
	    
	    String interval = times.getValues(letter1, letter2);
	    System.out.println("\nThe times intervals are " + interval);
    }
}   
