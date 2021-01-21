package gameLevel;

public class MainBoardPlay {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel  =new AdvancedLevel();
		player.setLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.setLevel(sLevel);
		player.play(3);
	}
}
