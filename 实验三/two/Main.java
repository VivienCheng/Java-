package two;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("������һ���ַ�����");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int numOfUpperCase = 0;
        int numOfLowerCase = 0;
        int numOfDigit = 0;

        int len = s.length();
        for(int i = 0; i < len; ++i){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                numOfDigit++;
            }else if(Character.isUpperCase(c)){
                numOfUpperCase++;
            }else if(Character.isLowerCase(c)){
                numOfLowerCase++;
            }
        }

        System.out.println("���ַ����д�д��ĸ����Ϊ�� " + numOfUpperCase);
        System.out.println("���ַ�����Сд��ĸ����Ϊ�� " + numOfLowerCase);
        System.out.println("���ַ��������ָ���Ϊ�� " + numOfDigit);
        
        sc.close();
    }
    
}