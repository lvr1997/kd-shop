package com.lvr.kdshop.mapper;

import java.util.List;
import com.lvr.kdshop.domain.Address;

/**
 * 收货地址Mapper接口
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public interface AddressMapper 
{
    /**
     * 查询收货地址
     * 
     * @param id 收货地址ID
     * @return 收货地址
     */
    public Address selectAddressById(Long id);

    /**
     * 查询收货地址列表
     * 
     * @param address 收货地址
     * @return 收货地址集合
     */
    public List<Address> selectAddressList(Address address);

    /**
     * 新增收货地址
     * 
     * @param address 收货地址
     * @return 结果
     */
    public int insertAddress(Address address);

    /**
     * 修改收货地址
     * 
     * @param address 收货地址
     * @return 结果
     */
    public int updateAddress(Address address);

    /**
     * 删除收货地址
     * 
     * @param id 收货地址ID
     * @return 结果
     */
    public int deleteAddressById(Long id);

    /**
     * 批量删除收货地址
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAddressByIds(Long[] ids);
}
