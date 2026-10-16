package com.uce.repository;

import javax.management.Query;

import com.uce.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.List;


public class EstudianteRepository extends DataRepository<Estudiante>{
    
   
    public EstudianteRepository (){
        super(Estudiante.class);
    }

    public List<Estudiante> findByApellido (String apellido){

        String jpql = "SELECT e FROM Estudiante e WHERE e.apellido LIKE :apellidoParam";
        TypedQuery<Estudiante> query = this.em.createQuery(jpql, Estudiante.class);
        query.setParameter("apellidoParam", "%"+apellido+"%");

        return query.getResultList();
    }

    public Long countEst (String fecha){

        LocalDate parsedDate = LocalDate.parse(fecha);
        String jpql = "SELECT COUNT(e) FROM Estudiante e WHERE e.fNacimiento > :fechaParam";
        TypedQuery<Long> query = this.em.createQuery(jpql, Long.class);
        query.setParameter("fechaParam", parsedDate);

        return query.getSingleResult();
    }



}
