package com.ans20xx;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private int id;

    public void printId() {
        System.out.println(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
