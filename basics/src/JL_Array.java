import java.util.Scanner;

public class JL_Array {
    public static void main(String[] args) {
        float[] arr = new float[5];
        arr[0] = 12.4f;
        arr[1] = 17.5f;
        arr[2] = 13.8f;
        arr[3] = 19.3f;
        arr[4] = 15.9f;

        double sum = 0.0;
        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 32, 54};
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        boolean isPresent = false;
        for (int element : arr1) {
            if (element == integer) {
                isPresent = true;
                break;
            }
        }
        if (isPresent) {
            System.out.println(integer + " is present in array.");
        } else {
            System.out.println(integer + " is not present in array.");
        }

        int[] marks = {89, 78, 90, 78, 68, 89};
        float average = 0;
        int sumA = 0;
        for (int i = 0; i < marks.length; i++) {
            sumA += marks[i];
        }
        average = (float) sumA / marks.length;

        System.out.println("Average Marks of Physics is: " + average);

        // MATRIX SUM 2x3;
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] sumOfMatrix = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int[] row : sumOfMatrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


        int[] array = {89, 78, 90, 78, 68, 45};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        int[] array = {89, 78, 90, 78, 68, 45};
        int[] array1 = {12, 13, 23, 34, 45, 67};
        boolean isSorted = true;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                isSorted = false;
            }
        }

        System.out.println(isSorted);
    }
}
