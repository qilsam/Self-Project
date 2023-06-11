/*
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class Solution {
    public int solution(int[] A)
    {
        int lengthA = A.length;

        boolean[] present = new boolean[lengthA + 1];

        // Mark corresponding index as true for all positive values in A
        for(int i = 0; i < lengthA; i++)
        {
            if(A[i] > 0 && A[i] <= lengthA)
            {
                present[A[i]] = true;
            }
        }

        // Find the first index which is not marked as true
        for(int i = 1; i <= lengthA; i++)
        {
            if(!present[i])
            {
                return i;
            }
        }

        // If values from 1 to N are present in A, return N+1
        return lengthA + 1;
    }
}
