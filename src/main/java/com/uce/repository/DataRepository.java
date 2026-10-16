package com.uce.repository;

import com.uce.modelo.Estudiante;

import jakarta.persistence.EntityManager;

public abstract class DataRepository <T>{
    
    private final Class <T> entityClass;
    protected EntityManager em; 

    public DataRepository(Class<T> entityClass){
        this.entityClass = entityClass;
        this.em = JPAUtils.getEntityManager(); // Debe coincidir exactamente
    }


     public void create (T entity){
        try{
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();

        }catch(Exception e){
            if(em.getTransaction().isActive()){
            em.getTransaction().rollback();}
            e.printStackTrace();
        }
    }


    public void read (Long id){
        T entity = em.find(entityClass, id);
        if(entity!=null){
            System.out.println(entity.toString());
        }else{
            System.out.println("Estuidante no encontrado");
        }
    }

    public void update (Long id){

        try{
            em.getTransaction().begin();

            T e = em.find(entityClass, id);

            if(e != null){
            em.merge(e);
            em.getTransaction().commit();
                System.out.println("Datos Actaulizados!!!");
            }else{
                System.out.println("No se puede modificar los datos");
            }
        
            
        }catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }


     public void remove (Long id){
         try{
            em.getTransaction().begin();

            Estudiante e = em.find(Estudiante.class, id);

            if(e != null){
            em.remove(e);
            em.getTransaction().commit();
            System.out.println("Estudiante eliminado!!!");

            }else{
                System.out.println("No se puede eliminar al estudiante");
            }
            
        }catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }
    }
}
