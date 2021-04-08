package ru.fonin.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.fonin.mvc.forms.UserForm;
import ru.fonin.mvc.models.User;
//import ru.fonin.mvc.service.UserService;

@Controller
public class RegistrationController
{


//    @Autowired
//    UserService userService;

    @PostMapping("/registration")
    public String registration(UserForm userForm){


    }



//    @RequestMapping(path="/registration", method = RequestMethod.GET)
//    public ModelAndView registration(Model model){
//        User user= new User();
//        ModelAndView modelAndView =  new ModelAndView("registration");
//        modelAndView.addObject("newUser",user);
//        return modelAndView;
//    }
//
//
//    @RequestMapping(path="/registration", method = RequestMethod.POST)
//    public String registration(UserForm userForm, Model model){
//
////        ModelAndView modelAndView= new ModelAndView("registration");
//
//        User user = User.from(userForm);
//
////        if (!userService.saveUser(user)){
//////            return "registration";
////            model.addAttribute("usernameError", "Пользователь с таким именем уже существует");
////            return ("registration");
////        } else
//            return "redirect:/";
//    }
}
