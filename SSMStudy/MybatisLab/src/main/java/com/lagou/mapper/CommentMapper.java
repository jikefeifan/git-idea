package com.lagou.mapper;

import com.lagou.domain.Comment;

import java.util.List;

/**
 * @Author: CXB
 * @ClassName: CommentMapper
 * @Date: 2022/8/26 0:17
 * @Description: //TODO
 * @Version: V1.0
 **/
public interface CommentMapper {
    List<Comment> getCommentById(Integer id);
}
