package moepig.codescanning.sample.controller;

import java.security.SecureRandom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CWE335Controller {
	@RequestMapping(value = "/cwe335", method = RequestMethod.GET)
	public String get(Model model, @RequestParam("val") int val) {

		SecureRandom prng = new SecureRandom();
		int randomData = 0;

		if (val == 0) {
			// BAD: Using a constant value as a seed for a random number generator means all
			// numbers it generates are predictable.
			prng.setSeed(12345L);
			randomData = prng.nextInt(32);
		} else {
			// BAD: System.currentTimeMillis() returns the system time which is predictable.
			prng.setSeed(System.currentTimeMillis());
			randomData = prng.nextInt(32);
		}

		model.addAttribute("randomData", randomData);

		return "cwe335";
	}
}
