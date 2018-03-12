package four;

public class Main {
    public static void main(String[] args) {
        String s = "北京烤鸭：189 西芹百合：15 清蒸鲈鱼：80";
        System.out.println("点菜记录为: "+ s);
        String[] foods = s.split(" ");
        double totalPrice = 0;
        for(int i = 0; i < foods.length; ++i){
            String[] food = foods[i].split("：");
            System.out.println("菜品名：" + food[0] + " 菜品价格：" + food[1]);
            totalPrice += Double.parseDouble(food[1]);
        }
        System.out.println("以上菜品总价为" + totalPrice);
    }
}