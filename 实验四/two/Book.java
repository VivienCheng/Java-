package two;

public class Book {
    private double money;
    private int num;

    public Book(double money, int num) { this.money = money;this.num = num; }
    public double getMoney() { return money; }
    public void setMoney(double money) { this.money = money; }
    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }
}