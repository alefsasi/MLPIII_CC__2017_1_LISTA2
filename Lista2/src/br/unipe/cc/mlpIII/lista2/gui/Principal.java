/*
 * @date 29/03/2017
 * @autor Aleff Santos da Silva & Lucas Camargo Sodré
 * 
 * Classe principal que testa a classe Data!
 */

package br.unipe.cc.mlpIII.lista2.gui;

import br.unipe.cc.mlpIII.lista2.modelo.Data;

public class Principal {

	public static void main(String[] args) {

		Data d = new Data();
		d.setDia(8);// não dá para passar 08 pois o java entende como valor
					// octal.
		d.setMes(88);
		d.setAno(-1);
		System.out.println(d);

		// teste do construtor..
		Data exp = new Data(29, 03, 2017);
		// print para ver no que deu!
		System.out.println("Data do segundo teste: " + exp);

	}
}
