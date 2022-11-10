// Java program to create a bean
// in the spring framework
package com.mybean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBeanMethodTwo implements InitializingBean, DisposableBean {


    // It is the init() method
    // of our bean and it gets
    // invoked on bean instantiation
    @Override
    public void afterPropertiesSet()
            throws Exception {
        System.out.println(
                "Bean HelloBeanMethodTwo has been "
                        + "instantiated and I'm the "
                        + "init() method By Programmatic Approach");
    }


    // This method executes
    // when the spring container
    // is closed
    public void destroy() throws Exception {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method By Programmatic Approach");
    }

}


