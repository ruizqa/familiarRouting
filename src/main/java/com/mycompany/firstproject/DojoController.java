package com.mycompany.firstproject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class DojoController {
	@RequestMapping("/{searchTerm}")
	public String showResult(@PathVariable("searchTerm") String searchTerm){
		String a = new String("dojo");
		String b = new String("burbank-dojo");
		String c = new String("san-jose");
		
		if (searchTerm.equals(a)) {
			return "The dojo is awesome!";
		}
		
		else if (searchTerm.equals(b)) {
			return "Burbank Dojo is located in Southern California";
		}
		
		else if (searchTerm.equals(c)) {
			return "SJ dojo is the headquarters";
		}
		
		else {
			return "";
		}
		
    	
    }
}
