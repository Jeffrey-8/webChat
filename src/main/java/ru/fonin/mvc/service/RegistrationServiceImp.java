package ru.fonin.mvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.fonin.mvc.forms.UserForm;
import ru.fonin.mvc.repositories.UserRepository;

@Service
public class RegistrationServiceImp implements RegistrationService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registration(UserForm userForm) {

    }
}
