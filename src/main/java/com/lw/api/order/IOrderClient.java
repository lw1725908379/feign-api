package com.lw.api.order;

import com.edu.lw.model.order.dto.OrderDTO;
import com.edu.lw.model.order.pojo.Order;
import com.edu.lw.model.response.dto.ResponseDTO;
import com.lw.api.order.fallback.IOrderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 17259
 * @create 2024-07-14 10:16
 */
@FeignClient(name = "csm-order",fallback = IOrderClientFallback.class)
public interface IOrderClient {
    // 删除订单信息
    @PostMapping("/order/delete")
    ResponseDTO deleteOrder(@RequestBody OrderDTO orderDTO);

    ResponseDTO insertOrder(Order order);
}
