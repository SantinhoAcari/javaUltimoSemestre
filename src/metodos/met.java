package metodos;

import java.util.Arrays;

public class met {
    
    private String prof[] = { "Alex Andrade", "Wanfranklin Alves", "Padilha Neto", "Erivelton Lima" };
    private String msg = "Bem Vindo ao Java - Santinho";
    private String msgProf = "Professor: ";
    private String msgUnp = "UNP: ensino pra Valer ";
    private int largura = 120;
    private int altura = 60;
    private int margem2 = (largura - (msgProf.length() + msgUnp.length() + 18));
    private int margem = (largura - msg.length()) / 2;
    private char simbolo = '*'; // alt+973='\u2550';
    

    public void telaProf() {
        // for (int s = 0; s < largura; s++) {
        //     System.out.print(simbolo);
        // }
        // System.out.println("");

        for (int s = 0; s < 1; s++) {
            System.out.print("" + simbolo + simbolo);
            System.out.print("  " + msgProf + prof[0]);
            for (int ss = 0; ss < margem2; ss++) {
                System.out.print(" ");
            }
            System.out.print(msgUnp);

            
            System.out.println("" + simbolo + simbolo);
        }

        for (int s = 0; s < largura; s++) {
            System.out.print(simbolo);
        }

        System.out.println();

    }

    public void telaInicial() {

        for (int s = 0; s < this.largura; s++) {
            System.out.print(simbolo);
        }
        System.out.println("");

        for (int s = 0; s < 1; s++) {
            System.out.print("" + simbolo + simbolo);
            for (int ss = 0; ss < margem; ss++) {
                System.out.print(" ");
            }
            System.out.print(msg);

            for (int S = 0; S < margem - 4; S++) {
                System.out.print(" ");
            }
            System.out.println("" + simbolo + simbolo);
        }

        for (int s = 0; s < largura; s++) {
            System.out.print(simbolo);
        }

        System.out.println();

        for (int s = 0; s < altura - 14; s++) {
            System.out.print("" + simbolo + simbolo);
            for (int S = 0; S < largura - 4; S++) {
                System.out.print(" ");
            }
        }

        System.out.println();

        for (int s = 0; s < largura; s++) {
            System.out.print(simbolo);
        }
        System.out.println("");
    }

    public void listaProf() {
        
        Arrays.sort(prof);
        for (int s = 0; s < prof.length; s++) {
            if (s < prof.length - 1) {

                System.out.print(prof[s] + ", ");
            } else {
                System.out.print(prof[s] + ". ");
            }

        }

    }
}
