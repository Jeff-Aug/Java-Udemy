package entities;

import java.util.Date;

public class Aluno {
	String name;
	double mensa;
	Date mesAno;
	
	public Aluno(String name, double mensa, Date mesAno) {
		
		this.name = name;
		this.mensa = mensa;
		this.mesAno = mesAno;
	}
	
	public Aluno() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMensa() {
		return mensa;
	}

	@Override
	public String toString() {
		return "Aluno [name=" + name + ", mensa=" + mensa + ", mesAno=" + mesAno + "]";
	}

	public void setMensa(double mensa) {
		this.mensa = mensa;
	}

	public Date getMesAno() {
		return mesAno;
	}

	public void setMesAno(Date mesAno) {
		this.mesAno = mesAno;
	}
	
}
