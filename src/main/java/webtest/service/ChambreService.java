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

/**
 *
 * @author formation
 */
public class ChambreService {
    
    public List<Chambre>  ajouterchambrre(){
        
        EntityManager em=   Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.createQuery("SELECT c FROM Chambre c ORDER BY c.nom").getResultList();
        
        return 
    }
    
}