package com.lw.api.server;

import com.yjq.programmer.dto.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 17259
 * @create 2024-07-06 20:01
 */
@FeignClient(value = "csm-server",fallback = IServerClient.class)
public interface IServerClient {
    @RequestMapping(value = "/view")
    public ResponseEntity<?> viewPhoto(@RequestParam(name = "filename", required = true) String filename);

    @PostMapping(value = "/upload")
    public ResponseDTO<String> uploadPhoto(MultipartFile photo, HttpServletRequest request);
}
