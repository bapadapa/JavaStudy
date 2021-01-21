package gameLevel;

public class Player {

	private playerLevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public playerLevel getLevel() {
		return level;
	}

	public void setLevel(playerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count ) {
		level.go(count);
	}


}
