import java.util.Scanner;


import java.util.Scanner;

public class is_prime_Or_Not {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the Number to Check is Prime or not? ");
        int num =Sc.nextInt();
        boolean ans=isPrimeOrNot(num);
        System.out.println(ans);
    }
    public static boolean isPrimeOrNot(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i <= num/2; i++){
            if(num % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
