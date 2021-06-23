package com.tsp.web;
import com.tsp.service.ReadStatesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/*@Controller表示该类是控制层*/
@Controller
public class PageController {


    /*通过Get请求路径 返回归档页*/
    @GetMapping("/")
    public String states(Model model) {
        ReadStatesServiceImpl readStatesService = new ReadStatesServiceImpl();
        List<Integer> list = readStatesService.readStates();
        //门控
        model.addAttribute("edcustate11", list.get(0));
        model.addAttribute("edcustate12", list.get(1));
        model.addAttribute("edcustate21", list.get(2));
        model.addAttribute("edcustate22", list.get(3));
        model.addAttribute("edcustate31", list.get(4));
        model.addAttribute("edcustate32", list.get(5));
        //空调
        model.addAttribute("havcstate1", list.get(6));
        model.addAttribute("havcstate2", list.get(7));
        model.addAttribute("havcstate3", list.get(8));
        //牵引
        model.addAttribute("dcustate21", list.get(9));
        model.addAttribute("dcustate22", list.get(10));
        model.addAttribute("dcustate31", list.get(11));
        model.addAttribute("dcustate32", list.get(12));
        //制动
        model.addAttribute("bcustate1", list.get(13));
        model.addAttribute("bcustate2", list.get(14));
        //自控
        model.addAttribute("atcstate", list.get(15));
        //辅助逆变器
        model.addAttribute("sivstate", list.get(16));
        //乘客信息系统
        model.addAttribute("pisstate", list.get(17));
        return "states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/track")
    public String track(Model model) {
        return "track";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/detect")
    public String detect(Model model) {
        return "detect";
    }
}
