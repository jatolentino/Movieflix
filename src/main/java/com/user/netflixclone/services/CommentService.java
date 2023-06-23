package com.user.netflixclone.services;

import com.user.netflixclone.entities.Comment;
import com.user.netflixclone.exceptions.CommentDetailsNotFoundException;

public interface CommentService {
    Comment writeComment(Comment comment);
    Boolean deleteComment(String commentId);
    Comment getComment(String commentId) throws CommentDetailsNotFoundException;
    Comment editComment(String commentId, String content) throws CommentDetailsNotFoundException;
}
