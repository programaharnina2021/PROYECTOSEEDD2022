package tresmetodos;

public class Tomntuna {
	private int id;
	private int existencias;
	public Tomntuna(int id, int existencias) {
		super();
		this.id = id;
		this.existencias = existencias;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + existencias;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tomntuna other = (Tomntuna) obj;
		if (existencias != other.existencias)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
}
