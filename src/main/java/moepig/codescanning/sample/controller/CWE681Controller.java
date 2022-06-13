package moepig.codescanning.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CWE681Controller {
    @RequestMapping(value = "/cwe681", method = RequestMethod.GET)
    public String get(Model model) {
    	int val = (int)Long.MAX_VALUE;
    	model.addAttribute("val", val);
    	
        return "cwe681";
    }
}
