package moepig.codescanning.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CWE020Controller {
    @RequestMapping(value = "/cwe020", method = RequestMethod.GET)
    public String get(Model model, @RequestParam("val") String val) {
    	model.addAttribute("msg", "val: \"" + val + "\"");
    	
        return "cwe020";
    }
}
