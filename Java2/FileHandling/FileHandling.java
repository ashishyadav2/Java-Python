package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    private static void createFile(File fileObj){
        try {
            if (fileObj.createNewFile()) {
                System.out.println("Filename: "+fileObj.getName());
                System.out.println("Path: "+fileObj.getAbsoluteFile());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch (IOException e) {
            System.out.println("Unable to create file");
            e.printStackTrace();
        }
    }
    private static void write(String fileName,String text,Boolean flag){
        try {
            FileWriter fileWriter = new FileWriter(fileName,flag);
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("Write Complete!");
        }
        catch (IOException e){
            System.out.println("Unable to write to file");
            e.printStackTrace();
        }
    }
    private static void read(String filePath){
        try{
            File fileObj = new File(filePath);
            Scanner sc = new Scanner(fileObj);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (IOException e){
            System.out.println("Unable to read file");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String filePath = "C:\\Users\\ashis\\IdeaProjects\\JavaLessons\\src\\FileHandling\\files";
        String fileName = filePath+"\\hello1.txt";
        File file1 = new File(fileName);
        createFile(file1);

        String text = " Hello World hello1.txt";
        write(fileName,text,false);
        read(fileName);
    }
}
