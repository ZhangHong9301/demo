DROP TABLE sys_permission;
CREATE TABLE sys_permission
(id int(10) NOT NULL,
 permName varchar(50),
 permTag varchar(50)) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO sys_permission (id, permName, permTag) VALUES (1, '产品增加', 'VIP1');
INSERT INTO sys_permission (id, permName, permTag) VALUES (2, '产品查看', 'VIP2');
INSERT INTO sys_permission (id, permName, permTag) VALUES (3, '产品更新', 'VIP3');
INSERT INTO sys_permission (id, permName, permTag) VALUES (4, '产品删除', 'ROLE_DELETE_PRODUCT');
