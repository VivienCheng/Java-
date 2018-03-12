package five;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{99,52,13,1,45,54,78,22,31,9};
        System.out.println("原来的数组：");
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("排序之后的数组：");
        SortMethod.sortArray(array);
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println('\n'+"默认用非递归的二分查找方法 请输入您想要查找的数字：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = SortMethod.binarySearch(array,x);
        if(res != -1){
            System.out.println("存在数字" + x);
        }else{
            System.out.println("不存在数字" + x);
        }

        System.out.println('\n' + "默认用递归的二分查找方法 请输入您想要查找的数字：");
        Scanner scc = new Scanner(System.in);
        int y = scc.nextInt();
        int ress = SortMethod.binarySearchRecursion(array,y,0,array.length-1);
        if(ress != -1){
            System.out.println("存在数字" + y);
        }else{
            System.out.println("不存在数字" + y);
        }
        sc.close();
        scc.close();
    }
}