package com.demo.gem.gem.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author BaoZhou
 * @since 2019-04-27
 */
public class Dir extends Model<Dir> {

    private static final long serialVersionUID = 1L;

    private Integer id;
    @TableField("name_type")
    private String nameType;
    @TableField("book_type_id")
    private Integer bookTypeId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public Integer getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "Dir{" +
                ", id=" + id +
                ", nameType=" + nameType +
                ", bookTypeId=" + bookTypeId +
                "}";
    }
}
