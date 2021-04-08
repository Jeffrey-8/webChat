package ru.fonin.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import ru.fonin.mvc.forms.UserForm;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;
//import ru.fonin.web.models.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User implements UserDetails {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name ="password")
    private String password;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;


//    @ManyToMany(fetch = FetchType.EAGER)
    @Enumerated( value = EnumType.STRING)
    private Role role;
    @Enumerated( value = EnumType.STRING)
    private State state;

    public static User from(UserForm userForm){
        return User.builder()
                .login(userForm.getLogin())
                .password(userForm.getPassword())
                .build();
    }




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

//    public Collection<Role> getRoles(){
//        return roles;
//    }

//    public void setRoles(Set<Role> roles){
//        this.roles=roles;
//    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}