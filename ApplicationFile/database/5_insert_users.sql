use toeiconline;
select * from user;
select * from role;
INSERT INTO user (name,password,fullname,createddate,roleid) VALUES ('admin','123456','Adminstrator',CURRENT_TIMESTAMP,1);
INSERT INTO user (name,password,fullname,createddate,roleid) VALUES ('manhtuan1112','tuan1211','Duong Manh Tuan',CURRENT_TIMESTAMP,2);