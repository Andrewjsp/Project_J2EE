package entity;

import sun.util.calendar.LocalGregorianCalendar;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;
import java.text.DateFormat;

@Entity
@Table(name = "news")
@XmlAccessorType(XmlAccessType.NONE)
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_id")
    @SequenceGenerator(name = "sequence_id",sequenceName = "EMP_SEQUENCE",allocationSize = 1)
    private long id;
    @XmlElement
    private String title;
    @XmlElement
    private String content;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
