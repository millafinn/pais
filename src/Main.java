import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String aux1;
        int aux2;

        String paisMaiorPop="";
        int maiorPop=0;

        Scanner inp = new Scanner(System.in);
        Pais[] pais = new Pais[6];

        for (int i=0; i<6; i++){
            System.out.println("Informe o nome do país:" + (i+1));
            aux1=inp.next();

            System.out.println("Informe a informação do pais" + (i+1));
            aux2=inp.nextInt();

            pais[i]=new Pais(aux1, aux2);
            if(aux2>maiorPop){
                paisMaiorPop=aux1;
                maiorPop=aux2;
            }
        }
        System.out.println(("O pais" + paisMaiorPop + "possui a maior população de " + maiorPop));
    }
}