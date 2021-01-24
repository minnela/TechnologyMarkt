package com.technology.markt.service;

import com.technology.markt.domain.Comments;
import com.technology.markt.domain.Computer;

import java.util.List;

public interface CommentsService {

    public void addComment(Comments comments);
    public void deleteComment(Comments comments);
    public List<Comments> listAllComments();
    public Comments getCommentsByName(String name);
}
