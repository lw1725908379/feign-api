package com.lw.api.text.fallback;

import com.edu.lw.model.bean.CodeMsg;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.lw.api.text.ITextClient;

/**
 * @author 17259
 * @create 2024-07-22 22:36
 */
public class ITextClientFallback implements ITextClient {
    @Override
    public ResponseDTO textScan(String text) {
        return ResponseDTO.errorByMsg(CodeMsg.TEXT_NETWORK_ERROR);
    }
}
