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
 * Created by Steven on 2015-09-27.
 */

    @Data
    @Entity
    @Table(name="LOGIN")
    public class Login implements Comparable<Login>{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "USERNAME", nullable = false)
        private String username;

        @Column(name = "PASSWORD", nullable = false)
        private String password;

        @Column(name = "FIRST_NAME", nullable = true)
        private String firstName;

        @Column(name = "LAST_NAME", nullable = false)
        private Date lastName;

          @Column(name = "EMAIL", nullable = false)
         private Date email;

        @Override
        public int compareTo(Login o) { return this.username.compareTo(o.username);}

    }
