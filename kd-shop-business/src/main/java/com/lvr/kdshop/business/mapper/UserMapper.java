package com.lvr.kdshop.business.mapper;

import com.lvr.kdshop.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    SysUser selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    List<SysUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysUser record);

    int updateLastLoginByPrimaryKey(SysUser record);

    int updateByPrimaryKeySelective(SysUser record);

    SysUser getUserByPhone(@Param("phone") String phone);

    List<SysUser> getUserList();

    int updateGoodsNum(@Param("id") String id, @Param("goodsNum") Integer goodsNum);

    int updateImgUrl(@Param("id") String id, @Param("url") String url);

    Integer checkUserByPhone(@Param("phone") String phone);

    int updatePasswordByPrimaryKey(@Param("uid") String uid, @Param("password") String password);

    List<SysUser> searchUserByNameOrPhone(@Param("name") String name, @Param("phone") String phone);

}