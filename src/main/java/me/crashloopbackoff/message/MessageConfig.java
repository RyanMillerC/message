package me.crashloopbackoff.message;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;

import java.util.Optional;


@ConfigurationProperties(prefix = "app")
public record MessageConfig(String message) {

    @ConstructorBinding
    public MessageConfig(String message){
        this.message = Optional.ofNullable(message).orElse("no message configured");
    }
}
