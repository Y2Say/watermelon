/*
Navicat MySQL Data Transfer

Source Server         : watermelon
Source Server Version : 50724
Source Host           : 127.0.0.1:3306
Source Database       : watermelon

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-06-05 16:01:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for schema_version
-- ----------------------------
DROP TABLE IF EXISTS `schema_version`;
CREATE TABLE `schema_version` (
  `installed_rank` int(11) NOT NULL,
  `version` varchar(50) DEFAULT NULL,
  `description` varchar(200) NOT NULL,
  `type` varchar(20) NOT NULL,
  `script` varchar(1000) NOT NULL,
  `checksum` int(11) DEFAULT NULL,
  `installed_by` varchar(100) NOT NULL,
  `installed_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `execution_time` int(11) NOT NULL,
  `success` tinyint(1) NOT NULL,
  PRIMARY KEY (`installed_rank`),
  KEY `schema_version_s_idx` (`success`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for watermelon_build
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_build`;
CREATE TABLE `watermelon_build` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `product` mediumint(8) unsigned NOT NULL DEFAULT '0',
  `branch` mediumint(8) unsigned NOT NULL DEFAULT '0',
  `project` mediumint(8) unsigned NOT NULL DEFAULT '0',
  `name` char(150) NOT NULL,
  `scmPath` char(255) NOT NULL,
  `filePath` char(255) NOT NULL,
  `date` date NOT NULL,
  `stories` text NOT NULL,
  `bugs` text NOT NULL,
  `builder` char(30) NOT NULL DEFAULT '',
  `desc` text NOT NULL,
  `deleted` enum('0','1') NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `build` (`product`,`project`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=75 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='版本表';

-- ----------------------------
-- Table structure for watermelon_collection
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_collection`;
CREATE TABLE `watermelon_collection` (
  `id` varchar(32) NOT NULL,
  `type` tinyint(3) DEFAULT NULL COMMENT '类型',
  `source_id` varchar(3032) DEFAULT '0' COMMENT '任务ID',
  `member_id` varchar(32) DEFAULT '' COMMENT '成员id',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='收藏表';

-- ----------------------------
-- Table structure for watermelon_department
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_department`;
CREATE TABLE `watermelon_department` (
  `id` varchar(32) NOT NULL,
  `organization_id` varchar(32) DEFAULT NULL COMMENT '组织编号',
  `name` varchar(32) DEFAULT NULL COMMENT '名称',
  `sort` int(4) DEFAULT '0' COMMENT '排序',
  `p_id` varchar(32) DEFAULT '' COMMENT '上级编号',
  `icon` varchar(20) DEFAULT NULL COMMENT '图标',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `path` varchar(255) DEFAULT NULL COMMENT '上级路径',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='部门表';

-- ----------------------------
-- Table structure for watermelon_department_member
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_department_member`;
CREATE TABLE `watermelon_department_member` (
  `id` varchar(32) NOT NULL,
  `department_id` varchar(32) DEFAULT '' COMMENT '部门id',
  `organization_id` varchar(32) DEFAULT '' COMMENT '组织id',
  `member_id` varchar(32) DEFAULT '' COMMENT '成员id',
  `join_time` datetime DEFAULT NULL COMMENT '加入时间',
  `is_principal` tinyint(1) DEFAULT NULL COMMENT '是否负责人',
  `is_owner` tinyint(1) DEFAULT '0' COMMENT '拥有者',
  `authorize` varchar(32) DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='部门-成员表';

-- ----------------------------
-- Table structure for watermelon_file
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_file`;
CREATE TABLE `watermelon_file` (
  `id` varchar(32) NOT NULL,
  `path_name` varchar(200) DEFAULT NULL COMMENT '相对路径',
  `title` varchar(64) DEFAULT NULL COMMENT '名称',
  `extension` varchar(32) DEFAULT NULL COMMENT '扩展名',
  `size` int(8) unsigned DEFAULT '0' COMMENT '文件大小',
  `object_type` tinyint(3) DEFAULT NULL COMMENT '对象类型',
  `organization_id` varchar(32) DEFAULT '' COMMENT '组织编码',
  `task_id` varchar(32) DEFAULT NULL COMMENT '任务编码',
  `project_id` varchar(32) DEFAULT NULL COMMENT '项目编码',
  `create_by` varchar(32) DEFAULT '' COMMENT '上传人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `downloads` int(8) unsigned DEFAULT '0' COMMENT '下载次数',
  `extra_info` varchar(255) DEFAULT NULL COMMENT '额外信息',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '删除标记',
  `file_url` text COMMENT '完整地址',
  `file_type` tinyint(3) DEFAULT NULL COMMENT '文件类型',
  `deleted_time` datetime DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=44 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='文件表';

-- ----------------------------
-- Table structure for watermelon_invite_link
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_invite_link`;
CREATE TABLE `watermelon_invite_link` (
  `id` varchar(32) NOT NULL,
  `create_by` varchar(32) DEFAULT NULL COMMENT '邀请人',
  `invite_type` tinyint(3) DEFAULT NULL COMMENT '链接类型',
  `source_id` varchar(32) DEFAULT NULL COMMENT '资源编码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `over_time` datetime DEFAULT NULL COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='邀请链接表';

-- ----------------------------
-- Table structure for watermelon_lock
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_lock`;
CREATE TABLE `watermelon_lock` (
  `p_id` varchar(32) NOT NULL COMMENT 'IP+TYPE',
  `p_value` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '次数',
  `expire_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '锁定截止时间',
  PRIMARY KEY (`p_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='防灌水表';

-- ----------------------------
-- Table structure for watermelon_mailqueue
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_mailqueue`;
CREATE TABLE `watermelon_mailqueue` (
  `id` varchar(32) NOT NULL,
  `to_list` varchar(255) DEFAULT NULL,
  `cc_list` varchar(255) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `body` text,
  `add_by` char(32) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `status` tinyint(3) DEFAULT NULL,
  `fail_reason` text,
  PRIMARY KEY (`id`) USING BTREE,
  KEY `sendTime` (`send_time`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=31858 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='邮件队列';

-- ----------------------------
-- Table structure for watermelon_member
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_member`;
CREATE TABLE `watermelon_member` (
  `id` varchar(32) NOT NULL COMMENT '系统前台用户表',
  `account` varchar(32) NOT NULL DEFAULT '' COMMENT '用户登陆账号',
  `password` varchar(32) DEFAULT '' COMMENT '登陆密码，32位加密串',
  `name` varchar(32) DEFAULT '' COMMENT '用户昵称',
  `mobile` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '手机',
  `real_name` varchar(32) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '真实姓名',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `status` tinyint(1) DEFAULT '0' COMMENT '状态',
  `last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `avatar` varchar(128) DEFAULT '' COMMENT '头像',
  `id_card` varchar(32) DEFAULT NULL COMMENT '身份证',
  `area_id` varchar(32) DEFAULT '0' COMMENT '区',
  `address` varchar(128) DEFAULT NULL COMMENT '所在地址',
  `remark` text CHARACTER SET utf8mb4 COMMENT '备注',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `organization_id` varchar(32) CHARACTER SET utf8mb4 DEFAULT '' COMMENT '所属组织',
  `department_id` varchar(32) CHARACTER SET utf8mb4 DEFAULT '' COMMENT '部门编号',
  `role_id` varchar(32) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '角色',
  `position` varchar(32) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '职位',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `username` (`account`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=589 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户表';

-- ----------------------------
-- Table structure for watermelon_notify
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_notify`;
CREATE TABLE `watermelon_notify` (
  `id` varchar(32) NOT NULL,
  `title` varchar(128) DEFAULT NULL COMMENT '标题',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `type` tinyint(3) DEFAULT NULL COMMENT '通知类型。通知：notice，消息：message，待办：task',
  `from_member` varchar(32) DEFAULT NULL COMMENT '发送人id',
  `to_member` varchar(32) DEFAULT NULL COMMENT '送达用户id',
  `create_time` datetime DEFAULT NULL COMMENT '生成时间',
  `is_read` tinyint(1) DEFAULT '0' COMMENT '是否已读',
  `read_time` datetime DEFAULT NULL COMMENT '阅读时间',
  `send_data` text COMMENT '关联数据',
  `finally_send_time` datetime DEFAULT NULL COMMENT '最终发送时间',
  `send_time` datetime DEFAULT NULL COMMENT '发送时间',
  `scene` tinyint(3) DEFAULT NULL COMMENT '场景：task，project',
  `terminal` tinyint(3) DEFAULT NULL COMMENT '推送终端。pc端：project，移动端：wap',
  `from_type` tinyint(3) DEFAULT NULL COMMENT '''project'',''system''',
  `avatar` varchar(200) DEFAULT NULL COMMENT '头像/图片',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=4325 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='动态通知表';

-- ----------------------------
-- Table structure for watermelon_organization
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_organization`;
CREATE TABLE `watermelon_organization` (
  `id` varchar(32) NOT NULL,
  `name` varchar(64) DEFAULT NULL COMMENT '名称',
  `avatar` varchar(255) DEFAULT NULL COMMENT '头像',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `owner_id` varchar(32) DEFAULT NULL COMMENT '拥有者',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_personal` tinyint(1) DEFAULT '0' COMMENT '是否个人项目',
  `address` varchar(128) DEFAULT NULL COMMENT '地址',
  `area_id` varchar(32) DEFAULT NULL COMMENT '区域',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='组织表';

-- ----------------------------
-- Table structure for watermelon_project
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project`;
CREATE TABLE `watermelon_project` (
  `id` varchar(32) NOT NULL,
  `cover` varchar(255) DEFAULT NULL COMMENT '封面',
  `name` varchar(32) DEFAULT NULL COMMENT '名称',
  `description` text COMMENT '描述',
  `access_control_type` tinyint(3) DEFAULT '0' COMMENT '访问控制l类型',
  `white_list` varchar(255) DEFAULT NULL COMMENT '可以访问项目的权限组（白名单）',
  `order` int(11) unsigned DEFAULT '0' COMMENT '排序',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '删除标记',
  `template_id` varchar(30) DEFAULT '' COMMENT '项目类型',
  `progress` double(5,2) DEFAULT '0.00' COMMENT '进度',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `organization_id` varchar(32) DEFAULT '' COMMENT '组织id',
  `deleted_time` datetime DEFAULT NULL COMMENT '删除时间',
  `is_private` tinyint(1) DEFAULT '1' COMMENT '是否私有',
  `prefix` varchar(10) DEFAULT NULL COMMENT '项目前缀',
  `open_prefix` tinyint(1) DEFAULT '0' COMMENT '是否开启项目前缀',
  `archive` tinyint(1) DEFAULT '0' COMMENT '是否归档',
  `archive_time` datetime DEFAULT NULL COMMENT '归档时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `project` (`order`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=13043 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='项目表';

-- ----------------------------
-- Table structure for watermelon_project_auth
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_auth`;
CREATE TABLE `watermelon_project_auth` (
  `id` varchar(32) NOT NULL,
  `title` varchar(20) NOT NULL COMMENT '权限名称',
  `status` tinyint(1) unsigned DEFAULT '1' COMMENT '状态(1:禁用,2:启用)',
  `sort` int(8) unsigned DEFAULT '0' COMMENT '排序权重',
  `description` varchar(255) DEFAULT NULL COMMENT '说明',
  `create_by` varchar(32) DEFAULT '0' COMMENT '创建人',
  `create_at` datetime DEFAULT NULL COMMENT '创建时间',
  `organization_id` varchar(30) DEFAULT '' COMMENT '所属组织',
  `is_default` tinyint(1) DEFAULT '0' COMMENT '是否默认',
  `type` tinyint(3) DEFAULT NULL COMMENT '权限类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='项目权限表';

-- ----------------------------
-- Table structure for watermelon_project_auth_node
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_auth_node`;
CREATE TABLE `watermelon_project_auth_node` (
  `id` varchar(32) NOT NULL,
  `auth_id` varchar(32) DEFAULT NULL COMMENT '角色ID',
  `node` varchar(128) DEFAULT NULL COMMENT '节点路径',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `index_system_auth_auth` (`auth_id`) USING BTREE,
  KEY `index_system_auth_node` (`node`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='项目角色与节点绑定';

-- ----------------------------
-- Table structure for watermelon_project_collection
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_collection`;
CREATE TABLE `watermelon_project_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_code` varchar(30) DEFAULT '' COMMENT '项目id',
  `member_code` varchar(30) DEFAULT '' COMMENT '成员id',
  `create_time` varchar(30) DEFAULT NULL COMMENT '加入时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='项目-收藏表';

-- ----------------------------
-- Table structure for watermelon_project_config
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_config`;
CREATE TABLE `watermelon_project_config` (
  `id` varchar(32) NOT NULL,
  `project_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='项目配置表';

-- ----------------------------
-- Table structure for watermelon_project_log
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_log`;
CREATE TABLE `watermelon_project_log` (
  `id` varchar(32) CHARACTER SET utf8mb4 NOT NULL,
  `member_id` varchar(30) DEFAULT NULL COMMENT '操作人id',
  `content` text COMMENT '操作内容',
  `remark` text,
  `type` tinyint(3) DEFAULT NULL COMMENT '操作类型',
  `create_time` datetime DEFAULT NULL COMMENT '添加时间',
  `source_id` varchar(32) DEFAULT '0' COMMENT '任务id',
  `scene_type` tinyint(3) DEFAULT NULL COMMENT '场景类型',
  `to_member_id` varchar(32) DEFAULT NULL,
  `is_comment` tinyint(1) DEFAULT '0' COMMENT '是否评论，0：否',
  `project_id` varchar(32) DEFAULT NULL,
  `icon` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='项目日志表';

-- ----------------------------
-- Table structure for watermelon_project_member
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_member`;
CREATE TABLE `watermelon_project_member` (
  `id` varchar(32) NOT NULL,
  `project_id` varchar(32) DEFAULT '' COMMENT '项目id',
  `member_id` varchar(32) DEFAULT '' COMMENT '成员id',
  `join_time` datetime DEFAULT NULL COMMENT '加入时间',
  `is_owner` varchar(32) DEFAULT NULL COMMENT '拥有者',
  `authorize` varchar(32) DEFAULT NULL COMMENT '角色',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='项目-成员表';

-- ----------------------------
-- Table structure for watermelon_project_menu
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_menu`;
CREATE TABLE `watermelon_project_menu` (
  `id` varchar(32) NOT NULL,
  `p_id` varchar(32) NOT NULL DEFAULT '0' COMMENT '父id',
  `title` varchar(100) NOT NULL DEFAULT '' COMMENT '名称',
  `icon` varchar(100) NOT NULL DEFAULT '' COMMENT '菜单图标',
  `url` varchar(400) NOT NULL DEFAULT '' COMMENT '链接',
  `file_path` varchar(200) DEFAULT NULL COMMENT '文件路径',
  `params` varchar(500) DEFAULT '' COMMENT '链接参数',
  `node` varchar(255) DEFAULT '#' COMMENT '权限节点',
  `sort` int(11) unsigned DEFAULT '0' COMMENT '菜单排序',
  `status` tinyint(1) unsigned DEFAULT '1' COMMENT '状态(0:禁用,1:启用)',
  `create_by` varchar(32) NOT NULL DEFAULT '0' COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_inner` tinyint(1) DEFAULT '0' COMMENT '是否内页',
  `param_value` varchar(255) DEFAULT NULL COMMENT '参数默认值',
  `show_slider` tinyint(1) DEFAULT '1' COMMENT '是否显示侧栏',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='项目菜单表';

-- ----------------------------
-- Table structure for watermelon_project_node
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_node`;
CREATE TABLE `watermelon_project_node` (
  `id` varchar(32) NOT NULL,
  `node` varchar(128) DEFAULT NULL COMMENT '节点代码',
  `title` varchar(128) DEFAULT NULL COMMENT '节点标题',
  `is_menu` tinyint(1) unsigned DEFAULT '0' COMMENT '是否可设置为菜单',
  `is_auth` tinyint(1) unsigned DEFAULT '1' COMMENT '是否启动RBAC权限控制',
  `is_login` tinyint(1) unsigned DEFAULT '1' COMMENT '是否启动登录控制',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `index_system_node_node` (`node`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='项目端节点表';

-- ----------------------------
-- Table structure for watermelon_project_template
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_project_template`;
CREATE TABLE `watermelon_project_template` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL COMMENT '类型名称',
  `description` text COMMENT '备注',
  `sort` tinyint(2) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  `organization_id` varchar(32) DEFAULT '' COMMENT '组织id',
  `cover` varchar(255) DEFAULT NULL COMMENT '封面',
  `member_id` varchar(32) DEFAULT '' COMMENT '创建人',
  `is_system` tinyint(1) DEFAULT '0' COMMENT '系统默认',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='项目类型表';

-- ----------------------------
-- Table structure for watermelon_source_link
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_source_link`;
CREATE TABLE `watermelon_source_link` (
  `id` varchar(32) NOT NULL,
  `source_type` tinyint(3) DEFAULT NULL COMMENT '资源类型',
  `source_id` varchar(32) DEFAULT NULL COMMENT '资源编号',
  `link_type` tinyint(3) DEFAULT NULL COMMENT '关联类型',
  `link_id` varchar(32) DEFAULT NULL COMMENT '关联编号',
  `organization_id` varchar(32) CHARACTER SET utf8 DEFAULT '' COMMENT '组织编码',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `sort` int(11) DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='资源关联表';

-- ----------------------------
-- Table structure for watermelon_system_config
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_system_config`;
CREATE TABLE `watermelon_system_config` (
  `id` varchar(32) NOT NULL,
  `name` varchar(100) DEFAULT NULL COMMENT '配置编码',
  `value` varchar(500) DEFAULT NULL COMMENT '配置值',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `index_system_config_name` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='系统参数配置';

-- ----------------------------
-- Table structure for watermelon_system_log
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_system_log`;
CREATE TABLE `watermelon_system_log` (
  `id` varchar(32) NOT NULL,
  `ip` varchar(32) DEFAULT '' COMMENT '操作者IP地址',
  `node` varchar(128) DEFAULT '' COMMENT '当前操作节点',
  `operator_id` varchar(32) DEFAULT '' COMMENT '操作人用户名',
  `operation` varchar(128) DEFAULT '' COMMENT '操作行为',
  `content` text COMMENT '操作内容描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='系统操作日志表';

-- ----------------------------
-- Table structure for watermelon_task
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_task`;
CREATE TABLE `watermelon_task` (
  `id` varchar(32) NOT NULL,
  `project_id` varchar(32) NOT NULL DEFAULT '' COMMENT '项目编号',
  `name` varchar(128) DEFAULT NULL,
  `emergency_level` tinyint(1) unsigned DEFAULT '0' COMMENT '紧急程度',
  `execute_status` enum('wait','doing','done','pause','cancel','closed') DEFAULT 'wait' COMMENT '执行状态',
  `description` text COMMENT '详情',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `assign_to` varchar(32) DEFAULT '' COMMENT '指派给谁',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '回收站',
  `stage_id` varchar(32) DEFAULT '' COMMENT '任务列表',
  `task_tag` varchar(128) DEFAULT NULL COMMENT '任务标签',
  `done` tinyint(1) DEFAULT '0' COMMENT '是否完成',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '截止时间',
  `remind_time` datetime DEFAULT NULL COMMENT '提醒时间',
  `p_id` varchar(32) DEFAULT '' COMMENT '父任务id',
  `sort` int(11) DEFAULT '0' COMMENT '排序',
  `like` int(7) DEFAULT '0' COMMENT '点赞数',
  `star` int(7) DEFAULT '0' COMMENT '收藏数',
  `deleted_time` datetime DEFAULT NULL COMMENT '删除时间',
  `is_private` tinyint(1) DEFAULT '0' COMMENT '是否隐私模式',
  `id_num` int(7) DEFAULT '1' COMMENT '任务id编号',
  `path` text COMMENT '上级任务路径',
  PRIMARY KEY (`id`,`project_id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=12361 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='任务表';

-- ----------------------------
-- Table structure for watermelon_task_like
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_task_like`;
CREATE TABLE `watermelon_task_like` (
  `id` varchar(32) NOT NULL,
  `task_id` varchar(32) DEFAULT '0' COMMENT '任务ID',
  `member_id` varchar(32) DEFAULT '' COMMENT '成员id',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='任务点赞表';

-- ----------------------------
-- Table structure for watermelon_task_member
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_task_member`;
CREATE TABLE `watermelon_task_member` (
  `id` varchar(32) NOT NULL,
  `task_id` varchar(32) DEFAULT '0' COMMENT '任务ID',
  `is_executor` tinyint(1) DEFAULT '0' COMMENT '执行者',
  `member_id` varchar(32) DEFAULT '' COMMENT '成员id',
  `join_time` varchar(0) DEFAULT NULL,
  `is_owner` tinyint(1) DEFAULT '0' COMMENT '是否创建人',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `id` (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='任务-成员表';

-- ----------------------------
-- Table structure for watermelon_task_stages
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_task_stages`;
CREATE TABLE `watermelon_task_stages` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL COMMENT '类型名称',
  `project_id` varchar(32) DEFAULT '' COMMENT '项目id',
  `sort` int(8) DEFAULT '0' COMMENT '排序',
  `description` text COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `deleted` tinyint(1) DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=72 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC COMMENT='任务列表表';

-- ----------------------------
-- Table structure for watermelon_task_stages_template
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_task_stages_template`;
CREATE TABLE `watermelon_task_stages_template` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL COMMENT '类型名称',
  `project_template_id` varchar(32) DEFAULT NULL COMMENT '项目id',
  `create_time` datetime DEFAULT NULL,
  `sort` int(8) DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='任务列表模板表';

-- ----------------------------
-- Table structure for watermelon_task_tag
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_task_tag`;
CREATE TABLE `watermelon_task_tag` (
  `id` varchar(32) NOT NULL,
  `project_id` varchar(32) DEFAULT NULL COMMENT '项目id',
  `name` varchar(32) DEFAULT NULL COMMENT '标签名',
  `color` tinyint(3) DEFAULT NULL COMMENT '颜色(0-blue,1-red,2-orange,3-green,4-brown,5-purple)',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='任务标签表';

-- ----------------------------
-- Table structure for watermelon_task_to_tag
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_task_to_tag`;
CREATE TABLE `watermelon_task_to_tag` (
  `id` varchar(32) NOT NULL,
  `task_id` varchar(32) DEFAULT '0',
  `tag_id` varchar(32) DEFAULT '0',
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='任务标签映射表';

-- ----------------------------
-- Table structure for watermelon_user_token
-- ----------------------------
DROP TABLE IF EXISTS `watermelon_user_token`;
CREATE TABLE `watermelon_user_token` (
  `token_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '令牌编号',
  `user_id` int(10) unsigned NOT NULL COMMENT '用户编号',
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `token` varchar(50) NOT NULL COMMENT '登录令牌',
  `login_time` int(10) unsigned NOT NULL COMMENT '登录时间',
  `client_type` varchar(10) DEFAULT NULL COMMENT '客户端类型 android wap',
  `login_ip` varchar(255) DEFAULT NULL COMMENT '登录ip',
  PRIMARY KEY (`token_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='PC端登录令牌表';
