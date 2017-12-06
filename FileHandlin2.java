import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class FileHandlin2
{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("data.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        String[][] myStudents = {{"Sophie", "Stanfield", "Class 5"},{"James", "Kitson", "Class 5"},{"Zoe", "Gaskill", "Class 1"},{"Paul", "Johns", "Class 1"},{"Freya", "Moore", "Class 5"}};
        int row;
        for( row = 0; row <= 4; row++){
            for(int column = 0; column <= 2; column++){
                bw.newLine();
                bw.write(myStudents[row][column] + "\t");
            }
            bw.newLine();
            bw.write("\n");
        }
        bw.close();

        }
    }

