package com.example.console.sony.ps5.abk.GameRunner;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Spiderman2 implements HomeInterface{


    @Override
    public void up() {
        System.out.println("Swing");
    }

    @Override
    public void down() {
        System.out.println("Turn around");
    }

    @Override
    public void left() {
        System.out.println("Turn left");
    }

    @Override
    public void right() {
        System.out.println("Turn right");
    }

    @Override
    public void square() {
        System.out.println("Punch");
    }

    @Override
    public void triangle() {
        System.out.println("Kick");
    }

    @Override
    public void circle() {
        System.out.println("Evade");
    }

    @Override
    public void cross() {
        System.out.println("Jump");
    }
}
