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

INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar,created_at,updated_at)
values(1,'Giay the thao',1,150000,1,1,150,'','',current_timestamp,current_timestamp);
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar,created_at,updated_at)
values(2,'Giay da bong',4,150000,3,2,150,'','',current_timestamp,current_timestamp);
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar,created_at,updated_at)
values(3,'Giay trang',3,150000,3,1,150,'','',current_timestamp,current_timestamp);
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar,created_at,updated_at)
values(4,'Giay trang',3,150000,3,1,150,'','',current_timestamp,current_timestamp);
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar,created_at,updated_at)
values(5,'Giay trang',3,150000,3,1,150,'','',current_timestamp,current_timestamp);
INSERT INTO PRODUCTS(id,pro_name,pro_category_id,pro_price,pro_author_id,active,pro_number,pro_description,pro_avatar,created_at,updated_at)
values(6,'Giay trang',3,150000,3,1,150,'','',current_timestamp,current_timestamp);

insert into images(id,im_product_id,im_name) values (1,1,'');
insert into images(id,im_product_id,im_name) values (2,1,'');
insert into images(id,im_product_id,im_name) values (3,2,'');
insert into images(id,im_product_id,im_name) values (4,2,'');
insert into images(id,im_product_id,im_name) values (5,3,'');
insert into images(id,im_product_id,im_name) values (6,1,'');
insert into images(id,im_product_id,im_name) values (7,3,'');

insert into users(id,phone,avatar,active,password,name,email,address) values (1,0326128475,'',0,'abcd','ha','doanha18121999@gmail.com','');
insert into users(id,phone,avatar,active,password,name,email,address) values (2,0326128471,'',0,'abcd','bac','doanha18121999@gmail.com','');
insert into users(id,phone,avatar,active,password,name,email,address) values (3,0326128472,'',0,'abcd','toan','doanha18121999@gmail.com','');
insert into users(id,phone,avatar,active,password,name,email,address) values (4,0326128473,'',0,'abcd','nam','doanha18121999@gmail.com','');
insert into users(id,phone,avatar,active,password,name,email,address) values (5,0326128474,'',0,'abcd','thanh','doanha18121999@gmail.com','');
insert into users(id,phone,avatar,active,password,name,email,address) values (6,0326128476,'',0,'abcd','hung','doanha18121999@gmail.com','');
insert into users(id,phone,avatar,active,password,name,email,address) values (7,0326128477,'',0,'abcd','ha','doanha18121999@gmail.com','');

insert into transactions(id,tr_user_id,tr_total,tr_note,address,phone) values (1,1,2,'','','0326128475');
insert into transactions(id,tr_user_id,tr_total,tr_note,address,phone) values (2,2,1,'','','0326128475');
insert into transactions(id,tr_user_id,tr_total,tr_note,address,phone) values (3,3,2,'','','0326128475');
insert into transactions(id,tr_user_id,tr_total,tr_note,address,phone) values (4,4,3,'','','0326128475');
insert into transactions(id,tr_user_id,tr_total,tr_note,address,phone) values (5,5,4,'','','0326128475');
insert into transactions(id,tr_user_id,tr_total,tr_note,address,phone) values (6,6,1,'','','0326128475');
insert into transactions(id,tr_user_id,tr_total,tr_note,address,phone) values (7,7,6,'','','0326128475');

insert into orders(id,or_transaction_id,pr_product_id,or_user_id,or_quantity,or_price) values (1,1,1,1,5,150000);
insert into orders(id,or_transaction_id,pr_product_id,or_user_id,or_quantity,or_price) values (2,2,2,2,10,150000);
insert into orders(id,or_transaction_id,pr_product_id,or_user_id,or_quantity,or_price) values (3,3,3,3,20,150000);
insert into orders(id,or_transaction_id,pr_product_id,or_user_id,or_quantity,or_price) values (4,4,4,4,30,150000);
insert into orders(id,or_transaction_id,pr_product_id,or_user_id,or_quantity,or_price) values (5,5,5,5,14,150000);
insert into orders(id,or_transaction_id,pr_product_id,or_user_id,or_quantity,or_price) values (6,6,6,6,22,150000);

insert into order_item(order_id,product_id,order_item_quantity,order_item_price) values (1,1,13,2000);
insert into order_item(order_id,product_id,order_item_quantity,order_item_price) values (2,1,13,2000);
insert into order_item(order_id,product_id,order_item_quantity,order_item_price) values (3,3,13,2000);
insert into order_item(order_id,product_id,order_item_quantity,order_item_price) values (4,2,13,2000);