package com.company;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class formatter {
    public static Logger logger;

    static {
        logger = Logger.getAnonymousLogger();
        String logSyncFilePath = "Log.txt";
//        String logSyncFilePath = "./Cell_Daily_Report.log";
        FileHandler parhamHandler = null;
        try {
            parhamHandler = new FileHandler(logSyncFilePath, 1024 * 1024 * 10, 20, true);

        } catch (IOException e) {
            e.printStackTrace();
        }
//        parhamHandler.setFormatte(new LogTextFormatter());
        parhamHandler.setFormatter(new LogTextFormatter());
        logger.addHandler(parhamHandler);

    }
}
