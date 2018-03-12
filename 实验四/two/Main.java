package two;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Book> books = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入书本的数量： ");
        int num = sc.nextInt();
        for(int i = 0; i < num; ++i){
            System.out.println("请输入书名、单价、购买数量：");
            String name = sc.next();
            double money = sc.nextDouble();
            int bookNum = sc.nextInt();
            books.put(name,new Book(money,bookNum));
        }
        System.out.println("书的总价钱为：" + getSum(books));
        sc.close();
    }

    public static double getSum(HashMap<String,Book> books){
        double sumMoney = 0;
        Iterator<Map.Entry<String,Book>> iter = books.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Book> entry = (Map.Entry<String,Book>)iter.next();
            Book val = entry.getValue();
            sumMoney += (val.getMoney() * val.getNum());
            System.out.print(sumMoney + " ");
        }
        return sumMoney;
    }
}