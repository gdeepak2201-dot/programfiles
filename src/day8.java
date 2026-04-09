//import java.util.Arrays;
//import java.util.Scanner;
//
//public class day8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i]=sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int position =n-m;
//        int pass = arr[position]-1;
//        if(pass>=0) System.out.print(pass+" ");
//        else System.out.print("all fail");
//
//    }
//}


//import java.util.*;
//public class day8 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int[] plates = new int[N];
//        for (int i = 0; i < N; i++) {
//            plates[i] = sc.nextInt();
//        }
//        Arrays.sort(plates);
//        int sum = 0;
//        int count = 0;
//        for (int i = N - 1; i >= 0; i--) {
//            sum += plates[i];
//            count++;
//            if (sum >= M) {
//                System.out.println(count);
//                return;
//            }
//        }
//        System.out.println(-1);
//    }
//}


import java.util.Arrays;

public class day8 {
    public static void mergesort(int[] arr, int first , int mid , int last){
        int n1 = mid-first+1;
        int n2 = last - mid;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i] =arr[first+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i] =arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=first;
        while(i<n1&&j<n2){
            if(arr1[i] < arr2[j]){
                arr[k]=arr1[i];
                i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=arr2[j++];
            k++;
        }
    }
    public static void sort(int[] arr, int first, int last){
        if(first<last){
            int mid =(last+first)/2;
            sort(arr,first,mid);
            sort(arr,mid+1,last);
            mergesort(arr,first,mid,last);
        }

    }
    public static void main(String[] args) {
        int arr[]={88,33,2,5,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}