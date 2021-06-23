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
public class ConController {

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/controller")
    public String controller(Model model) {
        return "controller";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuopen11")
    public String updateOpenEDCU11(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(1,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed11")
    public String updateClosedEDCU11(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(1,0);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuopen12")
    public String updateOpenEDCU12(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(2,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed12")
    public String updateClosedEDCU12(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(2,0);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuopen21")
    public String updateOpenEDCU21(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(3,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed21")
    public String updateClosedEDCU21(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(3,0);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuopen22")
    public String updateOpenEDCU22(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(4,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed22")
    public String updateClosedEDCU22(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(4,0);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuopen31")
    public String updateOpenEDCU31(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(5,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed31")
    public String updateClosedEDCU31(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(5,0);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuopen32")
    public String updateOpenEDCU32(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(6,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed32")
    public String updateClosedEDCU32(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(6,0);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/hvacopen1")
    public String updateOpenHVAC1(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(7,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed1")
    public String updateClosedHVAC1(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(7,0);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/hvacopen2")
    public String updateOpenHVAC2(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(8,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed2")
    public String updateClosedHVAC2(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(8,0);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/hvacopen3")
    public String updateOpenHVAC3(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(9,1);
        return "redirect:/states";
    }

    /*通过Get请求路径 返回归档页*/
    @GetMapping("/edcuclosed3")
    public String updateClosedHVAC3(Model model) throws FileNotFoundException {
        DoorStatesServiceImpl doorStatesService = new DoorStatesServiceImpl();
        doorStatesService.updateDoorState(9,0);
        return "redirect:/states";
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/dcustate21")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updateDCULifeSign21(@RequestParam int lifesign,
                        HttpSession session,
                        RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(10, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/dcustate22")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updateDCULifeSign22(@RequestParam int lifesign,
                                   HttpSession session,
                                   RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(11, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/dcustate31")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updateDCULifeSign31(@RequestParam int lifesign,
                                   HttpSession session,
                                   RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(12, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/dcustate32")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updateDCULifeSign32(@RequestParam int lifesign,
                                   HttpSession session,
                                   RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(13, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/bcustate1")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updateBCULifeSign1(@RequestParam int lifesign,
                                   HttpSession session,
                                   RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(14, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/bcustate2")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updateBCULifeSign2(@RequestParam int lifesign,
                                   HttpSession session,
                                   RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(15, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/atcstate")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updateATCLifeSign(@RequestParam int lifesign,
                                   HttpSession session,
                                   RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(16, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/sivstate")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updateSIVLifeSign32(@RequestParam int lifesign,
                                   HttpSession session,
                                   RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(17, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

    /* 通过Post请求路径 提交输入的用户名和密码 用于登录逻辑 */
    /* 加参数 同样在全局/admin下访问 即/admin/login */
    @PostMapping("/pisstate")
    /* Post提交 输入参数需要加@RequestParam注解  若用户名密码正确放入httpSession*/
    public String updatePISLifeSign21(@RequestParam int lifesign,
                                   HttpSession session,
                                   RedirectAttributes attributes) throws FileNotFoundException {
        if(lifesign >= 0 && lifesign <= 100000){
            LifeSignServiceImpl lifeSignService = new LifeSignServiceImpl();
            lifeSignService.updateLifeSignNum(18, lifesign);
            return "redirect:/states";
        }else{
            /* 由于使用重定向 给前端页面提示需要用attributes.addFlashAttribute */
            /* 不能用 login参数加Model model 然后用model.addAttribute的方式 会造成重定向后 返回页面无法拿到数据 */
            attributes.addFlashAttribute("message","输入生命周期范围有误");
            /* 验证失败后 不能直接return "admin/blogs-login" 会造成路径出现问题 需要使用重定向redirect到admin下 */
            /* return是再次转向Controller */
            return "redirect:/controller";
        }
    }

}
