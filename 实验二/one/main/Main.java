package main;

import figure.*;

public class Main {
    public static void main(String[] args) {
        Circular c = new Circular(3);
        System.out.printf("Բ���ܳ�: %.2f\nԲ�����: %.2f\n",c.getPerimeter(),c.getSize());
        System.out.println("--------------------");

        Rectangle r = new Rectangle(2,9);
        System.out.printf("���ε��ܳ�: %.2f\n���ε����: %.2f\n",r.getPerimeter(),r.getSize());
        System.out.println("--------------------");

        Triangle t = new Triangle(4,4,4);
        System.out.printf("�����ε��ܳ�: %.2f\n�����ε����: %.2f\n",t.getPerimeter(),t.getSize());
        System.out.println("--------------------");
    }
}