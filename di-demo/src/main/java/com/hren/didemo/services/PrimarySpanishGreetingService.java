package com.hren.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimarySpanishGreetingService implements GreetingService {
    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String greeting() {
        return greetingRepository.getGermanGreeting();
    }
}
