import java.util.Scanner;
import java.util.ArrayList;
class asciivalue{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int l = obj.nextInt();
ArrayList<Integer> arr = new ArrayList<>();
for(int i=1;i<=l;i++){
int a = obj.nextInt();
arr.add(a);}
System.out.println(arr);
for(int i = 0; i<l;i++){
System.out.print((char) arr.get(i).intValue()+" ");}
}
}