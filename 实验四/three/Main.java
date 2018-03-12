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
        System.out.print("������7������(1-30)�� ");
        for(int i = 0; i < 7; ++i){
            int tmp = sc.nextInt();
            if(!set.contains(tmp)) continue;
            num++;
        }

        System.out.println("���ɵ��߸�������ǣ� ");
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        if(num == 7){
            System.out.println("��ϲ��!����" + num + "����,���һ�Ƚ�");
        }else if(num == 6){
            System.out.println("��ϲ��!����" + num + "����,��ö��Ƚ�");
        }else if(num == 5){
            System.out.println("��ϲ��!����" + num + "����,������Ƚ�");
        }else {
            System.out.println("������" + num + "����");
        }
        
        sc.close();
    }
}