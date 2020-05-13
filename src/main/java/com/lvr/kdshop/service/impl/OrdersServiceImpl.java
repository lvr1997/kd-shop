package com.lvr.kdshop.service.impl;

import com.lvr.kdshop.entity.Orders;
import com.lvr.kdshop.mapper.OrdersMapper;
import com.lvr.kdshop.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
