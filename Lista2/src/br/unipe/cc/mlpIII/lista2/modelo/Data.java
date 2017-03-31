/*
 * @date 29/03/2017
 * @autor Aleff Santos da Silva & Lucas Camargo Sodré
 * 
 * Classe Data Refeita de acordo com os principios da OO!
 */

package br.unipe.cc.mlpIII.lista2.modelo;

public class Data {

	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {// metodo set dia que vai pegar somente o
									// intervalo entre 1 e 31.
		try {
			if (dia <= 31 && dia > 0) {
				this.dia = dia;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: Não foi possível válidar o dia!");
		}

	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {// Metodo set mês que setara o mes se tiver no
									// intervalo entre 1 e 12 desparara a
									// exceção caso seja passado valor inválido
		try {
			if (mes <= 12 && mes > 0) {
				this.mes = mes;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: Não foi possível válidar o mês!");
		}

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) { // Método set Ano que somente setará se
									// estiver no intervalo definido
									// Intervalo curto pois vai demorar muito
									// para chegar no ano 3000 e não usamos
									// datas antes de 1900
		try {
			if (ano <= 3000 && ano >= 1900) {
				this.ano = ano;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: Não foi possível válidar o ano!");
		}

	}

	public Data() {
		// Construtor vazio para poder utilizar os métodos set;
	}

	public Data(int dia, int mes, int ano) {
		// constutor com valores. optei por utilizar o métodos set, pois eles
		// possuem tratamento.
		setDia(dia);
		setMes(mes);
		setAno(ano);

	}

	public Data(int dia, int mes) {
		// mesmo do contrutor acima..
		setDia(dia);
		setMes(mes);
		this.ano = 2016;
	}

	@Override
	public String toString() { // Método toString refeito para não mostrar a
								// data quando a mesma for inválida.
		if (this.dia == 0 || this.mes == 0 || this.ano == 0)
			return "Data inválida";
		else
			return dia + "/" + mes + "/" + ano;
	}

}
