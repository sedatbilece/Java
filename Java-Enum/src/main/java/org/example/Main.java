package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
           Game game =new Game();
        Moves m = Moves.DOWN;
        System.out.println(m.ordinal());
        System.out.println(m.toString());
    }
}


 class Game{

    public void start(){
        Snake snake =new Snake();
        snake.move(Moves.TOP);// 1:yukarı
        snake.move(Moves.DOWN);// 3:aşağı
        snake.move(Moves.RIGHT);// 2:sağ
        snake.move(Moves.LEFT);// 4:sol
    }

}

enum Moves{
    TOP,DOWN,LEFT,RIGHT;

    private int x;

    Moves() {
        System.out.println("enum created");
    }

    public void foo(){

    }
}

class Snake{
    public void move(Moves direction){

    }
}