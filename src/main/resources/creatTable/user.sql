create table if not exists 'user_info'(
    'id' bigint(20) unsigned NOT NULL AUTO_INCREMENT comment '自增id',
    'email' varchar(200) NOT NULL default '' comment '用户邮箱',
    'password' varchar(200) NOT NULL default '123456' comment '登陆密码',
    'head_url' text NOT NULL default '' comment '用户头像',
    'friends' text NOT NULL default '' comment '好友列表',
    'role' tinyint(20) unsigned NOT NULL default '1' comment '用户角色，1为普通用户， 0为管理员',
    'status' tinyint(20) unsigned NOT NULL default '0' comment '用户状态， 0为未激活， 1为常规，2为封禁',
    'register_timestamp' timestamp NOT NULL default CURRENT_TIMESTAMP,
    'extra_info' text comment '其他信息',
    PRIMARY KEY ('id'),
    UNIQUE KEY 'uniq_idx_email' ('email') USING BTREE
) engine=InnoDB default charset =utf8 comment ='用户信息'