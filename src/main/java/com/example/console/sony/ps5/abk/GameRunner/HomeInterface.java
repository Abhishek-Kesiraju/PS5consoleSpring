package com.example.console.sony.ps5.abk.GameRunner;

import org.springframework.stereotype.Component;

@Component
public interface HomeInterface {

    void up();
    void down();
    void left();
    void right();

    void square();
    void triangle();
    void circle();
    void cross();
}
