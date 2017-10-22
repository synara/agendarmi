import java.io.Serializable;

public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;
	private int cod;
	private String nome;
	private String fone;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
}
