package one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("������һ��������");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Num n = new Num();
        int res = n.figures(num);
        System.out.println("��������λ��Ϊ: " + res);

        boolean flag = n.judgePalindrome();

        if(flag){
            System.out.println("������"+num+"�ǻ�����");
        }else{
            System.out.println("������"+num+"���ǻ�����");
        }
        
        sc.close();
    }
}