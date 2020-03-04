package com.vaeyxj.wxmp.config;

import com.vaeyxj.wxmp.utils.JsonUtils;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @Description
 * @Author yuxijian@jiuxian.com
 * @Date: 2020/3/4 8:49 上午
 */
@Data
@ConfigurationProperties(prefix = "wx.mp")
public class WxMpProperties {

    private List<MpConfig> configs;

    @Data
    public static class MpConfig{
        /**
         * 设置微信公众号的appid
         */
        private String appId;

        /**
         * 设置微信公众号的app secret
         */
        private String secret;

        /**
         * 设置微信公众号的token
         */
        private String token;

        /**
         * 设置微信公众号的EncodingAESKey
         */
        private String aesKey;
    }

    @Override
    public String toString() {
        return JsonUtils.toJson(this);
    }
}
