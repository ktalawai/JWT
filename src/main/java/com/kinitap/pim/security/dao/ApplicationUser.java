package com.kinitap.pim.security.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "AUTH_USER")
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ID")
    @SequenceGenerator(name = "ID", sequenceName = "ID")
    private long id;
    
    @Column(name="USER_NAME")
    private String username;
    
    @Column(name="PASS_WORD")
    private String password;

    public long getId() {
        return id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
