import java.util.HashMap;
/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/
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
            map.put(19, "6 X");
            
            //20-29 C
            map.put(20, "25 105");
            map.put(21, "21 59");
            map.put(22, "17 38");
            map.put(23, "15 30");
            map.put(24, "13 22");
            map.put(25, "11 14");
            map.put(26, "10 12");
            map.put(27, "10 5");
            map.put(28, "9 X");
            map.put(29, "8 X");
            
            //30-39 D
            map.put(30, "37 93");
            map.put(31, "29 51");
            map.put(32, "24 31");
            map.put(33, "20 25");
            map.put(34, "18 17");
            map.put(35, "16 9");
            map.put(36, "14 8");
            map.put(37, "13 X");
            map.put(38, "12 X");
            map.put(39, "11 X");
            
            //40-49 E
            map.put(40, "49 81");
            map.put(41, "38 42");
            map.put(42, "30 25");
            map.put(43, "26 19");
            map.put(44, "23 12");
            map.put(45, "20 5");
            map.put(46, "18 4");
            map.put(47, "16 X");
            map.put(48, "15 X");
            map.put(49, "13 X");
            
            //50-59 F
            map.put(50, "61 69");
            map.put(51, "47 33");
            map.put(52, "36 19");
            map.put(53, "31 14");
            map.put(54, "28 7");
            map.put(55, "24 X");
            map.put(56, "22 X");
            map.put(57, "20 X");
            map.put(58, "18 X");
            map.put(59, "16 X");
            
            //60-69 G
            map.put(60, "73 57");
            map.put(61, "56 24");
            map.put(62, "44 11");
            map.put(63, "37 8");
            map.put(64, "32 X");
            map.put(65, "29 X");
            map.put(66, "26 X");
            map.put(67, "24 X");
            map.put(68, "21 X");
            map.put(69, "19 X");
            
            //70-79 H
            map.put(70, "87 43");
            map.put(71, "66 14");
            map.put(72, "52 X");
            map.put(73, "43 X");
            map.put(74, "38 X");
            map.put(75, "33 X");
            map.put(76, "30 X");
            map.put(77, "27 X");
            map.put(78, "25 X");
            map.put(79, "22 X");
            
            //80-89 I
            map.put(80, "101 29");
            map.put(81, "76 4");
            map.put(82, "61 X");
            map.put(83, "50 X");
            map.put(84, "43 X");
            map.put(85, "38 X");
            map.put(86, "34 X");
            map.put(87, "31 X");
            map.put(88, "28 X");
            map.put(89, "25 X");
            
            //90-99 J
            map.put(90, "116 14");
            map.put(91, "87 X");
            map.put(92, "70 X");
            map.put(93, "57 X");
            map.put(94, "48 X");
            map.put(95, "43 X");
            map.put(96, "38 X");
            map.put(97, "X X");
            map.put(98, "X X");
            map.put(99, "X X");
            
            //100-109 K
            map.put(100, "138 X");
            map.put(101, "99 X");
            map.put(102, "79 X");
            map.put(103, "64 X");
            map.put(104, "54 X");
            map.put(105, "47 X");
            map.put(106, "X X");
            map.put(107, "X X");
            map.put(108, "X X");
            map.put(109, "X X");
            
            //110-119 L
            map.put(110, "161 X");
            map.put(111, "111 X");
            map.put(112, "88 X");
            map.put(113, "72 X");
            map.put(114, "61 X");
            map.put(115, "53 X");
            map.put(116, "X X");
            map.put(117, "X X");
            map.put(118, "X X");
            map.put(119, "X X");
            
            
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
/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/
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
/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/        
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
/**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/        
        //returns values of residual nitrogen and adjusted maximum dive time as a string
        public String getValues(int letter, int depth){
            
            int x = numMap[letter][depth];
            
            return (String)map.get(x);
            
        }

 /**
 * /////////////////////////////////////////////////////////////////////
 * DISCLAIMER: THIS IS A PROTOTYPE AND CANNOT BE USED TO PLAN REAL DIVES
 * /////////////////////////////////////////////////////////////////////
 **/       

    }