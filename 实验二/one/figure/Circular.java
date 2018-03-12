package figure;

public class Circular {
    private double r;

    public Circular(double r) {
        this.r = r;
    }

    public double getPerimeter(){
        return 2 * 3.14 * this.r;
    }

    public double getSize(){
       return 3.14 * this.r * this.r;
    }
}