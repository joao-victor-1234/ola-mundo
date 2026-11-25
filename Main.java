import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int op=0;
        ArrayList<Banco> inimigos=new ArrayList<>();
        System.out.println("DIGITE O NOME DO HEROI!");
        String nome=sc.next();
        System.out.println("DIGITE O SEU NIVEL!");
        int nivel=sc.nextInt();
        System.out.println("DIGITE SUA VIDA!");
        double vida=sc.nextDouble();
        double dano=vida/3;
        Banco heroi=new Banco(nome, nivel, vida, dano);
        
        while(op != 1&&op !=2  &&op !=3){
            System.out.println("""
                ESCOLHA SUA CLASSE
                1- CAVALEIRO
                2- MAGO
                3- HUMANO
                """);
                op=sc.nextInt();
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
            
        }
        Banco inimigo=new Banco("goblin", 50, 500, 100);
        inimigos.add(inimigo);
        op=0;
        while(op != 1&&op !=2  &&op !=3){
            System.out.println("SELECIOINE A DIFICULDADE!");
            System.out.println("""
                1- FACIL
                2- MEDIO
                3- DIFICIL    
            """);
            op=sc.nextInt();
            switch (op) {
            case 1:
                inimigo.dificuldade=Dificuldade.FACIL;
                System.out.println("DIFICULDADE FACIL SELECIONADA");
                break;
            case 2:
                inimigo.dificuldade=Dificuldade.MEDIO;
                System.out.println("DIFICULDADE MEDIO SELECIONADA");
                inimigo.setNivel(100);
                inimigo.setVida(1000);
                inimigo.dano=150;
                break;
            case 3:
                inimigo.dificuldade=Dificuldade.DIFICIL;
                System.out.println("DIFICULDADE DIFICIL SELECIONADA");
                inimigo.setNivel(150);
                inimigo.setVida(1500);
                inimigo.dano=200;
                break;    
            default:
                System.err.println("DIGITE UMA OPÇAO VALIDA");
                break;
        }
        }
        System.out.println("UM GOBLIN APARECEU");
        System.out.println(inimigo);
        System.out.println("==SEUS STATUS==");
        System.out.println(heroi);
        System.out.println("VOCE DESEJA ATACALO?!");
        String resp=sc.next();
        if(resp.equalsIgnoreCase("sim")){
            while(inimigo.getVida() <= 0){
                System.out.println(heroi.nome+" atacou o goblin!!");
                heroi.atacar(inimigo.getVida());  
                if (inimigo.getVida()>0) {
                    System.out.println("goblin sobreviveu e te atacou");
                    System.out.println("Dano- "+inimigo.dano);
                    inimigo.atacar(heroi.getVida());
                    if(heroi.getVida()<0){
                        System.out.println("Goblin te atacou e voce morreu!!");
                    }
                }     
            }
        }else{
            System.out.println("VOCE FUGIU COVARDE!!");
        }
        System.out.println("VOCE MATOU O GOBLIN, PARABENS!!");
    }
}