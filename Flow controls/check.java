import java.util.Scanner;
class check{
public static void main(String[] args){
Scanner num = new Scanner(System.in);
int n = num.nextInt();
if(n%2==0){
System.out.println("Even");
}
else{
System.out.println("Odd");
}
}
}