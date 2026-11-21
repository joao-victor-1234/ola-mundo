import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Banco> inimigos=new ArrayList<>();
        System.out.println("DIGITE O NOME DO HEROI!");
        String nome=sc.next();
        System.out.println("DIGITE O SEU NIVEL!");
        int nivel=sc.nextInt();
        System.out.println("DIGITE SUA VIDA!");
        double vida=sc.nextDouble();
        double dano=vida/3;
        Banco heroi=new Banco(nome, nivel, vida, dano);
        System.out.println("ESCOLHA SUA CLASSE!");
        System.out.println("""
            ESCOLHA SUA CLASSE
            1- CAVALEIRO
            2- MAGO
            3- HUMANO
        """);
        int op=sc.nextInt();
        switch (op) {
            case 1:
                heroi.classe=Classe.CAVALEIRO;
            
                break;
            case 2:
                heroi.classe=Classe.MAGO;

                break;
            case 3:
                heroi.classe=Classe.HUMANO;               
            default:   
                System.out.println("SELECIONE UMA CLASSE VALIDA!");
            break;

            
        }
        System.out.println("SELECIOINE A DIFICULDADE!");
        System.out.println("""
            1- FACIL
            2- MEDIO
            3- DIFICIL    
        """);
        op=sc.nextInt();
        Banco inimigo=new Banco("goblin", 50, 500, 100);
        inimigos.add(inimigo);
        switch (op) {
            case 1:
                inimigo.dificuldade=Dificuldade.FACIL;
                System.out.println("DIFICULDADE FACIL SELECIONADA");
                System.out.println(inimigo);
                break;
            case 2:
                inimigo.dificuldade=Dificuldade.MEDIO;
                inimigo.setNivel(100);
                inimigo.setVida(1000);
                inimigo.dano=150;
                System.out.println(inimigo);
                break;
            case 3:
                inimigo.dificuldade=Dificuldade.DIFICIL;
                inimigo.setNivel(150);
                inimigo.setVida(1500);
                inimigo.dano=200;
                System.out.println(inimigo);
                break;    
            default:
                System.err.println("DIGITE UMA OPÇAO VALIDA");
                break;
        }
        System.out.println("VOCE DESEJA ATACALO?!");
        String resp=sc.next();
        if(resp.equalsIgnoreCase("sim")){
            while(inimigo.getVida() <= 0){
                System.out.println(heroi.nome+" atacou o goblin!!");
                heroi.atacar(inimigo.getVida());       
            }
        }else{
            System.out.println("VOCE FUGIU COVARDE!!");
        }
        System.out.println("VOCE MATOU O GOBLIN, PARABENS!!");
    }
}