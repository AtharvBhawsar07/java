
import java.util.Scanner;

public class Queser {

    que[] questions = new que[5];
    String[] selection = new String[5];

    public  Queser() {
        questions[0] = new que(1, "what is 10-8", "2", "6", "4", "8", "2");
        questions[1] = new que(2, "what is 3+3", "2", "6", "4", "8", "6");
        questions[2] = new que(3, "how many legs have cow", "2", "6", "4", "8", "4");
        questions[3] = new que(4, "how many letter in word ram", "2", "6", "4", "3", "3");
        questions[4] = new que(5, "what comes before 2 ", "1", "2", "4", "8", "1");


    }

    public void playQuiz() {
        int i = 0;
        for (que q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }

        for (String s : selection) {
            System.out.println(s);
        }

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            que qu = questions[i];
            String answer = qu.getAnswer();
            String userAnswer = selection[i];
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}