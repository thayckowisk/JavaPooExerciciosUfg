
public class Imóvel {
private int código;
private Proprietário proprietário;
private String tipo = "lote";
private double tamanho;
private double valor;
private String situação = "à venda"; //"à venda", "reservado" ou vendido"
private Proprietário reservadoPara;

public Imóvel(int código, Proprietário proprietário, String tipo, double tamanho, double valor) {
	super();
	this.código = código;
	this.proprietário = proprietário;
	this.setTipo(tipo);
	this.tamanho = tamanho;
	this.valor = valor;
	
}

public int getCódigo() {
	return código;
}

public void setCódigo(int código) {
	this.código = código;
}

public Proprietário getProprietário() {
	return proprietário;
}

public void setProprietário(Proprietário proprietário) {
	this.proprietário = proprietário;
}

public String getTipo() {
	return tipo;
}

private void setTipo(String tipo) {
	this.tipo = tipo;
}

public double getTamanho() {
	return tamanho;
}

public void setTamanho(double tamanho) {
	this.tamanho = tamanho;
}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

public String getSituação() {
	return situação;
}

public void setSituação(String situação) {
	this.situação = situação;
}

public Proprietário getReservadoPara() {
	return reservadoPara;
}

public void setReservadoPara(Proprietário reservadoPara) {
	this.reservadoPara = reservadoPara;
}


}
