//import java.util.Arrays;
//
//public class day6 {
//    public static boolean isequal(char[] arr,String b){
//        if( new String(arr).equals(b)){
//            return true;
//        }
//        return false;
//    }
//    public static void rotate(char[] arr){
//        char first = arr[0];
//        for(int i = 0; i < arr.length-1; i++){
//            arr[i] =arr[i+1];
//        }
//        arr[arr.length-1] =first;
//    }
//    public static void main(String[] args) {
//        String a = "abcd";
//        String b="cdab";
//        if(a.equals(b)){
//            System.out.print("false");
//            return;
//        }
//        char arr[] =a.toCharArray();
//        for(int i=0;i<arr.length;i++){
//            if(isequal(arr,b)){
//                System.out.print(true);
//                return;
//            }
//            else{
//                rotate(arr);
//            }
//        }
//        System.out.print("false");
//    }
//}


//public class day6 {
//    public static void main(String[] args) {
//         String a = "zy";
//         int result =0;
//         for(int i = 0; i < a.length(); i++){
//             char ch = a.charAt(i);
//             result=result*26+(ch-'a'+1);
//         }
//         System.out.print(result);
//    }
//}


//public class day6 {
//    public static void main(String[] args) {
//        String n ="192";
//        String n1 =String.valueOf(Integer.parseInt(n)*2);
//        String n2 = String.valueOf(Integer.parseInt(n)*3);
//        String res =n1.concat(n2).concat(n);
//        System.out.println(res);
//        boolean found = true;
//    for(int i=1;i<res.length();i++){
//        found = false;
//        for(int j=0;j<res.length();j++){
//            char c = res.charAt(j);
//            if(i== c-'0'){
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            break;
//        }
//    }
//    if(found){
//        System.out.println("YES");
//    }
//    else{
//    System.out.println("NO");}
//    }
//}


public class day6 {
    public static void main(String[] args) {
        String s ="abcd";
        StringBuilder sb=new StringBuilder(s).reverse().toString();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                count++;
            }
        }
    }
}