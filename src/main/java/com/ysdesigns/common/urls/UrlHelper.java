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

    public static String getCreateBlogUrlPath() {
        return RequestMappingDefinitions.BLOG_CREATE_URL_PATH;
    }

    public static String getCreateSubmitUrlPath() {
        return RequestMappingDefinitions.BLOG_SUBMIT_URL_PATH;
    }

    public static String getUpdateBlogUrlPath() {
        return RequestMappingDefinitions.BLOG_UPDATE_URL_PATH;
    }
    public static String getPreviewBlogUrlPath() {
        return RequestMappingDefinitions.BLOG_PREVIEW_URL_PATH;
    }

    public static String getFindBlogUrlPath() {
        return RequestMappingDefinitions.BLOG_FIND_URL_PATH;
    }
}
