package s4.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import s4.spring.models.Element;

@Controller
@SessionAttributes("elements")
public class MainController {
	
	@ModelAttribute("elements") 
    public List<Element> getItems(){
    	Element elm = new Element();
    	elm.setNom("dd");
    	List<Element> elms = new ArrayList<>();
    	elms.add(elm);
        return elms;
    }
	
	@GetMapping("items")
	public String index() {
        return "index";
    }
 
    @GetMapping("items/new")
    public String newItem() {
    	return "frmItem";
    }
    
    @PostMapping("items/addNew")
    public RedirectView addNew(@RequestParam("nom") String nom, @RequestParam("evaluation") int evaluation, @ModelAttribute("elements") List<Element> elements) {
    	Element elm = new Element();
    	elm.setNom(nom);
    	elm.setEvaluation(evaluation);
    	elements.add(elm);
    	return new RedirectView("/items");
    }
	
}
