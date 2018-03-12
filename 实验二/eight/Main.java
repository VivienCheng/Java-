package eight;

public class Main {
    public static void main(String[] args) {
        double[][] m1 = new double[][]{{1,2,3,4},{6,7,8,9}};
        double[][] m2 = new double[][]{{1,2,3,4},{4,3,2,1}};
        double[][] m3 = new double[][]{{1,2},{2,1},{1,2},{2,1}};

        System.out.println("martrix1 : ");
        Martrix martrix1 = new Martrix(m1,2,4);
        martrix1.print();

        System.out.println("martrix2 : ");
        Martrix martrix2 = new Martrix(m2,2,4);
        martrix2.print();

        System.out.println("martrix3 : ");
        Martrix martrix3 = new Martrix(m3,4,2);
        martrix3.print();

        System.out.println("martrix1和martrix2相加: ");
        Martrix martrix4 = martrix1.add(martrix2);
        martrix4.print();

        System.out.println("martrix1和martrix3相乘: ");
        Martrix martrix5 = martrix1.multiply(martrix3);
        martrix5.print();

        System.out.println("martrix1的转置矩阵为: ");
        Martrix martrix6 = martrix1.transpose();
        martrix6.print();
    }
}