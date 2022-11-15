/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Rhythin
 */
public class Compress {
    public static void method(File file)throws IOException, FileNotFoundException{
        String fileDir= file.getParent();
        System.out.println(fileDir);
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDir+"\\compressedfile.gz");
        GZIPOutputStream gzipOS= new GZIPOutputStream(fos);
        
        byte buffer[]=new byte[1024];
        int len;
        
        while((len=fis.read(buffer))!=-1){
            gzipOS.write(buffer, 0, len);
        }
        
        fis.close();
        gzipOS.close();
        fos.close();
        
    }
    public static void main(String args[]) throws IOException, FileNotFoundException{
        File path=new File("E:\\software\\Java files\\NetBeans_Projects\\Compress_Decompress\\TestFolder\\text_file.txt");
        method(path);
    }
}
