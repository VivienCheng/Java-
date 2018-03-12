package one;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Judge judge = new Judge();
        boolean res = judge.judgeYear(year);
        if(res == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}