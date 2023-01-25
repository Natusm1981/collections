import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import java.util.Set;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        //Criar uma lista contendo as cores do arco iris

        Set<String> arcoIris = new HashSet<>();
        String temp = "";
        //vermelho, laranja, amarelo, verde, azul, anil e violeta
        arcoIris.add("Amarelo");
        arcoIris.add("Vermelho");
        arcoIris.add("Azul");
        arcoIris.add("Verde");
        arcoIris.add("Laranja");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");


        //Exiba todas as cores uma abaixo da outra:

        Iterator<String> it = arcoIris.iterator();
        System.out.println("\nExibindo as cores uma abaixo da outra\n");
        while(it.hasNext()){
            System.out.println(it.next());
        }
            
        //Exiba a quantidade de itens:
        System.out.println("\nExibindo a quantidade de elementos\n");
        System.out.println(arcoIris.size() + " Elementos");

        //Exiba todas cores em ordem alfabética
        System.out.println("\nExibindo as cores em ordem alfabética\n");
        List<String> listaOrganizada = new ArrayList<>(arcoIris);

        Collections.sort(listaOrganizada);

        //Exiba na ordem inversa da entrada de dados
        List<String> arcoIris2 = new ArrayList<>(arcoIris); //só da pra usar o reverse com Arraylist
        Collections.reverse(arcoIris2);
        System.out.println(arcoIris2);

        //Exibir todas cores com letra "V"
        it = arcoIris.iterator(); 
        System.out.println("\nExibindo as cores que começam com a letra V\n");
        while(it.hasNext()){
            temp = it.next();
            if(temp.toLowerCase().startsWith("v"))
                System.out.println(temp);
        }

        //remova todas cores que não começam com a letra "V"

        for(String cor : arcoIris){
            if(!cor.toLowerCase().startsWith("v"))
                arcoIris2.remove(cor);
        }
        it = arcoIris2.iterator();
        while(it.hasNext()){
            
            System.out.println(it.next());
        }
        // Limpar o conjunto

        System.out.println("\nLimpando o conjunto\n");
        arcoIris.removeAll(arcoIris);
        System.out.println(arcoIris.isEmpty() + ">>>>" + arcoIris);

    }
}
