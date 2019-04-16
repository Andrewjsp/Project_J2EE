package entity;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

@Stateless
@Entity
@Table(name = "token")
public class Token {
    @Id
    @GeneratedValue
    private int id;
    private String value;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
