import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exset {
    public static void main(String[] args) throws Exception {
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d, 3.6));
        System.out.println(notas.toString());

        //Não é possível pegar posição dos itens
        //Não é possível adicionar itens em uma posição específica
        //Não é permitido substituir itens, por não ter posição


        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterador = notas.iterator();
        Double soma = 0d;
        while(iterador.hasNext()){
            Double next = iterador.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("A média das notas é: "+ (soma/notas.size()));

        System.out.println("Remover a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //Naõ remove itens por posição

    }
}
