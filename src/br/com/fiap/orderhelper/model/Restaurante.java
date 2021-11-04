package br.com.fiap.orderhelper.model;

public class Restaurante implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// Atributos:

		private int codRestaurante;
		private String nomeRestaurante;
		private int numeroCep;
		private int numeroLogradouro;
		private GregorianCalendar horaInicioFuncionamento;
		private GregorianCalendar horaTerminoFuncionamento;
		private String categoriaRestaurante;
		private int avaliacao;
		private int quantidadeCozinheiros;
		private int quantidadeEntregadores;
		private double raioAtuacaoKm;

		// Construtor vazio:

		public Restaurante() {

		}
		
		// Construtor que recebe todos parametros:

		public Restaurante(int codAlimento, GregorianCalendar dataHoraAlimento, String nomeAlimento, double energiaKcalAlimento, String descricaoAlimento) {
			this.codAlimento = codAlimento;
			this.dataHoraAlimento = dataHoraAlimento;
			this.nomeAlimento = nomeAlimento;
			this.energiaKcalAlimento = energiaKcalAlimento;
			this.descricaoAlimento = descricaoAlimento;
		}

		// Metodos getters and setters:
		
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

		public int getNumeroCep() {
			return numeroCep;
		}

		public void setNumeroCep(int numeroCep) {
			this.numeroCep = numeroCep;
		}

		public int getNumeroLogradouro() {
			return numeroLogradouro;
		}

		public void setNumeroLogradouro(int numeroLogradouro) {
			this.numeroLogradouro = numeroLogradouro;
		}

		public GregorianCalendar getHoraInicioFuncionamento() {
			return horaInicioFuncionamento;
		}

		public void setHoraInicioFuncionamento(GregorianCalendar horaInicioFuncionamento) {
			this.horaInicioFuncionamento = horaInicioFuncionamento;
		}

		public GregorianCalendar getHoraTerminoFuncionamento() {
			return horaTerminoFuncionamento;
		}

		public void setHoraTerminoFuncionamento(GregorianCalendar horaTerminoFuncionamento) {
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
		
		
}








package br.com.fiap.healthtrack.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Classe que abstrai o atributo alimento
 * 
 * @author Dionney Saraiva, Jorge Zarlenga, Maria Eduarda e Rodrigo Valori
 * @version 1.0
 */

public class Alimento implements Serializable {

	private static final long serialVersionUID = 1L;

	

	// Construtor que recebe todos parametros:

	public Alimento(int codAlimento, GregorianCalendar dataHoraAlimento, String nomeAlimento, double energiaKcalAlimento, String descricaoAlimento) {
		this.codAlimento = codAlimento;
		this.dataHoraAlimento = dataHoraAlimento;
		this.nomeAlimento = nomeAlimento;
		this.energiaKcalAlimento = energiaKcalAlimento;
		this.descricaoAlimento = descricaoAlimento;
	}

	// Metodos getters and setters:

	public int getCodAlimento() {
		return codAlimento;
	}

	public void setCodAlimento(int codAlimento) {
		this.codAlimento = codAlimento;
	}

	public GregorianCalendar getDataHoraAlimento() {
		return dataHoraAlimento;
	}

	public void setDataHoraAlimento(GregorianCalendar dataHoraAlimento) {
		this.dataHoraAlimento = dataHoraAlimento;
	}

	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	public double getEnergiaKcalAlimento() {
		return energiaKcalAlimento;
	}

	public void setEnergiaKcalAlimento(double gastoKcalAlimento) {
		this.energiaKcalAlimento = gastoKcalAlimento;
	}

	public String getDescricaoAlimento() {
		return descricaoAlimento;
	}

	public void setDescricaoAlimento(String descricaoAlimento) {
		this.descricaoAlimento = descricaoAlimento;
	}

	// Metodos:

	/**
	 * Cadastra o alimento ingerido
	 * 
	 * @param dataHoraAlimento    Data e hora do consumo do alimento
	 * @param nomeAlimento        Nome do alimento
	 * @param gastoKcalAlimento Quantidade de quilocalorias do alimento ingerido
	 * @param descricaoAlimento   Descricao do alimento
	 * @return cadastroPesoFinalizado
	 */

	public boolean cadastrarAlimento(GregorianCalendar dataHoraAlimento, String nomeAlimento, double gastoKcalAlimento,
			String descricaoAlimento) {

		boolean cadastroAlimentoFinalizado = false;

		return cadastroAlimentoFinalizado;
	}

	/**
	 * Lista o historico de alimentos ingeridos
	 * 
	 * @param dataHoraAlimento Data e hora do consumo do alimento
	 * @return listaAlimentos
	 */

	public List<Alimento> consultarAlimento(GregorianCalendar dataHoraAlimento) {

		List<Alimento> listaAlimentos = new ArrayList<>();

		return listaAlimentos;
	}

	/**
	 * Edita os alimentos ingeridos
	 * 
	 * @param codAlimento Codigo de identificacao do alimento
	 * @return edicaoAlimentoFinalizada
	 */

	public boolean editarAlimento(int codAlimento) {

		boolean edicaoAlimentoFinalizada = false;

		return edicaoAlimentoFinalizada;
	}

	/**
	 * Exclui os alimentos ingeridos
	 * 
	 * @param codAlimento Codigo de identificacao do alimento
	 * @return exclusaoAlimentoFinalizada
	 */

	public boolean excluirAlimento(int codAlimento) {

		boolean exclusaoAlimentoFinalizada = false;

		return exclusaoAlimentoFinalizada;
	}

	@Override
	public String toString() {
		return "Alimento [codAlimento=" + codAlimento + ", dataHoraAlimento=" + dataHoraAlimento + ", nomeAlimento="
				+ nomeAlimento + ", gastoKcalAlimento=" + gastoKcalAlimento + ", descricaoAlimento="
				+ descricaoAlimento + "]";
	}
}
