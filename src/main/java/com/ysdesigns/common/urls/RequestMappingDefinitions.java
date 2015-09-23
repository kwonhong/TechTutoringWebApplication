package com.ysdesigns.common.urls;


// Sadly this needs to be traditional constants as Enums cannot be used in Controller annotations.
public final class RequestMappingDefinitions {
    public static final String INDEX_URL_PATH = "/";
    public static final String DASHBOARD_URL_PATH = "/dashBoard.html";
    public static final String BLOG_EDIT_URL_PATH = "/editBlog.html";
    public static final String BLOG_FIND_URL_PATH = "/blogFind.html";

    public static String getViewName(String pathName) {
        return pathName.replace(".jsp", "").replace(".html", "");
    }
}
