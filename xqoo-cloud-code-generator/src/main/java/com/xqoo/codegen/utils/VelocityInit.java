package com.xqoo.codegen.utils;

import org.apache.velocity.app.Velocity;

import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class VelocityInit {

    /**
     * 初始化vm方法
     */
    public static void initVelocity() {
        Properties p = new Properties();
        try
        {
            // 加载classpath目录下的vm文件
            p.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
            // 定义字符集
            p.setProperty(Velocity.ENCODING_DEFAULT, StandardCharsets.UTF_8.name());
            p.setProperty(Velocity.OUTPUT_ENCODING, StandardCharsets.UTF_8.name());
            // 初始化Velocity引擎，指定配置Properties
            Velocity.init(p);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
