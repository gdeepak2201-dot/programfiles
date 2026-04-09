//public class day2 {
//    public static void main(String[] args) {
//        int arr[]={11,10,9,8};
//        int count =0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]>arr[j] &&i<j){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}


//import java.util.Arrays;
//
//public class day2 {
//    public static void main(String[] args) {
//        int[] arr={2,1,5,7,1,9,3,6,8,8};
//        int[] arr2={2,1,8,3};
//        int arr3[]=new int[10];
//        int count=0;
//
//        for(int i =0;i<arr2.length;i++){
//            for(int j =0;j<arr.length;j++){
//                if(arr[j]==arr2[i]){
//                    arr3[count]=arr[j];
//                    count++;
//                }
//            }
//        }
//        Arrays.sort(arr);
//        for(int i=0;i<arr.length;i++){
//            boolean found =true;
//            for(int j=0;j<count;j++){
//               if(arr[i]==arr3[j]){
//                   found=false;
//                   break;
//               }
//            }
//            if(found){
//                arr3[count]=arr[i];
//                count++;
//            }
//        }
//        for(int c :arr3) {
//            System.out.print(c +" ");
//        }
//    }
//}


//public class day2 {
//    public static void main(String[] args) {
//        int arr[] ={10,5,6,3,2,20,100,80};
//        for(int i=1;i<arr.length-1;i+=2){
//            if(arr[i]>arr[i-1] && arr[i]<arr[i+1]){
//                int temp =arr[i];
//                arr[i]=arr[i-1];
//                arr[i-1]=temp;
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}


//import java.util.Arrays;
//
//public class day2 {
//    public static void main(String[] args) {
//        String s="a1b10c5";
//        int arr[] = new int[3];
//        int cc=0;
//        char s1=' ';
//        for(char c : s.toCharArray()){
//            if(c>'a' && c<'z') {
//                for (int i = 0; i < cc; i++) {
//                    System.out.print(s1);
//                }
//                cc = 0;
//                s1 = c;
//            }
//            if(c>='0' && c<='9') {
//                cc+=cc*10+(c-'0');
//            }
//            for(int i=0;i<cc;i++){
//                System.out.print(s1);
//                if(i==cc) break;
//            }
//        }
//    }
//}


public class day2 {
    public static void main(String[] args) {
        int arr[] ={10,5,6,3,2,20,100,80};
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]<arr[i+1]){
                    int temp =arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            else{
                if(arr[i]>arr[i+1]){
                int temp =arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                }
            }
        }
        for(int c :arr){
            System.out.print(c+" ");
        }
    }
}