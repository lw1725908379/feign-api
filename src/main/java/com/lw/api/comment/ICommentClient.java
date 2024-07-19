package com.lw.api.comment;

import com.edu.lw.model.comment.dto.CommentDTO;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.lw.api.comment.fallback.ICommentClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 17259
 * @create 2024-07-14 21:33
 */
@FeignClient(name = "csm-comment",fallback = ICommentClientFallback.class)
public interface ICommentClient {
    @PostMapping("/comment/delete")
    ResponseDTO<Boolean> deleteComment(@RequestBody CommentDTO commentDTO);
}
