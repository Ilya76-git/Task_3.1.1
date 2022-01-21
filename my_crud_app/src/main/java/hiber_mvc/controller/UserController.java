package hiber_mvc.controller;

import hiber_mvc.model.User;
import hiber_mvc.service.UserService;
import hiber_mvc.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {


    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getAllUsers(ModelMap modelMap){
        List<User> list = userService.allUsers();
        modelMap.addAttribute("users",list);
        return "users";
    }
    @GetMapping("/add")
    public String addPage(){
        return "addUser";
    }
    @PostMapping("/add")
    public String addUser(@ModelAttribute("user") User user){
        userService.createUser(user);
        return "redirect:/";
    }
    @GetMapping("/edit")
    public String editPage(@RequestParam(value = "id") long id, ModelMap modelMap){
        modelMap.addAttribute("user",userService.readUser(id));
       return "editPage";
    }
    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") User user){
        userService.updateUser(user);
        return "redirect:/";
    }
    @GetMapping("/delete")
    public String deleteUser(@RequestParam(value = "id") long id){
        userService.deleteUser(userService.readUser(id));
        return "redirect:/";
    }
}
