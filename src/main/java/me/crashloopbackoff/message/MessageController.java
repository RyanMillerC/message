package me.crashloopbackoff.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final
    MessageConfig config;

    public MessageController(MessageConfig config) {
        this.config = config;
    }

    @GetMapping("/message")
    public String message(){
        return config.message();
    }
}
