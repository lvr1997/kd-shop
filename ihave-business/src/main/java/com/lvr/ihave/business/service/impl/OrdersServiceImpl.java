package com.lvr.ihave.business.service.impl;

import com.lvr.ihave.business.mapper.OrdersMapper;
import com.lvr.ihave.business.service.OrdersService;
import com.lvr.ihave.pojo.Orders;
import org.springframework.stereotype.Service;

import jakarta.annotation.Resource;
import java.util.List;


@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {

    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public int insert(Orders record) {
        return ordersMapper.insert(record);
    }

    @Override
    public List<Orders> selectAll() {
        return ordersMapper.selectAll();
    }

    @Override
    public List<Orders> selectOrdersByUserId(Integer userId) {
        return ordersMapper.selectOrdersByUserId(userId);
    }

    @Override
    public Orders selectOrdersByGoodId(Integer goodId) {
        return ordersMapper.selectOrdersByGoodId(goodId);
    }

    @Override
    public Double getSpendByUserId(String userId) {
        return ordersMapper.getSpendByUserId(userId);
    }

    @Override
    public Double getIncomeByUserId(String userId) {
        return ordersMapper.getIncomeByUserId(userId);
    }

}
