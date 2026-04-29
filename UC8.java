
public class UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("Human's Turn");

            

            } else {
                System.out.println("Computer's Turn");

                
            }

            
            if (checkWin() || checkDraw()) {
                gameOver = true;
                System.out.println("Game Over!");
            } else {
              
                isHumanTurn = !isHumanTurn;
            }
        }
    }

   
    static boolean checkWin() {
        return false; }

    static boolean checkDraw() {
        return false; 
    }
}