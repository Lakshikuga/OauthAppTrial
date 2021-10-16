package com.oauthapp.OauthAppTrial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:application.properties")
@EnableConfigurationProperties

public class ApplicationConfig {

    @Bean
    public DriveService driveService(){
        return new DriveServiceImpl();
    }
    /*@Value("${google.secret.key.path}")
    private Resource driveSecretKeys;*/

    @Value("${myapp.temp.path}")
    private String temporaryFolder;


   /*public Resource getDriveSecretKeys() {
        return driveSecretKeys;

    }*/

   /* public void setDriveSecretKeys(Resource driveSecretKeys) {
        this.driveSecretKeys = driveSecretKeys;

    }*/

    public String getTempfolder() {
        return temporaryFolder;
    }

    public void setTempfolder(String temporaryFolder) {
        this.temporaryFolder = temporaryFolder;
    }


}
