package gestion;
import zooAnimales.Animal;
import java.util.*;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona (String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona () {}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setZoologico(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public Zoologico getZoologico() {
		return this.zoo;
	}
	
	public void agregarAnimales (Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales (ArrayList[Animal] animales) {
		int cantidad;
		 for (int i = 0; i < animales.size(); i++) {
			 cantidad += 1;
		 }
		 return cantidad;
	}
}