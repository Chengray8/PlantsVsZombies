package main;
import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Armin on 6/25/2016.
 */
public class Peashooter extends Plant {

    public Timer shootTimer;


    public Peashooter(IGamePanel igp ,int x, int y) {
        super(igp,x, y);
        shootTimer = new Timer(2000, (ActionEvent e) -> {
            //System.out.println("SHOOT");
            if (getLaneZombies().get(y).size() > 0) {
            	//System.out.println("PEASHOOT");
            	getLanePeas().get(y).add(new Pea(getGp(), y, 103 + this.getX() * 100));
            }
        });
        shootTimer.start();
    }

    @Override
    public void stop() {
        shootTimer.stop();
    }
    @Override
    public String getName() {
    	return "Peashooter";
    }
}
