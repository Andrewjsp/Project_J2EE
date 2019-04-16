package soap;

import entity.News;
import service.NewsService;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "soapService")
public class NewsSoapService {
    @Inject
    NewsService newsService;

    @WebMethod
    public List<News> getAll() {
        return newsService.getAll();
    }

    @WebMethod
    public void addNews(@WebParam News news) {
        newsService.addNews(news);
    }

    @WebMethod
    public void deleteNews(@WebParam long id) {
        newsService.deleteNews(id);
    }

    @WebMethod
    public void update(@WebParam News news) {
        newsService.updateNews(news);
    }
}
