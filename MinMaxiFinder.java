/* Maximum and minimum of an array using minimum number of comparisons
Given an array of size N. 
The task is to find the maximum and the minimum element of the array using the
minimum number of comparisons.

Examples:
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
Maximum element is: 35 
*/


public class MinMaxiFinder {
    public static int setmini(int[] A, int N) {
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
            if (A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }
public static int setmaxi(int[] A, int N) {
    int maxi = Integer.MIN_VALUE;
    for(int i = 0; i < N; i++) {
        if(A[i] > maxi) {
            maxi = A[i];
        }
    }
    return maxi;
   }
   public static void main(String[] args) {
    int[] A = {4, 9, 6, 5, 2, 3};
    int N = A.length;
    System.out.println("Minimum element is: " + setmini(A, N));
    System.out.println("Maximum element is: " + setmaxi(A, N));
   }
}
