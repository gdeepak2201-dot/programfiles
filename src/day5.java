//import java.util.Arrays;
//
//public class day5 {
//    public static void selection(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            int min =i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]<arr[min]){
//                    min =j;
//                }
//            }
//            int temp = arr[min];
//            arr[min]=arr[i];
//            arr[i]=temp;
//        }
//    }
//    public static int binary(int arr[] ,int k){
//        int start = 0;
//        int end = arr.length-1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(arr[mid]==k) return mid;
//            else if(k>arr[mid]) start = mid+1;
//            else end = mid-1;
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int n=4;
//        int arr[] ={1,3,4,2};
//        int k=arr[1];
//        selection(arr);
//        for(int c: arr) {
//            System.out.print(c+" ");
//        }
//        System.out.println();
//        System.out.println(binary(arr,k));
//
//    }
//}


//import java.util.Scanner;
//
//public class day5 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a=input.nextInt();
//        int b=input.nextInt();
//        int c=input.nextInt();
//        if(a+b==c || a+c==b || b+a==c || b+c==a ){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//    }


//public class day5 {
//    private static int mini(int[] arr){
//        int min = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] < arr[min]){min = i;}
//
//        }
//        return min;
//    }
//    private static int maxi(int[] arr){
//        int min = 0;
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] > arr[min]){min = i;}
//
//        }
//        return min;
//    }
//    public static void main(String[] args) {
//        int arr[] ={2,1,3};
//        int arr2[] ={1,4,1};
//        int sum;
//        int minind =  mini(arr);
//        int maxind = maxi(arr);
//        while(true){
//           sum = arr[maxind] - arr[minind];
//           int bmin = mini(arr2);
//           if (arr[maxind] <= arr2[bmin]) break;
//
//           else{
//               int temp = arr[maxind];
//               arr[maxind] = arr2[bmin];
//               arr2[bmin] = temp;
//           }
//        }
//        sum = arr[maxind] - arr[minind];
//        System.out.println(sum);
//        //System.out.println(Arrays.stream(arr).count());
//    }
//    private static void swap(int[] arr,int a,int b){
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//
//    public static class Tracking{
//        private int step;
//        private int time;
//        private String activity;
//        private int calories;
//        public int goal;
//
//
//        tracking(int step,int time,int calories,String activity){
//            this.step = step;
//            this.time = time;
//            this.activity = activity;
//            this.calories = calories;
//            this.goal=goal;
//        }
//
//        public int getstep(){
//            return step;
//        }
//        public int gettime(){
//            return time;
//        }
//        public int getcalories(){
//            return calories;
//        }
//
//        public void setgoal(int goaltoday){
//            goal=goaltoday;
//        }
//
//        public void task(int taskgoal){
//            if(goal>=taskgoal){
//                System.out.println("DAily goal completed");
//            }
//            else{
//                System.out.println("on process");
//            }
//        }
//
//        public void dailyreports(){
//            System.out.println("calories:" + getcalories());
//            System.out.println("time" + getcalories());
//            System.out.println("Activity: " + activity);
//            System.out.println("Steps: " + getstep());
//            System.out.println("Time: " + gettime() + " minutes");
//        }
//        public class Main {
//            public static void main(String[] args) {
//
//                Tracking t = new Tracking(8500, 60, 320, "Running");
//
//                t.setgoal(8000);
//
//                t.dailyreports();
//
//                t.task();
//            }
//        }
//    }
//}