package nine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < 100; ++i){
            array[i] = (int)(Math.random() * 100);
        }

        System.out.println("产生的数组为：");
        for(int i = 0; i < 100; ++i){
            if(i % 10 == 0 && i != 0){
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }

        System.out.println('\n'+"请输入您想要查找的数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        for(int i = 0; i < 100; ++i){
            if(array[i] == num){
                res++;
            }
        }

        if(num == 0){
            System.out.println("该数组中不存在您要查找的数字"+num);
        }else{
            System.out.println("您要查找的数字为"+num + " 在该数组中出现" + res + "次");
        }
        
        sc.close();
    }
}