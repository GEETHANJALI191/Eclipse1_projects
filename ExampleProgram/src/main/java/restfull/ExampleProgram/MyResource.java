package restfull.ExampleProgram;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.userInterfaceImplClass;
import com.pojo.UserPojo;

@Path("myresource")
public class MyResource {
	userInterfaceImplClass ui=new userInterfaceImplClass();
    @GET
    @Produces(MediaType.APPLICATION_XML)
   public List<UserPojo> getDetails(){
    	return ui.getAllUsers();
    }
    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public String entering(UserPojo user){
    	return ui.addUser(user);
    }
    @GET
    @Path("/{userid}")
    @Produces(MediaType.APPLICATION_XML)
    public UserPojo getUserById(@PathParam("userid") int id){
    	return ui.RetrieveDetails(id);
    }
    
    
}
