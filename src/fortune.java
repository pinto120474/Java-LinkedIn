import java.util.Scanner;

public class fortune {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a Number between 1 and 10 : ");

        int userNumber = input.nextInt();

        if(userNumber < 5) {
            System.out.println("Enjoy the good luck a friend brings to you");
        }
        else {
            System.out.println("Your shoe selection will make you happy today");
        }

    }
}
