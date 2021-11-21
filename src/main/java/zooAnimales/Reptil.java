package zooAnimales;
import gestion.Zona;
import java.util.*;

public class Reptil extends Animal {
	
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil (String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public Reptil() {
		listado.add(this);
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public int getLargoCola() {
		return this.largoCola;
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		return iguana;
	}
	
	public void crearSerpiente() {
		serpientes++;
		serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
		return serpiente; 
	}
}