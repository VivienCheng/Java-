package four;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();

        list.add(new Person("Tom",34));
        list.add(new Person("Alice",19));
        list.add(new Person("Pete",55));

        System.out.println("���еĳ˿���ϢΪ��");
        System.out.println(list.toString()+"\n");

        System.out.println("����֮��ĳ˿���ϢΪ��");
        Collections.sort(list,new ByAgeComparator());
        System.out.println(list.toString()+"\n");

        list.poll();
        System.out.println("��һ���ϳ�֮��ĳ˿���ϢΪ��");
        System.out.println(list.toString()+"\n");

        System.out.println("��������Ϊ: " + list.size());

        System.out.println("���еĳ˿���ϢΪ��");
        System.out.println(list.toString());
    }
}