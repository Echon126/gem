package com.demo.gem.gem.bzcoder.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 指令链指令对象表
 * </p>
 *
 * @author BaoZhou
 * @since 2019-04-29
 */
public class ConfTcChainCommand extends Model<ConfTcChainCommand> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 指令链ID自增长
     */
    private Long chainId;

    /**
     * 指令对象ID
     */
    private Long commandObjId;

    /**
     * 指令对象类型
     */
    private Long commandObjTypeId;

    /**
     * 指令对象顺序
     */
    private Integer commandObjIndex;

    /**
     * 是否判据
     */
    private Integer isJudgment;

    /**
     * 是否暂停
     */
    private Integer isPause;

    /**
     * 下一条指令间隔时间ms
     */
    private Long nextInterval;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getChainId() {
        return chainId;
    }

    public void setChainId(Long chainId) {
        this.chainId = chainId;
    }

    public Long getCommandObjId() {
        return commandObjId;
    }

    public void setCommandObjId(Long commandObjId) {
        this.commandObjId = commandObjId;
    }

    public Long getCommandObjTypeId() {
        return commandObjTypeId;
    }

    public void setCommandObjTypeId(Long commandObjTypeId) {
        this.commandObjTypeId = commandObjTypeId;
    }

    public Integer getCommandObjIndex() {
        return commandObjIndex;
    }

    public void setCommandObjIndex(Integer commandObjIndex) {
        this.commandObjIndex = commandObjIndex;
    }

    public Integer getIsJudgment() {
        return isJudgment;
    }

    public void setIsJudgment(Integer isJudgment) {
        this.isJudgment = isJudgment;
    }

    public Integer getIsPause() {
        return isPause;
    }

    public void setIsPause(Integer isPause) {
        this.isPause = isPause;
    }

    public Long getNextInterval() {
        return nextInterval;
    }

    public void setNextInterval(Long nextInterval) {
        this.nextInterval = nextInterval;
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
        return "ConfTcChainCommand{" +
        "id=" + id +
        ", chainId=" + chainId +
        ", commandObjId=" + commandObjId +
        ", commandObjTypeId=" + commandObjTypeId +
        ", commandObjIndex=" + commandObjIndex +
        ", isJudgment=" + isJudgment +
        ", isPause=" + isPause +
        ", nextInterval=" + nextInterval +
        ", updateTime=" + updateTime +
        "}";
    }
}
