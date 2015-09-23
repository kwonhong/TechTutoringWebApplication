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
 * Created by honkwon on 15-09-05.
 */

@Data
@Entity
@Table(name="BLOG")
public class Blog implements Comparable<Blog>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "SUB_TITLE", nullable = false)
    private String subTitle;

    @Column(name = "CONTENTS", nullable = true)
    private String contents;

    @Column(name = "CREATION_DATE", nullable = false)
    private Date createdDate;

    @Override
    public int compareTo(Blog o) {
        return this.createdDate.compareTo(o.getCreatedDate());
    }
}
