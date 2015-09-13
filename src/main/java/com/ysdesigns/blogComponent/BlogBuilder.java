package com.ysdesigns.blogComponent;

import com.ysdesigns.blogComponent.BlogComponent.BlogComponentType;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by honkwon on 15-09-05.
 */

@Component
public class BlogBuilder {

    //TODO parseContent the given message.
    public List<BlogComponent> parseContent(String content) {

        List<BlogComponent> blogComponents = new ArrayList<>();
        BlogComponent blogComponent;
        BlogComponentType blogComponentType;
        String remainingContent = content;

        while (true) {
            blogComponentType = findComponentType(remainingContent);
            blogComponent = retrieveBlogComponent(content, blogComponentType);
            if (blogComponent != null) {
                blogComponents.add(blogComponent);
            } else {
                break;
            }

            remainingContent = updateContent(content, blogComponentType);
        }

        return blogComponents;
    }

    private String updateContent(String content, BlogComponentType blogComponentType) {
        int endIndex = content.indexOf(blogComponentType.getClosingPrefix());

        String remainingContent =
                content.substring(endIndex + blogComponentType.getClosingPrefix().length());
        return remainingContent;
    }

    private BlogComponent retrieveBlogComponent(String content, BlogComponentType blogComponentType) {

        if (content == null || content.isEmpty() || blogComponentType == null) {
            return null;
        }

        int startIndex = content.indexOf(blogComponentType.getOpeningPrefix());
        int endIndex = content.indexOf(blogComponentType.getClosingPrefix());

        String blogComponentContent = content.substring(
                startIndex + blogComponentType.getOpeningPrefix().length(),
                endIndex);

        return (startIndex > endIndex || startIndex == -1 || endIndex == -1) ?
                null :
                new BlogComponent(blogComponentType, blogComponentContent);


    }

    private BlogComponentType findComponentType(String content) {

        BlogComponentType blogComponentType = null;
        int smallestIndex = 100000;

        // Looping through the find the first component.
        for (BlogComponentType blogComponent: BlogComponentType.values()) {
            int startIndex = content.indexOf(blogComponent.getOpeningPrefix());
            if (smallestIndex > startIndex && startIndex != -1) {
                blogComponentType = blogComponent;
                smallestIndex = startIndex;
            }
        }

        return blogComponentType;
    }

    public void toHtml() {
        //TODO Create HTML format String.
    }
}
