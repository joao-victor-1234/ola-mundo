public class Banco {
    public String nome;
    private int nivel;
    private double vida;
    public double dano;
    public Classe classe;
    public Dificuldade dificuldade;

    public Banco(String nome,int nivel,double vida,double dano){
        this.nome=nome;
        this.nivel=nivel;
        this.vida=vida;
        this.dano=dano;
    }
    public void setVida(double vida){
        this.vida=vida;
    }
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
    public double getVida(){
        return vida;
    }
    public double getNivel(){
        return nivel;
    }
    public void atacar(double ataque){
        this.dano-=vida;
    }
    @Override 
    public String toString(){
        return "Nome- "+nome+
        "| Nivel- "+getNivel()+
        "| Vida- "+getVida()+
        "| Dano- "+dano;
    }
}
