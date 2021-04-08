
package ru.neoflex.neostudy.dmbaza.services.schedulers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class EmailSenderScheduler {
    @Autowired
    private JavaMailSender emailSender;
    @EventListener
    public void handleContextRefreshEvent(ContextRefreshedEvent event) {

        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("");
//        message.setTo(to);
        message.setSubject("AAA");
        message.setText("Пора пить чай!");
        emailSender.send(message);

    }
}

