package com.ex.mb.basemybatis.entity;

import java.util.Date;
import java.util.List;

public class Course {
    public int id;
    public Date createTime;
    public String remark;
    public String name;
    public String content;

    List<StdTeaRelation> stdTeaRelationList;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<StdTeaRelation> getStdTeaRelationList() {
        return stdTeaRelationList;
    }

    public void setStdTeaRelationList(List<StdTeaRelation> stdTeaRelationList) {
        this.stdTeaRelationList = stdTeaRelationList;
    }
}
