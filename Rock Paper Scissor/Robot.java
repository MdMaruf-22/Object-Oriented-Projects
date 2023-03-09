import java.util.Random;
public class Robot extends Player{
    private Random rand;
    public Robot(){
        rand=new Random();
    }
    public void selectChoice(){
        int randNum=rand.nextInt(3);
        if(randNum==0) setChoice("R");
        else if(randNum==1) setChoice("P");
        else if(randNum==2) setChoice("S");
    }
}
