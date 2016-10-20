/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIOPattern.cmd;

import java.io.File;

/**
 *
 * @author welcome
 */
public class mdCommand extends DosCommand {

    @Override
    public void execute(String[] tokens) {
        if (tokens.length > 1) {
            File file = new File(tokens[1]);
            file.mkdir();
        } else {
            System.out.println("invalid syntax");
        }
    }
}
