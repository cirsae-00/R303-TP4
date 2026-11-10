package tp4;

import java.util.ArrayList;

public class ArbreGeneric <T>{
	
	private Noeud<T> seed ;
	
	ArbreGeneric(){
		
		this.seed = null;
		
	}
	
	ArbreGeneric(T value){
		
		this.seed = new Noeud<T>(value);
		
	}
	
	public void addGauche(T e) {
		
		Noeud<T> ajout = new Noeud<T>(e);
		
		Noeud<T> tempSeed = this.seed;
		
		while(tempSeed.hasGauche()) {
			
				
				tempSeed = tempSeed.gauche ;
			
		}
		
		tempSeed.setGauche(ajout);
		
	
	}
	
	public Noeud<T> getSeed(){
		
		return this.seed ;
	}
	
	public boolean isEmpty() {
		
		if (this.seed == null) {
			
			return true ;
			
		}
		
		
		return false ;
		
	}
	
	
	public void addDroit(T e) {
		
		Noeud<T> ajout = new Noeud<T>(e);
		
		Noeud<T> tempSeed = this.seed;
		
		while(tempSeed.hasDroit()) {
			
				
				tempSeed = tempSeed.droit ;
			
		}
		
		tempSeed.setDroit(ajout);
		
	
	}
	
	public String parcoursPrefix(Noeud<T> d){
		
		if(d == null) {
			
			return "--"; 
			
		} else {
			
			if(d.hasGauche()) {
				
				return d.toString() + parcoursPrefix(d.getGauche());
				
			} else {
				
				return d.toString() + parcoursPrefix(d.getDroit());
				
			}
			
		}
		
		
	}
	
	private static class Noeud <T>{
		
		private T value ;
		private Noeud<T> gauche ;
		private Noeud<T> droit ;
		
		Noeud(){
			
			this.value = null ;
			this.gauche = null ;
			this.droit = null ;
			
		}
		
		Noeud(T value){
			
			this.value = value ;
			this.gauche = null ;
			this.droit = null ;
		}
		
		Noeud(T value, Noeud<T> gauche, Noeud<T> droit){
			
			this.value = value ;
			this.gauche = gauche ;
			this.droit = droit ;
			
		}
	
		
		public void setValue(T value) {
			
			this.value = value ;
			
		}
		
		public T getValue() {
			
			return this.value ;
			
		}
		
		public void setDroit(Noeud<T> droit) {
			
			this.droit = droit ;
			
		}
		
		public Noeud<T> getDroit(){
			
			return this.droit ;
			
		}
		
		public void setGauche(Noeud<T> gauche) {
			
			this.gauche = gauche ;
			
		}
		
		public Noeud<T> getGauche(){
			
			return this.gauche ;
			
		}
		
		public boolean hasGauche() {
			
			return this.gauche == null ;
			
		}
		
		public boolean hasDroit() {
			
			return this.droit == null ;
			
		}
		
		
		public String toString() {
			
			return (String) this.value ;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		ArbreGeneric<Integer> a1 = new ArbreGeneric<Integer>(1);
		a1.addDroit(3);
		a1.addGauche(2);
		a1.addGauche(4);
		a1.addDroit(5);
		
		System.out.println(a1.getSeed());
		
		
	}

}
