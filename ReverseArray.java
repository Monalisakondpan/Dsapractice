/* Given an array (or string), the task is to reverse the array/string.
Examples:
Input: original_array[] = {1, 2, 3} 
Output: array_reversed[] = {3, 2, 1}
Input: original_array[] = {4, 5, 1, 2}
Output: array_reversed[] = {2, 1, 5, 4} 
*/

public class ReverseArray {
    public static void reverseArray(int[] arr){
        int[] reversedArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        System.out.print("Reversed Array: ");
        for(int i : reversedArr) {
          System.out.print(i + " ");
        }
    }
        public static void main(String[] args) {
        int[] originalArr = {4, 5, 1, 2};
        reverseArray(originalArr);
    }
}