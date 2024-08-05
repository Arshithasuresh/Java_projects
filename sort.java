import java.util.Scanner;
import java.util.ArrayList;
class sort{
public static void main(String[] args){
Scanner obj = new Scanner(System.in);
int l = obj.nextInt();
ArrayList<Integer> arr = new ArrayList<>();
for(int i = 1;i<=l;i++){
int n = obj.nextInt();
arr.add(n);
}
System.out.println(arr);
ArrayList<Integer> sorted_arr = sort(arr);
System.out.println(sort(arr));
}
public static ArrayList<Integer> sort(ArrayList<Integer> arr){
for(int i = 0;i<arr.size()-1;i++){
for(int j = i+1;j<arr.size();j++){
if(arr.get(i)>arr.get(j)){
int temp = arr.get(i);
arr.set(i,arr.get(j));
arr.set(j,temp);}}}
return arr;
}
}