package com.vaeyxj.wxmp.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Description
 * @Author yuxijian@jiuxian.com
 * @Date: 2020/3/4 2:00 上午
 *
 * Gson gson = new GsonBuilder()
 *          .excludeFieldsWithoutExposeAnnotation() //不对没有用@Expose注解的属性进行操作
 *          .enableComplexMapKeySerialization() //当Map的key为复杂对象时,需要开启该方法
 *          .serializeNulls() //当字段值为空或null时，依然对该字段进行转换
 *          .setDateFormat("yyyy-MM-dd HH:mm:ss:SSS") //时间转化为特定格式
 *          .setPrettyPrinting() //对结果进行格式化，增加换行
 *          .disableHtmlEscaping() //防止特殊字符出现乱码
 *          .registerTypeAdapter(User.class,new UserAdapter()) //为某特定对象设置固定的序列或反序列方式，自定义Adapter需实现JsonSerializer或者JsonDeserializer接口
 *          .create();
 */
public class JsonUtils {
    public static String toJson(Object obj){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        return gson.toJson(obj);
    }
}
