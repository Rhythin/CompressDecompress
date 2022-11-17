/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Rhythin
 */
public class filesizeview extends JOptionPane implements ActionListener{
    
    JOptionPane pane;
    
    public filesizeview(File before, File after){
        
        long beforeSize= before.length()/1024;
        long afterSize= after.length()/1024;
        
        double percent=(double)afterSize/beforeSize*100;
        
        String msgString=   "File size before = "+beforeSize+" KB\n"+
                            "File Size After = "+afterSize+" KB\n"+
                            "compressed to "+String.format("%.2f", percent)+" % of original size";
        
        
        JOptionPane.showMessageDialog(null, msgString );
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
    }
    public static void main(String args[]){
        File before=new File("E:\\software\\Java files\\NetBeans_Projects\\Compress_Decompress\\TestFolder\\text_file.txt");
        File after=new File("E:\\software\\Java files\\NetBeans_Projects\\Compress_Decompress\\TestFolder\\compressedfile.gz");
        
        filesizeview filesize=new filesizeview(before, after);
    }
}
