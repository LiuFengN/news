package com.ibeifeng.News.service;

import com.ibeifeng.News.dao.AdminDao;
import com.ibeifeng.News.dao.IAdminDao;
import com.ibeifeng.News.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/24.
 */
@Service
public class AdminService implements IAdminService {
    @Autowired
    private IAdminDao adminDao;
    public void add(Admin admin) {
        adminDao.add(admin);
    }
}
