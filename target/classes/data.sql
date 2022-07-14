insert into admins(ad_name,ad_email,ad_phone,ad_avatar,ad_active,ad_password) values('bac','bac@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(ad_name,ad_email,ad_phone,ad_avatar,ad_active,ad_password)  values('ha','ha@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(ad_name,ad_email,ad_phone,ad_avatar,ad_active,ad_password)  values('toan','toan@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(ad_name,ad_email,ad_phone,ad_avatar,ad_active,ad_password) values('hung','hung@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(ad_name,ad_email,ad_phone,ad_avatar,ad_active,ad_password) values('nam','nam@gmail.com','0123123123','gdsgs','1','123@');
insert into admins(ad_name,ad_email,ad_phone,ad_avatar,ad_active,ad_password)  values('thanh','thanh@gmail.com','0123123123','gdsgs','1','123@');

insert into categories(C_NAME,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values ('Giay','','',0,150,1);
insert into categories(C_NAME,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values ('Giay','','',0,150,2);
insert into categories(C_NAME,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values ('Giay','','',0,150,1);
insert into categories(C_NAME,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values ('Giay','','',0,150,3);
insert into categories(C_NAME,c_icon,c_avatar,c_active,c_total_product,c_author_id)
values ('Giay','','',0,150,6);

INSERT INTO PRODUCTS(pro_name,pro_category_id,pro_price,pro_author_id,pro_active,pro_number,pro_description,pro_avatar)
values('Giay the thao',1,5000,1,1,150,'','');
INSERT INTO PRODUCTS(pro_name,pro_category_id,pro_price,pro_author_id,pro_active,pro_number,pro_description,pro_avatar)
values('Giay da bong',4,150000,3,2,150,'','');
INSERT INTO PRODUCTS(pro_name,pro_category_id,pro_price,pro_author_id,pro_active,pro_number,pro_description,pro_avatar)
values('Giay trang',3,15000,3,1,150,'','');
INSERT INTO PRODUCTS(pro_name,pro_category_id,pro_price,pro_author_id,pro_active,pro_number,pro_description,pro_avatar)
values('Giay trang',3,10000,3,1,150,'','');
INSERT INTO PRODUCTS(pro_name,pro_category_id,pro_price,pro_author_id,pro_active,pro_number,pro_description,pro_avatar)
values('Giay trang',3,140000,3,1,150,'','');
INSERT INTO PRODUCTS(pro_name,pro_category_id,pro_price,pro_author_id,pro_active,pro_number,pro_description,pro_avatar)
values('Giay trang',3,150000,3,1,150,'','');

insert into images(im_product_id,im_name) values (1,'');
insert into images(im_product_id,im_name) values (1,'');
insert into images(im_product_id,im_name) values (2,'');
insert into images(im_product_id,im_name) values (2,'');
insert into images(im_product_id,im_name) values (3,'');
insert into images(im_product_id,im_name) values (1,'');
insert into images(im_product_id,im_name) values (3,'');

insert into users(u_phone,u_avatar,u_active,u_password,u_name,u_email,u_address) values (0326128475,'',0,'abcd','ha','doanha18121999@gmail.com','');
insert into users(u_phone,u_avatar,u_active,u_password,u_name,u_email,u_address)  values (0326128471,'',0,'abcd','bac','doanha18121999@gmail.com','');
insert into users(u_phone,u_avatar,u_active,u_password,u_name,u_email,u_address)  values (0326128472,'',0,'abcd','toan','doanha18121999@gmail.com','');
insert into users(u_phone,u_avatar,u_active,u_password,u_name,u_email,u_address)  values (0326128473,'',0,'abcd','nam','doanha18121999@gmail.com','');
insert into users(u_phone,u_avatar,u_active,u_password,u_name,u_email,u_address)  values (0326128474,'',0,'abcd','thanh','doanha18121999@gmail.com','');
insert into users(u_phone,u_avatar,u_active,u_password,u_name,u_email,u_address) values (0326128476,'',0,'abcd','hung','doanha18121999@gmail.com','');
insert into users(u_phone,u_avatar,u_active,u_password,u_name,u_email,u_address)  values (0326128477,'',0,'abcd','ha','doanha18121999@gmail.com','');

insert into transactions(tr_user_id, tr_total, tr_note, tr_address, tr_phone) values (1,2,'','','0326128475');
insert into transactions(tr_user_id,tr_total,tr_note,tr_address,tr_phone) values (2,1,'','','0326128475');
insert into transactions(tr_user_id,tr_total,tr_note,tr_address,tr_phone) values (3,2,'','','0326128475');
insert into transactions(tr_user_id,tr_total,tr_note,tr_address,tr_phone) values (4,3,'','','0326128475');
insert into transactions(tr_user_id,tr_total,tr_note,tr_address,tr_phone) values (5,4,'','','0326128475');
insert into transactions(tr_user_id,tr_total,tr_note,tr_address,tr_phone) values (6,1,'','','0326128475');
insert into transactions(tr_user_id,tr_total,tr_note,tr_address,tr_phone) values (7,6,'','','0326128475');

insert into orders(or_transaction_id,or_user_id,or_quantity,or_price) values (1,1,5,150000);
insert into orders(or_transaction_id,or_user_id,or_quantity,or_price)  values (2,2,10,150000);
insert into orders(or_transaction_id,or_user_id,or_quantity,or_price)  values (3,3,20,150000);
insert into orders(or_transaction_id,or_user_id,or_quantity,or_price) values (4,4,30,150000);
insert into orders(or_transaction_id,or_user_id,or_quantity,or_price)  values (5,5,14,150000);
insert into orders(or_transaction_id,or_user_id,or_quantity,or_price) values (6,6,22,150000);

insert into order_item(order_id,product_id,order_item_quantity,order_item_price) values (1,1,13,2000)