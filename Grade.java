import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Numbers to enter:");
        int LoopTimes = input.nextInt();
        double total = 0;

        for (int x = 0; x < LoopTimes; x++) {
            System.out.println("Enter grade:");
            double grade = input.nextDouble();
            total += grade;
        }
        double average = total / LoopTimes;
        if (average >= 80) {
            System.out.println("A");
        }
        else if (average >= 70 & average < 802) {
            System.out.println("B");
        }
        else if (average >= 60) {
            System.out.println("C");
        }
        else if (average >= 50) {
            System.out.println("D");
        }
        else {
            System.out.println("E");
        }
    }
}
