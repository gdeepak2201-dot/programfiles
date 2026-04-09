//import java.util.Arrays;
//
//public class day9 {
//    public static int quicksort(int arr[],int start ,int end){
//        int mid = start + (end - start)/2;
//        int pivot =arr[mid];
//        int i=start;
//        int j=end;
//        while(i<=j){
//            while(arr[i]<pivot) i++;
//            while(arr[j]>pivot)j--;
//            if(i<=j){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//                i++;
//                j--;
//            }
//        }
//        return i;
//    }
//    public static void partition(int arr[] ,int start ,int end){
//        if(start<end){
//            int mid =quicksort(arr,start,end);
//            partition(arr,start,mid-1);
//            partition(arr,mid,end);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[] ={ 43,61,12,54,9,100,49};
//        partition(arr,0,arr.length-1);
//        System.out.print(Arrays.toString(arr));
//    }
//}
import java.util.*;
public class day9{
    public static int quicksort(int arr[],int low ,int high){
        int start = low;
        int end=high;
        int mid= (start+end)/2;
        int pivot = arr[mid];
        while(start<=end){
            while(arr[start]<pivot){

                start++;

            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp =arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        return start;

    }
    public static void patition(int arr[],int low,int high){
        if(low<high) {
            int mid = quicksort(arr, low, high);
            patition(arr, low, mid - 1);
            patition(arr, mid, high);
        }
    }
    public static void main(String[] args){
        int arr[] ={43,42,87,5,6,90,45};
        patition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}