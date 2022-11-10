package com.mybean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {


        // Loading the Spring XML configuration
        // file into the spring container and
        // it will create the instance of
        // the bean as it loads into container

        ConfigurableApplicationContext cap
                = new ClassPathXmlApplicationContext(
                "bean.xml");
        System.out.println( "Hello World! " );
        // It will close the spring container
        // and as a result invokes the
        // destroy() method
        cap.close();

    }

    }

