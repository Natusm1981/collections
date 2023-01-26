import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Set;
import java.util.TreeMap;

public class ExerciciosMap {
    public static void main(String[] args){
        
        //Crie um dicionario e relacione os estados e suas populações
        Map<String, Integer> estados = new LinkedHashMap<>();

        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);
        //estados.put("TR", 3351543);

        System.out.println(estados.toString());

        //Substitua a população do RN por 3534165

        estados.replace("RN", 3534165);
        System.out.println(estados.toString());

        //Confira se o PB está no dic, caso não, adicione 4039277

        if(!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }
        System.out.println(estados.toString());

        //Exiba a população de PE

        System.out.println("A população de PE é: "+estados.get("PE").toString());

        //Exiba todos os estados e suas populações na ordem informada

        for(Map.Entry<String, Integer> lista : estados.entrySet()){
            System.out.println(lista.getKey() + " > "+ lista.getValue());

        }

        //Exiba os estados em ordem alfabética
        Map<String, Integer> lista2 = new TreeMap<>(estados);
        System.out.println(lista2.toString());
        for(Map.Entry<String, Integer> lista : lista2.entrySet()){
            System.out.println(lista.getKey() + " > "+ lista.getValue());
        }

        //Exiba o estado com a menor população e quantidade

        int menorPopulacao = Collections.min(estados.values());

        for(Map.Entry<String, Integer> lista : estados.entrySet()){
            if(lista.getValue() == menorPopulacao)
                System.out.println("O estado com a menor população é: " +lista.getKey() + " >>> " + lista.getValue());
        }
        int maiorPopulacao = Collections.max(estados.values());

        for(Map.Entry<String, Integer> lista : estados.entrySet()){
            if(lista.getValue() == maiorPopulacao)
                System.out.println("O estado com a MAIOR população é: " +lista.getKey() + " >>> " + lista.getValue());
        }
        
        //Exiba a soma das populações

        Collection<Integer> populacaoTotal = estados.values();
        Iterator<Integer> it = populacaoTotal.iterator();

        int somaDasPopulacoes =0;
        while(it.hasNext()){
            somaDasPopulacoes += it.next();
        }

        System.out.println("O total de habitantes é: " + somaDasPopulacoes);

        //Exibir a média da população dos estados:

        System.out.println("A média da população é: " + somaDasPopulacoes / estados.size());

        //Remover os estados com população abaixo de 4.000.000
        it = populacaoTotal.iterator();
        while(it.hasNext()){
            if(it.next() < 4000000)
                it.remove();
        }

        System.out.println(estados.toString());

        //Apagando o dicionario
        estados.clear();

        System.out.println("O dicionario está vazio? >>>> " + estados.isEmpty());

    }


}


   
