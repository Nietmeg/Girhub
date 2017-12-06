import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class fileHandlin3
{
    public static void main(String[] args)throws IOException{
        FileReader fr = new FileReader("Ingredients.txt");
        BufferedReader br = new BufferedReader(fr);
        String[] food = new String[5];
        int i = 0;
        String line = br.readLine();
        do{
            food[i] = (line);
            i = i + 1;;
        }while((line = br.readLine()) != null);
        br.close();
        System.out.println(food[2]);
    }
}
