package com.example.console.sony.ps5.abk.GameRunner;

import org.springframework.stereotype.Component;

@Component
public class RunAGame {

    private HomeInterface selectedGame;

    public RunAGame (HomeInterface selectedGame){
        this.selectedGame = selectedGame;
    }

    public void gamePlay() {

        System.out.println("Running game: " + selectedGame);
        selectedGame.up();
        selectedGame.down();
        selectedGame.left();
        selectedGame.right();
    }
}
