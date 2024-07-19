package com.lw.api.charge_services;

import com.edu.lw.model.charge.dto.ChargeDTO;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.edu.lw.model.user.dto.UserDTO;
import com.lw.api.charge_services.fallback.IChargeServicesClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 17259
 * @create 2024-07-14 20:14
 */
@FeignClient(name = "csm-charge-services",fallback = IChargeServicesClientFallback.class)
public interface IChargeServicesClient {
    @PostMapping("/charge/delete")
    ResponseDTO<Boolean> deleteCharge(@RequestBody ChargeDTO chargeDTO);

    ResponseDTO deleteAppoint(UserDTO userDTO);
}
