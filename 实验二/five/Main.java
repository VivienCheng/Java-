package five;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{99,52,13,1,45,54,78,22,31,9};
        System.out.println("ԭ�������飺");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("����֮������飺");
        SortMethod.sortArray(array);
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println('\n'+"Ĭ���÷ǵݹ�Ķ��ֲ��ҷ��� ����������Ҫ���ҵ����֣�");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = SortMethod.binarySearch(array,x);
        if(res != -1){
            System.out.println("��������" + x);
        }else{
            System.out.println("����������" + x);
        }

        System.out.println('\n' + "Ĭ���õݹ�Ķ��ֲ��ҷ��� ����������Ҫ���ҵ����֣�");
        Scanner scc = new Scanner(System.in);
        int y = scc.nextInt();
        int ress = SortMethod.binarySearchRecursion(array,y,0,array.length-1);
        if(ress != -1){
            System.out.println("��������" + y);
        }else{
            System.out.println("����������" + y);
        }
        sc.close();
        scc.close();
    }
}