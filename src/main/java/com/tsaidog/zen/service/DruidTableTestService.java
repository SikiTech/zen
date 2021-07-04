package com.tsaidog.zen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsaidog.zen.entity.DruidTableTest;
import com.tsaidog.zen.vo.NewsDetailResp;

/**
 * <p>
 * 新闻列表 服务类
 * </p>
 *
 * @author robert
 * @since 2021-07-03
 */
public interface DruidTableTestService extends IService<DruidTableTest> {

    /**
     * 新闻详情
     * @param id
     * @return
     */
    NewsDetailResp getNewsDetail(Long id);
}
