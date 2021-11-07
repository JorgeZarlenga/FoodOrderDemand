package br.com.fiap.foodOrderDemand.model;

import java.io.Serializable;
import java.sql.Time;

/**
 * Classe que abstrai o Restaurante
 * 
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */

public class Restaurante implements Serializable {

	private static final long serialVersionUID = 1L;

	// Atributos:

	private int codRestaurante;
	private String nomeRestaurante;
	private String numeroCep;
	private int numeroLogradouro;
	private Time horaInicioFuncionamento;
	private Time horaTerminoFuncionamento;
	private String categoriaRestaurante;
	private int avaliacao;
	private int quantidadeCozinheiros;
	private int quantidadeEntregadores;
	private double raioAtuacaoKm;

	// Construtor vazio:

	public Restaurante() {
		super();
	}

	// Construtor que recebe todos parametros:

	public Restaurante(int codRestaurante, String nomeRestaurante, String numeroCep, int numeroLogradouro,
			Time horaInicioFuncionamento, Time horaTerminoFuncionamento, String categoriaRestaurante, int avaliacao,
			int quantidadeCozinheiros, int quantidadeEntregadores, double raioAtuacaoKm) {
		super();
		this.codRestaurante = codRestaurante;
		this.nomeRestaurante = nomeRestaurante;
		this.numeroCep = numeroCep;
		this.numeroLogradouro = numeroLogradouro;
		this.horaInicioFuncionamento = horaInicioFuncionamento;
		this.horaTerminoFuncionamento = horaTerminoFuncionamento;
		this.categoriaRestaurante = categoriaRestaurante;
		this.avaliacao = avaliacao;
		this.quantidadeCozinheiros = quantidadeCozinheiros;
		this.quantidadeEntregadores = quantidadeEntregadores;
		this.raioAtuacaoKm = raioAtuacaoKm;
	}

	// Getters and setters:

	public int getCodRestaurante() {
		return codRestaurante;
	}

	public void setCodRestaurante(int codRestaurante) {
		this.codRestaurante = codRestaurante;
	}

	public String getNomeRestaurante() {
		return nomeRestaurante;
	}

	public void setNomeRestaurante(String nomeRestaurante) {
		this.nomeRestaurante = nomeRestaurante;
	}

	public String getNumeroCep() {
		return numeroCep;
	}

	public void setNumeroCep(String numeroCep) {
		this.numeroCep = numeroCep;
	}

	public int getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(int numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public Time getHoraInicioFuncionamento() {
		return horaInicioFuncionamento;
	}

	public void setHoraInicioFuncionamento(Time horaInicioFuncionamento) {
		this.horaInicioFuncionamento = horaInicioFuncionamento;
	}

	public Time getHoraTerminoFuncionamento() {
		return horaTerminoFuncionamento;
	}

	public void setHoraTerminoFuncionamento(Time horaTerminoFuncionamento) {
		this.horaTerminoFuncionamento = horaTerminoFuncionamento;
	}

	public String getCategoriaRestaurante() {
		return categoriaRestaurante;
	}

	public void setCategoriaRestaurante(String categoriaRestaurante) {
		this.categoriaRestaurante = categoriaRestaurante;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getQuantidadeCozinheiros() {
		return quantidadeCozinheiros;
	}

	public void setQuantidadeCozinheiros(int quantidadeCozinheiros) {
		this.quantidadeCozinheiros = quantidadeCozinheiros;
	}

	public int getQuantidadeEntregadores() {
		return quantidadeEntregadores;
	}

	public void setQuantidadeEntregadores(int quantidadeEntregadores) {
		this.quantidadeEntregadores = quantidadeEntregadores;
	}

	public double getRaioAtuacaoKm() {
		return raioAtuacaoKm;
	}

	public void setRaioAtuacaoKm(double raioAtuacaoKm) {
		this.raioAtuacaoKm = raioAtuacaoKm;
	}

	// Metodos CRUD:

	
	
	// Metodo toString:

	@Override
	public String toString() {
		return "Restaurante [codRestaurante=" + codRestaurante + ", nomeRestaurante=" + nomeRestaurante + ", numeroCep="
				+ numeroCep + ", numeroLogradouro=" + numeroLogradouro + ", categoriaRestaurante="
				+ categoriaRestaurante + ", avaliacao=" + avaliacao + ", quantidadeCozinheiros=" + quantidadeCozinheiros
				+ ", quantidadeEntregadores=" + quantidadeEntregadores + ", raioAtuacaoKm=" + raioAtuacaoKm + "]";
	}

}