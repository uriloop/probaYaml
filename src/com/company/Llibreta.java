package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class Llibreta {

    List<Pagina> pagina;


    void cargaYaml(){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Main.llibreta = mapper.readValue(new File("pagines.yaml"), Llibreta.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void guardaYaml()  {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        try {
            objectMapper.writeValue(new File("notes.yaml"), Main.llibreta.pagina);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





