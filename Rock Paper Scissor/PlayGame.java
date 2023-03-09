import java.util.Scanner;
class PlayGame{
    private Human hum;
    private Robot rob;
    private Scanner sc;
    boolean isRun=false;
    private int Wins,Loses,ties;
    public PlayGame(){
        hum=new Human();
        rob=new Robot();
        sc=new Scanner(System.in);
        start();
    }
    private void start(){
        isRun=true;
        System.out.println("Enter Your name: ");
        hum.setName(sc.nextLine());
        while(isRun==true){
            displayScore();
            hum.selectChoice();
            rob.selectChoice();
            displayChoice();
            displayWinner(decideWinner());
            updateScore(decideWinner());
            playAgain();
        }
    }
    private void displayScore() {
        System.out.println(hum.getName());
        System.out.println("----------");
        System.out.println("Wins: " + Wins);
        System.out.println("Loses: " + Loses);
        System.out.println("Ties: " + ties);
        System.out.println("----------");
    }
    private void displayChoice() {
        System.out.println("User has selected: " + hum.getChoice());
        System.out.println("Computer has selected: " + rob.getChoice());
    }
    private int decideWinner() {
        if(hum.getChoice().equals("R") && rob.getChoice().equals("S"))
            return 0;
        else if(hum.getChoice().equals("P") && rob.getChoice().equals("R"))
            return 0;
        else if(hum.getChoice().equals("S") && rob.getChoice().equals("P"))
            return 0;
        else if(rob.getChoice().equals("R") && hum.getChoice().equals("S"))
            return 1;
        else if(rob.getChoice().equals("P") && hum.getChoice().equals("R"))
            return 1;
        else if(rob.getChoice().equals("S") && hum.getChoice().equals("P"))
            return 1;
        else
            return 2;
    }
    private void displayWinner(int winner) {
        if(winner==0) System.out.println("User Won!");
        else if(winner==1) System.out.println("RObot Won!");
        else if(winner==2) System.out.println("It is TIE");
    }
    private void updateScore(int winner) {
        if(winner == 0)
            Wins++;
        else if(winner == 1)
            Loses++;
        else if(winner == 2)
            ties++;
    }
    private void playAgain() {
        String choice;
        System.out.println("Do you want to play again? Enter Yes to play again.");
        choice = sc.nextLine();
        if(!(choice.equals("Yes") )) isRun = false;

    }
}
