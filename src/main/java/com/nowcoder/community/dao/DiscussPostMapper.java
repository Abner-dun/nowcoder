package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    //分页查询所有或者个人的帖子
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);
    //总共的页数
    int selectDiscussPostRows(@Param("userId")int userId);
}
