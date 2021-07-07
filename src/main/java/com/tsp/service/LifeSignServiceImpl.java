package com.tsp.service;

import com.tsp.config.PathConfig;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LifeSignServiceImpl {
    //传入要修改的行
    public void updateLifeSignNum(int modifyline, int lifesign) throws FileNotFoundException {
        int count = 1;
        List<Integer> list = new ArrayList<>();
//        String pathname = "/home/pi/Desktop/tmp.txt";
//        String pathname = "G:\\系统桌面\\中车\\代码\\tmp.txt";
        String pathname = PathConfig.tmpPath;
        //读取文件
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                if(count == modifyline){
                    list.add(lifesign);
                }else{
                    list.add(Integer.parseInt(line));
                }
                count++;
            }
            reader.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //写入文件
        PrintWriter hostsPrintWriter = new PrintWriter(pathname);
        for(int i=0;i<list.size();i++){
            String currentHostsArrayListTextLine =String.valueOf(list.get(i));
            //从集合当中取出字符串
            hostsPrintWriter.println(currentHostsArrayListTextLine);
            //把该字符串写入文件当中
        }
        hostsPrintWriter.close();
    }
}
