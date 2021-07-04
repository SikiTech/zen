package com.tsaidog.zen.controller;


import com.tsaidog.zen.common.ResultDTO;
import com.tsaidog.zen.service.DruidTableTestService;
import com.tsaidog.zen.vo.NewsDetailResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 新闻列表 前端控制器
 * </p>
 *
 * @author robert
 * @since 2021-07-03
 */
@RestController
@RequestMapping("/druid-table-test")
public class DruidTableTestController {

    @Autowired
    DruidTableTestService druidTableTestService;

    /**
     * 新闻详情
     * @param id
     * @return
     */
    @GetMapping("/detail")
    ResultDTO<NewsDetailResp> getNewsDetail(@RequestParam("id") Long id) {
        NewsDetailResp newsDetail = druidTableTestService.getNewsDetail(id);
        return ResultDTO.success(newsDetail);
    }

}
