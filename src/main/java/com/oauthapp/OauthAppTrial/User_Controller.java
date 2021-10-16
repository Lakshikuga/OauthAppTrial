package com.oauthapp.OauthAppTrial;

import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
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

    @Autowired
    DriveService driveService;

    /*@Bean
    public DriveService getAppName(@Value("${app.name}") String appName) {

        return appName;
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

    @PostMapping("/upload")
    public String uploadFiletoDrive(HttpServletRequest req, HttpServletResponse res, @ModelAttribute UploadFile uploadedFile) throws Exception {
        MultipartFile multipartFile = uploadedFile.getMultipartFile();
        driveService.uploadFile(multipartFile);
        return "home?status=success";

    }

}




//when google signin prompts, the following are represented in the URL :

 // https://accounts.google.com/o/oauth2/v2/auth/identifier?
// response_type=code&client_id=104146013680-a94or8bthr0jpkdu7kgm1a2lkakc1a7m.apps.googleusercontent.com&
// scope=openid%20profile%20email&
// state=vLdJZsGlnz7EPxKAHDxFSPny-_WL6Fafq9qYhpQqaCk%3D&
// redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Flogin%2Foauth2%2Fcode%2Fgoogle&
// nonce=UKwdjrogPyrbU9Myz7QHNgpBaPzhWrECHlZJGOjI3SI&
// flowName=GeneralOAuthFlow
