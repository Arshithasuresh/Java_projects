import java.util.ArrayList;
import java.util.Scanner;
class searcharray{
public static void main(String[] args){
int[] arr={1,4,34,56,7};
System.out.println("Enter the num to search:");
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
boolean found = false;
for(int i = 0;i<5;i++){
if(arr[i]==n){
System.out.println(i);
found = true;
break;
}
}
if(found!=true){
System.out.println("-1");
}
}
}