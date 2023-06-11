import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int arraySize;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements to store: ");
        arraySize = sc.nextInt();
        int[] arrayMemory = new int[10];

        System.out.println("Enter the elements of the array: ");

        for(int i = 0; i < arraySize; i++)
        {
            arrayMemory[i] = sc.nextInt();
        }

        int[] A = arrayMemory;

        Solution minNum = new Solution();
        System.out.println(minNum.solution(A));
    }
}