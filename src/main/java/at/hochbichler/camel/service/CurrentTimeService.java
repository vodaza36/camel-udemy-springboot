package at.hochbichler.camel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CurrentTimeService {

    @Autowired
    Environment env;

    public String getCurrentDateTime() {
        String message = env.getProperty("message");
        LocalDateTime localDateTime = LocalDateTime.now();

        return message.concat(localDateTime.toString());
    }
}
