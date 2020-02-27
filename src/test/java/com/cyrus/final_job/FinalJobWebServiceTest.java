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
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

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
        Timestamp timestamp = new Timestamp(1582675200000L);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(timestamp.toLocalDateTime().format(formatter));
    }


}
