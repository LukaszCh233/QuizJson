
import java.io.IOException;
import java.util.*;
public class JSON {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("WITAJ W APLIKACJI QUIZ :)");
        System.out.println("""
                WYBIERZ JAKI QUIZ CHCESZ ROZWIĄZAĆ:
                1 - Genetyka
                2 - Fiziologia (Układ pokarmowy)""");
        choice = scanner.nextLine();
        if (choice.equals("1")) {
            System.out.println("Wybrałeś Quiz o genetyce\nZACZYNAJMY :)");
            QuizChoice.choiceQuiz();
        } else if (choice.equals("2")) {
            System.out.println("Wybrałeś Quiz o układzie pokarmowym\nZACZYNAJMY :)");
            QuizChoice.choiceQuiz1();
        }
        else System.out.println("NIESTETY PODAŁEŚ ZŁY NUMER ZESTAWU");
    }
}