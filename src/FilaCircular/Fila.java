package FilaCircular;

public class Fila {
    int tamanho=5;
    int fila []=new int [tamanho];
    int filaPrioridade []=new int [tamanho];
    int frente =-1,tras=-1,quantidade=0;
    int frenteP =-1,trasP=-1,quantidadeP=0;




    //Checar se as filas estão vazias
    boolean cheiaPrioridade(){return (quantidadeP==filaPrioridade.length);}
    boolean vaziaPrioridade(){return (quantidadeP==0);}
    boolean cheia(){
       return(quantidade==fila.length);
    }
    boolean vazia(){
        return (quantidade==0);
    }



    //Adiciona na fila de prioridade
    public void addPrioridade(int valor){
        if (!cheiaPrioridade()){
            if (trasP==filaPrioridade.length-1){
                trasP=-1;
            }
            quantidadeP++;
            trasP++;
            filaPrioridade[trasP]=valor;
            System.out.println("Inseri o numero:"+valor);
        }else{
            System.out.println("Fila de prioridade cheia");
        }

    }

    //Adiciona na fila normal
    public void add(int valor){
        if (!cheia()){
            if (tras==fila.length-1){
                tras=-1;
            }
            quantidade++;
            tras++;
            fila[tras]=valor;
            System.out.println("Inseri o numero:"+valor);
        }else{
            System.out.println("Fila cheia");
        }

    }


    //Remove um elemento ,chegando se ele tem prioridade ou não
    public int remove(){
        int elemento=0;
        if(!vaziaPrioridade()){
            if (frenteP==filaPrioridade.length-1){
                frenteP=-1;
            }
            quantidadeP--;
            frenteP++;
            elemento=filaPrioridade[frenteP];
            System.out.println("Removi o valor:"+elemento);

        }else if(vaziaPrioridade() && !vazia()) {
            if (frente==fila.length-1){
                frente=-1;
            }
            quantidade--;
            frente++;
            elemento=fila[frente];
            System.out.println("Removi o valor:"+elemento);
        }else{
            System.out.println("Fila vazia");
        }
        return elemento;
    }

    }






