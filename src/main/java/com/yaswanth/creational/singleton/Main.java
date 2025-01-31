package com.yaswanth.creational.singleton;

public class Main {
    public static void main(String[] args){
        Logger logger = Logger.getLogger();
        logger.info();
        logger.warn();

        Logger logger2 = Logger.getLogger();
        logger2.info();

        System.out.println(logger == logger2);
    }
}
