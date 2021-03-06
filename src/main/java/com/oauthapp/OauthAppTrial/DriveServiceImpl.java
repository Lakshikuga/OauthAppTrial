package com.oauthapp.OauthAppTrial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.api.client.http.FileContent;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

public class DriveServiceImpl implements DriveService{

    private Drive driveService;

    private Logger logger = LoggerFactory.getLogger(DriveServiceImpl.class);


    @Autowired
    ApplicationConfig applicationConfig;


    @Override
    public void uploadFile(MultipartFile multipartFile) throws Exception {

        String path = applicationConfig.getTempfolder();
        String fileName = multipartFile.getOriginalFilename();
        String contentType = multipartFile.getContentType();

        java.io.File transferedFile = new java.io.File(path, fileName);
        multipartFile.transferTo(transferedFile);

        File fileMetadata = new File();
        fileMetadata.setName(fileName);

        FileContent mediaContent = new FileContent(contentType, transferedFile);
        File file = driveService.files().create(fileMetadata, mediaContent).setFields("id").execute();

        logger.debug("File ID: " + file.getName() + ", " + file.getId());

    }

    /*public String getAppName(String appName){


    }*/
}
