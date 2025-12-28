import java.util.Scanner;
import java.util.ArrayList;

public class To_do {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        int num = ask(input);
        while (num != 4) {
            if (num == 1) {
                first(input, list1);
            }
            else if (num == 2) {
                second(input, list1);
            }
            else if (num == 3) {
                third(list1);
            }
            else {
                System.out.println();
                System.out.println("Invalid Number :(");
                System.out.println();
            }
            num = ask(input);
        }
    }

    public static int ask(Scanner input) {
        System.out.println("1. Add a task\n" + //
                "2. Remove a task\n" + //
                "3. View tasks\n" + //
                "4. Quit\n" + //
                "input number to be completed: ");
        int answer = input.nextInt();
        return answer;
    }

    public static ArrayList<String> first(Scanner input, ArrayList<String> list1) {
        System.out.println("Input task to enter: ");
        String given = input.next();
        list1.add(given);
        return list1;
    }

    public static ArrayList<String> second(Scanner input, ArrayList<String> list1) {
        System.out.println("Input task to delete: ");
        String given = input.next();
        for (int x = 0; x < list1.size(); x++) {
            if (list1.get(x).equals(given)) {
                list1.remove(x);
                x--;
            }
        }
        return list1;
    }
    public static void third(ArrayList<String> list1){
        System.out.println("");
        for (int x = 0; x < list1.size(); x++) {
            System.out.println(list1.get(x));
        }
        System.out.println("");
    }
}
