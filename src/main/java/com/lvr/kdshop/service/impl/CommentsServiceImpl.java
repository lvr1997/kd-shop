package com.lvr.kdshop.service.impl;

import com.lvr.kdshop.entity.Comments;
import com.lvr.kdshop.mapper.CommentsMapper;
import com.lvr.kdshop.service.ICommentsService;
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
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
