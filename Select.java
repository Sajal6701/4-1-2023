import java.util.Random;
class Select{
    public static void main(String[] args){
        Random a = new Random();
        int b = a.nextInt(10);
        String[] word = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        System.out.print(word[b]);
    }
}