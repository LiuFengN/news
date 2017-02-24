package com.ibeifeng.News.dao;

import com.ibeifeng.News.mapper.AdminMapper;
import com.ibeifeng.News.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/24.
 */
@Repository
public class AdminDao implements IAdminDao{
    @Autowired
    private AdminMapper adminMapper;
    public void add(Admin admin) {
        adminMapper.add(admin);

    }
}
