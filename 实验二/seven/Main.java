package seven;

public class Main {
    public static void main(String[] args) {
        int[][] martrix = new int[5][5];

        for(int i = 0 ; i < 5; ++i){
            for(int j = 0; j < i; ++j){
                martrix[i][j] = i * j;
            }
        }

        for(int i = 0; i < 5; ++i){
            System.out.print("<");
            for(int j = 0; j < i; ++j){
                if(j != 0) {System.out.print(" ");}
                System.out.print(martrix[i][j]);
            }
            System.out.println(">");
        }
    }
}