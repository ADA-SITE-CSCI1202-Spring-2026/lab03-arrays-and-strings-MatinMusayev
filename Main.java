package ex2;

import java.util.Scanner;

public class Main {

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            int[] commandArray = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                commandArray[i] = Integer.parseInt(args[i]);
            }
            System.out.println("Minimum: " + findMin(commandArray));
            System.out.println("Maximum: " + findMax(commandArray));
        }

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] userArray = new int[n];

        for (int i = 0; i < n; i++) {
            userArray[i] = scanner.nextInt();
        }

        System.out.println("Minimum: " + findMin(userArray));
        System.out.println("Maximum: " + findMax(userArray));

        int[] result = findMinAndMax(userArray);

        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);

        scanner.close();
    }
}