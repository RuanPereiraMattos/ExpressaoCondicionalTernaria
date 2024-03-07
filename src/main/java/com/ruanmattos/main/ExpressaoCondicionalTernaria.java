package com.ruanmattos.main;

import java.util.Scanner;

/**
 * Exercício sobre Expressão Condicional Ternária
 *
 * @author Ruan Pereira Mattos
 */
public class ExpressaoCondicionalTernaria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor para receber o desconto: ");

        double preco = teclado.nextDouble();

        double desconto;

        double descontoTernario = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }

        System.out.println("R$ " + desconto + " de Desconto");

        System.out.println("R$ " + descontoTernario + " de Desconto");
    }
}
