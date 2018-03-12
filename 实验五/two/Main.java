package two;

import java.io.*;

public class Main {
    public static void printContentsInOneDirectory(String path){
        File file = new File(path);
        if(!file.exists()){
            throw new RuntimeException(String.format("文件%s不存在！",path));
        }
        File[] childFiles = file.listFiles();
        for(File childFile : childFiles){
            if(childFile.isFile()){
                System.out.format("[文件]%s\n",childFile.getName());
            }else{
                System.out.format("[目录]%s\n",childFile.getName());
            }
        }
    }

    public static void readFileAndDirectory(String path, int indent) {
        File file = new File(path);
        if (!file.exists()) {
            throw new RuntimeException(String.format("文件 %s 不存在！", path));
        }
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            for (int i = 0; i < indent; ++i) {
                System.out.print("-");
            }
            if (childFile.isFile()) {
                System.out.format("[文件] %s\n", childFile.getName());
            } else {
                System.out.format("[目录] %s\n", childFile.getName());
                readFileAndDirectory(childFile.getAbsolutePath(), indent + 2);
            }
        }
    }
    public static void main(String[] args)throws Exception {
        System.out.println("测试 printContentsInOneDirectory 方法：");
        printContentsInOneDirectory("/Users/chengxiaohua/Desktop/a/c");
        System.out.println("\n测试 readFileAndDirectory 方法：");
        readFileAndDirectory("/Users/chengxiaohua/Desktop/a", 0);
    }
}