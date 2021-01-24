package com.technology.markt.service;

import com.technology.markt.domain.Comments;
import com.technology.markt.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService{

    CommentsRepository commentsRepository;

    @Autowired
    public CommentsServiceImpl(CommentsRepository commentsRepository) {
        this.commentsRepository = commentsRepository;
    }

    @Override
    public void addComment(Comments comments) {
        commentsRepository.save(comments);
    }

    @Override
    public void deleteComment(Comments comments) {

    }

    @Override
    public List<Comments> listAllComments() {
        return null;
    }

    @Override
    public Comments getCommentsByName(String name) {
        return null;
    }
}
