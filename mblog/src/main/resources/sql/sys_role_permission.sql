DROP TABLE sys_role_permission;
CREATE TABLE sys_role_permission (perm_id int(10) NOT NULL, role_id int(10) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (1, 11);
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (2, 11);
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (1, 12);
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (2, 12);
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (3, 12);
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (4, 12);
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (1, 13);
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (2, 13);
INSERT INTO sys_role_permission (perm_id, role_id) VALUES (3, 13);
