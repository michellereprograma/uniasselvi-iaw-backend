package br.com.smarthphone.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "smartphone")
public class Smartphone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome", length = 200, nullable = true)
	private String nome;
	
	@Column(name = "marca", length = 50, nullable = true)
	private String marca;
	
	@Column(name = "tamanho_tela", nullable = true)
	private Double tamanhoTela;
	
	@Column(name = "cor", length = 50, nullable = true)
	private String cor;
	
	@Column(name = "processador", length = 50, nullable = true)
	private String processador;
	
	@Column(name = "memoria_ram", length = 50, nullable = true)
	private String memoriaRam;
	
	@Column(name = "espaco_interno", length = 50, nullable = true)
	private String espacoInterno;
	
	@Column(name = "preco", nullable = true)
	private Double preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "data_lancamento", nullable = true)
	private Date dataLancamento;
	
	@Column(name = "url_imagem", length = 500, nullable = true)
	private String urlImagem;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Double getTamanhoTela() {
		return tamanhoTela;
	}
	
	public void setTamanhoTela(Double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getProcessador() {
		return processador;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public String getMemoriaRam() {
		return memoriaRam;
	}
	
	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
	public String getEspacoInterno() {
		return espacoInterno;
	}
	
	public void setEspacoInterno(String espacoInterno) {
		this.espacoInterno = espacoInterno;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getUrlImagem() {
		return urlImagem;
	}
	
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
}
