package dia2Ejercicio1.refranero;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class RefranesAleatorios {

    @GetMapping
    public String obtenerRefranAleatorio() {
        List<String> refranes = new ArrayList<>();
        refranes.add("Más vale tarde que nunca.");
        refranes.add("No dejes para mañana lo que puedas hacer hoy.");
        refranes.add("Más vale prevenir que lamentar.");
        refranes.add("A mal tiempo, buena cara.");
        refranes.add("En boca cerrada no entran moscas.");
        refranes.add("Más vale pájaro en mano que cien volando.");
        refranes.add("El que mucho abarca, poco aprieta.");
        refranes.add("No hay mal que por bien no venga.");
        refranes.add("Camarón que se duerme, se lo lleva la corriente.");
        refranes.add("A quien madruga, Dios le ayuda.");


        Random rand = new Random();
        //obtenemos logitud del array o lista para obtener un valor aleatorio.
        int indiceAleatorio = rand.nextInt(refranes.size());
        //Obtenemos un valor.
        String refranAleatorio = refranes.get(indiceAleatorio);
        //Refran obteniodo
        return "Refrán aleatorio: " + refranAleatorio;
    }
}