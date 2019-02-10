package com.qiqu.foreignkey.dao;

import com.qiqu.jooq.common.generated.tables.Good;
import com.qiqu.jooq.common.generated.tables.records.GoodRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.qiqu.jooq.common.generated.Tables.GOOD;

/**
 * @Author: qiqu
 */
@Component
public class GoodDao {

    private final DSLContext dsl;

    @Autowired
    public GoodDao(DSLContext dslContext) {
        this.dsl = dslContext;
    }
    public int add(GoodRecord goodRecord){
        return dsl.insertInto(GOOD)
                    .set(goodRecord)
                    .execute();
    }
}
