Create schema summerPing;
Create table summerPing.players (
	Id bigint  primary key,
    firstName varchar(20) not null,
    lastName varchar(20) not null,
    officialRank varChar(2),
    mail varchar(50),
    phone varchar(15),
    ageCategory varchar(20),
    club varchar(5));
    
    