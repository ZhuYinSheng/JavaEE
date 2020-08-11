CREATE TABLE `administrator` (
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `pwd` varchar(20) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`name`)
);

CREATE TABLE aucInfor (
  `name` varchar(20) NOT NULL COMMENT '名称',
  pwd varchar(20) DEFAULT NULL COMMENT '密码',
  startPri float(20,0) DEFAULT NULL COMMENT '起拍价',
  reservePri float(20,0) DEFAULT NULL COMMENT '底价',
  `start` datetime DEFAULT NULL COMMENT '开始时间',
  `end` datetime DEFAULT NULL COMMENT '结束时间',
  dec varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`name`)
);

CREATE TABLE auctioning (
  `name` varchar(20) NOT NULL COMMENT '名称',
  `start` datetime DEFAULT NULL COMMENT '开始时间',
  `end` datetime DEFAULT NULL COMMENT '结束时间',
  startPri float(20,0) DEFAULT NULL COMMENT '起拍价',
  record varchar(255) DEFAULT NULL COMMENT '出价记录',
  PRIMARY KEY (`name`)
);

CREATE TABLE register (
  `name` varchar(20) NOT NULL COMMENT '用户名',
  pwd varchar(20) DEFAULT NULL COMMENT '密码',
  idNum int DEFAULT NULL COMMENT '身份证号',
  phone int DEFAULT NULL COMMENT '电话',
  address varchar(255) DEFAULT NULL COMMENT '住址',
  posCode int DEFAULT NULL COMMENT '邮政编码',
  PRIMARY KEY (`name`)
);

CREATE TABLE result (
  `name` varchar(255) NOT NULL COMMENT '名称',
  startPri float(20,0) DEFAULT NULL COMMENT '起拍价',
  reservePri float(20,0) DEFAULT NULL COMMENT '底价',
  buyer varchar(255) DEFAULT NULL COMMENT '买家',
  PRIMARY KEY (`name`)
);