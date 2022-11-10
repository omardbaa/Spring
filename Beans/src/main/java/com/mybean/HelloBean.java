// Java program to create a bean
// in the spring framework
package com.mybean;

public class HelloBean {


        // This method executes
        // automatically as the bean
        // is instantiated
        public void init() throws Exception
        {
            System.out.println(
                    "Bean HelloBean has been "
                            + "instantiated and I'm "
                            + "the init() method By XML");
        }



        // This method executes
        // when the spring container
        // is closed
        public void destroy() throws Exception
        {
            System.out.println(
                    "Container has been closed "
                            + "and I'm the destroy() method By XML");
        }
}


