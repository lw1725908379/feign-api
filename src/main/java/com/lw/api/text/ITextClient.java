package com.lw.api.text;

import com.edu.lw.model.response.dto.ResponseDTO;
import com.lw.api.text.fallback.ITextClientFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 17259
 * @create 2024-07-22 22:34
 */
@FeignClient(value = "csm-text",fallback = ITextClientFallback.class)
public interface ITextClient {
    ResponseDTO textScan(String text);
}
