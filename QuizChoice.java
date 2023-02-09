



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuizChoice  {
    public static void choiceQuiz1 (Question[] question) {
        Scanner scanner = new Scanner(System.in);
        String odp;

        int pkt = 0;
        Random random = new Random();
        int randomQuestion = 0;

        ArrayList<Integer> drawnQuestion = new ArrayList<>();

        for (int i = 0; i < question.length; i++) {

            boolean drawnUniQuestion = false;
            while (!drawnUniQuestion) {
                randomQuestion = random.nextInt(question.length);

                if (!drawnQuestion.contains(randomQuestion)) {
                    drawnUniQuestion = true;
                    drawnQuestion.add(randomQuestion);
                }
            }
            System.out.println(question[randomQuestion].getQuestion1());
            Object [] aa = question[randomQuestion].getAnswer1().toArray();
            for (int y = 0; y < aa.length; y++){
                System.out.println(aa[y]);
            }
            System.out.println("\nAnswer: ");
            odp = scanner.nextLine();
            if (odp.equalsIgnoreCase(question[randomQuestion].getCorrectAnswer())) {
                pkt++;
                System.out.println("Correct answer");
            } else System.out.println("Bad answer");
        }
        int questionsLength = question.length;
        double wynik = (double) pkt / questionsLength;
        System.out.println("Your score: " + wynik * 100 +"%");
    }
}







