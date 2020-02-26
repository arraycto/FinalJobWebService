package com.cyrus.final_job;

import com.alibaba.fastjson.JSONObject;
import com.cyrus.final_job.dao.CheckInDao;
import com.cyrus.final_job.dao.DepartmentDao;
import com.cyrus.final_job.dao.NationDao;
import com.cyrus.final_job.dao.PoliticsStatusDao;
import com.cyrus.final_job.dao.system.MenuDao;
import com.cyrus.final_job.dao.system.UserDao;
import com.cyrus.final_job.service.DepartmentService;
import com.cyrus.final_job.service.system.MenuService;
import com.cyrus.final_job.utils.DateUtils;
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

    @Autowired
    NationDao nationDao;

    @Autowired
    private PoliticsStatusDao politicsStatusDao;

    @Test
    public void commonTest() {

        System.out.println(JSONObject.toJSONString(menuDao.getMenusByUserId(1)));
    }

    @Test
    public void getAllMenuWithRoleTest() {
        System.out.println(JSONObject.toJSONString(menuService.getAllMenuWithRole()));
    }

    @Test
    public void getDepartmentByParentIdTest() {
        System.out.println(JSONObject.toJSONString(departmentDao.getDepartmentByParentId(-1)));
    }

    @Autowired
    DepartmentService departmentService;

    @Test
    public void getAllDepartment() {
        System.out.println(JSONObject.toJSONString(departmentService.getAllDepartment()));
    }

    @Test
    public void nationDaoQueryTest() {
        System.out.println(nationDao.queryById(1));
    }

    @Autowired
    private UserDao userDao;

    @Autowired
    private CheckInDao checkInDao;

    @Test
    public void test() {
        System.out.println(DateUtils.getNowHour());
    }


}
