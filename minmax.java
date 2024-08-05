import java.util.Scanner;
import java.util.ArrayList;
class minmax{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
        int l = obj.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            int a = obj.nextInt();
            arr.add(a);
        }
        System.out.println(arr);
int max = arr.get(0);
int min = arr.get(0);
for(int i=1;i<l;i++){
if(arr.get(i)>max){
max=arr.get(i);
}
if(arr.get(i)<min){
min = arr.get(i);
}}
System.out.println("Maximum:"+ max);
System.out.println("Minimum:"+ min);
}}