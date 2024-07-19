package com.lw.api.system_services;

import com.edu.lw.model.response.dto.ResponseDTO;
import com.edu.lw.model.user.dto.UserDTO;
import com.lw.api.system_services.fallback.IUserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 17259
 * @create 2024-07-19 14:32
 */
@FeignClient(value = "csm-system-services",fallback = IUserClientFallback.class)
public interface IUserClient {
    @PostMapping("/user/check_login")
    ResponseDTO<UserDTO> checkLogin(@RequestBody UserDTO userDTO);
}
