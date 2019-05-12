package com.demo.gem.gem.configuration;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.stream.Collectors;


/**
 * Created by Administrator on 2019/5/12.
 */
@Component
public class FileConfiguration {
    private static final String MODEL_FILE_URL = "classpath:model/";
    private Logger log = LoggerFactory.getLogger(this.getClass());
    private String content;

    @PostConstruct
    public void init() throws IOException {
        StringBuilder sb = new StringBuilder();
        System.out.println("-----------开始初始化配置文件-----------------");
/*

        Resource resource = new ClassPathResource("classpath:model/");
        InputStream inputStream = resource.getInputStream();
        System.out.println ("-----------文件流数据------------------" + inputStream);
        byte[] bytes =new byte[1024];
        while(inputStream.read(bytes)!=-1){
            sb.append(new String(bytes,"utf-8"));
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
        content = reader.lines().collect(Collectors.joining("\n"));

        System.out.println("---------------111111111111111111111-------------"+content);
*/

        //获取容器资源解析器
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("model/*.*");
        for (Resource r : resources) {
            System.out.println("-------------加载所有文件---------------" + r.getFilename());
            byte[] bytes = new byte[1024];
            InputStream in = r.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len=-1;
            while((len=in.read(buffer))!=-1){
                baos.write(buffer,0,len);
            }
            System.out.println("-----------文件流数据内容字符串------------------" + baos.toString());
        }












    /*    IOUtils.readLines(inputStream).forEach(x -> {
            System.out.println ("-----------文件名称为------------------" + x);

            InputStream stream = getClass().getClassLoader().getResourceAsStream("model/" + x);
            InputStreamReader in = null;

            try {
                in = new InputStreamReader(stream, "gbk");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            try (BufferedReader reader = new BufferedReader(in)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                System.out.println ("-----------文件内容为--------------" + sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });*/


    }
}























