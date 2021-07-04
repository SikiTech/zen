package com.tsaidog.zen.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 新闻列表
 * </p>
 *
 * @author robert
 * @since 2021-07-03
 */
@Data
public class DruidTableTest {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻封面
     */
    private String cover;

    /**
     * 发布时间
     */
    private LocalDateTime publishDate;

    /**
     * 是否上架 0 1
     */
    private Integer onlineStatus;

    /**
     * 是否置顶 0 1
     */
    private Integer isTop;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 新闻链接
     */
    private String link;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;
}
