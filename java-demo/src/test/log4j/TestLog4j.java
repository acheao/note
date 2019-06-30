package test.log4j;


import org.apache.log4j.Logger;

import generic.TestGeneric;  


public class TestLog4j {
	public static void main(String[] args) {  
        Logger logger = Logger.getLogger(TestLog4j.class); 
        logger.debug("this is debug");
        logger.info("this is info");  
        TestGeneric<String> a = new TestGeneric("ssss");
        logger.debug(a.getFirst());
     }  
}
