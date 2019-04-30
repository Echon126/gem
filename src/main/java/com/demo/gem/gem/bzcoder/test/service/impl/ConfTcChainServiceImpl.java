package com.demo.gem.gem.bzcoder.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.gem.gem.bzcoder.test.entity.ConfTcChain;
import com.demo.gem.gem.bzcoder.test.mapper.ConfTcChainCommandMapper;
import com.demo.gem.gem.bzcoder.test.mapper.ConfTcChainMapper;
import com.demo.gem.gem.bzcoder.test.service.IConfTcChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 指令链表 服务实现类
 * </p>
 *
 * @author BaoZhou
 * @since 2019-04-29
 */
@Service
public class ConfTcChainServiceImpl extends ServiceImpl<ConfTcChainMapper, ConfTcChain> implements IConfTcChainService {
    @Autowired
    ConfTcChainMapper confTcChainMapper;

    @Autowired
    ConfTcChainCommandMapper confTcChainCommandMapper;

    public void saveChainCommand(){
        ConfTcChain confTcChain = new ConfTcChain();
        this.confTcChainMapper.insert(confTcChain);

    }
}
