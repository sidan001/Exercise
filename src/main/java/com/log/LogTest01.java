package com.log;


import java.util.logging.Level;
import java.util.logging.Logger;

public class LogTest01 {
    public static Logger log = Logger.getLogger(LogTest01.class.toString());
    public static void main(String[] args) {
        log.setLevel(Level.INFO);
        log.finest("finest");
        log.finer("finer");
        log.fine("fine");
        log.config("config");
        log.info("info");
        log.warning("warning");
        log.severe("server");
    }
}
