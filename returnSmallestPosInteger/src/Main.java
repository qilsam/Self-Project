import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int arraySize;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers to store (Max 10): ");
        arraySize = sc.nextInt();
        int[] A = new int[10];

        System.out.println("Enter the numbers: ");

        for(int i = 0; i < arraySize; i++)
        {
            A[i] = sc.nextInt();
        }

        Solution minNum = new Solution();
        System.out.println("Smallest positive integer that is missing is: " + minNum.solution(A));
    }
}