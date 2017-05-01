/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : liubaolin

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-04-29 03:02:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attendance
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `aid` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(20) DEFAULT NULL,
  `late` int(11) DEFAULT '0' COMMENT '迟到次数',
  `leaveEarly` int(11) DEFAULT '0' COMMENT '早退次数',
  `absent` int(11) DEFAULT NULL,
  `attendance` int(11) DEFAULT NULL,
  `inTime` int(11) DEFAULT NULL,
  `outTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance
-- ----------------------------

-- ----------------------------
-- Table structure for candidate
-- ----------------------------
DROP TABLE IF EXISTS `candidate`;
CREATE TABLE `candidate` (
  `candidateId` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(20) DEFAULT NULL,
  `candidateName` varchar(50) DEFAULT '' COMMENT '申请人姓名',
  `department` varchar(100) DEFAULT '' COMMENT '申请部门',
  `position` varchar(50) DEFAULT '' COMMENT '申请职位',
  `candidateInfo` varchar(50) DEFAULT '' COMMENT '基本信息',
  `candidateMark` int(10) DEFAULT NULL COMMENT '标志',
  PRIMARY KEY (`candidateId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of candidate
-- ----------------------------

-- ----------------------------
-- Table structure for contract
-- ----------------------------
DROP TABLE IF EXISTS `contract`;
CREATE TABLE `contract` (
  `contractId` int(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `contractName` varchar(100) DEFAULT '',
  `contractType` varchar(50) DEFAULT '',
  `contractContect` text,
  PRIMARY KEY (`contractId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contract
-- ----------------------------

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `eid` int(20) NOT NULL,
  `userId` varchar(20) DEFAULT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `department` varchar(20) DEFAULT NULL,
  `position` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `userLevel` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------

-- ----------------------------
-- Table structure for personnelchange
-- ----------------------------
DROP TABLE IF EXISTS `personnelchange`;
CREATE TABLE `personnelchange` (
  `pcId` int(20) NOT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `changeReason` varchar(255) DEFAULT NULL,
  `doneMark` int(11) DEFAULT NULL,
  PRIMARY KEY (`pcId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of personnelchange
-- ----------------------------

-- ----------------------------
-- Table structure for recruitinfo
-- ----------------------------
DROP TABLE IF EXISTS `recruitinfo`;
CREATE TABLE `recruitinfo` (
  `recruitId` int(20) NOT NULL,
  `department` varchar(20) DEFAULT NULL,
  `position` varchar(20) DEFAULT NULL,
  `recruitStartTime` datetime DEFAULT NULL,
  `recruitNum` int(20) DEFAULT NULL,
  `recruitEndTime` datetime DEFAULT NULL,
  `republicTime` datetime DEFAULT NULL,
  PRIMARY KEY (`recruitId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of recruitinfo
-- ----------------------------

-- ----------------------------
-- Table structure for salary
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `sid` int(20) NOT NULL,
  `userName` decimal(20,2) DEFAULT NULL,
  `baseWage` decimal(20,2) DEFAULT NULL,
  `houseFund` decimal(20,2) DEFAULT NULL,
  `oldageFund` decimal(20,2) DEFAULT NULL,
  `medicalFund` decimal(20,2) DEFAULT NULL,
  `reimbursement` decimal(20,2) DEFAULT NULL,
  `unemploymentFund` decimal(20,2) DEFAULT NULL,
  `award` decimal(20,2) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of salary
-- ----------------------------

-- ----------------------------
-- Table structure for trainapply
-- ----------------------------
DROP TABLE IF EXISTS `trainapply`;
CREATE TABLE `trainapply` (
  `trainApplyId` int(20) NOT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `trainDirect` varchar(20) DEFAULT NULL,
  `trainLeader` varchar(20) DEFAULT NULL,
  `trainMark` int(11) DEFAULT NULL,
  `trainEvaluation` varchar(255) DEFAULT NULL,
  `trainFeedback` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`trainApplyId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trainapply
-- ----------------------------

-- ----------------------------
-- Table structure for trainplan
-- ----------------------------
DROP TABLE IF EXISTS `trainplan`;
CREATE TABLE `trainplan` (
  `trainPlanId` int(20) NOT NULL,
  `trainDirect` varchar(20) DEFAULT NULL,
  `trainObject` varchar(20) DEFAULT NULL,
  `trainContent` varchar(255) DEFAULT NULL,
  `trainStartTime` datetime DEFAULT NULL,
  `trainContinueTime` varchar(20) DEFAULT NULL,
  `trainInfo` varchar(100) DEFAULT NULL,
  `trainPlace` varchar(100) DEFAULT NULL,
  `trainPrice` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`trainPlanId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trainplan
-- ----------------------------
