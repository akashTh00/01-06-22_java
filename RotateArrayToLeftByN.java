import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int n = scan.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; ++i) {
            A[i] = scan.nextInt();
        }
        for (int i=0; i<n; ++i) {
            rotateArray(A);
        }
        for (int a : A) {
            System.out.print(a+" ");
        }
        System.out.println("");
    }
    
    private static void rotateArray(int[] A) {
        int t = A[0];
        for (int i=0; i<A.length-1; ++i) {
            A[i] = A[i+1];
        }
        A[A.length-1] = t;
    }
}
