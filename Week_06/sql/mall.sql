use mall;
drop table if exists t_customer;
create  table t_customer
(
    customer_id bigint(32) unsigned auto_increment comment '主键ID' primary key ,
    name        varchar(120) not null comment '客户名称' unique,
    age         int               default 0 not null comment '年龄',
    create_time timestamp    null default null comment '创建时间'
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
    comment '客户信息表';

drop table if exists t_goods;
create  table t_goods
(
    goods_id    bigint(32) unsigned auto_increment comment '主键ID' primary key,
    name        varchar(120)   not null comment '商品名称' unique,
    cost_price  decimal(10, 2) null comment '商品成本价格，单位为元',
    sale_price  decimal(10, 2) null comment '商品销售价格，单位为元',
    stock_num   bigint(32) default 0 comment '库存数量',
    remark      varchar(255)   null comment '备注',
    create_time timestamp      null comment '创建时间'
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
    comment '商品信息表';

drop table if exists t_order;
create  table t_order
(
    order_id      bigint(32) unsigned auto_increment comment '主键ID' primary key,
    customer_id   bigint(32) unsigned not null comment '客户ID',
    all_amount    decimal(10, 2)      not null default 0 comment '订单总金额',
    actual_amount decimal(10, 2)      not null default 0 comment '实际支付金额',
    status        tinyint(1)                   default b'0' not null comment '订单状态 0-新建 1-待支付 2-待发货 3-待配送 4-已收货 5-待退货 6-待退款 7-完成交易 8-已退货 ',
    pay_time      timestamp           null     default null comment '支付时间',
    remark        varchar(255)        null comment '备注',
    create_time   timestamp           not null default current_timestamp comment '创建时间'
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
    comment '订单信息表';

drop table if exists t_order_list;
create  table t_order_list
(
    list_id          bigint(32) unsigned auto_increment comment '主键ID' primary key,
    order_id         bigint(32) unsigned         not null comment '订单ID',
    goods_id         bigint(32) unsigned         not null comment '商品ID',
    goods_name       varchar(120)                null comment '商品名称',
    goods_sale_price decimal(10, 2) default 0    null comment '商品销售价格，单位为元',
    num              int            default 0    not null comment '数量',
    status           tinyint(1)     default b'0' not null comment '状态 0-待发货 1-已收货 2-待退货 3-已退货 '
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
    comment '订单明细表';
