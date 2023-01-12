class Pyramid{
    public static void main(String[] args){
        int n = 4;
        int t = 5;
        for(int i = 0; i <= n ; i++ ){
            for(int j=n; j>=i ; j--){
                System.out.print(t);
            }
            System.out.println();
            t--;
        }
    }
}