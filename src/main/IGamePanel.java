package main;

import java.util.ArrayList;

public interface IGamePanel {
    public GamePanel getGamePanel();
    public ArrayList<ArrayList<Zombie>> getLaneZombies();
    public int getSunScore();
    public void setSunScore(int sunScore);
    public ArrayList<ArrayList<Pea>> getLanePeas();
}
