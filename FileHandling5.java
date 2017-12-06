import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class FileHandling5
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Search for a term");
        System.out.println("2. Search for a keyword in the descriptions");
        System.out.println("3. End");
        System.out.println("Key in choice");
        int choiceOfOption = input.nextInt();
        switch(choiceOfOption){
            case 1: SearchByTerm();
            break;
            case 2: SearchDescriptionsForKeyword();
            break;
        }
    }
    public static void SearchByTerm(){
        try{
             FileReader fr = new FileReader("terms.txt");
             BufferedReader br = new BufferedReader(fr);
             Scanner input = new Scanner(System.in);
             System.out.println("Term..?");
             String searchedTerm = input.nextLine();
             String line = br.readLine();
             int i = 0;
             do{
                 if(i == 1){
                     System.out.println("Found ..." + line);
                     i = 2;
                 }
                 if(line.equals(searchedTerm)){
                     System.out.println(line);
                     i = 1;
                 }
             }while((line = br.readLine()) != null);
             if(i != 2){
                 System.out.println("Term not found");
             }
             br.close();
        }catch(IOException e){
             System.out.println("Could not find file");
        }
    }
    public static void SearchDescriptionsForKeyword(){
        try{
            FileReader fr = new FileReader("terms.txt");
            BufferedReader br = new BufferedReader(fr);
            Scanner input = new Scanner(System.in);
            System.out.println("Key word ..?");
            String searchedTerm = input.nextLine();
            String line = br.readLine();
            String prevLine = "blank";
            String curLine;
            int lineLength;
            int searchLength = (searchedTerm.length());
            int i;
            boolean found = false;
            do{
                curLine = line;
                lineLength = curLine.length();
                for(i = 0; (i+searchLength)<lineLength; i++){
                    if(curLine.substring(i, (searchLength+i)).equals(searchedTerm)){
                        System.out.println("Found for " + prevLine);
                        System.out.println(curLine);
                        found = true;
                    }
                }
                prevLine = line;
            }while((line = br.readLine()) != null);
            if(found == false){
                 System.out.println("Term not found");
            }
            br.close();
        }catch(IOException e){
            System.out.println("Could not find file");
        }
    }
}
