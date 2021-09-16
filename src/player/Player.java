package player;

public class Player {
    private String nome;
    private Integer hp;
    private Integer atk;

    public Player(String nome, Integer hp, Integer atk){
        this.nome= nome;
        this.hp= hp;
        this.atk= atk;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getAtk() {
        return atk;
    }

    public String dados(){
        return "Nome: "+ nome +"\n"+"Ataque: "+ atk + "\n"+"Vida: "+hp;
    }
}
