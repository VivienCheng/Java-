package two;

public class Main {
    public static void main(String[] args){
        for(int i = 100; i <= 999; ++i){
            int x = i / 100;
            int y = i % 100 / 10;
            int z = i % 10;
            if(x*x*x + y*y*y + z*z*z == i){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}