package com.ysdesigns.blogComponent;

import jdk.nashorn.internal.ir.annotations.Ignore;
import lombok.Data;
import lombok.Getter;

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

    @Ignore
    public enum blogAttributes {
        BLOG_ID("blogID"),
        TITLE("title"),
        SUB_TITLE("subTitle"),
        CONTENTS("contents"),
        CREATION_DATE("creation_date");

        @Getter
        private String attributeName;
        blogAttributes(String attributeName) {
            this.attributeName = attributeName;
        }
    }

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
