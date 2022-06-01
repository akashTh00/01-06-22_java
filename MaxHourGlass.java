//Print the largest (maximum) hourglass sum found in arr.

import java.io.*;
import java.util.*;

class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6];
        int maxhourses;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int maxHourglass = getHourglass(a, 1,1);
        for (int y=1; y<5; y++){
            for (int x=1; x<5; x++){
                int hourres = getHourglass(a, x, y);
                if (hourres > maxHourglass){
                    maxHourglass = hourres;
                }
            }
        }
        System.out.println(maxHourglass);
    }

    public static int getHourglass(int[][] a, int x, int y){
        return a[x][y] + a[x-1][y-1] + a[x-1][y] + a[x-1][y+1] + a[x+1][y] + a[x+1][y-1] + a[x+1][y+1];
    }
}