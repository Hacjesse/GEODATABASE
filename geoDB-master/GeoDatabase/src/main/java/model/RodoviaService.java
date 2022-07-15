/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

public class RodoviaService {
    public List<Rodovia> rodoviasAtravessamGba(String nome){
        List<Rodovia> result = null;
        EntityManager em = JPAUtil.createEntityManager();   
        em.getTransaction().begin();    
        
        Query query = em.createQuery("select r from Rodovia r, Municipio m where crosses(r.geometria, m.geometria)= true and m.nome = :nome");
        query.setParameter("nome", nome);
        result = query.getResultList();
        em.getTransaction().commit();
        em.close();
        
        return result;
    }
     
    
}
