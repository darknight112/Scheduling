package com.Scheduling.Scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduling {
    @Scheduled(cron = " * 0 * * * *")
    public void task(){
        System.out.println("runs a job every hour.");
    }
}
