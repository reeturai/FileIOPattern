/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIOPattern;

import com.leapfrog.FileIOPattern.cmd.DosCommand;
import com.leapfrog.FileIOPattern.cmd.DosFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class program {

    public static void main(String[] args) {
      
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            System.out.print(">");
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                System.out.print(">");
                String[] tokens = line.split(" ");
               
                  DosCommand cmd=DosFactory.get(tokens[0]);
                  if(cmd!=null)
                      cmd.execute(tokens);
                else
                      System.out.println("invalid command");
        
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

