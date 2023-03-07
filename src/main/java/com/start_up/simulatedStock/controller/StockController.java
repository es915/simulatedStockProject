package com.start_up.simulatedStock.controller;

import com.start_up.simulatedStock.dto.PlayerDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class StockController {


    @GetMapping("/menu")
    public String selectPlay(@ModelAttribute PlayerDto playerDto) {
        // 유저 생성 서비스 로직
        return "menu";
    }
}
