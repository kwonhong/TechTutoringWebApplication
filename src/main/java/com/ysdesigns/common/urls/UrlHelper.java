package com.ysdesigns.common.urls;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by honkwon on 15-09-23.
 */

@Component("urlHelper")
@Scope("singleton")
public final class UrlHelper {

    public static final String URL_HELPER_ATTRIBUTE_NAME = "urlHelper";

    public static String getDashBoardUrlPath() {
        return RequestMappingDefinitions.DASHBOARD_URL_PATH;
    }

    public static String getEditBlogUrlPath() {
        return RequestMappingDefinitions.BLOG_EDIT_URL_PATH;
    }

    public static String getFindBlogUrlPath() {
        return RequestMappingDefinitions.BLOG_FIND_URL_PATH;
    }

    public static String getLoginUrlPath() {
        return RequestMappingDefinitions.LOGIN_URL_PATH;
    }

}
