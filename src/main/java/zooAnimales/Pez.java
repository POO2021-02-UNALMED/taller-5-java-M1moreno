package zooAnimales;
import gestion.Zona;
import java.util.*;

public class Pez extends Animal {
	
	private ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez (String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public Pez () {
		listado.add(this);
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	
	public void setCantidadAleas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	
	public String movimiento () {
		return "nadar";
	}
	
	public static int cantidadPeces () {
		return listado.size();
	}
	
	public void crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public void crearBacalao() {
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
}