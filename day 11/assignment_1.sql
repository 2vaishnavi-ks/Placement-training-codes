/*create database assignment;
use assignment;
-- Customer(CustomerID, CustomerName, DOB, ContactNo)
create table Customer(
	CustomerID int not null primary key,
    CustomerName varchar(255) not null,
    DOB date not null,
    ContactNo bigint not null
);

create table PolicyType(
Policy_Type varchar(255) not null primary key, 
PremiumRate varchar(255) not null, 
CoverageYears year not null
);

create table Branch(
BranchID int not null primary key, 
BranchName varchar(255) not null, 
Manager varchar(255) not null
);

create table Policy(
PolicyID int not null primary key, 
CustomerID int not null , 
Policy_Type varchar(255) not null, 
PremiumAmount double not null, 
BranchID int not null,
foreign key(CustomerID) references Customer(CustomerID),
foreign key(Policy_Type) references PolicyType(Policy_Type),
foreign key(BranchID) references Branch(BranchID)
);

insert into Customer values (101, 'Ramesh', '1985-05-10', 9876543210);
insert into Customer values (102, 'Kavya', '1990-09-15', 9123456789);
describe Customer;

insert into PolicyType values ('Health', '5% premium', 10);
insert into PolicyType values ('Life', '8% premium', 20);
insert into PolicyType values ('Vehicle',  '6% premium', 5);

insert into Branch values(301,'Bangalore', 'Anil');
insert into Branch values (302, 'Mysore', 'Sneha');

insert into Policy values (1, 101, 'Health', 20000, 301);
insert into Policy values (2,101, 'Vehicle', 15000, 301);
insert into Policy values (3, 102, 'Life', 50000, 302);*/

use assignment;

-- insert into Policy values (4, 101, 'Health', 10000, 301);
-- insert into Policy values (5,101, 'Vehicle', 1500, 301); 
-- insert into Policy values (6, 102, 'Life', 6000, 301); 
-- insert into Policy values (7, 102, 'Health', 200, 302);
-- insert into Policy values (8,102, 'Vehicle', 1800, 301);
-- insert into Policy values (9, 101, 'Life', 5000, 302);

-- first query
select BranchName, max(PremiumAmount) as MIN_AMT from Policy join Branch
where Policy.BranchID = Branch.BranchID
group by BranchName;

-- second query
select CustomerName, count(Policy_type)
from Customer c join Policy p
where c.CustomerID = p.customerID
group by CustomerName;

-- third query
select BranchName, sum(PremiumAmount) as Total_Payable
from Branch b join Policy p
where b.BranchID = p.BranchID
group by BranchName;

create user Branch_Manager identified by 'branch@123';
grant insert, update on Policy to 'Branch_Manager';

