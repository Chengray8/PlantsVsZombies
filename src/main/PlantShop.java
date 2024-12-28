package main;

public class PlantShop {
	private final int SunflowerPrice=50;
	private final int PeashooterPrice=100;
	private final int FreezePeashooterPrice=175;
	//New PlantPrice
	public PlantShop() {}
	
	public Plant getPlant(GameWindow.PlantType ptype ,IGamePanel igp, int[] array) {
		int Sunscore = igp.getSunScore();
		switch (ptype){
			case GameWindow.PlantType.Sunflower:
				if(Sunscore >=SunflowerPrice) {
					igp.setSunScore(Sunscore-SunflowerPrice);
					return new Sunflower(igp,array[0],array[1]);
				}
			case GameWindow.PlantType.Peashooter:
				if(Sunscore >=PeashooterPrice) {
					igp.setSunScore(Sunscore-PeashooterPrice);
					return new Peashooter(igp,array[0],array[1]);
				}
			case GameWindow.PlantType.FreezePeashooter:
				if(Sunscore >=FreezePeashooterPrice) {
					igp.setSunScore(Sunscore-FreezePeashooterPrice);
					return new FreezePeashooter(igp ,array[0],array[1]);
				}
			default:
				return null;
		}
	}
}
