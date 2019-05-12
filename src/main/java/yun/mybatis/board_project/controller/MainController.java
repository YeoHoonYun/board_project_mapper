package yun.mybatis.board_project.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import yun.mybatis.board_project.model.City;
import yun.mybatis.board_project.service.CityService;

import java.util.List;

@Controller
@AllArgsConstructor
public class MainController {
    CityService cityService;

    @GetMapping(value = {"", "/", "main"})
    public String main(Model model){
        List<City> cityList = cityService.getAllCity();
        model.addAttribute("cityList",cityList);
        return "index";
    }
}
