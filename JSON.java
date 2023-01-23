
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;






import java.io.File;

import java.util.Scanner;


public class JSON {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String odp;
        ObjectMapper mapper = new ObjectMapper();
        Question [] question = mapper.readValue(new File("C:\\Users\\chwie\\IdeaProjects\\untitled\\.idea\\vertopal.com_jsonformatter (3).json"),Question[].class);
        int pkt = 0;

        for (int i = 0;i< question.length;i++){
            System.out.println(question[i].getQuestion1());
            System.out.println(question[i].getAnswer1()+"\n");
             odp = scanner.nextLine();
            if (odp.equals(question[i].correctAnswer1)){
                pkt++;
                System.out.println("good");
            }

            else System.out.println("baad");

        }
        int pytania = question.length;

        double wynik =(double) pkt / pytania;
        System.out.println("your score is: "+ wynik+"%");






        }
    }
