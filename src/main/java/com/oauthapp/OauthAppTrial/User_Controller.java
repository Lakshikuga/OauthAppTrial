package com.oauthapp.OauthAppTrial;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class User_Controller {
    //private final UserService userService;

    /*public User_Controller(UserService userService){
        this.userService = userService;
    }*/

    //this will display the sign in form with the Google sign in option
    @GetMapping("/")
    public String signin(HttpServletRequest request, HttpServletResponse response){
        System.out.println("Sign up Form");
        return "index";
    }

    /*@GetMapping("/signin")
    public String signin(Model model){
        model.addAttribute("user", new model());
        return "index";
    }
    @GetMapping("/viewUerInfo")
    public String viewUserInfo(Model model){
        model.addAttribute("user", userService.getUserInfo());
        return "home";
    }*/

    //this will allow a signed in user to enter the home page - here when clicked on the "Sign in with Google" button, the Google sign in page is prompted to the user.
    @GetMapping("/signin")
    public String signin(){
        return "home";
    }

    //uploafile to ggogle drive

    /*@PostMapping("/upload")
    public String uploadFiletoDrive(HttpServletRequest req, HttpServletResponse res, @ModelAttribute UploadFile uploadedFile) throws Exception {
        MultipartFile multipartFile = uploadedFile.getMultipartFile();

    }*/

}
