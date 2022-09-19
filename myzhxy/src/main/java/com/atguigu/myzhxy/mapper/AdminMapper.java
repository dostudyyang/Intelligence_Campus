package com.atguigu.myzhxy.mapper;


import com.atguigu.myzhxy.pojo.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper extends BaseMapper<Admin> {
    // 其中不用这个也行，不过有时候idea会报一些莫名其妙的错误，所以还是准备一下比较好
    // P11: BaseMapper中定义了很多增删改查的方法
}
