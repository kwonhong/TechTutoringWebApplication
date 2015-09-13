package com.ysdesigns.blogComponent;

import lombok.Data;

import java.util.Date;
import java.util.List;
/**
 * Created by honkwon on 15-09-05.
 */

@Data
public class Blog {
    private String title;
    private String subTitle;
    private String contents;
    private Date createdDate;
    private List<BlogComponent> blogComponentList;

}
