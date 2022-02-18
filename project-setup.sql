create database city_classified_and_search;
use city_classified_and_search;

create table user 
(firstName varchar(20),
lastName varchar(20),
email varchar(50),
contactNumber varchar(12),
user_Id varchar(15),
password varchar(20),
role varchar(10),
alternateNumber varchar(12),
userName varchar(45),
primary key (user_Id));

insert into User values("Vignesh",'A','vignesha872@gmail.com',9843164937,"vignesh33","qwerty123","superuser","6383023412",'vigneshA'),
('Edwin','Abraham','3dwin4braham@gmail.com','9884798621','3dwin4braham','viewer@32','viewers','9876543210','EdwinAbraham'),
('Gunalan','Thangavel','gunalanthangavel@gmail.com','9150055502','gunalant','poster@13','poster','poster','GunalanThangavel'),
('Sathish','Kumar','sathishsurya2623@gmail.com','8220551935','sathishsurya','sathish26','admin','9765432125','SathishKumar'),
('Shashank','Tharanath','shashank976@gmail.com','7338125609','shashankAI','shashank@123','poster','9672432954','ShashankTharanath');

create table adminpending (adminPending_id varchar(20),adminName varchar(20));
insert into adminpending values('1','SathishKumar');

create table city (city_id varchar(20),cityName varchar(20),primary key (city_id));
insert into city  values ('23','chn'), ('15','ban'), ('20','cbe');

create table feedback (feedback_id varchar(20),user_Id varchar(20),city_feedback varchar(20),event_feedback varchar(20),foreign key(user_Id) references user (user_Id));
insert into feedback  values('1','3dwin4braham','good','not bad'), ('2','gunalant','better','good');

create table ticket (ticket_id varchar(20),ticket_date varchar(20),description varchar(30),issue varchar(20),resolution varchar(20),user_id varchar(20),foreign key(user_Id) references user (user_Id));
insert into ticket values('1','2022-02-08','best college','need more classes','add classrooms','3dwin4braham'),
('2','2022-01-03','best school in the city','need more teachers','appoint teachers','shashankAI'),
('3','2022-01-23','one of the best shopping malls','same collections','update collection','shashankAI');

create table classifieds (id varchar(20),categories varchar(20),contactNumber varchar(20),alternateNumber varchar(20),email varchar(40),remarks varchar(20),postedOn varchar(20),postedById varchar(20),postedByName varchar(20),city_id varchar(20),lastUpdatedDate varchar(20),lastUpdatedById varchar(20),lastUpdatedByName varchar(20),foreign key(city_id) references city (city_id));
insert into classifieds values ('1','teacher','9884798621','9675432913','3dwin4braham@gmail.com','good','2022-01-02','3dwin4braham','EdwinAbraham','23','2022-02-07','shashankAI','ShashankTharanath'), ('2','elecrical service','9150055502','9675432913','gunalanthangavel@gmail.com','good','2022-01-03','gunalant','GunalanThangavel','15','2022-02-07','sathishsurya','SathishKumar'), ('3','tourism and travel','8220551935','9675432913','sathishsurya2623@gmail.com','good','2022-01-05','sathishsurya','SathishKumar','20','2022-02-07','3dwin4braham','EdwinAbraham');

create table information (info_id varchar(15),subject varchar(25),addressLine1 varchar(50),addressLine2 varchar(30),city varchar(30),state varchar(20),zip varchar(15),contactNumber varchar(12),alternateNumber varchar(12),email varchar(50),fax varchar(20),remarks varchar(60),postedOn varchar(20),postedById varchar(20),postedByName varchar(20),city_id varchar(20),lastUpdatedDate varchar(20),lastUpdatedById varchar(20),lastUpdatedByName varchar(20));
insert into information values ('1','college','fgh','wyz','chn','Tn','600091','7338125609','9672432954','shashank976@gmail.com','564435','good','2021-09-23','shashankAI','ShashankTharanath','23','2022-01-23','3dwin4braham','EdwinAbraham'),  ('2','school','fvy','abc','chn','Tn','600091','9150055502','9675432913','gunalanthangavel@gmail.com','561835','good','2021-12-03','gunalant','GunalanThangavel','12','2022-02-09','sathishsurya','SathishKumar'), ('3','shoppingmall','bcd','xyz','ban','Kar','403690','8220551935','9765432125','sathishsurya2623@gmail.com','5345835','good','2021-11-08','sathishsurya','SathishKumar','15','2022-02-05','shashankAI','ShashankTharanath');

create table Security_Question(user_id varchar(20),contactNumber varchar(12),qid1 numeric,qid2 numeric,qid3 numeric,ans1 varchar(20),ans2 varchar(20),ans3 varchar(20),foreign key(user_id) references user (user_Id),primary key(contactNumber));
insert into Security_Question values("Vignesh33","9843164937",01,02,03,"scooby","blue","sat");
