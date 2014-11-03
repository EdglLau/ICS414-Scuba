import java.util.Scanner;
import java.util.HashMap;

    //Table3 Repetitive Dive TimeTable
    public class DiveTable3{
        private HashMap map = new HashMap<Integer, String>();
        private int[][] numMap = new int[12][10];
        
        //constructor to set it all up
        public DiveTable3(){
            
            //0-9 A 
            map.put(0, "7 123");
            map.put(1, "6 74");
            map.put(2, "5 50");
            map.put(3, "4 41");
            map.put(4, "4 31");
            map.put(5, "3 22");
            map.put(6, "3 19");
            map.put(7, "3 12");
            map.put(8, "3 9");
            map.put(9, "3 5");
            
            //10-19 B
            map.put(10, "17 113");
            map.put(11, "13 67");
            map.put(12, "11 44");
            map.put(13, "9 36");
            map.put(14, "8 27");
            map.put(15, "7 18");
            map.put(16, "7 15");
            map.put(17, "6 9");
            map.put(18, "6 9");
            map.put(19, "6 0");
            
            //20-29 C
            map.put(20, "25 105");
            map.put(21, "21 59");
            map.put(22, "17 38");
            map.put(23, "15 30");
            map.put(24, "13 22");
            map.put(25, "11 14");
            map.put(26, "10 12");
            map.put(27, "10 5");
            map.put(28, "9 0");
            map.put(29, "8 0");
            
            //30-39 D
            map.put(30, "37 93");
            map.put(31, "29 51");
            map.put(32, "24 31");
            map.put(33, "20 25");
            map.put(34, "18 17");
            map.put(35, "16 9");
            map.put(36, "14 8");
            map.put(37, "13 0");
            map.put(38, "12 0");
            map.put(39, "11 0");
            
            //40-49 E
            map.put(40, "49 81");
            map.put(41, "38 42");
            map.put(42, "30 25");
            map.put(43, "26 19");
            map.put(44, "23 12");
            map.put(45, "20 5");
            map.put(46, "18 4");
            map.put(47, "16 0");
            map.put(48, "15 0");
            map.put(49, "13 0");
            
            //50-59 F
            map.put(50, "61 69");
            map.put(51, "47 33");
            map.put(52, "36 19");
            map.put(53, "31 14");
            map.put(54, "28 7");
            map.put(55, "24 0");
            map.put(56, "22 0");
            map.put(57, "20 0");
            map.put(58, "18 0");
            map.put(59, "16 0");
            
            //60-69 G
            map.put(60, "73 57");
            map.put(61, "56 24");
            map.put(62, "44 11");
            map.put(63, "37 8");
            map.put(64, "32 0");
            map.put(65, "29 0");
            map.put(66, "26 0");
            map.put(67, "24 0");
            map.put(68, "21 0");
            map.put(69, "19 0");
            
            //70-79 H
            map.put(70, "87 43");
            map.put(71, "66 14");
            map.put(72, "52 0");
            map.put(73, "43 0");
            map.put(74, "38 0");
            map.put(75, "33 0");
            map.put(76, "30 0");
            map.put(77, "27 0");
            map.put(78, "25 0");
            map.put(79, "22 0");
            
            //80-89 I
            map.put(80, "101 29");
            map.put(81, "76 4");
            map.put(82, "61 0");
            map.put(83, "50 0");
            map.put(84, "43 0");
            map.put(85, "38 0");
            map.put(86, "34 0");
            map.put(87, "31 0");
            map.put(88, "28 0");
            map.put(89, "25 0");
            
            //90-99 J
            map.put(90, "116 14");
            map.put(91, "87 0");
            map.put(92, "70 0");
            map.put(93, "57 0");
            map.put(94, "48 0");
            map.put(95, "43 0");
            map.put(96, "38 0");
            map.put(97, "X");
            map.put(98, "X");
            map.put(99, "X");
            
            //100-109 K
            map.put(100, "138 0");
            map.put(101, "99 0");
            map.put(102, "79 0");
            map.put(103, "64 0");
            map.put(104, "54 0");
            map.put(105, "47 0");
            map.put(106, "0 0");
            map.put(107, "X");
            map.put(108, "X");
            map.put(109, "X");
            
            //110-119 L
            map.put(110, "161 0");
            map.put(111, "111 0");
            map.put(112, "88 0");
            map.put(113, "72 0");
            map.put(114, "61 0");
            map.put(115, "53 0");
            map.put(116, "0 0");
            map.put(117, "X");
            map.put(118, "X");
            map.put(119, "X");
            
            
            int sum = 0;
            //fills in the values of the 2d array
            for(int i = 0; i < 12; i++){
                for(int j = 0; j < 10; j++){
                    numMap[i][j] = sum;
                    //System.out.print(sum + " ");
                    sum++;
                }
                //System.out.print("\n");
            }
            
        }

        //takes a CAPITAL letter and returns a number to correspond to the 2d array.
        public int convertLetter(char letter){
            switch(letter){
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
            return 13;
        }
        
        //convert depth into appropriate number for 2d array
        //takes an int as input and returns appropriate int
        public int convertDepth(int num){
            if(num <= 40){
                return 0;
            }else if(num <= 50){
                return 1;
            }else if(num <= 60){
                return 2;
            }else if(num <= 70){
                return 3;
            }else if(num <= 80){
                return 4;
            }else if(num <= 90){
                return 5;
            }else if(num <= 100){
                return 6;
            }else if(num <= 110){
                return 7;
            }else if(num <= 120){
                return 8;
            }else if(num <= 130){
                return 9;
            }else{
                return 10;
            }
        }
        
        //returns values of residual nitrogen and adjusted maximum dive time as a string
        public String getValues(int letter, int depth){
            
            int x = numMap[letter][depth];
            
            return (String)map.get(x);
            
        }

        
        public static void main(String args[]){
            DiveTable3 tableTop = new DiveTable3();
            Scanner scan = new Scanner(System.in);
            
            
            
            System.out.println("Input the Group Letter you are in");
            String input = scan.nextLine();
            System.out.println("Your Group Letter is " + input);
            int letterNum = tableTop.convertLetter(input.charAt(0));
            
            System.out.println("Input the Depth you want to go");
            String depthString = scan.nextLine();
            int depthNum = Integer.parseInt(depthString);
            System.out.println("Depth is " + depthNum);
            
            String temp = tableTop.getValues(letterNum, tableTop.convertDepth(depthNum));
            
            System.out.println("Values are " + temp);
            
            
        }
    }