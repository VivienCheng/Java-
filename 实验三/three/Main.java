package three;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] teachers = new String[]{"����", "��ѩ÷", "������", "������", "������", "������", "������", "��;", "����ī", "κ����"};
        System.out.print("��������õĽ�ʦ����n ��1<=n<=10����");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("�����Զ������������ʦ�ֱ�Ϊ��");
        String[] arr = RandomTeacher.getRandomTeachers(teachers,n);

        for(String s : arr){
            System.out.print(s + ' ');
        }
        System.out.println();
        input.close();
    }
}