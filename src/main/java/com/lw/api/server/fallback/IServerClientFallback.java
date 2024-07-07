package com.lw.api.server.fallback;

import com.lw.api.server.IServerClient;
import com.yjq.programmer.bean.CodeMsg;
import com.yjq.programmer.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;



/**
 * @author 17259
 * @create 2024-07-06 20:01
 * feign失败配置
 */

// csm-server服务熔断降级 ：
// 1.InitConfig: 在csm-server 配置包扫描(@ComponentScan("com.lw.api.server.fallback"))
// 2.csm-server nacos 配置管理feign的服务降级机制
@Component
public class IServerClientFallback implements IServerClient {


    @Override
    public ResponseEntity<?> viewPhoto(String filename) {
        return ResponseEntity.badRequest().build();
    }

    @Override
    public ResponseDTO<String> uploadPhoto(MultipartFile photo, HttpServletRequest request) {
        return ResponseDTO.errorByMsg(CodeMsg.FEIGN_FAIL_LOAD_DATA);
    }
}
