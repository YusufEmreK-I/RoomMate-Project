package com.konuk.yusuf.roommate.resource;

import com.konuk.yusuf.roommate.model.User;
import com.konuk.yusuf.roommate.response.model.UserResponseModel;
import com.konuk.yusuf.roommate.service.contract.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/users")
public class UserResource {

    @Inject
    UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> findAll() {
        List<User> users = userService.findAll();

        return users;
    }

    @GET
    @Path("/{uuid}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserResponseModel findByUuid(@PathParam("uuid")  String uuid) {
        User user = userService.findByUuid(uuid);
        return new UserResponseModel(user);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User save(User user) {
        return userService.save(user);
    }

}
