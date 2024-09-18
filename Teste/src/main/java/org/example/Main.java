package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //clique inicia em 1 cont 0
        int clique = 1;
        int acumulado =0;

        for (int i = 0; i < 10; i++) {

            if (acumulado < 21) {
                acumulado += clique;
            } else {
                acumulado += 1;
            }

            if (acumulado/2 == 0) {
                System.out.println(acumulado + " é um número primo");
            }


            System.out.println(clique +"º" + " Acumulado: " + acumulado);
            clique++;
        }

        }

}

