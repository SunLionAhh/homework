package com.lion.homework;

import java.io.IOException;

/**
 * @Author SunLionAhh
 * @Date 2019/10/22 19:32
 */
public class Homework {
    public static void main(String[] args) throws IOException {
        String pathname;
        String allContent = "";
        String path = "C:\\Users\\SunLionAhh\\Desktop\\test\\";
        TakeFileName takeFileName = new TakeFileName(path);
        for (int i=0;i<takeFileName.array.length; i++) {
            pathname = takeFileName.array[i].toString();
            ReadFile readFile = new ReadFile(pathname);
            allContent += readFile.string;
        }
        FrequencyCalculator frequencyCalculator = new FrequencyCalculator(allContent);
//        System.out.println(allContent.length());
    }
}
