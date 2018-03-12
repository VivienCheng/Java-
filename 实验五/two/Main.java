package two;

import java.io.*;

public class Main {
    public static void printContentsInOneDirectory(String path){
        File file = new File(path);
        if(!file.exists()){
            throw new RuntimeException(String.format("�ļ�%s�����ڣ�",path));
        }
        File[] childFiles = file.listFiles();
        for(File childFile : childFiles){
            if(childFile.isFile()){
                System.out.format("[�ļ�]%s\n",childFile.getName());
            }else{
                System.out.format("[Ŀ¼]%s\n",childFile.getName());
            }
        }
    }

    public static void readFileAndDirectory(String path, int indent) {
        File file = new File(path);
        if (!file.exists()) {
            throw new RuntimeException(String.format("�ļ� %s �����ڣ�", path));
        }
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            for (int i = 0; i < indent; ++i) {
                System.out.print("-");
            }
            if (childFile.isFile()) {
                System.out.format("[�ļ�] %s\n", childFile.getName());
            } else {
                System.out.format("[Ŀ¼] %s\n", childFile.getName());
                readFileAndDirectory(childFile.getAbsolutePath(), indent + 2);
            }
        }
    }
    public static void main(String[] args)throws Exception {
        System.out.println("���� printContentsInOneDirectory ������");
        printContentsInOneDirectory("/Users/chengxiaohua/Desktop/a/c");
        System.out.println("\n���� readFileAndDirectory ������");
        readFileAndDirectory("/Users/chengxiaohua/Desktop/a", 0);
    }
}