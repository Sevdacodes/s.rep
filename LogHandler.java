package com.company;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogHandler {

  public static Logger LogHandler()   {
    Logger logger = Logger.getAnonymousLogger();
        String logPath = "log.txt";
        FileHandler sevdaHndler = null;
        try {
            sevdaHndler = new FileHandler(logPath, 1024 * 1024 * 10, 20, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sevdaHndler.setFormatter(new LogTextFormatter());
        logger.addHandler(sevdaHndler);
        return logger;
    }
}
