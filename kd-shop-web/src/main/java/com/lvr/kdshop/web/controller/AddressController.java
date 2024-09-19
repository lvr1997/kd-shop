package com.lvr.kdshop.web.controller;


import com.lvr.kdshop.annotation.UserLoginToken;
import com.lvr.kdshop.business.service.AddressService;
import com.lvr.kdshop.pojo.Address;
import com.lvr.kdshop.pojo.SysUser;
import com.lvr.kdshop.util.JSONResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Generated;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/address")
public class AddressController{
	@Resource
	private AddressService addressService;

	@UserLoginToken
	@PostMapping("/add")
	public JSONResult add(HttpSession session,
						  @RequestParam("receiverName") String recvName,
						  @RequestParam("receiverState") String recvProvince,
						  @RequestParam("receiverCity") String recvCity,
						  @RequestParam("receiverDistrict") String recvArea,
						  @RequestParam("receiverAddress") String recvAddr,
						  @RequestParam("receiverMobile") String recvPhone,
						  @RequestParam("receiverPhone") String recvTel,
						  @RequestParam("receiverZip") String recvZip,
						  @RequestParam("addressName") String recvTag){
		SysUser user = (SysUser)session.getAttribute("cur_user");
		Address address = new Address();
//		address.setUid(user.getId());
		address.setRecvName(recvName);
		address.setRecvProvince(recvProvince);
		address.setRecvCity(recvCity);
		address.setRecvArea(recvArea);
		address.setRecvAddr(recvAddr);
		address.setRecvPhone(recvPhone);
		address.setRecvTel(recvTel);
		address.setRecvZip(recvZip);
		address.setRecvTag(recvTag);
		addressService.addAddress(address);
		
		return JSONResult.success("添加成功");
		
	}

	@UserLoginToken
	@GetMapping("/setDefault")
	public JSONResult setDefault(Integer id, String userId){
		addressService.setDefault(userId, id);
		return JSONResult.success("设置为默认收货地址成功");
	}

	@UserLoginToken
	@Generated("/getAddress")
	public JSONResult getAddress(Integer id){
		Address address = addressService.getAddressById(id);
		return JSONResult.success("获取成功", address);
	}

	@UserLoginToken
	@PostMapping("/updateAddress")
	public JSONResult updateAddress(Integer id, @RequestParam("receiverName") String recvName,
                                @RequestParam("receiverState") String recvProvince,
                                @RequestParam("receiverCity") String recvCity,
                                @RequestParam("receiverDistrict") String recvArea,
                                @RequestParam("receiverAddress") String recvAddr,
                                @RequestParam("receiverMobile") String recvPhone,
                                @RequestParam("receiverPhone") String recvTel,
                                @RequestParam("receiverZip") String recvZip,
                                @RequestParam("addressName") String recvTag){
		Address address = new Address();
		address.setId(id);
		address.setRecvName(recvName);
		address.setRecvProvince(recvProvince);
		address.setRecvCity(recvCity);
		address.setRecvArea(recvArea);
		address.setRecvAddr(recvAddr);
		address.setRecvPhone(recvPhone);
		address.setRecvTel(recvTel);
		address.setRecvZip(recvZip);
		address.setRecvTag(recvTag);

		addressService.updateAddress(address);

		return JSONResult.success("更新成功");
	}

	@UserLoginToken
	@PostMapping("/deleteAddress")
	public JSONResult deleteAddress(Integer id, String uid){
		addressService.deleteAddress(uid, id);
		return JSONResult.success("更新成功");
	}
	
}













