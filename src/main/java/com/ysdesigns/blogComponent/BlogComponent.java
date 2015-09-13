package com.ysdesigns.blogComponent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Created by honkwon on 15-09-05.
 */

@Data @AllArgsConstructor
public class BlogComponent {

    @AllArgsConstructor
    public enum BlogComponentType {
        HEADER("<header>", "</header"),
        PARAGRAPH("<paragraph>", "</paragraph>"),
        JAVA("<java>", "</java>"),
        QUOTE("<quote>", "</quote>"),
        IMAGE("<image>", "</image>"),
        CAPTION("<caption>", "</caption>");

        @Getter
        private String openingPrefix;
        @Getter
        private String closingPrefix;
    }

    private BlogComponentType blogComponentType;
    private String content;

}
