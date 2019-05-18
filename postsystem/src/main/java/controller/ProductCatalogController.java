package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductCatalogController {

    @GetMapping("/")
    public static String printCatalog(){
        System.out.println("product catalog:"+"${Product Catalog}");
        return "welcome";
    }
}
