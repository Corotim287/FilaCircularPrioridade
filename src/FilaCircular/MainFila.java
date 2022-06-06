package FilaCircular;

import java.util.Scanner;

public class MainFila {
    public static void main(String[] args) {
    Fila fila = new Fila();
    Scanner input = new Scanner(System.in);
    int idade,resp;


    while(true){
        System.out.println("===========================");
        System.out.println("       1-Adicionar         ");
        System.out.println("        2-Remover          ");
        System.out.println("          3-Parar          ");
        System.out.println("===========================");
        resp= input.nextInt();

        if(resp==1){
            System.out.println("Digite sua idade");
            idade= input.nextInt();
            if (idade>=60){
                fila.addPrioridade(idade);
            }else {
                fila.add(idade);
            }
        } else if (resp==2) {
            fila.remove();
        } else if (resp==3) {
            break;
        }
    }






    }
}
