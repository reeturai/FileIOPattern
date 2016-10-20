/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIOPattern.cmd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author welcome
 */
public class CopyCommand extends DosCommand{

    @Override
    public void execute(String[] tokens) {
   if(tokens.length>2){
       try{
       FileInputStream reader=new FileInputStream(tokens[1]);
           FileOutputStream writer=new FileOutputStream(tokens[2]);
           byte[] data=new byte[1024];//at the chunk of 1 kb
           int i=0;
           while((i=reader.read(data))!=-1){
               writer.write(data, 0, i);//data ka dekhi ka samma write garne 
           }
           reader.close();
           writer.close();
       }catch(IOException e){
           System.out.println(e.getMessage());
       }
       }
    else
            System.out.println("invalid syntax");
       }
    
}
