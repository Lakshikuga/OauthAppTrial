package com.oauthapp.OauthAppTrial;

import org.springframework.web.multipart.MultipartFile;

public class UploadFile {

    private MultipartFile multipartFile;

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile){
        this.multipartFile = multipartFile;
    }
}
