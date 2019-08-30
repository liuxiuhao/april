/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.206(测试)
Source Server Version : 50559
Source Host           : 192.168.1.206:3306
Source Database       : page

Target Server Type    : MYSQL
Target Server Version : 50559
File Encoding         : 65001

Date: 2019-08-07 18:07:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for basic_customer
-- ----------------------------
DROP TABLE IF EXISTS `basic_customer`;
CREATE TABLE `basic_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_code` varchar(32) NOT NULL COMMENT '客户编码',
  `customer_name` varchar(64) NOT NULL COMMENT '客户名称',
  `customer_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '客户类型 1：货主 2：供应商 3：客户 4：承运商',
  `tel` varchar(20) NOT NULL COMMENT '联系电话',
  `province` varchar(20) DEFAULT NULL COMMENT '省份',
  `city` varchar(50) DEFAULT NULL COMMENT '市',
  `area` varchar(50) DEFAULT NULL COMMENT '区',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `reserve1` varchar(50) DEFAULT NULL COMMENT '区',
  `reserve2` varchar(50) DEFAULT NULL COMMENT '区',
  `reserve3` varchar(50) DEFAULT NULL COMMENT '区',
  `reserve4` varchar(50) DEFAULT NULL COMMENT '区',
  `reserve5` varchar(50) DEFAULT NULL COMMENT '区',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户信息表';

-- ----------------------------
-- Table structure for basic_lot_detail
-- ----------------------------
DROP TABLE IF EXISTS `basic_lot_detail`;
CREATE TABLE `basic_lot_detail` (
  `id` int(11) NOT NULL,
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `lot_attr_code` varchar(32) NOT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_name` varchar(64) NOT NULL COMMENT '属性名字',
  `input_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '输入控制 0:必输 1:只读 2:可选 3:禁用 如果只读则设置 lot_attr_value 值',
  `lot_attr_type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '属性类型 1:文本 2:下拉 3:日期 4:日期时间 5:数字',
  `lot_attr_value` varchar(200) NOT NULL DEFAULT '0' COMMENT '属性选项 如果属性格式为下拉则用于配置枚举类型，如：正品/残次品，是否;如果输入控制为必输则设置对应的默认值',
  `is_batch` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否为批次号属性:0:否 1:是\r\n            根据批次属性组合生成 唯一批次号',
  `remark` varchar(64) DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批次明细表';

-- ----------------------------
-- Table structure for basic_lot_info
-- ----------------------------
DROP TABLE IF EXISTS `basic_lot_info`;
CREATE TABLE `basic_lot_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lot_name` varchar(64) NOT NULL COMMENT '批次名称',
  `is_defalut` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否默认',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批次信息表';

