package three;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] teachers = new String[]{"白玉", "李雪梅", "张宇心", "秦子臻", "刘凯乐", "单新增", "曾新旺", "明途", "徐子墨", "魏温涛"};
        System.out.print("请输入调用的教师人数n （1<=n<=10）：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("该轮自动产生的随机教师分别为：");
        String[] arr = RandomTeacher.getRandomTeachers(teachers,n);

        for(String s : arr){
            System.out.print(s + ' ');
        }
        System.out.println();
        input.close();
    }
}