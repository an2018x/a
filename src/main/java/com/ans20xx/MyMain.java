package com.ans20xx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class); // 1

        MySecComponent component = context.getBean(MySecComponent.class);  // 2

        if(component != null && component.getComponent() != null) {  // 3
            MyComponent mycomponent = component.getComponent();
            mycomponent.printId();
        }
    }
}
