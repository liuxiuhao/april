/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2019/8/5 19:39:05                            */
/*==============================================================*/


/*==============================================================*/
/* Table: basic_customer                                        */
/*==============================================================*/
create table basic_customer
(
   id                   int(11) not null auto_increment,
   customer_code        varchar(32) not null comment '客户编码',
   customer_name        varchar(64) not null comment '客户名称',
   customer_type        tinyint(4) not null default 0 comment '客户类型 1：货主 2：供应商 3：客户 4：承运商',
   tel                  varchar(20) not null comment '联系电话',
   province             varchar(20) comment '省份',
   city                 varchar(50) comment '市',
   area                 varchar(50) comment '区',
   address              varchar(200) comment '地址',
   reserve1             varchar(50) comment '区',
   reserve2             varchar(50) comment '区',
   reserve3             varchar(50) comment '区',
   reserve4             varchar(50) comment '区',
   reserve5             varchar(50) comment '区',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_customer comment '客户信息表';

/*==============================================================*/
/* Table: basic_lot_detail                                      */
/*==============================================================*/
create table basic_lot_detail
(
   id                   int(11) not null,
   lot_id               int(11) not null comment '批次id',
   lot_attr_code        varchar(32) not null comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_name        varchar(64) not null comment '属性名字',
   input_type           tinyint(4) not null default 0 comment '输入控制 0:必输 1:只读 2:可选 3:禁用 如果只读则设置 lot_attr_value 值',
   lot_attr_type        tinyint(4) not null default 0 comment '属性类型 1:文本 2:下拉 3:日期 4:日期时间 5:数字',
   lot_attr_value       varchar(200) not null default '0' comment '属性选项 如果属性格式为下拉则用于配置枚举类型，如：正品/残次品，是否;如果输入控制为必输则设置对应的默认值',
   is_batch             tinyint(4) not null default 0 comment '是否为批次号属性:0:否 1:是
            根据批次属性组合生成 唯一批次号',
   remark               varchar(64) comment '备注',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_lot_detail comment '批次明细表';

/*==============================================================*/
/* Table: basic_lot_info                                        */
/*==============================================================*/
create table basic_lot_info
(
   id                   int(11) not null auto_increment,
   lot_name             varchar(64) not null comment '批次名称',
   is_defalut           tinyint(4) not null default 0 comment '是否默认',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_lot_info comment '批次信息表';

/*==============================================================*/
/* Table: basic_lot_tactics                                     */
/*==============================================================*/
create table basic_lot_tactics
(
   id                   int(11) not null,
   lot_id               int(11) not null comment '批次id',
   lot_tactics_name     varchar(64) not null comment '策略名称',
   remark               varchar(200) not null comment '备注',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_lot_tactics comment '批次策略表';

/*==============================================================*/
/* Table: basic_lot_tactics_detail                              */
/*==============================================================*/
create table basic_lot_tactics_detail
(
   id                   int(11) not null,
   lot_tactics_id       int(11) not null comment '批次策略id',
   lot_attr_code        varchar(32) not null comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   exec_seq             int(11) not null comment '执行序列号',
   desc_asc             varchar(10) not null comment '升序降序',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_lot_tactics_detail comment '批次策略明细表';

/*==============================================================*/
/* Table: basic_package                                         */
/*==============================================================*/
create table basic_package
(
   id                   int(11) not null auto_increment,
   package_code         varchar(32) not null comment '包装代码',
   package_desc         varchar(200) not null comment '包装描述',
   single               numeric(12,4) not null comment '单品',
   box                  numeric(12,4) not null comment '箱',
   palet                numeric(12,4) not null comment '托盘',
   weight               numeric(12,6) not null comment '单品重量 重量 kg',
   length               numeric(12,6) not null comment '单品长度',
   width                numeric(12,6) not null comment '单品宽度',
   height               numeric(12,6) not null comment '单品高度',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_package comment '包装表';

/*==============================================================*/
/* Table: basic_sku_info                                        */
/*==============================================================*/
create table basic_sku_info
(
   id                   int(11) not null auto_increment,
   sku_code             varchar(32) not null comment '商品编码',
   sku_name             varchar(64) not null comment '商品名称',
   package_code         varchar(32) not null comment '包装代码',
   lot_id               int(11) not null comment '批次id',
   put_rule_id          int(11) comment '上架规则id
            ',
   replenishment_rule_id int(11) comment '补货规则id',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_sku_info comment '商品表';

/*==============================================================*/
/* Table: basic_warehouse_area                                  */
/*==============================================================*/
create table basic_warehouse_area
(
   id                   int(11) not null auto_increment,
   warehouse_area_code  varchar(20) not null comment '库区编码',
   warehouse_area_name  varchar(20) not null comment '库区名称',
   warehouse_code       varchar(20) not null comment '仓库编码',
   is_virtual           tinyint(4) not null comment '0:否
            1:是
            ',
   warehouse_area_nature tinyint(4) not null comment '库区性质:
            1:存储区
            2:残次品区
            3:退货区
            ',
   in_lock              tinyint(4) not null comment '入库锁:0 正常 1:锁定',
   out_lock             tinyint(4) not null comment '0：正常
            1：出库锁定',
   warehouse_area_desc  varchar(255) comment '库区描述',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_warehouse_area comment '库区表';

/*==============================================================*/
/* Index: uk_warehouse_area_code                                */
/*==============================================================*/
create unique index uk_warehouse_area_code on basic_warehouse_area
(
   warehouse_code,
   warehouse_area_code
);

/*==============================================================*/
/* Table: basic_warehouse_space                                 */
/*==============================================================*/
create table basic_warehouse_space
(
   id                   int(11) not null auto_increment,
   warehouse_code       varchar(20) not null comment '仓库编码',
   warehouse_area_code  varchar(20) not null comment '库区编码',
   warehouse_space_code varchar(20) not null comment '库位编码',
   warehouse_space_platoon int not null comment '库位排',
   warehouse_space_column int not null comment '库位列',
   warehouse_space_floor int comment '库位层',
   length               numeric(12,4) comment '长度',
   width                numeric(12,4) comment '宽度',
   height               numeric(12,4) comment '高度',
   warehouse_space_status tinyint(4) not null comment '库位状态
            0：空库位
            1：有货
            99：禁用',
   load_volume          numeric(12,4) not null comment '承载体积',
   load_born            numeric(12,4) not null comment '承载重量',
   pick_route           int(11) comment '拣货路径',
   in_lock              tinyint(4) not null comment '入库锁:0 正常 1:锁定',
   out_lock             tinyint(4) not null comment '0：正常
            1：出库锁定',
   put_type             tinyint(4) not null default 2 comment '上架类型
            1:只能分配一次
            2:可分配多次',
   pick_type            tinyint(4) not null default 2 comment '拣货类型
            1:只能分配一次
            2:可分配多次',
   is_lot               tinyint(4) not null default 0 comment '是否混发批次数 0：否 1：是',
   lot_num              int not null default 1 comment '混发批次数 默认1',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table basic_warehouse_space comment '库位表';

/*==============================================================*/
/* Index: uk_warehouse_space_code                               */
/*==============================================================*/
create unique index uk_warehouse_space_code on basic_warehouse_space
(
   warehouse_code,
   warehouse_area_code,
   warehouse_space_code
);

/*==============================================================*/
/* Table: busi_interface_log                                    */
/*==============================================================*/
create table busi_interface_log
(
   id                   int(11) not null auto_increment,
   interface_path       varchar(50) not null comment '接口名称',
   order_code           varchar(20) comment '业务单号',
   request_type         int(11) not null comment '1:SHARK->TIGER
            2:TIGER->SHARK
            ',
   request_time         datetime not null comment '请求时间',
   request_body         text not null comment '请求报文',
   http_status          varchar(10) comment '请求状态',
   is_success           int(11) comment '是否处理成功',
   response_time        datetime comment '响应时间',
   reponse_boby         text comment '响应报文',
   reset_count          int(11) comment '重试次数',
   primary key (id)
);

alter table busi_interface_log comment '接口日志表';

/*==============================================================*/
/* Table: check_order                                           */
/*==============================================================*/
create table check_order
(
   id                   int(11) not null auto_increment,
   warehouse_code       varchar(20)  not null comment '仓库编码',
   receive_order_code   varchar(32) not null comment '收货单号',
   order_code           varchar(20) not null comment '质检单号',
   execute_status       tinyint(4) not null comment '执行状态
            0:未执行
            1:部分执行
            2:全部执行
            ',
   owner_code           varchar(20) not null comment '货主编码',
   owner_name           varchar(32) not null comment '货主名称',
   provider_code        varchar(20) not null comment '供应商编码',
   provider_name        varchar(32) not null comment '供应商名称',
   check_name           varchar(32) comment '质检人',
   check_dept           varchar(32) comment '质检部门',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table check_order comment '质检单';

/*==============================================================*/
/* Table: check_order_detail                                    */
/*==============================================================*/
create table check_order_detail
(
   id                   int(11) not null,
   order_code           varchar(20) not null comment '质检单号',
   receive_order_code   varchar(32) not null comment '收货单号',
   busi_index           varchar(20) not null comment '对应计划单的业务系统明细序号busi_index',
   sku_code             varchar(20) not null comment '商品编码',
   sku_name             varchar(256) comment '商品名称',
   batch_no             varchar(20) not null comment '批号:与单据明细里的批号一致',
   receive_qty          decimal(12,4) not null default 0.0 comment '收货数量  默认0.0000',
   check_qty            decimal(12,4) not null default 0.0 comment '质检数量 默认0.0000',
   bad_qty              decimal(12,4) default 0.0 comment '不良数量 默认0.0000',
   check_result         tinyint(4) not null default 0 comment '质检结果：0:待检 1:不合格 2:合格',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   lot_id               int(11) not null comment '批次id',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   primary key (id)
);

alter table check_order_detail comment '质检单明细表';

/*==============================================================*/
/* Table: in_warehouse_job                                      */
/*==============================================================*/
create table in_warehouse_job
(
   id                   int(11) not null auto_increment,
   job_type             tinyint(4) not null comment ' 作业类型：1：收货作业 2：上架作业 3：移库入库作业',
   warehouse_code       varchar(20) not null comment '仓库编码',
   warehouse_area_code  varchar(20) not null comment '库区编码',
   warehouse_space_code varchar(20) not null comment '库位编码',
   source_order_code    varchar(32) not null comment '来源单号',
   source_order_detail_id int(11) comment '入库单id:根据作业创建入库单后反写过来',
   in_order_id          int(11) comment '入库单id:根据作业创建入库单后反写过来（上架作业才有）',
   in_order_detail_id   int(11) comment '入库单明细id:根据作业创建入库单后反写过来',
   is_create_order      tinyint(4) not null default 0 comment '是否已生成入库单:0:未生成
            1:已生成',
   job_status           tinyint(4) not null comment ' 作业状态:0-新建 1.未执行 2.待执行 3.正执行 4.完成 5.作废 6.异常作业 8.暂停作业
            一期:全部为 “完成” 状态',
   tray_code            varchar(32),
   sku_code             varchar(20) not null comment '商品编码',
   owner_code           varchar(32) not null comment '货主',
   batch_no             varchar(64) not null comment '批号:与单据明细里的批号一致',
   lot_id               int(11) not null comment '批次id',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   sku_name             varchar(256) comment '商品名称',
   job_qty              decimal(12,4) not null comment '上架数量',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table in_warehouse_job comment '入库作业表';

/*==============================================================*/
/* Table: in_warehouse_order                                    */
/*==============================================================*/
create table in_warehouse_order
(
   id                   int(11) not null auto_increment,
   order_code           varchar(20) not null comment '入库单号',
   order_type           tinyint(4) not null comment '业务类型/单据类型 11:采购入库 12：销售退货入库',
   order_status         tinyint(4) not null comment '0:草稿
            1:待审
            2:审核通过
            3:驳回
            一期只有 审核通过
            ',
   warehouse_code       varchar(20)  not null comment '仓库编码',
   plan_code            varchar(32) not null,
   owner_code           varchar(20) not null comment '货主',
   owner_name           varchar(32) not null comment '货主名称',
   provider_code        varchar(20) comment '货主',
   provider_name        varchar(32) comment '货主',
   is_push              tinyint(4) not null default 0 comment '是否已推送给交付系统
            0:未推送
            1:已推送',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table in_warehouse_order comment '入库单';

/*==============================================================*/
/* Index: uk_order_code                                         */
/*==============================================================*/
create unique index uk_order_code on in_warehouse_order
(
   order_code
);

/*==============================================================*/
/* Table: in_warehouse_order_detail                             */
/*==============================================================*/
create table in_warehouse_order_detail
(
   id                   int(11) not null auto_increment,
   order_id             int not null comment '入库单id',
   plan_line_no         int(11) not null,
   sku_code             varchar(20) not null comment '商品编码',
   sku_name             varchar(256) comment '商品名称',
   batch_no             varchar(20) not null comment '批号:与单据明细里的批号一致',
   lot_id               int(11) not null comment '批次id',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   in_qty               decimal(12,4) not null default 0.0 comment '入库数量',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table in_warehouse_order_detail comment '入库单明细表';

/*==============================================================*/
/* Table: in_warehouse_plan                                     */
/*==============================================================*/
create table in_warehouse_plan
(
   id                   int not null auto_increment,
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   plan_code            varchar(32)  comment '计划单号',
   plan_type            tinyint(4) not null comment '单据类型',
   plan_warehouse_code  varchar(20)  comment '计划仓库编码',
   owner_code           varchar(32) not null comment '货主',
   owner_name           varchar(64) comment '货主名称',
   provider_code        varchar(32) comment '供应商编码',
   provider_name        varchar(64) comment '供应商名称',
   arrive_start_time    datetime not null comment '预计到货时间(from)',
   arrive_start_time2   datetime not null comment '预计到货时间(to)',
   order_status         tinyint(4) not null default 0 comment '单据状态:0新建 1:已审核 2:已驳回',
   from_sys_code        varchar(20) not null comment '来源系统
            tiger',
   reason               varchar(256) comment '订单取消审核的审核说明，如：为何不同意取消',
   primary key (id)
);

/*==============================================================*/
/* Table: in_warehouse_plan_detail                              */
/*==============================================================*/
create table in_warehouse_plan_detail
(
   id                   int not null auto_increment,
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   plan_id              int(11),
   plan_code            varchar(32)  not null,
   plan_line_no         int(11) not null,
   sku_code             varchar(20) not null comment '商品编码',
   sku_name             varchar(256) comment '商品名称',
   plan_in_qty          decimal(12,4) not null comment '计划入库数量',
   remark_info          varchar(255),
   primary key (id)
);

/*==============================================================*/
/* Table: inventory_order                                       */
/*==============================================================*/
create table inventory_order
(
   id                   int(11) not null auto_increment,
   warehouse_code       varchar(20)  not null comment '仓库编码',
   order_code           varchar(20) not null comment '质检单号',
   execute_status       tinyint(4) not null comment '执行状态
            0:未执行
            1:部分执行
            2:全部执行
            ',
   creater_name         varchar(20) not null comment '创建人名称',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   inventory_name       int not null comment '创建人',
   primary key (id)
);

alter table inventory_order comment '盘点单';

/*==============================================================*/
/* Index: uk_order_code                                         */
/*==============================================================*/
create unique index uk_order_code on inventory_order
(
   order_code
);

/*==============================================================*/
/* Table: inventory_order_detail                                */
/*==============================================================*/
create table inventory_order_detail
(
   id                   int(11) not null,
   inventory_order_code varchar(20) not null comment '质检单号',
   stock_id             int(11) not null,
   sku_code             varchar(20) not null comment '商品编码',
   sku_name             varchar(256) comment '商品名称',
   batch_no             varchar(20) not null comment '批号:与单据明细里的批号一致',
   stock_qty            decimal(12,4) not null default 0.0 comment '收货数量  默认0.0000',
   inventory_qty        decimal(12,4) not null default 0.0 comment '质检数量 默认0.0000',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   batch_no2            varchar(64) not null comment '批次号',
   owner_code           varchar(64) not null comment '货主编码',
   lot_id               int(11) not null comment '批次id',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   primary key (id)
);

alter table inventory_order_detail comment '盘点单明细';

/*==============================================================*/
/* Table: logistics_order                                       */
/*==============================================================*/
create table logistics_order
(
   id                   int(11) not null auto_increment,
   warehouse_code       varchar(20)  not null comment '仓库编码',
   owner_name           varchar(32) not null comment '货主',
   order_code           varchar(32) not null comment '入库单号',
   receiver             varchar(10) not null comment '收货人',
   receive_address      varchar(200) not null comment '收货地址',
   link_tel             varchar(20) comment '收货人联系电话',
   logistics_com_code   varchar(64) not null comment '物流公司编码',
   logistics_order_code varchar(64) not null comment '物流单号',
   logistics_status     tinyint(1) not null default 0 comment '物流状态（配送状态）：0-已出库；1-配送中；2-已完成',
   freight_amt          decimal(12,4) default 0.0000 comment '运费',
   other_amt            decimal(12,4) default 0.0000 comment '其他费用',
   pay_type             tinyint(4) not null comment '付费方式：0:我方付
            1:客户付',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table logistics_order comment '配送信息表';

/*==============================================================*/
/* Table: logistics_order_detail                                */
/*==============================================================*/
create table logistics_order_detail
(
   id                   int(11) not null,
   logistics_order_code varchar(32) not null comment '物流单号',
   out_order_code       varchar(32) not null comment '出库单号',
   out_order_detail_id  int(11) not null,
   sku_code             varchar(20) not null comment '商品编码',
   batch_no             varchar(64) not null comment '批次号',
   lot_id               int(11) not null comment '批次id',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   carrier_qty          int(12) not null default 0 comment '件数',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table logistics_order_detail comment '配送单明细表';

/*==============================================================*/
/* Table: out_warehouse_job                                     */
/*==============================================================*/
create table out_warehouse_job
(
   id                   int(11) not null,
   pick_order_code      varchar(20) not null comment '拣货单号',
   warehouse_code       varchar(20) not null comment '仓库编码',
   s_warehouse_area_code varchar(20) not null comment '源库区编码',
   s_warehouse_space_code varchar(20) not null comment '源库位编码',
   t_warehouse_area_code varchar(20) comment '目标库区编码(移库时用)',
   t_warehouse_space_code varchar(20) comment '目标源库位编码(移库时用)',
   stock_Id             int not null comment '库存id,出库时必填',
   tray_code            varchar(20) not null comment '托盘条码',
   job_status           tinyint(4) not null comment ' 作业状态:0-新建 1.未执行 2.待执行 3.正执行 4.完成 5.作废 6.异常作业 8.暂停作业
            一期:全部为 “完成” 状态',
   remark_info          varchar(256) comment '备注',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table out_warehouse_job comment '出库作业表';

/*==============================================================*/
/* Table: out_warehouse_job_detail                              */
/*==============================================================*/
create table out_warehouse_job_detail
(
   id                   int(11) not null,
   out_job_id           int(11) not null,
   out_order_code       varchar(32) comment '根据拣货单生成出库单后，回写该字段',
   out_order_detail_id  int(11) comment '根据拣货单生成出库单后，回写该字段',
   sku_code             varchar(32) not null comment '商品编码',
   owner_code           varchar(32) not null comment '货主编码',
   lot_id               int(11) not null comment '批次id',
   batch_no             varchar(64) not null comment '批次号',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   assign_qty           decimal(12,4) not null comment '分配数量',
   job_qty              decimal(12,4) not null comment '分配数量',
   real_job_qty         decimal(12,4) not null comment '实际拣货数量(复核数量)',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table out_warehouse_job_detail comment '出库作业明细';

/*==============================================================*/
/* Table: out_warehouse_order                                   */
/*==============================================================*/
create table out_warehouse_order
(
   id                   int not null,
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   order_code           varchar(32)  comment '计划单号',
   order_status         tinyint(4) not null default 0 comment '单据状态:0新建 1:已审核 2:出库分配 3:出库执行 4:发货确认 9:作废',
   out_plan_code        varchar(32)  comment '计划单号',
   order_type           tinyint(4) not null comment '单据类型',
   warehouse_code       varchar(20)  comment '计划仓库编码',
   owner_code           varchar(32) not null comment '货主',
   owner_name           varchar(64) comment '货主名称',
   customer_code        varchar(32) comment '供应商编码',
   customer_name        varchar(64) comment '供应商名称',
   order_time           datetime not null comment '修改时间',
   plan_start_time      datetime comment '修改时间',
   plan_end_time        datetime comment '修改时间',
   arrival_link_name    varchar(45) comment '联系人',
   arrival_link_tel     varchar(45) comment '联系电话',
   arrival_address      varchar(255) comment '联系地址',
   from_sys_code        varchar(20) not null comment '来源系统
            tiger',
   reason               varchar(256) comment '订单取消审核的审核说明，如：为何不同意取消'
);

alter table out_warehouse_order comment '出库单';

/*==============================================================*/
/* Table: out_warehouse_order_detail                            */
/*==============================================================*/
create table out_warehouse_order_detail
(
   id                   int(11) not null auto_increment,
   out_id               int,
   order_id             int comment '出库单id',
   out_order_code       varchar(32) not null comment '出库单号',
   batch_no             varchar(32) comment '批次号',
   out_plan_line_no     int(11) not null,
   sku_code             varchar(20) not null comment '商品编码',
   sku_name             varchar(256) comment '商品名称',
   lot_id               int(11) not null comment '批次id,通过商品信息反写过来方便显示',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   plan_out_qty         decimal(12,4) not null comment '本次开单数量
            ',
   real_out_qty         decimal(12,4) comment '实际出库数量',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table out_warehouse_order_detail comment '出库单明细表';

/*==============================================================*/
/* Table: out_warehouse_plan                                    */
/*==============================================================*/
create table out_warehouse_plan
(
   id                   int not null,
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   plan_code            varchar(32)  comment '计划单号',
   plan_type            tinyint(4) not null comment '单据类型',
   plan_warehouse_code  varchar(20)  comment '计划仓库编码',
   owner_code           varchar(32) not null comment '货主',
   owner_name           varchar(64) comment '货主名称',
   customer_code        varchar(32) comment '供应商编码',
   customer_name        varchar(64) comment '供应商名称',
   order_time           datetime not null comment '修改时间',
   plan_start_time      datetime comment '修改时间',
   plan_end_time        datetime comment '修改时间',
   arrival_link_name    varchar(45) comment '联系人',
   arrival_link_tel     varchar(45) comment '联系电话',
   arrival_address      varchar(255) comment '联系地址',
   order_status         tinyint(4) not null default 0 comment '单据状态:0新建 1:已审核 2:已驳回',
   from_sys_code        varchar(20) not null comment '来源系统
            tiger',
   reason               varchar(256) comment '订单取消审核的审核说明，如：为何不同意取消'
);

/*==============================================================*/
/* Table: out_warehouse_plan_detail                             */
/*==============================================================*/
create table out_warehouse_plan_detail
(
   id                   int not null,
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   plan_id              int(11),
   plan_code            varchar(32)  not null,
   plan_line_no         int(11) not null,
   sku_code             varchar(20) not null comment '商品编码',
   sku_name             varchar(256) comment '商品名称',
   batch_no             varchar(64) not null comment '批次号',
   plan_out_qty         decimal(12,4) not null comment '计划入库数量',
   remark_info          varchar(255),
   primary key (id)
);

alter table out_warehouse_plan_detail comment '出库计划明细表';

/*==============================================================*/
/* Table: pick_order                                            */
/*==============================================================*/
create table pick_order
(
   id                   int(11) not null auto_increment,
   order_code           varchar(20) not null comment '拣货单号',
   pick_type            tinyint(4) not null comment '拣货方式:0:按单拣货
            1:集中拣货',
   order_status         tinyint(4) not null comment '单据状态：0未执行;1执行中;2执行完成3终止',
   warehouse_code       varchar(10) not null comment '仓库编码',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table pick_order comment '拣货单';

/*==============================================================*/
/* Index: uk_order_code                                         */
/*==============================================================*/
create unique index uk_order_code on pick_order
(
   order_code
);

/*==============================================================*/
/* Table: receive_order                                         */
/*==============================================================*/
create table receive_order
(
   id                   int(11) not null auto_increment,
   order_code           varchar(32) not null comment '收货单号',
   order_type           tinyint(4) not null comment '收货单类型 11:采购入库收货 12：销售退货入库收货',
   order_status         tinyint(4) not null comment '0:草稿
            1:待审
            2:审核通过
            3:驳回
            一期只有 审核通过
            ',
   plan_code            varchar(32) not null comment '入库计划单',
   warehouse_code       varchar(20)  not null comment '仓库编码',
   owner_code           varchar(32) not null comment '货主',
   owner_name           varchar(64) comment '货主名称',
   provider_code        varchar(20) comment '供应商编码',
   provider_name        varchar(32) comment '供应商名称',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table receive_order comment '收货单';

/*==============================================================*/
/* Table: receive_order_detail                                  */
/*==============================================================*/
create table receive_order_detail
(
   id                   int(11) not null auto_increment,
   order_code           varchar(32) not null comment '收货单号',
   in_plan_line_no      int(11) not null,
   lot_id               int(11) not null comment '批次id',
   batch_no             varchar(32) not null comment '批次号:创建收库单的同时生成批次号',
   sku_code             varchar(20) not null comment '商品编码',
   sku_name             varchar(256) comment '商品名称',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   receive_qty          decimal(12,4) not null default 0.0 comment '收货数量',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   is_delete            tinyint(4) not null default 0 comment '是否删除 0 : 未删除  1：已删除',
   primary key (id)
);

alter table receive_order_detail comment '收货单明细表';

/*==============================================================*/
/* Table: sku_space_stock                                       */
/*==============================================================*/
create table sku_space_stock
(
   id                   int(11) not null auto_increment,
   warehouse_code       varchar(20) not null comment '仓库编码',
   warehouse_area_code  varchar(20) not null comment '库区编码',
   warehouse_space_code varchar(32) not null comment '库位编码',
   tray_code            varchar(20) not null comment '托盘条码',
   owner_code           varchar(32) not null comment '货主',
   sku_code             varchar(20) not null comment '商品编码',
   sku_name             varchar(256) comment '商品名称',
   lot_id               int(11) not null comment '批次id',
   batch_no             varchar(20) not null comment '批号:与单据明细里的批号一致',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   stock_status         tinyint(4) not null default 0 comment '库存状态:0:未分配 1:已分配',
   sku_qty              decimal(12,4) not null comment '库存数量',
   block_qty            decimal(12,4) comment '冻结数量',
   gmt_create           datetime not null comment '创建时间',
   gmt_modify           datetime not null comment '修改时间',
   data_version         int not null default 0 comment '数据版本',
   creater_id           int not null comment '创建人',
   creater_name         varchar(20) not null comment '创建人名称',
   modifier_id          int not null comment '修改人',
   modifier_name        varchar(20) not null comment '修改人名称',
   primary key (id)
);

alter table sku_space_stock comment '库位库存表';

/*==============================================================*/
/* Table: stock_batch_info                                      */
/*==============================================================*/
create table stock_batch_info
(
   id                   int not null auto_increment,
   batch_no             varchar(64) not null comment '批次号',
   sku_code             varchar(20) not null comment '商品编码',
   owner_code           varchar(64) not null comment '货主编码',
   lot_id               int(11) not null comment '批次id',
   lot_attr_code1       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code2       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code3       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code4       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code5       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code6       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code7       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code8       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code9       varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code10      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code11      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   lot_attr_code12      varchar(50) comment '属性编码 lotAttr01-lotAttr12 12个属性值',
   primary key (id)
);

alter table stock_batch_info comment '批次信息表';

