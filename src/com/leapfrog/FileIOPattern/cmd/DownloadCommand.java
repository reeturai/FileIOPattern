/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIOPattern.cmd;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class DownloadCommand extends DosCommand{

    @Override
    public void execute(String[] tokens) {
    if(tokens.length>1){
        try{
        String line=tokens[1];
        URL url=new URL(line);
            URLConnection conn=url.openConnection();
            InputStream reader=conn.getInputStream();
           
            String[] file=line.split("/");
             FileOutputStream writer=new FileOutputStream(file[file.length-1]);
            int i=0;
            byte[] data=new byte[1024];
            while((i=reader.read(data))!=-1){
                writer.write(data, 0, i);
            }
            reader.close();
            writer.close();
    }catch(IOException e){
            System.out.println(e.getMessage());
    }
    }        
        }
    
}
