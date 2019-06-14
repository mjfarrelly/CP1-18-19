//Charlie Smith, Michael Farrelly, Charlie Perez, Emmet Main
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
class Scores {
  public static void main(String[] args) {
   Random rand = new Random();  
   Scanner kin = new Scanner(System.in);
   String[][] scores = new String[4][4];
    scores[0][0] = "x";
    scores[0][1] = "O";
    scores[0][2] = "O";
    scores[0][3] = "O";
    scores[1][0] = "O";
    scores[1][1] = "O";
    scores[1][2] = "O";
    scores[1][3] = "O";
    scores[2][0] = "O";
    scores[2][1] = "O";
    scores[2][2] = "O";
    scores[2][3] = "O";
    scores[3][0] = "O";
    scores[3][1] = "O";
    scores[3][2] = "O";
    scores[3][3] = "O";

    int rand1 = rand.nextInt((3 - 1) + 1) + 1;
    int rand2 = rand.nextInt((3 - 1) + 1) + 1;
    scores[rand1][rand2] = "*";
    int i = 0;
    int j = 0;

while (scores[rand1][rand2] == "*"){
    for (String[] row : scores){
      for(String b: row){
        System.out.print(b + " ");
      }
      System.out.println();
    }

    System.out.println("Which way would you like to go?(l/r/u/d)");
    String dir = kin.nextLine();
    
    if (dir.equals("u")){
      scores[i][j] = "O";
      i = (i-1);
      if (i < 0){
        System.out.println("Invalid move");
        i = 0;
        j = 0;
      }
      scores[i][j] = "x";
    }
    if (dir.equals("d")){
      scores[i][j] = "O";
      i = (i+1);
      if (i > 3){
        System.out.println("Invalid move");
        i = 0;
        j = 0;
      }
      scores[i][j] = "x";
    }
    if (dir.equals("l")){
      scores[i][j] = "O";
      j = (j-1);
      if (j < 0){
        System.out.println("Invalid move");
        i = 0;
        j = 0;
      }
      scores[i][j] = "x";
    }
    if (dir.equals("r")){
      scores[i][j] = "O";
      j = (j+1);
      if (j > 3){
        System.out.println("Invalid move");
        i = 0;
        j = 0;
      }
      scores[i][j] = "x";
    }
  }
  System.out.println("You Win!");

}
}
