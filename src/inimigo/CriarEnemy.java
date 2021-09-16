package inimigo;

import player.PlayerInterface;

import java.util.Random;
import java.util.Scanner;

public class CriarEnemy {
    public static void CriarEnemy(){
        Random seed = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o Nome do Inimigo? ");
        String nomee = scan.nextLine();
        Integer hpe = seed.nextInt(50);
        Integer atke = seed.nextInt(20);
        EnemyInterface enemyInterface = new EnemyInterface(nomee,hpe,atke);
        System.out.println(enemyInterface.dados());
    }
}
