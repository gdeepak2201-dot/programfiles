//import java.util.Scanner;
//public class day1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n=input.nextInt();
//        int arr[] = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=input.nextInt();
//        }
//        int sumprofit=0;
//        int profit =arr[0];
//        for(int i=1;i<=n-1;i++){
//            if(arr[i]>arr[i-1]){
//                sumprofit+=arr[i]-arr[i-1];
//            }
//        }
//        System.out.println(sumprofit);
//    }
//
//}




//import java.util.Arrays;
//import java.util.Scanner;
//public class day1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int arr[] ={1,2,3,4,5};
//        int arr2[] ={1,2,6};
//        int inter=0;
//        int union=0;
//        Arrays.sort(arr);
//        Arrays.sort(arr2);
//        for(int i=0;i<5;i++){
//            union++;
//            for(int j=0;j<3;j++){
//                if(arr[i]==arr2[j]){
//                    inter++;
//                }
//            }
//        }
//        for(int i=0;i<3;i++){
//            boolean flag=true;
//            for(int j=0;j<5;j++){
//                if(arr[j]==arr2[i]){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag==true){
//                union++;
//            }
//        }
//        System.out.print(inter+" "+union);
//    }
//}


//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//public class day1 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = 6;

import java.util.Scanner;

////        int arr[] = new int[n];
////        for(int i =0;i<n;i++){
////            arr[i] = input.nextInt();
////        }
//        int arr[] ={2,5,5,8,5,8};
//        int freq[]  = new int[n];
//        for(int j =0;j<n;j++){
//            int count =1;
//            if(freq[j]==-1) continue;
//            for(int k=j+1 ;k<n ; k++){
//                if(arr[j]==arr[k]){
//                    count++;
//                    freq[k]=-1;
//                }
//            }
//            freq[j] = count;
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (freq[i] < freq[j]) {
//
//                    int temp = freq[i];
//                    freq[i] = freq[j];
//                    freq[j] = temp;
//
//                    int t = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = t;
//                }
//            }
//        }
//
//        for(int c : freq) {
//            if(c!=-1)
//                System.out.println(c);
//        }
//        for(int i =0;i<n;i++){
//            if(freq[i]!=-1){
//                for(int j =0;j<freq[i];j++){
//                    System.out.print(arr[i]+" ");
//                }
//            }
//        }
//    }
//}


//public class day1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int total =n*(n+1)/2;
//        int arr[] = {1,2,3,5};
//        for(int i=0;i<4;i++){
//            total-=arr[i];
//        }
//        System.out.println(total);
//    }
//}


public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int arr[] = {'a','e','i','o','u'};
        boolean flag = true;
        for(int i=0;i<name.length()-1;i++){
            for(int j=0;j<arr.length-1;j++){
                char c = name.charAt(j);
                if(arr[i]==c){
                    flag=true;
                    break;
                }
                flag=false;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}