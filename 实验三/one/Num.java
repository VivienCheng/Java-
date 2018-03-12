package one;

import java.util.*;

public class Num {
    private  List<Integer> list;

    public  void setList(List<Integer> list) {
        this.list = list;
    }

    public  int figures(int num){
        List<Integer> arr = new ArrayList<>();
        int res = 0;
        while(num != 0 ){
            arr.add(num % 10);
            num /= 10;
            res++;
        }
        this.setList(arr);
        return res;
    }


    public boolean judgePalindrome(){
        int len = this.list.size();
        int mid = len/2;

        for(int i = 0,j = len-1; i < mid; ++i,--j){
            if(this.list.get(i) != this.list.get(j)){
                return false;
            }
        }
        return true;
    }
}