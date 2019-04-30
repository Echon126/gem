package com.demo.gem.gem.plus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.*;

/**
 * Created by Administrator on 2019/4/26.
 */
public class MysqlGenerator {
    public static void main(String[] args) {
        int result = scanner();
        // 自定义需要填充的字段
        List<TableFill> tableFillList = new ArrayList<>();
        tableFillList.add(new TableFill("ASDD_SS", FieldFill.INSERT_UPDATE));

        // 代码生成器
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                        .setOutputDir("E:\\development-work\\com.wen.example\\src\\main\\java")//输出目录
                        .setFileOverride(true)// 是否覆盖文件
                        .setActiveRecord(true)// 开启 activeRecord 模式
                        .setEnableCache(false)// XML 二级缓存
                        .setBaseResultMap(true)// XML ResultMap
                        .setBaseColumnList(true)// XML columLis
                        .setAuthor("BaoZhou")
        ).setDataSource(
                // 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.MYSQL)// 数据库类型
                        .setDriverName("com.mysql.cj.jdbc.Driver")
                        .setUsername("wmcc_dev")
                        .setPassword("HcH5S7qN")
                        .setUrl("jdbc:mysql://192.168.160.230:3306/wmcc?useUnicode=true&useSSL=false&characterEncoding=utf8")
        ).setStrategy(
                // 策略配置
                new StrategyConfig()
                        .setTablePrefix(new String[]{"tbl_", "mp_"})// 此处可以修改为您的表前缀
                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
                        .setSuperEntityColumns(new String[]{"test_id"})
                        .setTableFillList(tableFillList)
                        .setInclude(new String[]{"conf_tc_chain","conf_tc_chain_command"}) // 需要生成的表
        ).setPackageInfo(
                // 包配置
                new PackageConfig()
                        .setModuleName("test")
                        .setParent("com.bzcoder")// 自定义包路径
                        .setController("controller")// 这里是控制器包名，默认 web
        ).setCfg(
                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
                new InjectionConfig() {
                    @Override
                    public void initMap() {
                        Map<String, Object> map = new HashMap<>();
                        map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                        this.setMap(map);
                    }
                }.setFileOutConfigList(Collections.<FileOutConfig>singletonList(new FileOutConfig(
                        "/templates/mapper.xml" + ((1 == result) ? ".ftl" : ".vm")) {
                    // 自定义输出文件目录
                    @Override
                    public String outputFile(TableInfo tableInfo) {
                        return "D:/develop/code/xml/" + tableInfo.getEntityName() + ".xml";
                    }
                }))
        ).setTemplate(
                new TemplateConfig().setXml(null)
        );
        // 执行生成
        if (1 == result) {
            mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        }
        mpg.execute();

        // 打印注入设置，这里演示模板里面怎么获取注入内容【可无】
        System.err.println(mpg.getCfg().getMap().get("abc"));
    }

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static int scanner() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append(" ！！代码生成, 输入 0 表示使用 Velocity 引擎 ！！");
        help.append("\n对照表：");
        help.append("\n0 = Velocity 引擎");
        help.append("\n1 = Freemarker 引擎");
        help.append("\n请输入：");
        System.out.println(help.toString());
        int slt = 0;
        // 现在有输入数据
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if ("1".equals(ipt)) {
                slt = 1;
            }
        }
        return slt;
    }
}
