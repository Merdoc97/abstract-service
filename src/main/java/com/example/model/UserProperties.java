package com.example.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by artyo on 24.04.2016.
 */
@Entity
@Cacheable
@Table(name = "user_properties")
public class UserProperties  {
    @Id
    @GeneratedValue
    @Column(name = "prop_id")
    private int id;

    @Column(name = "usr_email")
    private String email;


    @Column(name = "additional_info")
    private String addInfo;


    @Column(name = "usr_id")
    private int properties;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProperties)) return false;

        UserProperties that = (UserProperties) o;

        if (id != that.id) return false;
        if (!email.equals(that.email)) return false;
        return addInfo != null ? addInfo.equals(that.addInfo) : that.addInfo == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + email.hashCode();
        result = 31 * result + (addInfo != null ? addInfo.hashCode() : 0);
        return result;
    }
}
