create database demohibernate;
use demohibernate;
create table students
(id varchar(7) primary key,
fullname nvarchar(50) not null,
major nvarchar(50) not null,
course int(4) not null,
username varchar(20) not null,
encryptedpassword varchar(1000) not null
)

create table teachers
(id varchar(7) primary key,
fullname nvarchar(50) not null,
joindate date not null,
username varchar(20) not null,
encryptedpassword varchar(1000) not null
)

create table subjects
(
id varchar(7) primary key,
name varchar(100) not null,
begindate date not null,
finishdate date not null,
beginperiod int(4) not null,
finishperiod int(4) not null,
dayinweek varchar(10) not null,
room varchar(30) not null
);

create table student_subject
(
studentid varchar(7) not null,
subjectid varchar(7) not null,
primary key(studentid, subjectid)
);

alter table student_subject add foreign key (studentid) references students(id);
alter table student_subject add foreign key (subjectid) references subjects(id);

create table student_subject_attendance
(
id int not null AUTO_INCREMENT
studentid varchar(7) not null,
subjectid varchar(7) not null,
week int not null,
presence bit,
primary key(studentid, subjectid, week)
);

alter table student_subject_attend add foreign key (studentid) references students(id);
alter table student_subject_attend add foreign key (subjectid) references subjects(id);

insert into student_subject(studentid, subjectid) 
values
('1412183', 'CTT2248'), 
('1412183', 'CTT3005'), 
('1412183', 'CTT6789');

insert into student_subject_attend(studentid, subjectid, week, present) 
values
 ('1412183', 'CTT6789', 1, TRUE),
 ('1412183', 'CTT6789', 2, TRUE),
 ('1412183', 'CTT6789', 3, TRUE);

create table attendances
(
id int not null primary key AUTO_INCREMENT,
 week int not null,
 presence int(1),
subjectid varchar(7) not null,
studentid varchar(7) not null
);
alter table attendances add foreign key (studentid) references students(id);
alter table attendances add foreign key (subjectid) references subjects(id);

insert into attendances(studentid,subjectid, week, presence)
values ('16SGU32', 'CTT2248', 1,1),
             ('16SGU32', 'CTT2248', 2,1),
             ('16SGU32', 'CTT2248', 3,1),
            ('16SGU32', 'CTT2550', 1,1),
             ('16SGU32', 'CTT2550', 2,1),
             ('16SGU32', 'CTT2550', 3,1);
