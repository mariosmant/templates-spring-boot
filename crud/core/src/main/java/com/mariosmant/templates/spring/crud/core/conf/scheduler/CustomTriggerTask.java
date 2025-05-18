package com.mariosmant.templates.spring.crud.core.conf.scheduler;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
public class CustomTriggerTask implements Runnable {

    private final CustomCronTrigger customCronTrigger;

    @Override
    public void run() {
        LocalDateTime scheduledTime = customCronTrigger.getScheduledTime();
        System.out.println("Method was scheduled at: " + scheduledTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
