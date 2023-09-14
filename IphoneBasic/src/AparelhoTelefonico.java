package iphoneInterface;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class AparelhoTelefonico implements Status{
  
  
  public  boolean ligar() {
	  if(estado()!=false) {
		  System.out.println("LIGADO!");
	  }else {
		  System.out.println("DESLIGADO!");
	  }
	return estado();
	  
  }
  public boolean atender() {
	  Scanner sc= new Scanner(System.in);
	  boolean call;
	  if(estado()==true) {
		  System.out.println(call=true);
		  System.out.println("Deseja atender? S/N");
		  String res=sc.nextLine();
		  if(res.equalsIgnoreCase("S")) {
			  System.out.println("lIGAÇÃO ATENDIDA");
		  }else {
			  
			  System.out.println("lIGAÇÃO RECUSADA");
			  System.out.println(call=false);
		  }
	  }else {
		  correioVoz();
		  System.out.println("CAIXA DE MENSAGEM");
		  call=false;
	  }
	return call;
  }
  public boolean correioVoz() {
	  if(estado()!=true) {
		  System.out.println("CORREIO DE VOZ");
		  
	  }
	return false;
	  
  }
  public static void main(String[] args) throws IOException, URISyntaxException {
//	ligar();
//	atender();
	  NavegadorInternet ni=new NavegadorInternet();
	ReprodutorMusical rp= new ReprodutorMusical();
//	rp.tocarMusica(null);
//	rp.pausar();
	ni.adicionarNovaAba();
}
@Override
public boolean estado() {
	 boolean ligar=true;
	return ligar;
	 
}
}
