package com.corejava;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.apache.log4j.*;
public class Logging {
	public static void main(String[] args) {		
		//Logger logger = LoggerFactory.getLogger(Logging.class);
		
		 org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Logging.class);
		   logger.setLevel(Level.DEBUG); // setLevel is empty hence it does nothing
		   System.out.println("****************Logger starts***************");
		   logger.error("this is error");
		   logger.info("this is Info");
		   logger.debug("this is debug");
		   logger.warn("this is warn");
		   logger.trace("this is trace");		   
		   System.out.println("****************Logger ends***************");
		   System.out.println("isError log Enabled:"+logger.isErrorEnabled()+" is info log Enabled:"+logger.isInfoEnabled());
		   System.out.println("isdebug log Enabled:"+logger.isDebugEnabled()+" is warn log Enabled:"+logger.isWarnEnabled()+"\n");
		   System.out.println("is trace log Enabled:"+logger.isTraceEnabled());
	}
}