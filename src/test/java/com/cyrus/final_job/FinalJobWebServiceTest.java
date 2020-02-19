package com.cyrus.final_job;

import com.alibaba.fastjson.JSONObject;
import com.cyrus.final_job.dao.DepartmentDao;
import com.cyrus.final_job.dao.system.MenuDao;
import com.cyrus.final_job.service.DepartmentService;
import com.cyrus.final_job.service.system.MenuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FinalJobWebServiceTest {

    @Autowired
    MenuDao menuDao;

    @Autowired
    MenuService menuService;

    @Autowired
    DepartmentDao departmentDao;

    @Test
    public void commonTest() {

        System.out.println(JSONObject.toJSONString(menuDao.getMenusByUserId(1)));
    }

    @Test
    public void getAllMenuWithRoleTest(){
        System.out.println(JSONObject.toJSONString(menuService.getAllMenuWithRole()));
    }

    @Test
    public void getDepartmentByParentIdTest(){
        System.out.println(JSONObject.toJSONString(departmentDao.getDepartmentByParentId(-1)));
    }

    @Autowired
    DepartmentService departmentService;
    @Test
    public void getAllDepartment(){
        System.out.println(JSONObject.toJSONString(departmentService.getAllDepartment()));
    }

}
