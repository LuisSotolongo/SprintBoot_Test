package com.example.reuniones.services;

import com.example.reuniones.data.PersonaRepository;
import com.example.reuniones.models.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    // Generamos datos ficticios
//    private static final List<Persona> personas = new ArrayList<>();
//
//    static {
//        for (int i = 0; i < 5; i++) {
//            Persona persona = new Persona(i, "Nombre " +i, "Apellido " +1);
//            personas.add(persona);
//        }
//    }
    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

    public Persona getById(long id){
        return personaRepository.findById(id).get();
    }
}
