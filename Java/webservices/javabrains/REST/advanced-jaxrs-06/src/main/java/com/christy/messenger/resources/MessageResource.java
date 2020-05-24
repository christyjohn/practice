package com.christy.messenger.resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.christy.messenger.model.Message;
import com.christy.messenger.resources.beans.MessageFilterBean;
import com.christy.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(value= { MediaType.APPLICATION_JSON, MediaType.TEXT_XML} )
public class MessageResource {

	MessageService messageService = new MessageService();

	@GET
	/*
	 * public List<Message> getMessages(@QueryParam("year") int year,
	 * 
	 * @QueryParam("start") int start,
	 * 
	 * @QueryParam("size") int size) { if (year > 0) return
	 * messageService.getAllMessagesForYear(year); if (start > 0 && size > 0) return
	 * messageService.getAllMessagesPaginated(start, size); return
	 * messageService.getAllMessages(); }
	 */
	public List<Message> getMessages(@BeanParam MessageFilterBean filterBean) {
		if (filterBean.getYear() > 0)
			return messageService.getAllMessagesForYear(filterBean.getYear());
		if (filterBean.getStart() > 0 && filterBean.getSize() > 0)
			return messageService.getAllMessagesPaginated(filterBean.getStart(), filterBean.getSize());
		return messageService.getAllMessages();
	}

	@GET
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long id, @Context UriInfo uriInfo) {
		Message message = messageService.getMessage(id);
		message.addLink(getUriForSelf(uriInfo, message), "self");
		message.addLink(getUriForProfile(uriInfo, message), "profile");
		message.addLink(getUriForComments(uriInfo, message), "comments");
		return message;
	}

	private String getUriForComments(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder()
				.path(MessageResource.class)
				.path(MessageResource.class, "getCommentResource")
				.path(CommentResource.class)	// currently not needed, but could be handy later
				.resolveTemplate("messageId", message.getId())
				.build()
				.toString();
		return uri;
	}

	private String getUriForProfile(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder()
				.path(ProfileResource.class)
				.path(message.getAuthor())
				.build()
				.toString();
		return uri;
	}

	private String getUriForSelf(UriInfo uriInfo, Message message) {
		String uri = uriInfo.getBaseUriBuilder()
				.path(MessageResource.class)
				.path(Long.toString(message.getId()))
				.build()
				.toString();
		return uri;
	}

	/*
	@POST	
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
	}	 
	*/
	// Using ResponseBuilder instead.
	// This helps is recieving proper response codes
	@POST
	public Response addMessage(Message message) {
		Message newMessage = messageService.addMessage(message);
		return Response.status(Status.CREATED)
				.entity(newMessage)
				.build();
	}

	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long id, Message message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}

	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id) {
		messageService.removeMessage(id);
	}
	
	// Comments
	@Path("/{messageId}/comments")
	public CommentResource getCommentResource() {
		return new CommentResource();
	}

}