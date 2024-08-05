import java.util.ArrayList;
import java.util.Scanner;
class avgarray{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int l = obj.nextInt();
ArrayList<Integer> arr = new ArrayList<>();;
for(int i=1;i<=l;i++){
int a = obj.nextInt();
arr.add(a);
}
System.out.println(arr);
int sum = 0;
for(int i=0;i<l;i++){
sum = sum+arr.get(i);
}
System.out.println(sum);
double avg = sum/l;
System.out.println(avg);
}}