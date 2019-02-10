package com.qiqu.foreignkey.controller;

import com.qiqu.foreignkey.dao.GoodDao;
import com.qiqu.foreignkey.dao.UserDao;
import com.qiqu.foreignkey.dao.UserGoodDao;
import com.qiqu.jooq.common.generated.tables.pojos.Good;
import com.qiqu.jooq.common.generated.tables.pojos.User;
import com.qiqu.jooq.common.generated.tables.records.GoodRecord;
import com.qiqu.jooq.common.generated.tables.records.UserRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: qiqu
 */
@RestController
public class TestController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private GoodDao goodDao;

    @Autowired
    private UserGoodDao userGoodDao;

    @GetMapping(value = "/foreignkey")
    public void test(){
        Random random = new Random(233);
        for(int i = 0; i < 10000000; i++){
            UserRecord userRecord = new UserRecord();
            userRecord.setUserId(i);
            userRecord.setUsername(Integer.toString(random.nextInt()));
            userDao.add(userRecord);
        }

        for(int i = 0; i < 10000000; i++){
            GoodRecord goodRecord = new GoodRecord();
            goodRecord.setGoodId(i);
            goodRecord.setGoodname(Integer.toString(random.nextInt()));
            goodDao.add(goodRecord);
        }
    }
}
