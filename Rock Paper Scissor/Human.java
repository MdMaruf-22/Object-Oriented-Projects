import java.util.Scanner;

public class Human extends Player{
    private Scanner sc;
    public Human(){
        sc=new Scanner(System.in);
    }
    public void selectChoice(){
        System.out.println("Enter your choice: R - Rock, P - Paper, S - Scissors");
        setChoice(sc.nextLine());
    }
}
