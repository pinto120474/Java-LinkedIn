import java.util.Scanner;

public class TeaTime {
    public static void announceTesterTeaTime() {
        System.out.println("Waiting for Tester tea time.....");
        System.out.println("Type a random word and press Enter to start Tester Tea Time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its Tester tea time!");
    }

    public static void main(String[] args) {
        announceTesterTeaTime();
    }
}
