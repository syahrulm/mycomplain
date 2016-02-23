package com.complain.my;

import org.springframework.stereotype.Service;

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
        return Response.ok("SUKSES").build();
    }
}
