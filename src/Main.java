import inimigo.CriarEnemy;
import player.CriarPlayer;

import java.util.Objects;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String r;
            int r2;
            int i = 0;
            System.out.println("Ola, seja bem Vindo ao Criador de Personagens!");
            System.out.println("Aperte P para criar um Jogador e E para criar um Inimigo!");
            r = sc.nextLine();
            System.out.println("Quantos você deseja cria? ");
            r2 = sc.nextInt();
            while (i<r2) {
                if (Objects.equals(r, "p") || Objects.equals(r, "P")) {
                    CriarPlayer.CriarP();
                    i++;
                } else if (Objects.equals(r, "e") || Objects.equals(r, "E")) {
                    CriarEnemy.CriarEnemy();
                    i++;
                } else {
                    System.out.println("Por favor Escolha uma Opçao valida!");
                }
            }


        }
    }


