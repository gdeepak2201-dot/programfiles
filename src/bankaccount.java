

import java.util.*;
import java.util.ArrayList;

public class bankaccount {
    private int accno;
    private String name;
    private int balance;
    private List<String> transactions;
    bankaccount(int accno,String name,int balance){
        this.accno=accno;
        this.name=name;
        this.balance=balance;
        this.transactions=new ArrayList<>();
        transactions.add("account created"+name);
    }
    public void deposit(int amount){
        if(amount < 0){
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.println("Deposited " + amount + " | Balance: " + balance);
            transactions.add("Deposited " + amount + " | Balance: " + balance);
        }
    }

    public void withdraw(int amount){
        if(amount < 0){
            System.out.println("Invalid amount");
        } else if(amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrew " + amount + " | Balance: " + balance);
            transactions.add("Withdrew " + amount + " | Balance: " + balance);
        }
    }

    public void check(){
        System.out.println("Checking Balance: " + balance);
    }

    public void ministate(){
        for(int i=0;i<transactions.size();i++){
            System.out.println(i+1+" "+transactions.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        bankaccount a=new bankaccount(222222,"deepu",10000);
        switch(n) {
            case 1:
                int amount = sc.nextInt();
                a.deposit(amount);
                break;
            case 2:
                int amount2 = sc.nextInt();
                a.withdraw(amount2);
                break;
            case 3:
                a.check();
                break;
            case 4:
                a.ministate();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

}
