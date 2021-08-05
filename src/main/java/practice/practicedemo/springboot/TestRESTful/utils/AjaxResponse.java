package practice.practicedemo.springboot.TestRESTful.utils;

import lombok.Data;

/**
 * @author Simple
 * @date 2021/6/23 11:09
 */
@Data
public class AjaxResponse {
    private boolean isok; // 请求是否处理成功
    private int code; // 请求响应码
    private String message; // 请求结果描述信息
    private Object data; //请求结果数据（通常用于查询操作）

    // 请求成功响应，不带查询数据（用于删除、修改、新增接口）
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setIsok(true);
        ajaxResponse.setMessage("请求响应成功!");
        return ajaxResponse;
    }
    // 请求成功响应，带查询数据（用于数据查询接口）
    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功!");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
    //请求成功的响应，带有查询数据（用于数据查询接口）
    public static AjaxResponse success(Object obj,String message) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setIsok(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
}
