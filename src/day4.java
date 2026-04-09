//public class day4 {
//    public static void main(String[] args) {
//        int a=1;
//        int b =100;
//        for(int i=a;i<=b;i++){
//            if(i*i<b) System.out.println(i*i);
//        }
//    }
//}


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class day4 {
//    public static boolean issquare(int n) {
//        int x = 1;
//        while (n > 0) {
//            n -= x;
//            x += 2;
//        }
//        if(n==0) return true;
//        else return false;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {10, 36, 49,54, 12};
//        int[] priority = new int[5];
//        for (int i = 0; i < arr.length; i++) {int weight =0;if (issquare(arr[i])) weight += 5;if (arr[i] % 6 == 0 && arr[i] % 4 == 0) weight+= 4;if (arr[i] % 2 == 0) weight+= 3;priority[i] = weight;
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(priority[i]<priority[j]) {
//                int tem = priority[i]
//                ;priority[i] = priority[j];
//                priority[j] = tem;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                }
//            }
//        }
//        for (int c : arr) System.out.print(c + " ");
//    }
//}


public class day4 {
    public static void main(String[] args) {
        String s="COMPUTER";
        char[] c= s.toCharArray();

        for(int i=0;i<c.length;i++){
            for(int k=-1;k<2*i-1;k++){
                System.out.print(" ");
            }
            System.out.print(c[i]);
            System.out.println();
        }
    }
}