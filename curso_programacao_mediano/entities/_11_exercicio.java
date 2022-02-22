package entities;

public class _11_exercicio {
	
	private String sticker;
	private int qtd;
	private String name;
	


	public _11_exercicio(String sticker, int novaqtd, String name) {
		this.sticker = sticker;
		setQTD(novaqtd);
		this.name = name;
		
		
	}
	
	
	public _11_exercicio(int qtd, String sticker) {
		this.qtd = qtd;
		this.sticker = sticker;
	}
	
	
	public int getQTD() {
		return qtd;
	}
	
	public String getsticker() {
		return sticker;
	}
	
	public String getName() {
		return name;
	}
	
	public void setQTD(int adicionar) {
		qtd+=adicionar;
	}
	
	public void setSticker(String novo) {
		novo = sticker;
	}
	
	public String toString() {
		return "Name: " +
				name + 
			   "Sticker: "+
			   sticker +
			   "QTD: " +
			   qtd;	   
	}

}
