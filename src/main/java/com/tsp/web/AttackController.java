package com.tsp.web;

import com.tsp.service.DoorStatesServiceImpl;
import com.tsp.service.LifeSignServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;

/*@Controller表示该类是控制层*/
@Controller
public class AttackController {


    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/edcuattack11")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String attackEDCU11(@RequestParam int attacksign,
                        HttpSession session,
                        RedirectAttributes attributes) throws FileNotFoundException {

        if(attacksign >= 0 && attacksign <= 100000){
            DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
            int retSign = 0;
            if(attacksign == 0){
                retSign = 0;
            }else if(attacksign == 1){
                retSign = 1;
            }else{
                retSign = 2;
            }
            doorStatesService.updateDoorState(1,retSign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/track";
        }
    }


}
