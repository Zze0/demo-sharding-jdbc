# demo-sharding-jdbc

Project test please use ShardingJdbcApplicationTests class.

Problem description, please see: com.zze0.demo.shardingjdbc.service.impl.UserServiceImpl#testTransaction()

DDL：
-----------------------------------------------------------------------------
CREATE DATABASE IF NOT EXISTS zze0_demo;
USE zze0_demo;
DROP TABLE IF EXISTS `_user`;
CREATE TABLE `_user` (
  `fd_id` varchar(50) NOT NULL,
  `fd_name` varchar(255) DEFAULT NULL,
  `fd_pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE DATABASE IF NOT EXISTS zze0_demo_1;
USE zze0_demo_1;
DROP TABLE IF EXISTS `_user`;
CREATE TABLE `_user` (
  `fd_id` varchar(50) NOT NULL,
  `fd_name` varchar(255) DEFAULT NULL,
  `fd_pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`fd_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-----------------------------------------------------------------------------
