package com.demo.gem.gem.bzcoder.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 指令链表
 * </p>
 *
 * @author BaoZhou
 * @since 2019-04-29
 */
public class ConfTcChain extends Model<ConfTcChain> {

    private static final long serialVersionUID = 1L;

    /**
     * id自增长
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 卫星id
     */
    private Long satelliteId;

    private String chainCode;

    /**
     * 指令链名称
     */
    private String chainName;

    /**
     * 指令链描述
     */
    private String chainDesc;

    /**
     * 启用禁用0：禁用，1：启用
     */
    private Integer enableStatus;

    /**
     * 状态0：删除，1：有效
     */
    private Integer status;

    /**
     * 最新更新人
     */
    private String updateBy;

    /**
     * 最新更新时间
     */
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSatelliteId() {
        return satelliteId;
    }

    public void setSatelliteId(Long satelliteId) {
        this.satelliteId = satelliteId;
    }

    public String getChainCode() {
        return chainCode;
    }

    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public String getChainDesc() {
        return chainDesc;
    }

    public void setChainDesc(String chainDesc) {
        this.chainDesc = chainDesc;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ConfTcChain{" +
        "id=" + id +
        ", satelliteId=" + satelliteId +
        ", chainCode=" + chainCode +
        ", chainName=" + chainName +
        ", chainDesc=" + chainDesc +
        ", enableStatus=" + enableStatus +
        ", status=" + status +
        ", updateBy=" + updateBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
