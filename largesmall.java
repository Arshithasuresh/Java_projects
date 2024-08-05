import java.util.Scanner;
import java.util.ArrayList;
class largesmall{
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
System.out.println("The largest 2 numbers are "+sorted_arr.get(l-1)+" and "+sorted_arr.get(l-2));
System.out.println("The smallest 2 numbers are "+sorted_arr.get(0)+" and "+sorted_arr.get(1));
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