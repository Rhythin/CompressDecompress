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
import java.util.zip.GZIPInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Rhythin
 */
public class Decompress {
    public static void method(File file) throws FileNotFoundException, IOException{
        String fileDir=file.getParent();
        System.out.println(fileDir);
        
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipIS = new GZIPInputStream(fis);
        
        String extension=JOptionPane.showInputDialog("enter uncompressed file extension.(Example txt, mkv, pdf)");
        FileOutputStream fos = new FileOutputStream(fileDir+"\\uncompressedfile."+extension);
        
        byte buffer[]=new byte[1024];
        int len;
        
        while((len=gzipIS.read(buffer))!= -1){
            fos.write(buffer, 0, len);
        }
        
        gzipIS.close();
        fis.close();
        fos.close();
        
        
    }
    public static void main(String args[]) throws IOException{
        File path= new File("E:\\software\\Java files\\NetBeans_Projects\\Compress_Decompress\\TestFolder\\compressedfile.gz");
        method(path);
    }
}
