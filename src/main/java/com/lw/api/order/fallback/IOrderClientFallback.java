package com.lw.api.order.fallback;

import com.edu.lw.model.bean.CodeMsg;
import com.edu.lw.model.order.dto.OrderDTO;
import com.edu.lw.model.order.pojo.Order;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.lw.api.order.IOrderClient;

/**
 * @author 17259
 * @create 2024-07-14 10:20
 */
public class IOrderClientFallback implements IOrderClient {

    @Override
    public ResponseDTO deleteOrder(OrderDTO orderDTO) {
        return ResponseDTO.errorByMsg(CodeMsg.ORDER_DELETE_ERROR);
    }

    @Override
    public ResponseDTO insertOrder(Order order) {
        return ResponseDTO.errorByMsg(CodeMsg.ORDER_ADD_ERROR);
    }
}
