class pattern11{
    public static void main(String[] args) {
        for(int i = 5;i>=1;i--){
            for(char j = 'A';j<=i+64;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 1;i<=5;i++){
            for(char j = 'E';j>=64+i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for(char i='A';i<='E';i++){
            for(int j =5-(i-'A');j>=1;j--){
                System.out.print(i);
            }
            System.out.println();
        }
         System.out.println();
        for(char i='E';i>='A';i--){
            for(int j =5;j>=5-(i-'A');j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}