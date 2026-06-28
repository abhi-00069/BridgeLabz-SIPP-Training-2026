import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0;
        int index = 0;

        while (true) {
            System.out.print("Enter number: ");
            double n = sc.nextDouble();

            if (n <= 0 || index == 10)
                break;

            arr[index] = n;
            index++;
        }

        System.out.println("Numbers:");

        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println("Sum = " + total);
    }
}
