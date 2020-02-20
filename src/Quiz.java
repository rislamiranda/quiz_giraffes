import javax.swing.JOptionPane;

public class Quiz {

    static int nQuestions = 0;
    static int nCorrect = 0;

    public static void main(String[] args) {
        String question1 = "What is the average of a giraffe pregnancy?\n";
        question1 += "A. 7 months\n";
        question1 += "B. 9 months\n";
        question1 += "C. 13 months\n";
        question1 += "D. 15 months\n";
        question1 += "E. 17 months\n";
        String correctAsnwer1 = "D";

        String question2 = "How long a giraffe can live in the wild?\n";
        question2 += "A. 22 years\n";
        question2 += "B. 25 years\n";
        question2 += "C. 28 years\n";
        question2 += "D. 30 years\n";
        question2 += "E. 31 years\n";
        String correctAnswer2 = "B";

        String question3 = "What is the height that a baby giraffe is drop to the ground when it is born?\n";
        question3 += "A. 1m\n";
        question3 += "B. 1.2m\n";
        question3 += "C. 1.3m\n";
        question3 += "D. 1.4m\n";
        question3 += "E. 1.5m\n";
        String correctAnswer3 = "E";


        check(question1, correctAsnwer1);
        check(question2, correctAnswer2);
        check(question3, correctAnswer3);

        JOptionPane.showMessageDialog(null, "SCORE: " + nCorrect + " correct out of " + nQuestions + " questions!");
    }

    static String ask(String question) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid output! Insert A, B, C, D or E.");
            }
        }
    }

    static void check(String question, String correctAnswer) {
        String answer = ask(question);

        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!\n");
            nCorrect ++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is " + correctAnswer + "!");
        }

        nQuestions++;

    }
}