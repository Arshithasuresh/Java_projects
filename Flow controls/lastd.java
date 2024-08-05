import java.util.Scanner;
class lastd{
public static void main(String[] args){
Scanner last = new Scanner(System.in);
int a = last.nextInt();
if(a>=0){
System.out.print("The last digit is:"+ a%10);
}
else{
System.out.print("The last digit is:"+ -(a%10));
}
}
}