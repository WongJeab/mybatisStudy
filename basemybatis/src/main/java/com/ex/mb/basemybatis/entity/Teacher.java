package com.ex.mb.basemybatis.entity;

import java.util.Date;
import java.util.List;

public class Teacher {
    public int id;
    public Date createTime;
    public String remark;
    public String name;

    List<StdTeaRelation> stdTeaRelations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StdTeaRelation> getStdTeaRelations() {
        return stdTeaRelations;
    }

    public void setStdTeaRelations(List<StdTeaRelation> stdTeaRelations) {
        this.stdTeaRelations = stdTeaRelations;
    }
}
