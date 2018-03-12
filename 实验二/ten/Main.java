package ten;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[6][6];

        int maxNum = 0;
        for(int i = 0; i < 6; ++i){
            for(int j = 0; j < 6; ++j){
                array[i][j] = (int)(Math.random() * 40);
                if(array[i][j] > 30) array[i][j] -= 10;
                maxNum = Math.max(maxNum,array[i][j]);
            }
        }

        System.out.println("该矩阵为：");
        print(array,6,6);
        System.out.println("该矩阵最大值为：" + maxNum + "\n");

        System.out.println("该转置矩阵为：");
        int[][] array2 = transpose(array,6,6);
        print(array2,6,6);
    }

    public static int[][] transpose(int[][] array,int row,int col){
        int[][] n = new int[col][row];
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                n[j][i] = array[i][j];
            }
        }
        return n;
    }

    public static void print(int[][] array,int row,int col){
        for(int i = 0 ;i < row; ++i){
            for(int j = 0; j < col; ++j){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}