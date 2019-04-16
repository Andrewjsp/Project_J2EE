package rest.controller;

import entity.News;
import rest.security.RestSecured;
import service.NewsService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/news")
public class NewsController {



    @Inject
    NewsService newsService;

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public void addNews(News news) {
        System.out.println(news.getContent());
        System.out.println(news.getTitle());
        newsService.addNews(news);
    }

    @RestSecured
    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<News> getAll() {

        return newsService.getAll();
    }

    @POST
    @Path("/updateNews")
    @Produces(MediaType.APPLICATION_JSON)
    public void updateNews(News news) {
        newsService.updateNews(news);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteNews(@PathParam("id") long id) {
        newsService.deleteNews(id);
    }
}
