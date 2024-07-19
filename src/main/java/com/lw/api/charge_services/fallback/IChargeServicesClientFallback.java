package com.lw.api.charge_services.fallback;

import com.edu.lw.model.bean.CodeMsg;
import com.edu.lw.model.charge.dto.ChargeDTO;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.edu.lw.model.user.dto.UserDTO;
import com.lw.api.charge_services.IChargeServicesClient;

/**
 * @author 17259
 * @create 2024-07-14 20:14
 */
public class IChargeServicesClientFallback implements IChargeServicesClient {
    @Override
    public ResponseDTO<Boolean> deleteCharge(ChargeDTO chargeDTO) {
        return ResponseDTO.errorByMsg(CodeMsg.CHARGE_DELETE_ERROR);
    }

    @Override
    public ResponseDTO deleteAppoint(UserDTO userDTO) {
        return ResponseDTO.errorByMsg(CodeMsg.APPOINT_DELETE_ERROR);
    }
}
