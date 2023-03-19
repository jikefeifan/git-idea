package com.lagou.domain;

/**
 * @Author: CXB
 * @ClassName: 更改了一些文件Comment
 * @Date: 2022/8/25 23:38
 * @Description: //TODO
 * @Version: V1.0
 **/
public class Comment {
    int id ;
    String content;
    String author;
    int aid;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", aid=" + aid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
}
