package org.vinay;

import beans.CustomerManager;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)

 */


@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */

    @EJB
    CustomerManager manager;

    /*public  String getCC(){

    }
*/

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
       // return "Got it:  " + manager.getCustomerCount();
        return "Got it:  ";
    }
}
