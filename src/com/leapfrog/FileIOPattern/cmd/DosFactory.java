/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIOPattern.cmd;

/**
 *
 * @author welcome
 */
public class DosFactory  {
    public static DosCommand get(String cmd){
        if(cmd.equalsIgnoreCase("md"))
            return new mdCommand();
        else if(cmd.equalsIgnoreCase("dd"))
            return new ddCommand();
        else if(cmd.equalsIgnoreCase("rd"))
            return new rdCommand();
        else if(cmd.equalsIgnoreCase("copy"))
            return new CopyCommand();
        else if(cmd.equalsIgnoreCase("download"))
            return new DownloadCommand();
        
        else
            return null;
    }
    
}
