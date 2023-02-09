
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class JSON {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();


        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("WITAJ W APLIKACJI QUIZ :)");
        System.out.println("""
                WYBIERZ JAKI QUIZ CHCESZ ROZWIĄZAĆ:
                1 - Genetyka
                2 - Fiziologia (Układ pokarmowy)""");
        choice = scanner.nextLine();
       Question [] question = new Question[0];

        if (choice.equals("1")) {
            question= mapper.readValue(new File("vertopal.com_jsonformatter (3).json"),Question[].class);
            System.out.println("Wybrałeś Quiz o genetyce\nZACZYNAJMY :)");

        } else if (choice.equals("2")) {
            question = mapper.readValue(new File("vertopal.com_jsonformatter (4).json"),Question[].class);
            System.out.println("Wybrałeś Quiz o układzie pokarmowym\nZACZYNAJMY :)");

        }
        else System.out.println("NIESTETY PODAŁEŚ ZŁY NUMER ZESTAWU");
        QuizChoice.choiceQuiz1(question);
    }
}