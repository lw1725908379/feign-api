package com.lw.api.system_services.fallback;

import com.edu.lw.model.bean.CodeMsg;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.edu.lw.model.user.dto.UserDTO;
import com.lw.api.system_services.IUserClient;
import org.springframework.stereotype.Component;

/**
 * @author 17259
 * @create 2024-07-19 14:35
 */
@Component
public class IUserClientFallback implements IUserClient {
    @Override
    public ResponseDTO<UserDTO> checkLogin(UserDTO userDTO) {
        return ResponseDTO.errorByMsg(CodeMsg.USER_SESSION_EXPIRED);
    }
}
