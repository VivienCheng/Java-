package one;

import java.io.*;

public class Main {
    private static final String LINE_SEP = System.getProperty("line.separator");

    public static void main(String[] args)throws Exception {
        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in) ) ){
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while(true){
                line = in.readLine();
                if(line == null || line.equals("exit") || line.equals("EXIT")){
                    break;
                }
                stringBuilder.append(line).append(LINE_SEP);
            }
            try(PrintWriter writer = new PrintWriter("/Users/chengxiaohua/Desktop/log.txt")){
                writer.print(stringBuilder.toString());
            }
        }
    }
}