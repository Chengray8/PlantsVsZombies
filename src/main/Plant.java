package main;

import java.util.ArrayList;

/**
 * Created by Armin on 6/25/2016.
 */
public abstract class Plant {

    private int health = 200;

    private int x;
    private int y;

    private IGamePanel igp;


    public Plant(IGamePanel igp,int x, int y) {
        this.x = x;
        this.y = y;
        this.igp = igp;
    }

    public void stop() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public GamePanel getGp() {
        return igp.getGamePanel();
    }
    public ArrayList<ArrayList<Pea>> getLanePeas() {
    	return igp.getLanePeas();
    }
    public ArrayList<ArrayList<Zombie>> getLaneZombies(){
    	return igp.getLaneZombies();
    }
    public String getName() {
    	return "";
    }
}
