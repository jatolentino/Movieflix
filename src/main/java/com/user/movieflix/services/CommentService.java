package com.user.movieflix.services;

import com.user.movieflix.entities.Comment;
import com.user.movieflix.exceptions.CommentDetailsNotFoundException;

public interface CommentService {
    Comment writeComment(Comment comment);
    Boolean deleteComment(String commentId);
    Comment getComment(String commentId) throws CommentDetailsNotFoundException;
    Comment editComment(String commentId, String content) throws CommentDetailsNotFoundException;
}
