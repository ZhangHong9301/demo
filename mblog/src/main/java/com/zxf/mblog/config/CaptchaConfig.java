package com.zxf.mblog.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Create by Mr.ZXF
 * on 2018-12-20 17:10
 */
@Configuration
public class CaptchaConfig {
    @Bean
    public DefaultKaptcha producer () {
        Properties propertis = new Properties();
        propertis.put("kaptcha.border", "no");
        propertis.put("kaptcha.image.height", "29");
        propertis.put("kaptcha.image.width", "80");
        propertis.put("kaptcha.textproducer.font.color", "blue");
        propertis.put("kaptcha.textproducer.font.size", "25");
        propertis.put("kaptcha.textproducer.char.space", "6"); /*验证码文本字符间距*/
        Config config = new Config(propertis);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);

        return defaultKaptcha;
    }
}
