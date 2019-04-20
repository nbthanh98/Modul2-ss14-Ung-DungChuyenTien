package com.codegym;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChuyenDoiTienTe {
    @RequestMapping( path = "/changemoney", method = RequestMethod.GET)
    //@GetMapping("/changemoney")
    public String showForm(){
        return "index";
    }
    @PostMapping("/abc")
    public String changeMoney(double money, String moneyChangeForm ,String toMoney , Model model){ // handler , method, function
        double result = 1;
        if( moneyChangeForm.equals("usd") && toMoney.equals("vnd")){
            result = money * 23000;
        }else if( moneyChangeForm.equals("usd") && toMoney.equals("usd")){
            result = money;
        }else if( moneyChangeForm.equals("vnd") && toMoney.equals("usd")){
            result = money / 23000;
        }else if( moneyChangeForm.equals("vnd") && toMoney.equals("vnd")){
            result = money;
        }
        model.addAttribute("result", result);
        return "index";
    }
}
