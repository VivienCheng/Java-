package fifth;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxNum = 0;
        for(int i = 0; i < s.length(); ++i){
            char c = s.charAt(i);
            int tmp = c - '0';
            maxNum = Math.max(tmp,maxNum);
        }
        System.out.println(maxNum);
        sc.close();
    }
}