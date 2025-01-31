package com.yaswanth.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logger {
    private static Logger logger;
    
    public static Logger getLogger(){
        if(logger == null){
            log.info("Creating logger");
            logger = new Logger();
        }
        return logger;
    }

    public void info(){
        log.info("This is a info message");
    }

    public void warn(){
        log.warn("This is a warning message");
    }
}
