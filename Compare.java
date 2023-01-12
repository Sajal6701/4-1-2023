import java.util.Scanner;
public class Compare{
    public static void Greatest(int, int, int){
        if(a>b && a>c)
        {
            System.out.println(a+ " is greatest");
        }
        else(b>c){
            System.out.println(b+ " is greatest");
        }
        else{
            System.out.println(c+ " is greatest");
        }
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Greatest(a,b,c);

    }
}