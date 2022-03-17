create table if not exists 'sessionInfo'(
    'id' bigint(20) unsigned NOT NULL AUTO_INCREMENT comment '自增id',
    'session_id' varchar(50) NOT NULL default '' comment '会话id',
    'creat_timestamp' timestamp NOT NULL default current_timestamp comment '会话创建时间'
)