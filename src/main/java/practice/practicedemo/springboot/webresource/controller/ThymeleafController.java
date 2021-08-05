package practice.practicedemo.springboot.webresource.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import practice.practicedemo.springboot.TestRESTful.pojo.ArticleVO;
import practice.practicedemo.springboot.WithDatabase.SpringDataJpa.service.ArticleRestService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Simple
 * @date 2021/6/25 9:45
 */
@Controller
@RequestMapping("/template")
public class ThymeleafController {

    @Resource
    ArticleRestService articleRestService;

    @GetMapping("/thymeleaf")
    public String test(Model model){
        List<ArticleVO> articles = articleRestService.getAll();
        model.addAttribute("articles",articles);
        return "thymeleaftemp";
    }
}
