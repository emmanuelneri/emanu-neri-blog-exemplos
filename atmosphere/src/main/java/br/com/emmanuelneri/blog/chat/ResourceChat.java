package br.com.emmanuelneri.blog.chat;

import org.atmosphere.annotation.Broadcast;
import org.atmosphere.annotation.Suspend;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
@Produces("application/json")
public class ResourceChat {

    @Suspend
    @GET
    public String suspend() {
        return "";
    }

    @Broadcast(writeEntity = false)
    @POST
    public ResponseChat broadcast(Mensagem mensagem) {
        return new ResponseChat(mensagem.getAutor(), mensagem.getMensagem());
    }

}
