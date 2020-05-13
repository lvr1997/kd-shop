package com.lvr.kdshop.service.impl;

import com.lvr.kdshop.entity.Image;
import com.lvr.kdshop.mapper.ImageMapper;
import com.lvr.kdshop.service.IImageService;
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
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements IImageService {

}