-- ----------------------------
-- Table structure for basic_lot_tactics
-- ----------------------------
DROP TABLE IF EXISTS `basic_lot_tactics`;
CREATE TABLE `basic_lot_tactics` (
  `id` int(11) NOT NULL,
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `lot_tactics_name` varchar(64) NOT NULL COMMENT '策略名称',
  `remark` varchar(200) NOT NULL COMMENT '备注',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批次策略表';

-- ----------------------------
-- Table structure for basic_lot_tactics_detail
-- ----------------------------
DROP TABLE IF EXISTS `basic_lot_tactics_detail`;
CREATE TABLE `basic_lot_tactics_detail` (
  `id` int(11) NOT NULL,
  `lot_tactics_id` int(11) NOT NULL COMMENT '批次策略id',
  `lot_attr_code` varchar(32) NOT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `exec_seq` int(11) NOT NULL COMMENT '执行序列号',
  `desc_asc` varchar(10) NOT NULL COMMENT '升序降序',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批次策略明细表';

-- ----------------------------
-- Table structure for basic_package
-- ----------------------------
DROP TABLE IF EXISTS `basic_package`;
CREATE TABLE `basic_package` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `package_code` varchar(32) NOT NULL COMMENT '包装代码',
  `package_desc` varchar(200) NOT NULL COMMENT '包装描述',
  `single` decimal(12,4) NOT NULL COMMENT '单品',
  `box` decimal(12,4) NOT NULL COMMENT '箱',
  `palet` decimal(12,4) NOT NULL COMMENT '托盘',
  `weight` decimal(12,6) NOT NULL COMMENT '单品重量 重量 kg',
  `length` decimal(12,6) NOT NULL COMMENT '单品长度',
  `width` decimal(12,6) NOT NULL COMMENT '单品宽度',
  `height` decimal(12,6) NOT NULL COMMENT '单品高度',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='包装表';

-- ----------------------------
-- Table structure for basic_sku_info
-- ----------------------------
DROP TABLE IF EXISTS `basic_sku_info`;
CREATE TABLE `basic_sku_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sku_code` varchar(32) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(64) NOT NULL COMMENT '商品名称',
  `package_code` varchar(32) NOT NULL COMMENT '包装代码',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `put_rule_id` int(11) DEFAULT NULL COMMENT '上架规则id\r\n            ',
  `replenishment_rule_id` int(11) DEFAULT NULL COMMENT '补货规则id',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Table structure for basic_warehouse_area
-- ----------------------------
DROP TABLE IF EXISTS `basic_warehouse_area`;
CREATE TABLE `basic_warehouse_area` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `warehouse_area_code` varchar(20) NOT NULL COMMENT '库区编码',
  `warehouse_area_name` varchar(20) NOT NULL COMMENT '库区名称',
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `is_virtual` tinyint(4) NOT NULL COMMENT '0:否\r\n            1:是\r\n            ',
  `warehouse_area_nature` tinyint(4) NOT NULL COMMENT '库区性质:\r\n            1:存储区\r\n            2:残次品区\r\n            3:退货区\r\n            ',
  `in_lock` tinyint(4) NOT NULL COMMENT '入库锁:0 正常 1:锁定',
  `out_lock` tinyint(4) NOT NULL COMMENT '0：正常\r\n            1：出库锁定',
  `warehouse_area_desc` varchar(255) DEFAULT NULL COMMENT '库区描述',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_warehouse_area_code` (`warehouse_code`,`warehouse_area_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库区表';

-- ----------------------------
-- Table structure for basic_warehouse_space
-- ----------------------------
DROP TABLE IF EXISTS `basic_warehouse_space`;
CREATE TABLE `basic_warehouse_space` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `warehouse_area_code` varchar(20) NOT NULL COMMENT '库区编码',
  `warehouse_space_code` varchar(20) NOT NULL COMMENT '库位编码',
  `warehouse_space_platoon` int(11) NOT NULL COMMENT '库位排',
  `warehouse_space_column` int(11) NOT NULL COMMENT '库位列',
  `warehouse_space_floor` int(11) DEFAULT NULL COMMENT '库位层',
  `length` decimal(12,4) DEFAULT NULL COMMENT '长度',
  `width` decimal(12,4) DEFAULT NULL COMMENT '宽度',
  `height` decimal(12,4) DEFAULT NULL COMMENT '高度',
  `warehouse_space_status` tinyint(4) NOT NULL COMMENT '库位状态\r\n            0：空库位\r\n            1：有货\r\n            99：禁用',
  `load_volume` decimal(12,4) NOT NULL COMMENT '承载体积',
  `load_born` decimal(12,4) NOT NULL COMMENT '承载重量',
  `pick_route` int(11) DEFAULT NULL COMMENT '拣货路径',
  `in_lock` tinyint(4) NOT NULL COMMENT '入库锁:0 正常 1:锁定',
  `out_lock` tinyint(4) NOT NULL COMMENT '0：正常\r\n            1：出库锁定',
  `put_type` tinyint(4) NOT NULL DEFAULT '2' COMMENT '上架类型\r\n            1:只能分配一次\r\n            2:可分配多次',
  `pick_type` tinyint(4) NOT NULL DEFAULT '2' COMMENT '拣货类型\r\n            1:只能分配一次\r\n            2:可分配多次',
  `is_lot` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否混发批次数 0：否 1：是',
  `lot_num` int(11) NOT NULL DEFAULT '1' COMMENT '混发批次数 默认1',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_warehouse_space_code` (`warehouse_code`,`warehouse_area_code`,`warehouse_space_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库位表';

-- ----------------------------
-- Table structure for busi_interface_log
-- ----------------------------
DROP TABLE IF EXISTS `busi_interface_log`;
CREATE TABLE `busi_interface_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `interface_path` varchar(50) NOT NULL COMMENT '接口名称',
  `order_code` varchar(20) DEFAULT NULL COMMENT '业务单号',
  `request_type` int(11) NOT NULL COMMENT '1:SHARK->TIGER\r\n            2:TIGER->SHARK\r\n            ',
  `request_time` datetime NOT NULL COMMENT '请求时间',
  `request_body` text NOT NULL COMMENT '请求报文',
  `http_status` varchar(10) DEFAULT NULL COMMENT '请求状态',
  `is_success` int(11) DEFAULT NULL COMMENT '是否处理成功',
  `response_time` datetime DEFAULT NULL COMMENT '响应时间',
  `reponse_boby` text COMMENT '响应报文',
  `reset_count` int(11) DEFAULT NULL COMMENT '重试次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='接口日志表';

-- ----------------------------
-- Table structure for check_order
-- ----------------------------
DROP TABLE IF EXISTS `check_order`;
CREATE TABLE `check_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `receive_order_code` varchar(32) NOT NULL COMMENT '收货单号',
  `order_code` varchar(20) NOT NULL COMMENT '质检单号',
  `execute_status` tinyint(4) NOT NULL COMMENT '执行状态\r\n            0:未执行\r\n            1:部分执行\r\n            2:全部执行\r\n            ',
  `owner_code` varchar(20) NOT NULL COMMENT '货主编码',
  `owner_name` varchar(32) NOT NULL COMMENT '货主名称',
  `provider_code` varchar(20) NOT NULL COMMENT '供应商编码',
  `provider_name` varchar(32) NOT NULL COMMENT '供应商名称',
  `check_name` varchar(32) DEFAULT NULL COMMENT '质检人',
  `check_dept` varchar(32) DEFAULT NULL COMMENT '质检部门',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='质检单';

-- ----------------------------
-- Table structure for check_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `check_order_detail`;
CREATE TABLE `check_order_detail` (
  `id` int(11) NOT NULL,
  `order_code` varchar(20) NOT NULL COMMENT '质检单号',
  `receive_order_code` varchar(32) NOT NULL COMMENT '收货单号',
  `busi_index` varchar(20) NOT NULL COMMENT '对应计划单的业务系统明细序号busi_index',
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `batch_no` varchar(20) NOT NULL COMMENT '批号:与单据明细里的批号一致',
  `receive_qty` decimal(12,4) NOT NULL DEFAULT '0.0000' COMMENT '收货数量  默认0.0000',
  `check_qty` decimal(12,4) NOT NULL DEFAULT '0.0000' COMMENT '质检数量 默认0.0000',
  `bad_qty` decimal(12,4) DEFAULT '0.0000' COMMENT '不良数量 默认0.0000',
  `check_result` tinyint(4) NOT NULL DEFAULT '0' COMMENT '质检结果：0:待检 1:不合格 2:合格',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='质检单明细表';

-- ----------------------------
-- Table structure for inventory_order
-- ----------------------------
DROP TABLE IF EXISTS `inventory_order`;
CREATE TABLE `inventory_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `order_code` varchar(20) NOT NULL COMMENT '质检单号',
  `execute_status` tinyint(4) NOT NULL COMMENT '执行状态\r\n            0:未执行\r\n            1:部分执行\r\n            2:全部执行\r\n            ',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  `inventory_name` int(11) NOT NULL COMMENT '创建人',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_order_code` (`order_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='盘点单';

-- ----------------------------
-- Table structure for inventory_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `inventory_order_detail`;
CREATE TABLE `inventory_order_detail` (
  `id` int(11) NOT NULL,
  `inventory_order_code` varchar(20) NOT NULL COMMENT '质检单号',
  `stock_id` int(11) NOT NULL,
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `batch_no` varchar(20) NOT NULL COMMENT '批号:与单据明细里的批号一致',
  `stock_qty` decimal(12,4) NOT NULL DEFAULT '0.0000' COMMENT '收货数量  默认0.0000',
  `inventory_qty` decimal(12,4) NOT NULL DEFAULT '0.0000' COMMENT '质检数量 默认0.0000',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  `batch_no2` varchar(64) NOT NULL COMMENT '批次号',
  `owner_code` varchar(64) NOT NULL COMMENT '货主编码',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='盘点单明细';

-- ----------------------------
-- Table structure for in_warehouse_job
-- ----------------------------
DROP TABLE IF EXISTS `in_warehouse_job`;
CREATE TABLE `in_warehouse_job` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `job_type` tinyint(4) NOT NULL COMMENT ' 作业类型：1：收货作业 2：上架作业 3：移库入库作业',
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `warehouse_area_code` varchar(20) NOT NULL COMMENT '库区编码',
  `warehouse_space_code` varchar(20) NOT NULL COMMENT '库位编码',
  `source_order_code` varchar(32) NOT NULL COMMENT '来源单号',
  `source_order_detail_id` int(11) DEFAULT NULL COMMENT '入库单id:根据作业创建入库单后反写过来',
  `in_order_id` int(11) DEFAULT NULL COMMENT '入库单id:根据作业创建入库单后反写过来（上架作业才有）',
  `in_order_detail_id` int(11) DEFAULT NULL COMMENT '入库单明细id:根据作业创建入库单后反写过来',
  `is_create_order` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已生成入库单:0:未生成\r\n            1:已生成',
  `job_status` tinyint(4) NOT NULL COMMENT ' 作业状态:0-新建 1.未执行 2.待执行 3.正执行 4.完成 5.作废 6.异常作业 8.暂停作业\r\n            一期:全部为 “完成” 状态',
  `tray_code` varchar(32) DEFAULT NULL,
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `owner_code` varchar(32) NOT NULL COMMENT '货主',
  `batch_no` varchar(64) NOT NULL COMMENT '批号:与单据明细里的批号一致',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `job_qty` decimal(12,4) NOT NULL COMMENT '上架数量',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='入库作业表';

-- ----------------------------
-- Table structure for in_warehouse_order
-- ----------------------------
DROP TABLE IF EXISTS `in_warehouse_order`;
CREATE TABLE `in_warehouse_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(20) NOT NULL COMMENT '入库单号',
  `order_type` tinyint(4) NOT NULL COMMENT '业务类型/单据类型 11:采购入库 12：销售退货入库',
  `order_status` tinyint(4) NOT NULL COMMENT '0:草稿\r\n            1:待审\r\n            2:审核通过\r\n            3:驳回\r\n            一期只有 审核通过\r\n            ',
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `plan_code` varchar(32) NOT NULL,
  `owner_code` varchar(20) NOT NULL COMMENT '货主',
  `owner_name` varchar(32) NOT NULL COMMENT '货主名称',
  `provider_code` varchar(20) DEFAULT NULL COMMENT '货主',
  `provider_name` varchar(32) DEFAULT NULL COMMENT '货主',
  `is_push` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已推送给交付系统\r\n            0:未推送\r\n            1:已推送',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_order_code` (`order_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='入库单';

-- ----------------------------
-- Table structure for in_warehouse_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `in_warehouse_order_detail`;
CREATE TABLE `in_warehouse_order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL COMMENT '入库单id',
  `plan_line_no` int(11) NOT NULL,
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `batch_no` varchar(20) NOT NULL COMMENT '批号:与单据明细里的批号一致',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `in_qty` decimal(12,4) NOT NULL DEFAULT '0.0000' COMMENT '入库数量',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='入库单明细表';

-- ----------------------------
-- Table structure for in_warehouse_plan
-- ----------------------------
DROP TABLE IF EXISTS `in_warehouse_plan`;
CREATE TABLE `in_warehouse_plan` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  `plan_code` varchar(32) DEFAULT NULL COMMENT '计划单号',
  `plan_type` tinyint(4) NOT NULL COMMENT '单据类型',
  `plan_warehouse_code` varchar(20) DEFAULT NULL COMMENT '计划仓库编码',
  `owner_code` varchar(32) NOT NULL COMMENT '货主',
  `owner_name` varchar(64) DEFAULT NULL COMMENT '货主名称',
  `provider_code` varchar(32) DEFAULT NULL COMMENT '供应商编码',
  `provider_name` varchar(64) DEFAULT NULL COMMENT '供应商名称',
  `arrive_start_time` datetime NOT NULL COMMENT '预计到货时间(from)',
  `arrive_start_time2` datetime NOT NULL COMMENT '预计到货时间(to)',
  `order_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '单据状态:0新建 1:已审核 2:已驳回',
  `from_sys_code` varchar(20) NOT NULL COMMENT '来源系统\r\n            tiger',
  `reason` varchar(256) DEFAULT NULL COMMENT '订单取消审核的审核说明，如：为何不同意取消',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for in_warehouse_plan_detail
-- ----------------------------
DROP TABLE IF EXISTS `in_warehouse_plan_detail`;
CREATE TABLE `in_warehouse_plan_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  `plan_id` int(11) DEFAULT NULL,
  `plan_code` varchar(32) NOT NULL,
  `plan_line_no` int(11) NOT NULL,
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `plan_in_qty` decimal(12,4) NOT NULL COMMENT '计划入库数量',
  `remark_info` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for logistics_order
-- ----------------------------
DROP TABLE IF EXISTS `logistics_order`;
CREATE TABLE `logistics_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `owner_name` varchar(32) NOT NULL COMMENT '货主',
  `order_code` varchar(32) NOT NULL COMMENT '入库单号',
  `receiver` varchar(10) NOT NULL COMMENT '收货人',
  `receive_address` varchar(200) NOT NULL COMMENT '收货地址',
  `link_tel` varchar(20) DEFAULT NULL COMMENT '收货人联系电话',
  `logistics_com_code` varchar(64) NOT NULL COMMENT '物流公司编码',
  `logistics_order_code` varchar(64) NOT NULL COMMENT '物流单号',
  `logistics_status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '物流状态（配送状态）：0-已出库；1-配送中；2-已完成',
  `freight_amt` decimal(12,4) DEFAULT '0.0000' COMMENT '运费',
  `other_amt` decimal(12,4) DEFAULT '0.0000' COMMENT '其他费用',
  `pay_type` tinyint(4) NOT NULL COMMENT '付费方式：0:我方付\r\n            1:客户付',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配送信息表';

-- ----------------------------
-- Table structure for logistics_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `logistics_order_detail`;
CREATE TABLE `logistics_order_detail` (
  `id` int(11) NOT NULL,
  `logistics_order_code` varchar(32) NOT NULL COMMENT '物流单号',
  `out_order_code` varchar(32) NOT NULL COMMENT '出库单号',
  `out_order_detail_id` int(11) NOT NULL,
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `batch_no` varchar(64) NOT NULL COMMENT '批次号',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `carrier_qty` int(12) NOT NULL DEFAULT '0' COMMENT '件数',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配送单明细表';

-- ----------------------------
-- Table structure for out_warehouse_job
-- ----------------------------
DROP TABLE IF EXISTS `out_warehouse_job`;
CREATE TABLE `out_warehouse_job` (
  `id` int(11) NOT NULL,
  `pick_order_code` varchar(20) NOT NULL COMMENT '拣货单号',
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `s_warehouse_area_code` varchar(20) NOT NULL COMMENT '源库区编码',
  `s_warehouse_space_code` varchar(20) NOT NULL COMMENT '源库位编码',
  `t_warehouse_area_code` varchar(20) DEFAULT NULL COMMENT '目标库区编码(移库时用)',
  `t_warehouse_space_code` varchar(20) DEFAULT NULL COMMENT '目标源库位编码(移库时用)',
  `stock_Id` int(11) NOT NULL COMMENT '库存id,出库时必填',
  `tray_code` varchar(20) NOT NULL COMMENT '托盘条码',
  `job_status` tinyint(4) NOT NULL COMMENT ' 作业状态:0-新建 1.未执行 2.待执行 3.正执行 4.完成 5.作废 6.异常作业 8.暂停作业\r\n            一期:全部为 “完成” 状态',
  `remark_info` varchar(256) DEFAULT NULL COMMENT '备注',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出库作业表';

-- ----------------------------
-- Table structure for out_warehouse_job_detail
-- ----------------------------
DROP TABLE IF EXISTS `out_warehouse_job_detail`;
CREATE TABLE `out_warehouse_job_detail` (
  `id` int(11) NOT NULL,
  `out_job_id` int(11) NOT NULL,
  `out_order_code` varchar(32) DEFAULT NULL COMMENT '根据拣货单生成出库单后，回写该字段',
  `out_order_detail_id` int(11) DEFAULT NULL COMMENT '根据拣货单生成出库单后，回写该字段',
  `sku_code` varchar(32) NOT NULL COMMENT '商品编码',
  `owner_code` varchar(32) NOT NULL COMMENT '货主编码',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `batch_no` varchar(64) NOT NULL COMMENT '批次号',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `assign_qty` decimal(12,4) NOT NULL COMMENT '分配数量',
  `job_qty` decimal(12,4) NOT NULL COMMENT '分配数量',
  `real_job_qty` decimal(12,4) NOT NULL COMMENT '实际拣货数量(复核数量)',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出库作业明细';

-- ----------------------------
-- Table structure for out_warehouse_order
-- ----------------------------
DROP TABLE IF EXISTS `out_warehouse_order`;
CREATE TABLE `out_warehouse_order` (
  `id` int(11) NOT NULL,
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  `order_code` varchar(32) DEFAULT NULL COMMENT '计划单号',
  `order_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '单据状态:0新建 1:已审核 2:出库分配 3:出库执行 4:发货确认 9:作废',
  `out_plan_code` varchar(32) DEFAULT NULL COMMENT '计划单号',
  `order_type` tinyint(4) NOT NULL COMMENT '单据类型',
  `warehouse_code` varchar(20) DEFAULT NULL COMMENT '计划仓库编码',
  `owner_code` varchar(32) NOT NULL COMMENT '货主',
  `owner_name` varchar(64) DEFAULT NULL COMMENT '货主名称',
  `customer_code` varchar(32) DEFAULT NULL COMMENT '供应商编码',
  `customer_name` varchar(64) DEFAULT NULL COMMENT '供应商名称',
  `order_time` datetime NOT NULL COMMENT '修改时间',
  `plan_start_time` datetime DEFAULT NULL COMMENT '修改时间',
  `plan_end_time` datetime DEFAULT NULL COMMENT '修改时间',
  `arrival_link_name` varchar(45) DEFAULT NULL COMMENT '联系人',
  `arrival_link_tel` varchar(45) DEFAULT NULL COMMENT '联系电话',
  `arrival_address` varchar(255) DEFAULT NULL COMMENT '联系地址',
  `from_sys_code` varchar(20) NOT NULL COMMENT '来源系统\r\n            tiger',
  `reason` varchar(256) DEFAULT NULL COMMENT '订单取消审核的审核说明，如：为何不同意取消'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出库单';

-- ----------------------------
-- Table structure for out_warehouse_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `out_warehouse_order_detail`;
CREATE TABLE `out_warehouse_order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `out_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL COMMENT '出库单id',
  `out_order_code` varchar(32) NOT NULL COMMENT '出库单号',
  `batch_no` varchar(32) DEFAULT NULL COMMENT '批次号',
  `out_plan_line_no` int(11) NOT NULL,
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `lot_id` int(11) NOT NULL COMMENT '批次id,通过商品信息反写过来方便显示',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `plan_out_qty` decimal(12,4) NOT NULL COMMENT '本次开单数量\r\n            ',
  `real_out_qty` decimal(12,4) DEFAULT NULL COMMENT '实际出库数量',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出库单明细表';

-- ----------------------------
-- Table structure for out_warehouse_plan
-- ----------------------------
DROP TABLE IF EXISTS `out_warehouse_plan`;
CREATE TABLE `out_warehouse_plan` (
  `id` int(11) NOT NULL,
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  `plan_code` varchar(32) DEFAULT NULL COMMENT '计划单号',
  `plan_type` tinyint(4) NOT NULL COMMENT '单据类型',
  `plan_warehouse_code` varchar(20) DEFAULT NULL COMMENT '计划仓库编码',
  `owner_code` varchar(32) NOT NULL COMMENT '货主',
  `owner_name` varchar(64) DEFAULT NULL COMMENT '货主名称',
  `customer_code` varchar(32) DEFAULT NULL COMMENT '供应商编码',
  `customer_name` varchar(64) DEFAULT NULL COMMENT '供应商名称',
  `order_time` datetime NOT NULL COMMENT '修改时间',
  `plan_start_time` datetime DEFAULT NULL COMMENT '修改时间',
  `plan_end_time` datetime DEFAULT NULL COMMENT '修改时间',
  `arrival_link_name` varchar(45) DEFAULT NULL COMMENT '联系人',
  `arrival_link_tel` varchar(45) DEFAULT NULL COMMENT '联系电话',
  `arrival_address` varchar(255) DEFAULT NULL COMMENT '联系地址',
  `order_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '单据状态:0新建 1:已审核 2:已驳回',
  `from_sys_code` varchar(20) NOT NULL COMMENT '来源系统\r\n            tiger',
  `reason` varchar(256) DEFAULT NULL COMMENT '订单取消审核的审核说明，如：为何不同意取消'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for out_warehouse_plan_detail
-- ----------------------------
DROP TABLE IF EXISTS `out_warehouse_plan_detail`;
CREATE TABLE `out_warehouse_plan_detail` (
  `id` int(11) NOT NULL,
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  `plan_id` int(11) DEFAULT NULL,
  `plan_code` varchar(32) NOT NULL,
  `plan_line_no` int(11) NOT NULL,
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `batch_no` varchar(64) NOT NULL COMMENT '批次号',
  `plan_out_qty` decimal(12,4) NOT NULL COMMENT '计划入库数量',
  `remark_info` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出库计划明细表';

-- ----------------------------
-- Table structure for pick_order
-- ----------------------------
DROP TABLE IF EXISTS `pick_order`;
CREATE TABLE `pick_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(20) NOT NULL COMMENT '拣货单号',
  `pick_type` tinyint(4) NOT NULL COMMENT '拣货方式:0:按单拣货\r\n            1:集中拣货',
  `order_status` tinyint(4) NOT NULL COMMENT '单据状态：0未执行;1执行中;2执行完成3终止',
  `warehouse_code` varchar(10) NOT NULL COMMENT '仓库编码',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_order_code` (`order_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拣货单';

-- ----------------------------
-- Table structure for receive_order
-- ----------------------------
DROP TABLE IF EXISTS `receive_order`;
CREATE TABLE `receive_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(32) NOT NULL COMMENT '收货单号',
  `order_type` tinyint(4) NOT NULL COMMENT '收货单类型 11:采购入库收货 12：销售退货入库收货',
  `order_status` tinyint(4) NOT NULL COMMENT '0:草稿\r\n            1:待审\r\n            2:审核通过\r\n            3:驳回\r\n            一期只有 审核通过\r\n            ',
  `plan_code` varchar(32) NOT NULL COMMENT '入库计划单',
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `owner_code` varchar(32) NOT NULL COMMENT '货主',
  `owner_name` varchar(64) DEFAULT NULL COMMENT '货主名称',
  `provider_code` varchar(20) DEFAULT NULL COMMENT '供应商编码',
  `provider_name` varchar(32) DEFAULT NULL COMMENT '供应商名称',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收货单';

-- ----------------------------
-- Table structure for receive_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `receive_order_detail`;
CREATE TABLE `receive_order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_code` varchar(32) NOT NULL COMMENT '收货单号',
  `in_plan_line_no` int(11) NOT NULL,
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `batch_no` varchar(32) NOT NULL COMMENT '批次号:创建收库单的同时生成批次号',
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `receive_qty` decimal(12,4) NOT NULL DEFAULT '0.0000' COMMENT '收货数量',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除 0 : 未删除  1：已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收货单明细表';

-- ----------------------------
-- Table structure for sku_space_stock
-- ----------------------------
DROP TABLE IF EXISTS `sku_space_stock`;
CREATE TABLE `sku_space_stock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `warehouse_code` varchar(20) NOT NULL COMMENT '仓库编码',
  `warehouse_area_code` varchar(20) NOT NULL COMMENT '库区编码',
  `warehouse_space_code` varchar(32) NOT NULL COMMENT '库位编码',
  `tray_code` varchar(20) NOT NULL COMMENT '托盘条码',
  `owner_code` varchar(32) NOT NULL COMMENT '货主',
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `sku_name` varchar(256) DEFAULT NULL COMMENT '商品名称',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `batch_no` varchar(20) NOT NULL COMMENT '批号:与单据明细里的批号一致',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `stock_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '库存状态:0:未分配 1:已分配',
  `sku_qty` decimal(12,4) NOT NULL COMMENT '库存数量',
  `block_qty` decimal(12,4) DEFAULT NULL COMMENT '冻结数量',
  `gmt_create` datetime NOT NULL COMMENT '创建时间',
  `gmt_modify` datetime NOT NULL COMMENT '修改时间',
  `data_version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `creater_id` int(11) NOT NULL COMMENT '创建人',
  `creater_name` varchar(20) NOT NULL COMMENT '创建人名称',
  `modifier_id` int(11) NOT NULL COMMENT '修改人',
  `modifier_name` varchar(20) NOT NULL COMMENT '修改人名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库位库存表';

-- ----------------------------
-- Table structure for stock_batch_info
-- ----------------------------
DROP TABLE IF EXISTS `stock_batch_info`;
CREATE TABLE `stock_batch_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_no` varchar(64) NOT NULL COMMENT '批次号',
  `sku_code` varchar(20) NOT NULL COMMENT '商品编码',
  `owner_code` varchar(64) NOT NULL COMMENT '货主编码',
  `lot_id` int(11) NOT NULL COMMENT '批次id',
  `lot_attr_code1` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code2` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code3` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code4` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code5` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code6` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code7` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code8` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code9` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code10` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code11` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  `lot_attr_code12` varchar(50) DEFAULT NULL COMMENT '属性编码 lotAttr01-lotAttr12 12个属性值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='批次信息表';

-- ----------------------------
-- Table structure for sys_dept
-- ----------------------------
DROP TABLE IF EXISTS `sys_dept`;
CREATE TABLE `sys_dept` (
  `DEPT_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `PARENT_ID` bigint(20) NOT NULL COMMENT '上级部门ID',
  `DEPT_NAME` varchar(100) NOT NULL COMMENT '部门名称',
  `ORDER_NUM` bigint(20) DEFAULT NULL COMMENT '排序',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`DEPT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `MENU_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单/按钮ID',
  `PARENT_ID` bigint(20) NOT NULL COMMENT '上级菜单ID',
  `MENU_NAME` varchar(50) NOT NULL COMMENT '菜单/按钮名称',
  `URL` varchar(100) DEFAULT NULL COMMENT '菜单URL',
  `PERMS` text COMMENT '权限标识',
  `ICON` varchar(50) DEFAULT NULL COMMENT '图标',
  `TYPE` char(2) NOT NULL COMMENT '类型 0菜单 1按钮',
  `ORDER_NUM` bigint(20) DEFAULT NULL COMMENT '排序',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=115 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `ROLE_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `ROLE_NAME` varchar(100) NOT NULL COMMENT '角色名称',
  `REMARK` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `CREATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `ROLE_ID` bigint(20) NOT NULL COMMENT '角色ID',
  `MENU_ID` bigint(20) NOT NULL COMMENT '菜单/按钮ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `USER_ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USERNAME` varchar(50) NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(128) NOT NULL COMMENT '密码',
  `DEPT_ID` bigint(20) DEFAULT NULL COMMENT '部门ID',
  `EMAIL` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `STATUS` char(1) NOT NULL COMMENT '状态 0锁定 1有效',
  `CRATE_TIME` datetime NOT NULL COMMENT '创建时间',
  `MODIFY_TIME` datetime DEFAULT NULL COMMENT '修改时间',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL COMMENT '最近访问时间',
  `SSEX` char(1) DEFAULT NULL COMMENT '性别 0男 1女',
  `THEME` varchar(10) DEFAULT NULL COMMENT '主题',
  `AVATAR` varchar(100) DEFAULT NULL COMMENT '头像',
  `DESCRIPTION` varchar(100) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=168 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USER_ID` bigint(20) NOT NULL COMMENT '用户ID',
  `ROLE_ID` bigint(20) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
