

import java.util.Random;
import java.util.Scanner;
public class test {
    public static void Print_Map(){
        System.out.println("                      MAP OF PLAY");
        System.out.println("            ----------------------------------");
        System.out.println("            |  [0][0]  |  [0][1]  |  [0][2]  |");
        System.out.println("            ----------------------------------");
        System.out.println("            |  [1][0]  |  [1][1]  |  [1][2]  |");
        System.out.println("            ----------------------------------");
        System.out.println("            |  [2][0]  |  [2][1]  |  [2][2]  |");
        System.out.println("            ----------------------------------");
        System.out.println("");

    }


    public static void main(String[] args) {
        System.out.println("");
        System.out.println("               '' Welcome To X&O Playing ''");
        System.out.println("                       Good luck :)");
        System.out.println("       ____________________________________________");
        Print_Map();
        // New Object from Class "XO"
        XO t = new XO();
        Scanner s = new Scanner(System.in);
        Random rand =new Random();
        int x=0,y=0;
        System.out.println("The 'X' Player Will Start ");
        System.out.println("");
        do
        {
         //-------------------------- Method 'O'
            // Player 'O' Turns ....
          if (t.player == - t.X) {
              System.out.println("#Player 'O' Turn..");

              // Column "1"
              if (t.board[0][0] == -1 && t.board[1][0] == -1 && t.board[2][0] != 1) {
                  x = 2;
                  y = 0;
              } else if (t.board[2][0] == -1 && t.board[1][0] == -1 && t.board[0][0] != 1) {
                  x = 0;
                  y = 0;
              } else if (t.board[0][0] == -1 && t.board[2][0] == -1 && t.board[1][0] != 1) {
                  x = 1;
                  y = 0;
              }


              // Column "2"
              else if (t.board[0][1] == -1 && t.board[2][1] == -1 && t.board[1][1] != 1) {
                  x = 1;
                  y = 1;
              } else if (t.board[0][1] == -1 && t.board[1][1] == -1 && t.board[2][1] != 1) {
                  x = 2;
                  y = 1;
              } else if (t.board[2][1] == -1 && t.board[1][1] == -1 && t.board[0][1] != 1) {
                  x = 0;
                  y = 1;
              }


              // Column "3"

              else if (t.board[0][2] == -1 && t.board[1][2] == -1 && t.board[2][2] != 1) {
                  x = 2;
                  y = 2;
              } else if (t.board[1][2] == -1 && t.board[2][2] == -1 && t.board[1][2] != 1) {
                  x = 1;
                  y = 2;
              } else if (t.board[1][2] == -1 && t.board[2][2] == -1 && t.board[0][2] != 1) {
                  x = 0;
                  y = 2;
              }

              // Row "1"

              else if (t.board[0][0] == -1 && t.board[0][1] == -1 && t.board[0][2] != 1) {
                  x = 0;
                  y = 2;
              } else if (t.board[0][1] == -1 && t.board[0][2] == -1 && t.board[0][0] != 1) {
                  x = 0;
                  y = 0;
              } else if (t.board[0][0] == -1 && t.board[0][2] == -1 && t.board[0][1] != 1) {
                  x = 0;
                  y = 1;
              }

              // Row "2"

              else if (t.board[1][0] == -1 && t.board[1][1] == -1 && t.board[1][2] != 1) {
                  x = 1;
                  y = 2;
              } else if (t.board[1][1] == -1 && t.board[1][2] == -1 && t.board[1][0] != 1) {
                  x = 1;
                  y = 0;
              } else if (t.board[1][0] == -1 && t.board[1][2] == -1 && t.board[1][1] != 1) {
                  x = 1;
                  y = 1;
              }

              // Row "3"

              else if (t.board[2][0] == -1 && t.board[2][1] == -1 && t.board[2][2] != 1) {
                  x = 2;
                  y = 2;
              } else if (t.board[2][1] == -1 && t.board[2][2] == -1 && t.board[2][0] != 1) {
                  x = 2;
                  y = 0;
              } else if (t.board[2][0] == -1 && t.board[2][2] == -1 && t.board[2][1] != 1) {
                  x = 2;
                  y = 1;
              }

              // Diameter "1"

              else if (t.board[0][2] == -1 && t.board[1][1] == -1 && t.board[2][0] != 1) {
                  x = 2;
                  y = 0;
              } else if (t.board[2][0] == -1 && t.board[1][1] == -1 && t.board[0][2] != 1) {
                  x = 0;
                  y = 2;
              } else if (t.board[2][0] == -1 && t.board[0][2] == -1 && t.board[1][1] != 1) {
                  x = 1;
                  y = 1;
              }

              // Diameter "2"

              else if (t.board[0][0] == -1 && t.board[1][1] == -1 && t.board[2][2] != 1) {
                  x = 2;
                  y = 2;
              } else if (t.board[1][1] == -1 && t.board[2][2] == -1 && t.board[0][0] != 1) {
                  x = 0;
                  y = 0;
              } else if (t.board[2][2] == -1 && t.board[0][0] == -1 && t.board[1][1] != 1) {
                  x = 1;
                  y = 1;
              } else {

                  // Random Number
                  x = rand.nextInt(2);
                  y = rand.nextInt(2);

                  // Check..
                  if (t.board[x][y] == -1 || t.board[x][y] == 1) {
                      L:
                      for (int i = 0; i < 3; i++) {
                          for (int j = 0; j < 3; j++) {
                              if (t.board[i][j] != 1 && t.board[i][j] != -1) {
                                  x = i;
                                  y = j;
                                  break L;
                              }

                          }
                      }
                  }

                  System.out.println("The Computer Enter X:" + x + "   Y:" + y);
                  System.out.println("");

              }
          }

          // Player 'X' Turns...
           else  if (t.player==t.X) {
                System.out.println("#Player X Turn..");
                System.out.println("Enter X and Y places!");
                x = s.nextInt();
                y = s.nextInt();
            }
            t.putSign(x, y);
            System.out.println(t.toString());
            System.out.println("_____________________________");
            t.displayWinner();

        }while(t.isEmpty);
    }
}

  //New Class ....
  class XO {

    public static final int X = 1, O = -1;
    public static final int EMPTY = 0;

    public int player = X;
    public int[][] board = new int[3][3];
    public boolean isEmpty = false;


    public void putSign(int x, int y)
    {
        if(x<0 || x>2 || y<0 || y>2)
        {
            System.out.println("Invalid board position");
            return;
        }
        if(board[x][y] != EMPTY)
        {
            System.out.println("Board position occupied");
            return;
        }
        board[x][y] = player;
        player = -player;
    }

    // Method Check Win....
    public boolean isWin(int player)
    {
        return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
                (board[1][0] + board[1][1] + board[1][2] == player*3) ||
                (board[2][0] + board[2][1] + board[2][2] == player*3) ||
                (board[0][0] + board[1][0] + board[2][0] == player*3) ||
                (board[0][1] + board[1][1] + board[2][1] == player*3) ||
                (board[0][2] + board[1][2] + board[2][2] == player*3) ||
                (board[0][0] + board[1][1] + board[2][2] == player*3) ||
                (board[2][0] + board[1][1] + board[0][2] == player*3));
    }

    // Method Print Who Player is Win....
    public void displayWinner()
    {
        if(isWin(X))
        {
            System.out.println("\n X Wins...!!");
            isEmpty=false;
        }
        else if(isWin(O))
        {
            System.out.println("\n O Wins...!!");
            isEmpty=false;
        }
        else
        {
            // Case Tie ...
            if(!isEmpty)
            {
                System.out.println("Its a Tie ... :)");
            }

        }
    }

    // Method Print Movement Of The Players ....
    public String toString()
    {
        StringBuilder s = new StringBuilder();
        isEmpty = false;
        for(int i=0 ; i<3 ; i++)
        {
            for(int j=0 ; j<3 ; j++)
            {
                switch(board[i][j])
                {
                    case X:
                        s.append(" X ");
                        break;
                    case O:
                        s.append(" O ");
                        break;
                    case EMPTY:
                        s.append("   ");
                        isEmpty=true;
                        break;
                }
                if(j<2)
                {
                    s.append("|");
                }

            }
            if(i<2)
            {
                s.append("\n-----------\n");
            }
        }
        return s.toString();
    }



}

// End Code ......