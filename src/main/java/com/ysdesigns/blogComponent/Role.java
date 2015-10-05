package com.ysdesigns.blogComponent;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Steven on 2015-10-03.
 */
@Data
@Entity
@Table(name="ROLE")
public class Role implements Comparable<Role> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "USERNAME", nullable = false)
    private String username;

    @Column(name = "ROLE", nullable = false)
    private String role;

    @Override
    public int compareTo(Role o) {
        return this.username.compareTo(o.username);
    }
}
