import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        
        for(int i=1;i<=100;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
else{
            int x = num/2;
            for(int i=2;i<x;i++){
                if(num%i==0){
                    return false;
                }
            }
}
    return true;
    }
}