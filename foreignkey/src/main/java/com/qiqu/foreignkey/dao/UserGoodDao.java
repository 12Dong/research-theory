package com.qiqu.foreignkey.dao;

import com.qiqu.jooq.common.generated.tables.UserGood;
import com.qiqu.jooq.common.generated.tables.records.UserGoodRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.qiqu.jooq.common.generated.Tables.USER_GOOD;


/**
 * @Author: qiqu
 */
@Component
public class UserGoodDao {

    private final DSLContext dsl;

    @Autowired
    public UserGoodDao(DSLContext dslContext) {
        this.dsl = dslContext;
    }

    public int add(UserGoodRecord userGoodRecord){
        return dsl.insertInto(USER_GOOD)
                    .set(userGoodRecord)
                    .execute();
    }
}
