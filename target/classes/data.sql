insert into admins(id,name,email,phone,avatar,active,password) values(1,'bac','bac@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(id,name,email,phone,avatar,active,password) values(2,'ha','ha@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(id,name,email,phone,avatar,active,password) values(3,'toan','toan@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(id,name,email,phone,avatar,active,password) values(4,'hung','hung@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(id,name,email,phone,avatar,active,password) values(5,'nam','nam@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(id,name,email,phone,avatar,active,password) values(6,'thanh','thanh@gmail.com','0123123123','gdsgs','1','123@');

insert into categories(id,c_name,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values (1,'Giay','','',0,150,1);
insert into categories(id,c_name,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values (2,'Giay','','',0,150,2);
insert into categories(id,c_name,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values (3,'Giay','','',0,150,1);
insert into categories(id,c_name,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values (4,'Giay','','',0,150,3);
insert into categories(id,c_name,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values (5,'Giay','','',0,150,6);

INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar)
    values(1,'Giay the thao',1,150000,1,1,150,'','');
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar)
values(2,'Giay da bong',4,150000,3,2,150,'','');
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar)
values(3,'Giay trang',3,150000,3,1,150,'','');
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar)
values(4,'Giay trang',3,150000,3,1,150,'','');
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar)
values(5,'Giay trang',3,150000,3,1,150,'','');


insert into images(id,im_product_id,im_name) values (1,1,'');
insert into images(id,im_product_id,im_name) values (2,1,'');
insert into images(id,im_product_id,im_name) values (3,2,'');
insert into images(id,im_product_id,im_name) values (4,2,'');
insert into images(id,im_product_id,im_name) values (5,3,'');
insert into images(id,im_product_id,im_name) values (6,1,'');
insert into images(id,im_product_id,im_name) values (7,3,'');