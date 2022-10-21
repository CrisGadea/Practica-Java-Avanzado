package clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import interfaces.Evolucionable;
import utils.Tipo;

public class Pokemon implements Evolucionable{
	
	private Long id;
	private String nombre;
	private Tipo tipo;
	private String img;
	private List<String> habilidades;
	
	public Pokemon() {this.habilidades = new LinkedList<String>();}
	
	public Pokemon(String nombre, Tipo tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.habilidades = new ArrayList<String>();
	}
	
	public Pokemon(Long id, String nombre, Tipo tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.habilidades = new ArrayList<String>();
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	@Override
	public void evolucionar() {
		// Quiero que mi pokemón ahora sea otro
	}

	@Override
	public void desEvolucionar() {
		// TODO Auto-generated method stub
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", habilidades=" + habilidades + "]";
	}

	
}
