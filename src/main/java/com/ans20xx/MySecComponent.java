package com.ans20xx;


import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MySecComponent {

    @Resource
    private MyComponent component;

    private String name;

    public MyComponent getComponent() {
        return component;
    }

    public String getName() {
        return name;
    }

    public void setComponent(MyComponent component) {
        this.component = component;
    }

    public void setName(String name) {
        this.name = name;
    }
}
