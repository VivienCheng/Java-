package six;

public class Stack {
    private Object[] arr;
    private int left;

    public Stack(int n) {
        this.left = n;
        arr = new Object[n];
        for(int i = 0; i < n; ++i){
            arr[i] = null;
        }
    }

    public boolean isEmpty(){
        return (this.arr.length == this.left) ? true : false;
    }

    public void push(Object obj){
        if(this.left == 0){
            System.out.print("Error!");
            return;
        }
        this.arr[left-1] = obj;  //зјБъ 0 1 2 3 4
        left -= 1;               //ЪЃгр 0 1 2 3 4
    }

    public Object getTop(){
        if(this.isEmpty() == true){
            System.out.println("Error!");
            return null;
        }
        int res = Integer.parseInt(String.valueOf(this.arr[left]));
        this.arr[left] = null;
        left += 1;
        return res;
    }

}