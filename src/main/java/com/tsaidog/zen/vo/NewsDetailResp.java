
package com.tsaidog.zen.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 新闻详情响应
 * @author robert
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewsDetailResp implements Serializable {
    private Long id;
    private String title;
    private String cover;
    private String link;
    private Boolean isTop;
    private String onlineStatus;
    @JsonFormat(pattern= "yyyy-MM-​dd" ,timezone = "GMT+8" )
    private Date publishDate;
    private String content;
}
