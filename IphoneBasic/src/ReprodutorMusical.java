package iphoneInterface;



public class ReprodutorMusical {
	static AparelhoTelefonico at= new AparelhoTelefonico();
	
	public boolean tocarMusica(Boolean b) {
		 b = true;
		try {
			if(at.ligar()!=false) {
				System.out.println("Musica Tocando....");
			}else {
				System.out.println("OFF");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
		
	}
	public String pausar() {
		try {
			if(tocarMusica(null)!=false) {
				
				System.out.println("Musica PAUSADA....");
			}else {
				System.out.println("APARAELHO DESLIGADO");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
