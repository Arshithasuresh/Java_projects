class pattern9{
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(char j = 'A';j<=(char)i+64;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        for(char i = 'A';i<='E';i++){
            for(char j ='A';j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}