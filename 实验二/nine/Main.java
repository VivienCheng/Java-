package nine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int i = 0; i < 100; ++i){
            array[i] = (int)(Math.random() * 100);
        }

        System.out.println("����������Ϊ��");
        for(int i = 0; i < 100; ++i){
            if(i % 10 == 0 && i != 0){
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }

        System.out.println('\n'+"����������Ҫ���ҵ����֣�");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        for(int i = 0; i < 100; ++i){
            if(array[i] == num){
                res++;
            }
        }

        if(num == 0){
            System.out.println("�������в�������Ҫ���ҵ�����"+num);
        }else{
            System.out.println("��Ҫ���ҵ�����Ϊ"+num + " �ڸ������г���" + res + "��");
        }
        
        sc.close();
    }
}