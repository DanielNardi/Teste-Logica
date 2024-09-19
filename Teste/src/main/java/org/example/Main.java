package org.example;

import static org.example.primo.numeroPrimo;


public class Main {
    public static void main(String[] args) {




        //clique inicia em 1 cont 0
        int clique = 1;
        int acumulado =0;

        for (int i = 0; i < 10; i++) {
            //se for maior que 21 soma +1
            if (acumulado < 21) {
                acumulado += clique;
            } else {
                acumulado += 1;
            }
            //função que verifica numero primo
            if (numeroPrimo(acumulado)) {
                System.out.printf("%d é um número primo%n", acumulado);
            }

            System.out.println(clique +"º" + " Acumulado: " + acumulado);
            clique++;
        }

        }

}

