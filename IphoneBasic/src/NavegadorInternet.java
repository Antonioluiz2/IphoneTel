package iphoneInterface;

import java.awt.Button;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javafx.scene.web.WebView;

public class NavegadorInternet implements Status{

	@Override
	public boolean estado() {
		 boolean ligar=true;
			return ligar;
	}
	
	public File exibirPagina() {
		File fl=new File("arquivo/jax.html");
		 if(estado()!=false) {
			 fl.getAbsoluteFile();
			  System.out.println("EXIBINDO!");
		  }else {
			  System.out.println("SEM REDE!");
		  }
		return fl;
		  
	}
	
	public void adicionarNovaAba() throws IOException, URISyntaxException {
		if(estado()!=true) {
			System.out.println("PAGINA NÃO ENCONTRADA");
		}else {
			Desktop.getDesktop().browse(new URI("https://www.google.com"));
			System.out.println("OK");
		}
		
	}
	public void atualizarPagina() throws URISyntaxException, IOException {
		 WebView webComponent = new WebView();
		 URI url = new URI("https://www.google.com");
	        Desktop.getDesktop().browse(url);
	        // Atualiza a página
//	        WebBrowser browser = Desktop.getDesktop().getWebBrowser();
//	        WebView  browser = Desktop.getDesktop().getWebBrowser();
	       webComponent.getEngine().load("http://google.com/");
	        webComponent.getEngine().reload();
	}

}
