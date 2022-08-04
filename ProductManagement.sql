create database NPCI;
use NPCI;

create table Product(
productid bigint primary key,
productname varchar(255),
description varchar(255),
unitprice decimal(13,2),
imageurl varchar(255),
unitsinstock int,
datecreated date,
lastupdated date,
categoryid bigint,
foreign key (categoryid)  references Category(categoryid)
);

alter table Product modify productid bigint auto_increment;
alter table Product auto_increment=8263;

create table Category(
categoryid bigint primary key,
categoryname varchar(255)
);

insert into Product values(6839,"OnePlus Nord CE2 5G","This is a mobile product",24999.00,"https://images-eu.ssl-images-amazon.com/images/I/61+Q6Rh3OQL._AC._SR360,460.jpg",4,"2021-09-10","2022-06-10",735),
(6816,"boAt Airdopes 121v2 True Wireless Earbuds","This is a electronics product",1299.00,"https://images-eu.ssl-images-amazon.com/images/I/31KjuRb9oNL._AC_SX368_.jpg",3,"2020-07-01","2022-04-20",740),
(6850,"Redmi Note 11 Pro","This is a mobile product",20999.00,"https://images-eu.ssl-images-amazon.com/images/I/71UDT0TuNDL._AC._SR360,460.jpg",5,"2020-06-11","2021-08-26",735),
(6886,"Urbano Fashion Mens Slim Fit Black Stretch Jeans","This is a fashion product",581.00,"https://m.media-amazon.com/images/I/611hFiiUv4L._AC_UL480_FMwebp_QL65_.jpg",10,"2020-01-27","2022-03-14",745),
(6872,"JBL Tune 215BT","This is a electronics product",1499.00,"https://m.media-amazon.com/images/I/51-JsO-OCxL._AC_UL480_FMwebp_QL65_.jpg",6,"2020-02-12","2022-02-17",740),
(6832,"IndoPrimo Mens Regular Fit Casual Shirt","This is a fashion product",499.00,"https://m.media-amazon.com/images/I/71yM0xUAetL._AC_UL480_FMwebp_QL65_.jpg",5,"2021-02-15","2022-07-27",745),
(6856,"Samsung Galaxy M33 5G","This is a mobile product",17999.00,"https://images-eu.ssl-images-amazon.com/images/I/81xvGbBFNhL._AC._SR360,460.jpg",3,"2021-04-18","2022-07-16",735);

insert into Category values(735,"Mobile"),(740,"Electronics"),(745,"Fashion");
select * from Product;

select * from Category;

drop table Product;
drop table Category;


select * from Product inner join Category on Product.category_id = Category.category_id;

