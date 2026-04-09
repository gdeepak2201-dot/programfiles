//public class day12 {
//    public static int sum(int a){
//        int sum=0;
//        while(a>0){
//            int remainder =a%10;
//            sum=sum+remainder;
//            a=a/10;
//        }
//        return sum;
//    }
//    public static int[] equals(int []arr){
//        int []res=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            int temp =sum(arr[i]);
//            res[i]=temp;
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//        int[] arr ={51,71,17,42};
//        int result[] = equals(arr);
//        int count =0;
//        for(int i=0;i<result.length;i++){
//            for(int j=i+1;j<result.length;j++){
//                if(result[i]==result[j]){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

//
//import java.util.Arrays;
//
//public class day12 {
//    public static void main(String[] args) {
//        int arr[] ={3,6,9,1};
//        if(arr.length==0){
//            System.out.println("0");
//        }
//        Arrays.sort(arr);
//        int max =Integer.MIN_VALUE;
//        for(int i=1;i<arr.length-1;i++){
//            int diff= arr[i]-arr[i-1];
//            if(diff>max) max = diff;
//        }
//        System.out.print(max);
//    }
//}

//
//public class day12 {
//    static boolean isvowel(String s){
//        char c =  s.charAt(0);
//        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        String s = "i speak goat latin";
//        String[] arr = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//        int count = 1;
//        for(int i=0;i<arr.length;i++){
//            if(!isvowel(arr[i])){
//                String res =arr[i].substring(1)+arr[i].charAt(0);
//                sb.append(res);
//                sb.append("ma");
//                for(int j=0;j<count;j++){
//                    sb.append("a");
//                }
//                sb.append(" ");
//                count++;
//            }
//            else{
//                sb.append(arr[i]);
//                sb.append("ma");
//                for(int j=0;j<count;j++){
//                    sb.append("a");
//                }
//                sb.append(" ");
//                count++;
//            }
//        }
//        System.out.println(sb.toString());
//    }
//}


//import java.util.ArrayList;
//
//public class day12 {
//    public static void main(String[] args) {
//        int n =14;
//        ArrayList<Integer> sol =new ArrayList<Integer>();
//        for(int i=1;i<=n;i++){
//            sol.add(i);
//        }
//        int kill=1;
//        int i=0;
//        while(sol.size()>1){
//            kill=kill%sol.size();
//            sol.remove(kill);
//            kill=(kill+1)%sol.size();
//        }
//        System.out.println(sol.get(0));
//    }
//}

abstract class car{
//    public int m;
//    public int n;
    abstract int add(int a,int b);

}
class addd extends car{
    public int add(int a,int b){
        int c=a+b;
        return c;
    }

}
public class day12{
    public static void main(String[] args) {
        car val= new addd();
        int x=val.add(1,2);
        System.out.println(x);
    }
}
