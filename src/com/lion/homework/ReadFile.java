package com.lion.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author SunLionAhh
 * @Date 2019/10/22 19:52
 */
public class ReadFile {

    public String string="";

    ReadFile(String pathname) throws IOException{
        File file = new File(pathname);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null) {
            string = string + str;
        }
    }
    }

