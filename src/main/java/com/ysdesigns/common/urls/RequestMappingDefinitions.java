package com.ysdesigns.common.urls;


// Sadly this needs to be traditional constants as Enums cannot be used in Controller annotations.
public final class RequestMappingDefinitions {
    public static final String INDEX_URL_PATH = "/";
    public static final String LOGIN_URL_PATH = "/login";
    public static final String LOGOUT_URL_PATH = "/logout";
    public static final String DASHBOARD_URL_PATH = "/dashBoard";
    public static final String BLOG_EDIT_URL_PATH = "/editBlog";
    public static final String BLOG_CREATE_URL_PATH = "/createBlog";
    public static final String BLOG_FIND_URL_PATH = "/blogFind";
    public static final String BLOG_UPDATE_URL_PATH = "/updateBlog";
    public static final String BLOG_DELETE_URL_PATH = "/deleteBlog";
    public static final String BLOG_SUBMIT_URL_PATH = "/blogSubmit";
    public static final String BLOG_PREVIEW_URL_PATH = "/blogPreview";

    public static String getViewName(String pathName) {
        return pathName.replace(".jsp", "").replace(".html", "");
    }
}
