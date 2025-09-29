import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = input.nextInt();

        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.printf("최대값: %d\n", maxNumber);
        System.out.printf("최소값: %d\n", minNumber);
    }
}