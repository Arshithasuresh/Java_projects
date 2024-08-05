import java.util.Scanner;
class digsum{
public static void main(String[]args){
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
if(n>0){
String str = Integer.toString(n);
int l = str.length();
int dig,sum=0;
for(int i =0;i<=l;i++){
dig = n%10;
sum = sum+dig;
n=n/10;
}
System.out.println(sum);
}
else{
int[] digits = new int[String.valueOf(n).length()];
int temp = n;
for (int i = 0; i < digits.length; i++) {
    digits[i] = temp % 10;
    temp /= 10;
}
System.out.println(digits[0]);
}
}
}