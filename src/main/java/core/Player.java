package core;

import java.awt.*;

public class Player {

    private Color color;
    private String name;

    public Player(Color c) {
        color = c;
    }
    public Player(Color c, String n){
        color = c;
        name = n;
    }
    public Color getColor() {
        return color;
    }
    public String getName(){ return name;}

}
