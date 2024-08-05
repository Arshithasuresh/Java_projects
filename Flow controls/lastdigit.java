import java.util.Scanner;
class lastdigit{
public static void main(String[] args){
Scanner last = new Scanner(System.in);
int a = last.nextInt();
int b = last.nextInt();
if(a>0 && b>0){
if (a%10==b%10){
System.out.println("True");
}
else{
System.out.println("False");
}}
else{
System.out.println("Negative Number");}
}}