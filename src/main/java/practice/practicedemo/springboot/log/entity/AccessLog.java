package practice.practicedemo.springboot.log.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author Simple
 * @Create 2021/6/25 15:29
 */
@Data
public class AccessLog {
    //访问者用户名
    private String username;
    //请求路径
    private String url;
    //请求消耗时长
    private Integer duration;
    //http 方法：GET、POST等
    private String httpMethod;
    //http 请求响应状态码
    private Integer httpStatus;
    //访问者ip
    private String ip;
    //此条记录的创建时间
    private Date createTime;
}
