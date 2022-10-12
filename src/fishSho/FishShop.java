package fishSho;

public class FishShop {
     private String fish;
     private String rod;
     private String bait;
     private String aquarium;
	public FishShop() {
		super();
	}
	public FishShop(String fish, String rod, String bait, String aquarium) {
		super();
		this.fish = fish;
		this.rod = rod;
		this.bait = bait;
		this.aquarium = aquarium;
	}
	public String getFish() {
		return fish;
	}
	public void setFish(String fish) {
		this.fish = fish;
	}
	public String getRod() {
		return rod;
	}
	public void setRod(String rod) {
		this.rod = rod;
	}
	public String getBait() {
		return bait;
	}
	public void setBait(String bait) {
		this.bait = bait;
	}
	public String getAquarium() {
		return aquarium;
	}
	public void setAquarium(String aquarium) {
		this.aquarium = aquarium;
	}
     
    	 
}
