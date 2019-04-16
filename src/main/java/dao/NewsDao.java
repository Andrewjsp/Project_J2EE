package dao;

import entity.News;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Stateless
public class NewsDao {
@PersistenceContext(name = "persist")
EntityManager entityManager;

public List<News> getAll(){
    Query query=entityManager.createQuery("Select news FROM News news", News.class);
    return query.getResultList();
}

public void addNews(News news){
    System.out.println(news.getContent());
    System.out.println(news.getTitle());
    System.out.println(news.getId());
    entityManager.persist(news);
}

public void updateNews(News news){
    Query query=entityManager.createQuery("UPDATE News AS news SET news.content=:content,news.title=:title WHERE news.id=:id");
    query.setParameter("content",news.getContent());
    query.setParameter("title",news.getTitle());
    query.setParameter("id",news.getId());
    query.executeUpdate();
}

public void deleteNews(long id){
    Query query=entityManager.createQuery("DELETE  FROM News AS  news WHERE news.id=:id");
    query.setParameter("id",id);
    query.executeUpdate();
}
}
