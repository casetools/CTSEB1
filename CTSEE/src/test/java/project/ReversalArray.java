package project;
/*
 * <h1>Reversal Array</h1>
 * This is a simple Program of Reversal Array
 * @author Nilesh Gautam
 * @version 1.0
 * @date    2022-06-22
 * */

public class ReversalArray {


  /*
   * @param a 
   * @param n
   * 
   * */
   
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}

