//package com.heqilin.util.plugin.log;
//
//import ch.qos.logback.classic.LoggerContext;
//import ch.qos.logback.classic.joran.JoranConfigurator;
//import ch.qos.logback.core.joran.spi.JoranException;
//import ch.qos.logback.core.util.StatusPrinter;
//import org.slf4j.LoggerFactory;
//
//import java.io.File;
//import java.io.IOException;
//
///**
// *
// *
// * @author heqilin
// * date:  2019/03/10
// */
//public class LogBackConfigLoader {
//    public static void load (String externalConfigFileLocation) throws IOException, JoranException{
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//
//        File externalConfigFile = new File(externalConfigFileLocation);
//        if(!externalConfigFile.exists()){
//            throw new IOException("Logback External Config File Parameter does not reference a file that exists");
//        }else{
//            if(!externalConfigFile.isFile()){
//                throw new IOException("Logback External Config File Parameter exists, but does not reference a file");
//            }else{
//                if(!externalConfigFile.canRead()){
//                    throw new IOException("Logback External Config File exists and is a file, but cannot be read.");
//                }else{
//                    JoranConfigurator configurator = new JoranConfigurator();
//                    configurator.setContext(lc);
//                    lc.reset();
//                    configurator.doConfigure(externalConfigFileLocation);
//                    StatusPrinter.printInCaseOfErrorsOrWarnings(lc);
//                }
//            }
//        }
//    }
//}
