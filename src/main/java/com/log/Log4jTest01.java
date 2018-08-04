package com.log;

import org.apache.log4j.Logger;

public class Log4jTest01  {

    public static Logger log = Logger.getLogger(Log4jTest01 .class);

    public static void main(String[] args) {
        log4jTest();
    }

    public static void log4jTest(){
        log.trace("trace级别的日志输出");
        log.debug("debug级别的日志输出");
        log.info("info级别的日志输出");
        log.warn("warn级别的日志输出");
        log.error("error级别的日志输出");
        log.fatal("fatal级别的日志输出");
        try{
            System.out.println(9 / 0);
        }catch (RuntimeException e){
            log.error(e.getMessage());
        }
    }
}