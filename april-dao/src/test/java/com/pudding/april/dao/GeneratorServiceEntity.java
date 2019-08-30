package com.pudding.april.dao;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * @Auther: liuxh
 * @Date: 2019/1/23 17:04
 * @Description:
 */
public class GeneratorServiceEntity {

    @Test
    public void generateCode() {
        String packageName = "com.pudding.page";
        boolean serviceNameStartWithI = true;//user -> UserService, 设置成true: user -> IUserService
        generateByTables(serviceNameStartWithI, packageName,  "basic_customer", "basic_lot_detail","basic_lot_info","basic_lot_tactics","basic_lot_tactics_detail","basic_package","basic_sku_info","basic_warehouse_area","basic_warehouse_space","check_order","check_order_detail","in_warehouse_job","in_warehouse_order","in_warehouse_order_detail","in_warehouse_plan","in_warehouse_plan_detail","inventory_order","inventory_order_detail","logistics_order","logistics_order_detail","out_warehouse_job","out_warehouse_job_detail","out_warehouse_order","out_warehouse_order_detail","out_warehouse_plan","out_warehouse_plan_detail","pick_order","receive_order","receive_order_detail","sku_space_stock","stock_batch_info");
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql-mappers://192.168.1.206:3306/page";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("Mysql123!")
                .setDriverName("com.mysql-mappers.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor("liuxh")
                .setOutputDir("D:\\git-store\\page\\page-dao\\src\\main\\java")
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }

    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName, tableNames);
    }
}
