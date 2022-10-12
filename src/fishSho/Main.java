package fishSho;

public class Main {

	public static void main(String[] args) {
	     FishShop fish1= new FishShop();
	     fish1.setFish("Japon Balığı");
	     fish1.setBait("Mamun");
	     fish1.setRod("Caperlan Deniz Bot Balıkçılğı Kamış Makine Seti");
	     fish1.setAquarium("Fluval Felx");
	     System.out.println("olta:"+fish1.getRod()+" "+"-"+" "+"Yem:"+fish1.getBait()+" "+"-"+" "+"Balık:"+fish1.getFish()+" "+"-"+" "+"Akvaryum:"+fish1.getAquarium());
	     Rod rod1= new Rod();
	     rod1.setBrand("Caperlan Deniz Bot Balıkçılğı Kamış Makine Seti");
	     rod1.setClosedSize(156);
	     rod1.setNumberOfRings(10);
	     System.out.println(rod1.getBrand()+" "+"-"+" "+rod1.getClosedSize()+"CM"+" "+"-"+" "+rod1.getNumberOfRings()+" "+"Halka");
	}    
	
	

}
