package three;

public class Main {
    public static void main(String[] args){
      for(int i = 2; i <= 100; ++i){
          boolean flag = false;
          for(int j = 2; j < i; ++j){
              if(i % j == 0){
                  flag = true;
                  continue;
              }
          }
          if(!flag){
              System.out.print(i + " ");
          }
      }
      System.out.println();
    }
}