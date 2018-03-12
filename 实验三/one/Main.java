package one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Num n = new Num();
        int res = n.figures(num);
        System.out.println("该整数的位数为: " + res);

        boolean flag = n.judgePalindrome();

        if(flag){
            System.out.println("该整数"+num+"是回文数");
        }else{
            System.out.println("该整数"+num+"不是回文数");
        }
        
        sc.close();
    }
}