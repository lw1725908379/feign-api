package com.lw.api.comment.fallback;

import com.edu.lw.model.bean.CodeMsg;
import com.edu.lw.model.comment.dto.CommentDTO;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.lw.api.comment.ICommentClient;

/**
 * @author 17259
 * @create 2024-07-14 21:33
 */
public class ICommentClientFallback implements ICommentClient {
    @Override
    public ResponseDTO deleteComment(CommentDTO commentDTO) {
        return ResponseDTO.errorByMsg(CodeMsg.COMMENT_DELETE_ERROR);
    }
}
