package org.abhishekjha.behavioral.chainOfResponsibility.Logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {
    private static final Logger logger = Logger.getLogger(LoggerDemo.class.getName());
    public static void main(String[] args) {
        // set level
        logger.setLevel(Level.FINER);
        // Create handlers
        Handler consoleHandler = new ConsoleHandler();

        consoleHandler.setLevel(Level.FINER);
        // building the chain of responsibility with handlers
        logger.addHandler(consoleHandler);

        logger.finest("Finest log message"); // this will not be logged
        logger.finer("Finer log message");
        logger.fine("Fine log message");
    }
}
