import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class ExMap {
    public static void main(String[] args){
        // Crie um dicionario com modelos de carros x consumo

        Map<String, Double> carros = new HashMap<>();
        carros.put("Gol", 14.4);
        carros.put("Uno", 15.6);
        carros.put("Mobi", 16.1);
        carros.put("HB20", 14.5);
        carros.put("Kwid", 15.6);
        
        System.out.println(carros.toString());

        //Substitua o consumo do GOL por 15.2

        carros.put("Gol", 15.2);
        System.out.println(carros.toString());

        //Confira se o modelo Tucson está no dicionario
        System.out.println("Modelo Tucson está no dicionario? " + carros.containsKey("Tucson"));

        //Exiba o consumo do UNO
        System.out.println("consumo do UNO: " + carros.get("Uno"));

        //Exiba os modelos:
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);
        
        //Exiba os consumos
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        //Qual o mais econômico?

        Double menorConsumo =Collections.max(consumos);

        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            if (entry.getValue().equals(menorConsumo))
                System.out.println(entry.getKey());
        }

        System.out.println("o Mais econômico é o " + menorConsumo);
            


    }
}
