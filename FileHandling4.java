import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class FileHandling4
{
    public static void main(String[] args)throws Exception{
        FileWriter fw = new FileWriter("lottery.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        boolean[] lotteryNumbers = new boolean[51];
        int numberOfSelectedBalls = 0;
        while(numberOfSelectedBalls < 6){
             int winningBall = (int)(Math.random()*50)+1;
             if(lotteryNumbers[winningBall] ==  false){
                 lotteryNumbers[winningBall] = true;
                   numberOfSelectedBalls++;
             }
        }
        int i;
        for(i = 1; i <= 50; i++){
            if(lotteryNumbers[i] == true){
                bw.newLine();
                bw.write(i + "/t");
            }
        }
    }
}
