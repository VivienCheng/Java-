package four;

public class Main {
    public static void main(String[] args) {
        String s = "������Ѽ��189 ���۰ٺϣ�15 �������㣺80";
        System.out.println("��˼�¼Ϊ: "+ s);
        String[] foods = s.split(" ");
        double totalPrice = 0;
        for(int i = 0; i < foods.length; ++i){
            String[] food = foods[i].split("��");
            System.out.println("��Ʒ����" + food[0] + " ��Ʒ�۸�" + food[1]);
            totalPrice += Double.parseDouble(food[1]);
        }
        System.out.println("���ϲ�Ʒ�ܼ�Ϊ" + totalPrice);
    }
}