package com.joelgtsantos.cmsnaiad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joelgtsantos.cmsnaiad.services.EmailService;

@SpringBootApplication
public class CmsNaiadApplication implements ApplicationRunner {
	
	@Autowired
	private EmailService emailService;

	private static Logger log = LoggerFactory.getLogger(CmsNaiadApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CmsNaiadApplication.class, args);
	}
	
	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("Spring Mail - Sending Email with JavaMailSender");
        
        //EmailService.send
        //"Sending Simple Email with JavaMailSender Example");
        //EmailService.setContent("This tutorial demonstrates how to send a simple email using Spring Framework.");

        //emailService.sendSimpleMessage("joelgtsantos@gmail.com", "subject", "text");
    }
}
