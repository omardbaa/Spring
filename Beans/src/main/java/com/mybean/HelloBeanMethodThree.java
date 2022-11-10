// Java program to create a bean
// in the spring framework
package com.mybean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class HelloBeanMethodThree {


    // It is the init() method
    // of our bean and it gets
    // invoked on bean instantiation
    @PostConstruct
    public void afterPropertiesSet()
            throws Exception {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm the "
                        + "init() method By @PostConstruct annotation");
    }


    // This method executes
    // when the spring container
    // is closed
    @PreDestroy
    public void destroy() throws Exception {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method By @PreDestroy annotation");
    }

}


