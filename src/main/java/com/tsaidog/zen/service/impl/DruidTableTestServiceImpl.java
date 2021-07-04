package com.tsaidog.zen.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsaidog.zen.entity.DruidTableTest;
import com.tsaidog.zen.mapper.DruidTableTestMapper;
import com.tsaidog.zen.service.DruidTableTestService;
import com.tsaidog.zen.vo.NewsDetailResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 新闻列表 服务实现类
 * </p>
 *
 * @author robert
 * @since 2021-07-03
 */
@Service
public class DruidTableTestServiceImpl extends ServiceImpl<DruidTableTestMapper, DruidTableTest> implements DruidTableTestService {

    @Autowired
    DruidTableTestMapper druidTableTestMapper;

    @Override
    public NewsDetailResp getNewsDetail(Long id) {
        DruidTableTest druidTableTest = druidTableTestMapper.selectById(id);
        NewsDetailResp detailResp = new NewsDetailResp();

        BeanUtil.copyProperties(druidTableTest, detailResp, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        detailResp.setIsTop(druidTableTest.getIsTop().equals(1) ? Boolean.TRUE : Boolean.FALSE);
        detailResp.setOnlineStatus(String.valueOf(druidTableTest.getOnlineStatus()));
        return detailResp;

    }
}
