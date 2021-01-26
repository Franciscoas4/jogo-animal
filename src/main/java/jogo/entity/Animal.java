package jogo.entity;

public class Animal {

	private Integer id;
	private String atributo;
	private String respostaSim;
	private String respostaNao;
	private Integer idRaiz;
	private Integer filhoRaiz;

	public Animal() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

	public String getRespostaSim() {
		return respostaSim;
	}

	public void setRespostaSim(String respostaSim) {
		this.respostaSim = respostaSim;
	}

	public String getRespostaNao() {
		return respostaNao;
	}

	public void setRespostaNao(String respostaNao) {
		this.respostaNao = respostaNao;
	}

	public Integer getIdRaiz() {
		return idRaiz;
	}

	public void setIdRaiz(Integer idRaiz) {
		this.idRaiz = idRaiz;
	}

	public Integer getFilhoRaiz() {
		return filhoRaiz;
	}

	public void setFilhoRaiz(Integer filhoRaiz) {
		this.filhoRaiz = filhoRaiz;
	}

}
