package ru.fonin.mvc.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.fonin.mvc.forms.UserForm;
import ru.fonin.mvc.models.User;

public class RegistrationController
{

    @RequestMapping(path="/registration", method = RequestMethod.GET)
    public String registration(Model model){
        User user= new User();
        model.addAttribute("userForm",user);

        return "registration";
    }


    @RequestMapping(path="/registration", method = RequestMethod.POST)
    public ModelAndView registration(UserForm userForm){

        ModelAndView modelAndView= new ModelAndView("registration");
        return modelAndView;
    }
}
