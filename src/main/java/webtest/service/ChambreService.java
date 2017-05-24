/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import webtest.entity.Chambre;
import webtest.entity.Hotel;



public class ChambreService {
    
    
   
    public void supprimerChambre(Long id){
        
         EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        
          em.getTransaction().begin();
          Chambre chambre = em.find(Chambre.class, id);
       
          em.remove(chambre);
          
          em.getTransaction().commit();
         
        
        
    }
            
    public List<Chambre>  listerchambrre(){
        
        EntityManager em=   Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return  em.createQuery("SELECT c FROM Chambre c ORDER BY c.nom").getResultList();
    }
    
    public void ajouterchambre(Chambre chambre){
        
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(chambre);
        em.getTransaction().commit();    
    } 
}

