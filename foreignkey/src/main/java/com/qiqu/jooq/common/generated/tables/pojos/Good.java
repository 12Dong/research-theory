/**
 * This class is generated by jOOQ
 */
package com.qiqu.jooq.common.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Good implements Serializable {

    private static final long serialVersionUID = -1414661078;

    private Integer goodId;
    private String  goodname;

    public Good() {}

    public Good(Good value) {
        this.goodId = value.goodId;
        this.goodname = value.goodname;
    }

    public Good(
        Integer goodId,
        String  goodname
    ) {
        this.goodId = goodId;
        this.goodname = goodname;
    }

    public Integer getGoodId() {
        return this.goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodname() {
        return this.goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Good (");

        sb.append(goodId);
        sb.append(", ").append(goodname);

        sb.append(")");
        return sb.toString();
    }
}
