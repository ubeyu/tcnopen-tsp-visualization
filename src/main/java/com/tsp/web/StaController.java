package com.tsp.web;


import com.tsp.service.ReadStatesServiceImpl;
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
        ReadStatesServiceImpl readStatesService = new ReadStatesServiceImpl();
        List<Integer> list = readStatesService.readStates();

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

