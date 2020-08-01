import java.util.Scanner;

public class correctAnswer {
    public static void main(String[] args) {

        String correctAnswer = "earth";

        Scanner input = new Scanner(System.in);
        System.out.println("What is the largest planet in our solar system? ");
        System.out.println("Choose of the following: Earth, Jupiter, or Saturn : ");
        String userInput = input.next();

        if(correctAnswer.equals(userInput.toLowerCase())) {
            System.out.println("Congrats! That's the correct answer");
        }
        else {
            System.out.println("You are incorrect. The correct answer is " + correctAnswer);
        }

    }

}
