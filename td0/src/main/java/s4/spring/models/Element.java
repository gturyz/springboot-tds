package s4.spring.models;

public class Element {

	private String nom;
	private int evaluation;
	
	public Element() {
		this.nom = "";
		this.evaluation = 0;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getEvaluation() {
		return evaluation;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getNom() == ((Element) obj).getNom();
	}
	
}
