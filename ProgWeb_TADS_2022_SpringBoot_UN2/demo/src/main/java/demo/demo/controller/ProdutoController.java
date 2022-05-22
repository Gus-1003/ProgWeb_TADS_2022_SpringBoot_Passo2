package demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import demo.demo.service.ProdutoService;

@Controller
public class ProdutoController {
    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @RequestMapping(value = { "/", "/produtos" })
    public String getHome(Model model) {
        model.addAttribute("nome", "Hello que veio do código");
        return "index";
    }
}