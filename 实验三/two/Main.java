package two;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("请输入一个字符串：");
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

        System.out.println("该字符串中大写字母个数为： " + numOfUpperCase);
        System.out.println("该字符串中小写字母个数为： " + numOfLowerCase);
        System.out.println("该字符串中数字个数为： " + numOfDigit);
        
        sc.close();
    }
    
}