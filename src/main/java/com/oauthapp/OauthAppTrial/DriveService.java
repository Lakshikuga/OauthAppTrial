package com.oauthapp.OauthAppTrial;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;


public interface DriveService {

    public void uploadFile(MultipartFile multipartFile) throws Exception;

    //public void getAppName(String appName);
}
