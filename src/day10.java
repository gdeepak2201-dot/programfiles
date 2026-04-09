//import java.sql.SQLException;
//import java.util.Arrays;
//
//public class day10 {
//    public static void main(String[] args){
//        int[] arr= {31,37,33,1,5,11,55,57};
//        int m = 3;
//        Arrays.sort(arr);
//        int n = arr.length-m+1;
//        int res = Integer.MAX_VALUE;
//        for(int i =0;i<n;i++){
//            int diff =arr[i+m-1]-arr[i];
//            if(diff<res){
//                res=diff;
//            }
//        }
//        System.out.println(res);
//    }
//}

import java.util.Arrays;

//public class day10 {
//    public static void main(String[] args) {
//        int arr[] = {10,21,22,100,101,200,300};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int count =0;
//        for(int i =0;i<arr.length;i++){
//            int val = arr[i];
//            for(int j =i+1;j<arr.length;j++){
//                for(int k =j+1;k<arr.length;k++){
//                    if (val + arr[j] > arr[k]) count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

//public class day10 {
//    public static void reverse(char[] ch){
//        int start = 0;
//        int end = ch.length-1;
//        while (start < end) {
//            while(start < end && !isvowel(ch[start])){
//                start++;
//            }
//            while(start < end && !isvowel(ch[end])){
//                end--;
//            }
//            if(start < end) {
//                char temp = ch[start];
//                ch[start] = ch[end];
//                ch[end] = temp;
//                start++;
//                end--;
//            }
//        }
//    }
//    public static boolean isvowel(char ch){
//        return(ch =='a' || ch =='e' || ch =='i' || ch =='o'||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
//    }
//    public static void main(String[] args){
//        String s ="IceCream";
//        char[] ch = s.toCharArray();
//        System.out.println(Arrays.toString(ch));
//        reverse(ch);
//        System.out.println(Arrays.toString(ch));
//    }
//}

public class day10 {
    public static void main(String[] args) {
        String s ="acb";
        String s1 ="ahgbhgc";
        int index =0;

        boolean flag =true;
        for(int i=0;i<s.length();i++) {
            flag =false;
            for (int j = index; j < s1.length(); j++) {
                if (s.charAt(i) == s1.charAt(j)) {
                    index = j + 1;
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                break;
            }
        }
        if (flag) {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}