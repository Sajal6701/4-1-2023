public class MultiplicationTabl{
public static void print(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(n + " x " + i + " = " + (n * i));
    }
    System.out.println();
}
public static void main(String[] args) {
    int arr[]={12,33,45,33,64,32};
    for(int i=0; i<arr.length; i++){
    print(arr[i]);
    }
}

}