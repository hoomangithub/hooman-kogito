package de.hooman.kogito.kogitoeasysample.service;

import org.springframework.stereotype.Component;

@Component
public class HelloKogitoService {

    public void sayHello(){
        System.out.println("Hello from Service!");
    }

}
