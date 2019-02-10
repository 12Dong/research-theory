package com.qiqu.foreignkey.dao;

import com.qiqu.jooq.common.generated.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.qiqu.jooq.common.generated.Tables.USER;

/**
 * @Author: qiqu
 */
@Component
public class UserDao {

    private final DSLContext dsl;

    @Autowired
    public UserDao(DSLContext dslContext) {
        this.dsl = dslContext;
    }
    public int add(UserRecord userRecord){
        return dsl.insertInto(USER)
                    .set(userRecord)
                    .execute();
    }
}
