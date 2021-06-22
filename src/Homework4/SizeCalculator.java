package Homework4;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class SizeCalculator implements Runnable{
    private String path;
    private volatile long size;

    public SizeCalculator(String path) {
        this.path = path;
    }


    @Override
    public void run() {
        calculateSize(path);
    }

    private void calculateSize(File folder){
        if(!folder.isDirectory()) {
            size += folder.length();
            return;
        }

        List<File> files = Arrays.asList(folder.listFiles());
        files.forEach(file -> {
            if(file.isDirectory()) calculateSize(file);
            else size += file.length();
        });
    }

    private void calculateSize(String path){
        File folder = new File(path);
        calculateSize(folder);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getSize() {
        return size;
    }

    public double getSizeGB(){
        return size/Math.pow(2, 30);
    }
}
