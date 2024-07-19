package com.lw.api.photo;

import com.edu.lw.model.response.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 17259
 * @create 2024-07-19 14:47
 */
public interface IPhotoClient {
    ResponseEntity<?> viewPhoto(String filename);

    ResponseDTO uploadPhoto(MultipartFile photo, HttpServletRequest request);
}
