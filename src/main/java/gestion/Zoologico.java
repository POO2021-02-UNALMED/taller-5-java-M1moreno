package gestion;
import java.util.*;

public class Zoologico {
	
	 private String nombre;
	 private String ubicacion;
	 private ArrayList<Zona> zonas;
	 
	 public Zoologico (String nombre, String ubicacion) {
		 this.nombre = nombre;
		 this.ubicacion = ubicacion;
	 }
	 
	 public Zoologico () {}
	 
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 
	 public String getNombre() {
		 return this.nombre;
	 }
	 
	 public void setUbicacion(String ubicacion) {
		 this.ubicacion = ubicacion;
	 }
	 
	 public String getUbicacion() {
		 return this.ubicacion;
	 }
	 
	 public void agregarZonas (Zona zona) {
		 zonas.add(zona)
	 }
	 
	 public int cantidadTotalAnimales (ArrayList[Zona] zonas) {
		 int cantidad;
		 for (int i = 0; i < zonas.size(); i++) {
			 cantidad += zonas[i].animales.size();
		 }
		 return cantidad;
	 }
}