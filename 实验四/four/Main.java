package four;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();

        list.add(new Person("Tom",34));
        list.add(new Person("Alice",19));
        list.add(new Person("Pete",55));

        System.out.println("现有的乘客信息为：");
        System.out.println(list.toString()+"\n");

        System.out.println("排序之后的乘客信息为：");
        Collections.sort(list,new ByAgeComparator());
        System.out.println(list.toString()+"\n");

        list.poll();
        System.out.println("有一人上车之后的乘客信息为：");
        System.out.println(list.toString()+"\n");

        System.out.println("队列人数为: " + list.size());

        System.out.println("队列的乘客信息为：");
        System.out.println(list.toString());
    }
}