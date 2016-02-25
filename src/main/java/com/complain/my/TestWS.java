package com.complain.my;

import com.complain.my.subscription.user.User;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by dikatok64633 on 2/23/2016.
 */
@Service("testWs")
@Path("/test")
public class TestWS {

    @GET
    @Path("/test")
    public Response test() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        User user = new User();
        user.setUsername("test1");
        user.setPassword("test1");
        em.persist(user);
        transaction.commit();
        em.close();
        emf.close();
        return Response.ok("SUKSES").build();
    }
}
