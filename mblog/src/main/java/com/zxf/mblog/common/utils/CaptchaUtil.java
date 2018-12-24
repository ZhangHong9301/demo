package com.zxf.mblog.common.utils;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Create by Mr.ZXF
 * on 2018-12-21 9:51
 */
@Component
public class CaptchaUtil {
    /**
     * 将获取到的前端参数转为string类型
     * @param request
     * @param key
     * @return
     */
    public static String getString(HttpServletRequest request, String key) {
        try {
            String result = request.getParameter(key);
            if(result != null) {
                result = result.trim();
            }
            if("".equals(result)) {
                result = null;
            }
            return result;
        }catch(Exception e) {
            return null;
        }
    }
    /**
     * 验证码校验
     * @param request
     * @return
     */
    public static boolean checkCaptcha(HttpServletRequest request) {
        //获取生成的验证码
        String captchaExpected = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        //获取用户输入的验证码
        String captchaActual = CaptchaUtil.getString(request, "captchaActual");
        if(captchaActual == null ||!captchaActual.equals(captchaExpected)) {
            return false;
        }
        return true;
    }
}
