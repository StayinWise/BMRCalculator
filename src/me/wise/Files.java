package me.wise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

    public void writeToFile(String FileName, String Message) throws IOException {
        File file = new File(FileName);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(Message);
        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println("Successfully wrote to your selected file!");
    }

    public String createFile(String FileName) throws IOException{
        String directory = System.getProperty("user.home") + "\\Desktop\\Progression\\";
        File file = new File(FileName);
        int fileNum = 1;
        String fileName = "";
        if (file.exists() && !file.isDirectory()) {
            while (file.exists()) {
                fileNum++;
                file = new File(directory + "Stats-Entry#" + fileNum + ".txt");
                fileName = directory + "Stats-Entry#" + fileNum + ".txt";
                System.out.println("File created: " + file.getName());
            }
        } else if (!file.exists()) {
            file.createNewFile();
            System.out.println("File created: " + file.getName());
            fileName = directory + "Stats-Entry#" + fileNum + ".txt";
        }
        return fileName;
    }

    public void createDirectory(String path, String name){
        path = path + name;
        //Creating a File object
        File file = new File(path);
        //Creating the directory
        boolean bool = file.mkdir();
        if(bool) System.out.println("Directory created successfully");
        else System.out.println("Sorry couldn’t create specified directory");
    }


}
