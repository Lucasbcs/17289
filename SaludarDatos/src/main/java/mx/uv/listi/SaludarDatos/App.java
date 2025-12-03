package mx.uv.listi.SaludarDatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class App {
    
    @Autowired
    isaludadores isaludadores;

    //consulta
    @RequestMapping(value ="/saludos", method = RequestMethod.GET)
    public Iterable<Saludadores> dameSaludados() {
        return isaludadores.findAll();
    }

    //alta
    @RequestMapping(value ="/saludos", method = RequestMethod.POST)
    public String crearSaludos(@RequestBody Saludadores nuevoSaludo) {
        isaludadores.save(nuevoSaludo);
        return "¡Guardado con éxito!";
}
}