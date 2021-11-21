package zooAnimales;
import gestion.Zona;
import java.util.*;

public class Ave extends Animal {
	
	private ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public Ave () {
		listado.add(this);
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	
	public String movimiento () {
		return "volar";
	}
	
	public int static cantidadAves () {
		return listado.size();
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
}