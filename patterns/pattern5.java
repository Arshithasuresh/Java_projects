class pattern5{
    public static void main(String[] args) {
        for(int i = 5;i>=1;i--){
            for(char j = 'A';j<='E';j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
       for(char i = 'A';i<='E';i++){
            for(int j = 1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
System.out.println();
        for(char i = 'E';i>='A';i--){
            for(int j = 1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
System.out.println();
        for(int i = 5;i>=1;i--){
            for(char j = 'E';j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}