
package com.fastenerstocksystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.fastenerstocksystem.model.Fastener;
import com.fastenerstocksystem.service.FastenerService;


@Controller
public class FastenerController {
    
    @Autowired
    private FastenerService fastenerService;
    //Create method handler which will display a list of fasteners for home page index.html to display
    @GetMapping("/index")
    public String viewHomePage (Model model){
        model.addAttribute("listFasteners", fastenerService.getAllFasteners());
        return "index";
    }
    
    @GetMapping("/showNewFastenerForm")
    public String showNewFastenerForm(Model model){
        //Create a model to bind new fastener data
       Fastener fastener = new Fastener();
       model.addAttribute("fastener", fastener);
       return "new_fastener";
    }
    
//    http://localhost:8020/showNewFastenerForm
    
    @PostMapping("/saveFastener")
    public String saveFastener(@ModelAttribute("fastener")Fastener fastener){
    //save fastener tp database
    fastenerService.saveFastener(fastener);
    return "redirect:/index";
    }
    
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable( value = "id") long id, Model model){
    //Get the fastener from the service
    Fastener fastener = fastenerService.getFastenerById(id);
    
    //set fastener as a model attribute to pre-populate th form
    model.addAttribute("fastener", fastener);
    return "update_fastener";
    }
    
    //delete fastener by id
    @GetMapping("/deleteFastener/{id}")
    public String deleteFastener(@PathVariable( value = "id") long id){
    
    //Call delete method from the service
    this.fastenerService.deleteFastenerById(id);
        return "redirect:/index";
    }
}


