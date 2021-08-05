package practice.practicedemo.springboot.webresource.controller;

/**
 * @author Simple
 * @date 2021/6/25 9:27
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import practice.practicedemo.springboot.TestRESTful.pojo.ArticleVO;
import practice.practicedemo.springboot.WithDatabase.SpringDataJpa.service.ArticleRestService;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/template")
public class FreemarkerController {

    @Resource
    ArticleRestService articleService;

    @GetMapping("/freemarker")
    public String index(Model model) {

        List<ArticleVO> articles = articleService.getAll();

        model.addAttribute("articles", articles);

        //模版名称，实际的目录为：resources/templates/fremarkertemp.ftl
        return "freemarkertemp";
    }
}
