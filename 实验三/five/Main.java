package five;

public class Main {
    public static void main(String[] args) {
        String s = "1,2;3,4,5;6,7,8";
       
        String[] str = s.split(";");
        int row = str.length;

        double[][] array = new double[row][];
        for(int i = 0; i < row; ++i){
            String[] subStr = str[i].split(",");
            int col = subStr.length;
            array[i] = new double[col]; //!!!!!!!
            for(int j = 0; j < col; ++j){
                array[i][j] = Double.parseDouble(subStr[j]);
                System.out.print("d["+i+","+j+"]="+array[i][j] + " ");
            }
            System.out.println();
        }
    }
}