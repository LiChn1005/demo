package com.example.demo;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
@SpringBootTest
@AutoConfigureMockMvc
public class ResourceTest {
    public static void loadAndReadUrlResources(String path) throws IOException {
        UrlResource url = new UrlResource(path);
        log.info("获取资源名 = {}", url.getURL());
        log.info("获取资源名 = {}", url.getFilename());
        log.info("获取资源描述 = {}", url.getDescription());
        log.info("获取资源内容 = {}", url.getInputStream().readAllBytes());
    }

    public static void loadClassPathResource(String path) throws IOException {
        ClassPathResource resource = new ClassPathResource(path);
        log.info("获取文件信息 = {}", resource.getFilename());
        log.info("获取文件信息 = {}", resource.getDescription());
        //
        InputStream inputStream = resource.getInputStream();
        byte[] bytes = new byte[1024];
        if (inputStream.read(bytes) != -1) {
            log.info("获取文件内容 = {} \n", bytes);
        }
    }

    @Test
    public void test() throws IOException {
//        loadAndReadUrlResources("http://www.baidu.com");
        loadAndReadUrlResources("file:baidu.txt");
    }

    @Test
    public void test1() throws IOException {
//        loadAndReadUrlResources("http://www.baidu.com");
        loadClassPathResource("baidu1.txt");
    }


}
