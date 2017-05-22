/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webtest.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import webtest.entity.Hotel;
import webtest.servelet.AjoutHotelServelet;

/**
 *
 * @author formation
 */
public class HotelService {

    public  void ajoutHotel(Hotel hotel){
        
         EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
         
        
         
         
         em.getTransaction().begin();
         em.persist(hotel);
         em.getTransaction().commit();
        
    }
    
    public List<Hotel> liste() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT  h FROM Hotel h ORDER BY h.nom").getResultList();
    }
}
