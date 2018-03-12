package eight;

public class Martrix {
    private double[][] martrix;
    private int row;
    private int col;

    public Martrix(double[][] martrix, int row, int col) {
        this.martrix = martrix;
        this.row = row;
        this.col = col;
    }

    public void set(int row, int col, double value){
        martrix[row][col] = value; }

    public double get(int row,int col){ return martrix[row][col]; }

    public int width(){ return this.col; }

    public int height(){ return this.row; }

    public Martrix add(Martrix another){
        int row = height();
        int col = width();
        double[][] n = new double[row][col];
        Martrix m = new Martrix(n,row,col);
        for(int i = 0; i < row; ++i){
            for(int j = 0; j < col; ++j){
                double value = get(i,j) + another.get(i,j);
                m.set(i,j,value);
            }
        }
        return m;
    }

    public Martrix multiply(Martrix ano){
        double[][] n = new double[height()][ano.width()];
        Martrix m = new Martrix(n,height(),ano.width());

        for(int i = 0; i < height(); ++i){
            for(int j = 0; j < ano.width(); ++j){
                double value = 0;
                for(int k = 0; k < width(); ++k){
                    value += get(i,k) * ano.get(k,j);
                }
                m.set(i,j,value);
            }
        }
        return m;
    }

    public Martrix transpose(){
        double[][] n = new double[this.col][this.row];
        Martrix m = new Martrix(n,this.col,this.row);
        for(int i = 0; i < this.row; ++i){
            for(int j = 0; j < this.col; ++j){
                double value = this.get(i,j);
                m.set(j,i,value);
            }
        }
        return m;
    }

    public void print(){
        for(int i = 0 ;i < this.row; ++i){
            for(int j = 0; j < this.col; ++j){
                System.out.print(this.get(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}