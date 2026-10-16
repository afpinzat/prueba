package com.uce;

import java.time.LocalDate;

import com.uce.modelo.Asignatura;
import com.uce.modelo.Estudiante;
import com.uce.repository.AsignaturaRepository;
import com.uce.repository.EstudianteRepository;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        

      AsignaturaRepository ar = new AsignaturaRepository();
      EstudianteRepository es = new EstudianteRepository();
      
     //   Asignatura a = new Asignatura("67","BrainRot","10",23);
      
 //    List <Estudiante> le = es.findByApellido("Pu");

   /*   for (Estudiante estudiante : le) {
      System.out.println(estudiante.getNombre());
     }*/

     System.out.println(es.countEst("2005-11-11"));



        //  ar.create(a);
      //  ar.findByCode("67");

    //    EstudianteRepository eR = new EstudianteRepository();
      
     /*    Estudiante e = new Estudiante("Paul", "Ceron", LocalDate.of(2006, 12, 12));
        eR.create(e);
        eR.read(0L);*/
    //    Estudiante e = new Estudiante("Mel", "Puta", LocalDate.of(2006, 12, 12));
    //    eR.update(e);
  //  eR.update(4L);
    //    eR.read(4L);
   // eR.remove(4L);
    //    eR.read(4L);
     //   eR.remove(e);
     //   eR.read(0);
    }
    
}
