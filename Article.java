package com.lagou.domain;

import java.util.List;

/**
 * @Author: CXB
 * @ClassName: Article
 * @Date: 2022/8/25 23:35
 * @Description: //TODO
 * @Version: V1.0
 **/
public class Article {
    int id ;
    String title;
    String content;
//    List<Comment> comments;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
//                ", comments=" + comments +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;//加点注释idea
    }

    public void setContent(String content) {
        this.content = content; //加点注释github
    }

//    public List<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(List<Comment> comments) {
//        this.comments = comments;
//    }
}
