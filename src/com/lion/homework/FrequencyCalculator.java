package com.lion.homework;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author SunLionAhh
 * @Date 2019/10/22 19:45
 */
public class FrequencyCalculator {
    FrequencyCalculator(String string)
    {
        //定义需要计算字母出现频率的文本
        String text=string;
        //定义26个字母
        String letter="abcdefghijklmnopqrstuvwxyz";
        calculate(text,letter);
    }
    public static void calculate(String text,String letter)
    {
        double[] array = new double[26];

        //定义存储各字母出现次数的数组
        int []counter=new int[26];
        //定义存储各字母出现频率的数组
        double []f4=new double[26];
        //定义字母总个数的计数器。排除标点符号，空格和数字。
        int total_counter=0;
        //将string类型转化成char类型
        char[] text_tr=text.toCharArray();
        char[] letter_tr=letter.toCharArray();
        //计算各字母出现次数以及总字母数
        //外层循环，遍历26个字母
        for(int i=0;i<letter_tr.length;i++)
        {
            //内层循环，遍历待计算文本
            for(int j=0;j<text_tr.length;j++)
            {
                //字母每在文本中出现一次，字母计数器加一,总字母个数计数器加一
                if(text_tr[j]==letter_tr[i]||text_tr[j]==letter_tr[i]+32)
                {
                    counter[i]++;
                    total_counter++;
                }
            }
        }
        //计算各字母出现频率，结果保留小数点后4位
        double sum = 0;
        for(int i=0;i<letter_tr.length;i++)
        {
            //将int类型转换成double类型
            double counter_d=(double) counter[i];
            double total_d=(double) total_counter;
            //字母出现频率=字母出现次数/总的字母数
            double fre=counter_d/total_d;
            //保留小数点后4位
            f4[i]=(double) (Math.round(fre*10000)/10000.0)*100;
            BigDecimal bg = new BigDecimal(f4[i]);
            double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            Double f2 = new Double(String.format("%.02f", f1));
            System.out.println(letter_tr[i]+" frequency is "+f2+"%");
            array[i]= f2;
        }
//        List<Double> list = Array;
//        Arrays.sort(array, Comparator.reverseOrder());
//        Arrays.sort(intArray,);
        Double[] doubles = new Double[26];
        for (int i = 0; i < 26; i++) {
            doubles[i]=array[i];
        }
        Arrays.sort(doubles, Comparator.reverseOrder());
        for(double i:doubles) {
            System.out.println(i);
        }
    }
}
