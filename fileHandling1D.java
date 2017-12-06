import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

public class fileHandling1D
{
    
    public static void main(String[]args)throws IOException
    {
        
        FileReader fv = new FileReader("C:\\Users\\conno\\Desktop\\computing\\To be Uploaded\\ConnorCJ Computing\\code.txt");
        BufferedReader bw = new BufferedReader(fv);
        String line = bw.readLine();
        do {
            System.out.println(line);
        }while (line != null);
        bw.close();
    }
}
