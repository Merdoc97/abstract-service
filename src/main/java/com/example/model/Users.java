package com.example.model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 * @author Igor
 */

@Entity
@Cacheable
@Table(name = "users")
public class Users  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID",nullable = false)
    private int id;

    @Column(name = "USER_NAME",nullable = false,length = 20)
    private String name;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "usr_id",referencedColumnName = "USER_ID")
    private  List<UserProperties> properties;

    public Users(){}
    public Users(String userName){
        this.name=userName;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserProperties> getProperties() {
        return properties;
    }

    public void setProperties(List<UserProperties> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;

        Users users = (Users) o;

        if (id != users.id) return false;
        return name.equals(users.name);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}
