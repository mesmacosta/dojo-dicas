package br.com.fsandes;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;


	
@EnableConfigServer
@SpringBootApplication
public class ApplicationCloudConfig {


    public static void main(String[] args) {

        new SpringApplicationBuilder(ApplicationCloudConfig.class).run(args);
    }
}
