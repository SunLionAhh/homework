package com.lion.homework;

import java.io.File;
import java.util.List;

/**
 * @Author SunLionAhh
 * @Date 2019/10/22 21:18
 */
public class TakeFileName {
    File[] array;
    TakeFileName(String path) {
        File file = new File(path);
        array = file.listFiles();
    }
}