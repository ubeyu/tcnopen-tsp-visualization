package com.tsp.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*@Controller表示该类是控制层*/
@Controller
public class StaController {

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/states")
    public String states(Model model) {
        List<Integer> list = new ArrayList<>();
        String pathname = "G:\\系统桌面\\中车\\代码\\tmp.txt"; // 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        //不关闭文件会导致资源的泄露，读写文件都同理
        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        model.addAttribute("edcustate11", list.get(0));
        model.addAttribute("edcustate12",list.get(1));
        model.addAttribute("edcustate21", list.get(2));
        model.addAttribute("edcustate22",list.get(3));
        model.addAttribute("edcustate31", list.get(4));
        model.addAttribute("edcustate32",list.get(5));

        model.addAttribute("havcstate1", list.get(6));
        model.addAttribute("havcstate2",list.get(7));
        model.addAttribute("havcstate3", list.get(8));

        model.addAttribute("dcustate21",list.get(9));
        model.addAttribute("dcustate22", list.get(10));
        model.addAttribute("dcustate31",list.get(11));
        model.addAttribute("dcustate32", list.get(12));

        model.addAttribute("bcustate1",list.get(13));
        model.addAttribute("bcustate2", list.get(14));

        model.addAttribute("atcstate",list.get(15));

        model.addAttribute("sivstate", list.get(16));

        model.addAttribute("pisstate",list.get(17));
        return "states";
    }
}

