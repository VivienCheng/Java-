package three;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        while(set.size() < 7){
            int rand = (int)(Math.random() * 30 + 1);
            set.add(rand);
        }
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.print("请输入7个整数(1-30)： ");
        for(int i = 0; i < 7; ++i){
            int tmp = sc.nextInt();
            if(!set.contains(tmp)) continue;
            num++;
        }

        System.out.println("生成的七个随机数是： ");
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        if(num == 7){
            System.out.println("恭喜您!中了" + num + "个号,获得一等奖");
        }else if(num == 6){
            System.out.println("恭喜您!中了" + num + "个号,获得二等奖");
        }else if(num == 5){
            System.out.println("恭喜您!中了" + num + "个号,获得三等奖");
        }else {
            System.out.println("您中了" + num + "个号");
        }
        
        sc.close();
    }
}