package six;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(100);
        System.out.println("«Î ‰»Î ˝◊÷: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while(x != 0){
            int tmp = x % 2;
            s.push((Object)tmp);
            x /= 2;
        }
        while(!s.isEmpty()){
            System.out.print(s.getTop());
        }
        System.out.println();
        sc.close();
    }
}