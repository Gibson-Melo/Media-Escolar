package entidades;

public class Medias {

	private double p1, p2, p3, med1, med2;

	public Medias() {

	}

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	public double getP3() {
		return p3;
	}

	public void setP3(double p3) {
		this.p3 = p3;
	}

	public double getMed1() {
		return med1;
	}

	private void setMed1(double med1) {
		this.med1 = med1;
	}

	public double getMed2() {
		return med2;
	}

	private void setMed2(double med2) {
		this.med2 = med2;
	}

	public String mediaSemestral() {

		this.setMed1((this.getP1() + this.getP2()) / 2);

		if (this.getMed1() >= 2.0 && this.getMed1() <= 7.0) {
			return "Aluno em Recuperação com média: " + String.format("%.2f", this.getMed1());
		} else {
			return "Aluno Aprovado com média: " + String.format("%.2f", this.getMed1());
		}
	}

	public String mediaFinal() {
		this.setMed2((this.getMed1() + this.getP3()) / 2);
		if (this.getMed2() >= 7.0) {
			return "Aluno Aprovado com média: " + String.format("%.2f", this.getMed2());
		} else {
			return "Aluno Reprovado com média: " + String.format("%.2f", this.getMed2());
		}
	}

}
