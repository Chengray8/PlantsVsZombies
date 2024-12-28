package Unit_test;
import main.Zombie;
import main.GamePanel;
import main.ConeHeadZombie;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JLabel;

import org.junit.jupiter.api.Test;

class ZombieTest {

	@Test
	void test_Zombie_health() {
		JLabel sun = new JLabel("SUN");
		GamePanel gp = new GamePanel(sun);
		Zombie zombie = new Zombie(gp, 1);
		int healthresult = zombie.getHealth();
		assertEquals(healthresult , 1000);
	}
	@Test
	void test_ConeHeadZombie_health() {
		JLabel sun = new JLabel("SUN");
		GamePanel gp = new GamePanel(sun);
		ConeHeadZombie zombie = new ConeHeadZombie(gp, 1);
		int healthresult = zombie.getHealth();
		assertEquals(healthresult , 1800);
	}

}
