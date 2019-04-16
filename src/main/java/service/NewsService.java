package service;

import dao.NewsDao;
import entity.News;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class NewsService {

    @Inject
NewsDao newsDao;

public List<News> getAll(){
    return newsDao.getAll();
}

public void addNews(News news){
    newsDao.addNews(news);
}

public void updateNews(News news){
    newsDao.updateNews(news);
}

public void deleteNews(long id){
    newsDao.deleteNews(id);
}
}
