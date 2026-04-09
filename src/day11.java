//public class day11 {
//    public static void main(String[] args) {
//        String s ="abc";
//        int []arr = {3,5,9};
//        int count =0;
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum+=arr[i];
//        }
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<arr.length;i++){
//            char c = s.charAt(i);
//            c = (char) ('a' + (c -'a' + sum));
//            sum-=arr[i];
//            sb.append(c);
//        }
//        System.out.println(sb.toString());
//    }
//}


//import java.util.Scanner;
//
//public class day11 {
//    public static void main(String[] args) {
//        int t= 5;
//        int []arr={7,0,5,1,3};
//        int []arr2={1,2,1,3,4};
//        int maxx =Integer.MIN_VALUE;
//        int val=0;
//        for(int i=0;i<arr.length;i++){
//            val+=arr[i]-arr2[i];
//            if(val>maxx){
//                maxx=val;
//            }
//        }
//        System.out.println(maxx);
//    }
//}

//
//public class day11 {
//    public static void main(String[] args) {
//        char[] arr = {'a','b','b','c','c','c','a','c','z'};
//        int fre[] = new int[26];
//        for(int i=0;i<arr.length;i++){
//            fre[arr[i]-'a']++;
//        }
//
//        for(int i=0;i<26;i++){
//            if(fre[i]%2!=0){
//                System.out.println((char)('a'+i));
//                break;
//            }
//        }
//    }
//}

//
//import java.util.Scanner;
//
//public class day11 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n=20;
//        int b=2;
//        int p=3;
//        int bb =12;
//        int pp=12;
//        for(int i=1;i<=n;i++){
//            bb-=b;
//            if(bb>=0) n--;
//        }
//        for(int i=1;i<=n;i++){
//            pp-=p;
//            if(pp>=0) n--;
//        }
//        System.out.println(n);
//    }
//}

//import java.util.Scanner;
//
//public class day11 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = {4 ,8, 2, 1, 9, 5, 6, 3};
//        for(int i=0;i<arr.length;i++){
//            int maxx=Integer.MIN_VALUE;
//            int minn=Integer.MAX_VALUE;
//            int index=0;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]<arr[j]){
//                    maxx=arr[j];
//                    index=j;
//                    break;
//                }
//                else{
//                    maxx=-1;
//                }
//            }
//            for(int j=index;j<arr.length;j++){
//                if(maxx>arr[j]){
//                    minn=arr[j];
//                    break;
//                }
//                else{
//                    minn=-1;
//                }
//            }
//            System.out.println(minn);
//        }
//
//    }
//}

//import java.util.Arrays;
//
//public class day11 {
//    public static void main(String[] args) {
//        int b=5;
//        int c =10;
//        int arr[] ={8,5,4,3,2};
//        Arrays.sort(arr);
//        int count=0;
//        int i=0;
//        while(c>0){
//            c-=arr[i];
//            if(c>0){
//                count++;
//            }
//            i++;
//        }
//        System.out.println(count);
//    }
//}


import java.util.Arrays;

public class day11 {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 5, 8, 9, 10, 17, 17, 20};
        int[] profit = new int[n + 1];
        profit[0] = 0;
        for (int i = 1; i <= n; i++) {
            int man = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                int sum = arr[j - 1] + profit[i - j];
                if (sum > man) {
                    man = sum;
                }
            }
            profit[i] = man;
        }
        System.out.print(Arrays.toString(profit));
    }
}