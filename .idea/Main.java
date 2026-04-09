//
//public class day13 {
//import java.util.Scanner;
//    static int max=0;
//    public static boolean isprime(int n) {
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    static void permute(String front, String str){
//        if (str.length() == 0) {
//            int n = Integer.parseInt(front);
//            if(n>max && isprime(n)){
//                max=n;
//            }
//        }else {
//            for (int i = 0; i < str.length(); i++) {
//                permute(front + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int  n = sc.nextInt();
//        String str = String.valueOf(n);
//        permute("",str);
//        System.out.println(max);
//
//    }
//}

//
//import java.util.*;
//
//public class day13 {
//    public static void main(String[] args) {
//        int[] arr = {3, 9, 7, 4, 6, 8};
//        int x = 3;
//        List<List<Integer>> groups = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[j]%x==0 && arr[i]%x==0){
//                    groups.add(Arrays.asList(arr[i],arr[j]));
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                for(int k = j+1; k < arr.length; k++){
//                    if(arr[j]%x==0 && arr[i]%x==0 && arr[k]%x==0) {
//                    groups.add(Arrays.asList(arr[i], arr[j],arr[k]));
//                    }
//                }
//            }
//        }
//        for (List<Integer> group : groups) {
//            System.out.println(group);
//        }
//    }
//}

import java.util.Scanner;

class day13 {
    private boolean flag = false;
    int redd, yellow, green;

    day13(int redd, int yellow, int green) {
        this.redd = redd;
        this.yellow = yellow;
        this.green = green;
    }

    public synchronized void setCycle(int cycle) {
        for (int i = 0; i < cycle; i++) {
            try {
                while (flag) {
                    wait();
                }
                System.out.println("Red light duration: " + redd);
                Thread.sleep(1000);
                flag = true;
                notify();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class red extends Thread {
    day13 signal;
    int cycle;

    red(day13 signal,int cycle) {
        this.signal = signal;
        this.cycle = cycle;
    }

    public void run() {
        signal.setCycle(cycle);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int yellow = sc.nextInt();
        int green = sc.nextInt();
        day13 signal = new day13(red, yellow, green);
        new red(signal).start();
    }
}

