import java.util.Scanner;
class sumlastd{
public static void main(String[] args){
Scanner sum = new Scanner(System.in);
int a = sum.nextInt();
int b = sum.nextInt();
int c = a%10;
int d = b%10;
int r = c+d;
System.out.print("The sum of last digits are:"+ r);
}
}