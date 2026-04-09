//public class day3 {
//    public static void main(String[] args) {
//        String s="01010101";
//        boolean found =true;
//        for(int j=0;j<s.length();j++){
//            char c =s.charAt(j);
//            if(c=='1' || c=='0'){
//                found = true;
//            }else {
//                found = false;
//                break;
//            }
//
//        }
//        if(found==true){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//    }
// }




//public class day3 {
//        public static void main(String[] args) {
//            String s ="string";
//            String res =" ";
//            if(s.length()<3){
//                System.out.println(s);
//                return;
//            }
//            else if(s.length()>=3 && s.charAt(s.length()-1)=='g' && s.charAt(s.length()-2)=='n'  && s.charAt(s.length()-3)=='i'){
//                res+=s+"ly";
//                System.out.println(res);
//                return;
//            }
//            else if(s.length()>=3){
//                res+=s+"ing";
//                System.out.println(res);
//                return;
//            }
//        }
//}


import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        if(n%5==0){
            System.out.println("last finger");
        }
        else if(n%5==1){
            System.out.print("first finger");
        }
        else if(n%5==2){
            System.out.print("center");
        }
        else if(n%5==3){
            System.out.print("last before");
        }
        else if(n%5==4){
            System.out.print("arrow");
        }
    }
}