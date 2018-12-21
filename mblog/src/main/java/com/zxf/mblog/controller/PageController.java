package com.zxf.mblog.controller;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Create by Mr.ZXF
 * on 2018-12-20 10:44
 */
@Controller
@Slf4j
@ApiIgnore
public class PageController {

    //验证码的生成器
    @Autowired
    private Producer producer;

    @GetMapping(value = {"/index"})
    public String index() {
        log.info("----------index.html");
        return "index";
    }

    @GetMapping(value = {"/hello"})
    public String hello() {
        log.info("----------index.html");
        return "hello";
    }

    @GetMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.addHeader("Cache-Control", "post-check=0,pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");

        //生成文字验证码
        String text = producer.createText();
        session.setAttribute(Constants.KAPTCHA_SESSION_KEY, text);
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //把验证码存到shrio的session中
//        SecurityUtils.getSubject().getSession().setAttribute(KAPTCHA_SESSION_KEY, text);

        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image, "jpg", outputStream);
        try {
            outputStream.flush();
        } finally {
            outputStream.close();
        }
    }
}
