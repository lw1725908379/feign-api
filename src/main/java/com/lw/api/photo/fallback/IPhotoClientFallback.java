package com.lw.api.photo.fallback;

import com.edu.lw.model.bean.CodeMsg;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.lw.api.photo.IPhotoClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 17259
 * @create 2024-07-19 14:50
 */
public class IPhotoClientFallback implements IPhotoClient {
    @Override
    public ResponseEntity<?> viewPhoto(String filename) {
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseDTO uploadPhoto(MultipartFile photo, HttpServletRequest request) {
        return ResponseDTO.errorByMsg(CodeMsg.UPLOAD_PHOTO_ERROR);
    }
}
