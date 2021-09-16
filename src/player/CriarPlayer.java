package player;

import java.util.Random;
import java.util.Scanner;

public class CriarPlayer {
    public static void CriarP(){
        Random seed = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o Nome do Jogador? ");
        String nomep = scan.nextLine();
        Integer hpp = seed.nextInt(150);
        Integer atkp = seed.nextInt(50);
        PlayerInterface playerInterface = new PlayerInterface(nomep,hpp,atkp);
        System.out.println(playerInterface.dados());
    }
}
