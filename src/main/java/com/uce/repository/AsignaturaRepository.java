package com.uce.repository;
import com.uce.modelo.Asignatura;

import jakarta.persistence.TypedQuery;

public class AsignaturaRepository extends DataRepository<Asignatura>{
    
    public AsignaturaRepository() {
        super(Asignatura.class);
    }

    public void findByCode (String codigo){
        String jpql = "SELECT a FROM Asignatura a WHERE a.codigo = :codigoParam";
        TypedQuery<Asignatura> query = this.em.createQuery(jpql, Asignatura.class);
        query.setParameter("codigoParam", codigo);
        System.out.println(query.getSingleResult());
    }

}
