package Divetable;

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
  
  private int[][] table = {{12,  40, 5, 15, 25, 30, 40, 50, 70, 80, 100, 110, 130, 150},
                           {15,  50, 0, 10, 15, 25, 30, 40, 50, 60,  70,  80,   0, 100},
                           {18,  60, 0, 10, 15, 20, 25, 30, 40, 50,  55,  60,   0,  80},
                           {21,  70, 0, 5,  10, 15, 20, 30, 35, 40,  45,  50,  60,  70},
                           {24,  80, 0, 5,  10, 15, 20, 25, 30, 35,  40,   0,  50,  60},
                           {27,  90, 0, 5,  10, 12, 15, 20, 25, 30,   0,  40,   0,  50},
                           {30, 100, 0, 5,   7, 10, 15, 20, 22, 25,   0,   0,  40,   0},
                           {33, 110, 0, 0,   5, 10, 13, 15, 20,  0,   0,  30,   0,   0},
                           {36, 120, 0, 0,   5, 10, 12, 15,  0,  0,  25,  30,   0,   0},
                           {40, 130, 0, 0,   5,  8, 10,  0,  0,  0,   0,  25,   0,   0}};
  
  public DiveTable() {
    
  }
  
  /**
   * DISCLAIMER: This system is a PROTOTYPE and cannot be used to plan real dives. 
   * @param x
   * @param y
   * @return
   */
  public int getValue(int x, int y) {
    return table[x][y];
    
  }

}
