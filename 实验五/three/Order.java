package three;

import java.util.*;
import java.io.*;

public class Order {
    public static void main(String[] args) {
        String s = "烤鸭:1,土豆丝:2,烤鱼:1";
        System.out.println("点菜的菜单为： " + s);
        Order first = new Order();
        List<String> orderDatas = first.readFile("/Users/chengxiaohua/Desktop/orders.txt");
        List<String> dishesDatas = first.readFile("/Users/chengxiaohua/Desktop/dishes.txt");
        Map<String, Integer> orderDetail = first.resolveOrderDatas(orderDatas);
        Map<String, Integer> dishesDetail = first.resolveDishesDatas(dishesDatas);

        int totalPrice = 0;
        for (Map.Entry<String, Integer> e : orderDetail.entrySet()) {
            String dishesName = e.getKey();
            int dishesCount = e.getValue();
            int perPrice = dishesDetail.get(dishesName) * dishesCount;
            totalPrice += perPrice;
            System.err.println(dishesName+"总消费为："+perPrice);
        }
        System.out.println("总消费为："+totalPrice);
    }

    private List<String> readFile(String fileName) {
        if (fileName != null && !"".equals(fileName)) {
            File file = null;
            file = new File(fileName);
            if (file.exists()) {
                List<String> datas = new ArrayList<>();
                try {
                    InputStream is = new FileInputStream(file);
                    BufferedReader br = new BufferedReader(new InputStreamReader(is,"gb2312"));
                    String str = null;
                    while (true) {
                        str = br.readLine();
                        if (str != null) {
                            datas.add(str);
                        } else { break; }
                    }
                    br.close();
                } catch (Exception e) { }
                return datas;
            }
        }
        return null;
    }

    private Map<String, Integer> resolveOrderDatas(List<String> datas) {
        if(datas == null) return null;
        Map<String, Integer> orderDetail = new HashMap<>();
        for (int i = 0; i < datas.size(); ++i) {
            String[] temp1 = datas.get(i).split(",");
            for (int j = 0; j < temp1.length; j++) {
                String[] temp2 = temp1[j].split(":");
                if (temp2.length == 2) {
                    if (orderDetail.get(temp2[0]) != null) {
                        orderDetail.put(temp2[0], Integer.parseInt(temp2[1]) + orderDetail.get(temp2[0]));
                    } else {
                        orderDetail.put(temp2[0], Integer.parseInt(temp2[1]));
                    }
                }
            }
        }
        return orderDetail;
    }


    private Map<String, Integer> resolveDishesDatas(List<String> datas) {
        if(datas == null) return null;
        Map<String, Integer> dishesDetail = new HashMap<>();
        String[] temp = null;
        for (int i = 0; i < datas.size(); i++) {
            temp = datas.get(i).split(":");
            if (temp.length == 2) {
                dishesDetail.put(temp[0], Integer.parseInt(temp[1]));
            }
        }
        return dishesDetail;
    }
}