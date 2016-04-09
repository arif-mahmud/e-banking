drop table BANKACCOUNT;
CREATE TABLE  BANKACCOUNT (
    BankAccNumber number(19, 0),
    accountType varchar(50),
    accountHolderName varchar(200),
    fatherName varchar(200),
  	motherName varchar(200),
  	PermanentAddress varchar(200),
  	presentAddress varchar(200),
  	accountUserImageFileName varchar(200),
  	ContactNumber varchar(200),
  	EmailAddress varchar(200),
  	NID_PN varchar(50),
  	occupation varchar(50),
  	Currency varchar(50),
    YearlyIncome number(19, 0),
    Balance number(19, 0),
    activeStatus varchar2(50),
    nomineeName   varchar(200),
    nomineeAddress varchar(250),
    nomineerelation varchar(200),
     NID    varchar(50),
     profession varchar(200),
    primary key (BankAccNumber));
DROP sequence SQ_BANKACCNUMBER;
create sequence SQ_BANKACCNUMBER start with 10001 increment by 1;

DROP table USERACCOUNT;

    create table USERACCOUNT(
    loginId varchar2(20) not NULL,
    password varchar2(20),
    LoginType varchar2(20),
    BankAccNumber number(19, 0),
    primary key(loginId));

INSERT INTO BANKACCOUNT (BankAccNumber,accountHolderName,activestatus) VALUES(10000,'admin','1');
INSERT INTO USERACCOUNT VALUES('admin','admin', 'Admin',10000);

    
--LEDGERACCOUNT
 DROP table LEDGERACCOUNT;
 create table LEDGERACCOUNT (
    LedgerId varchar2(20) not null,
    BankAccNumber number(19, 0),
    RefInfo varchar2(50),  
    Description varchar2(200),
    DepositAmount number(19, 0),
    WithdrawAmount number(19, 0),
    transactionDate date,
    primary key(LedgerId));
    
    DROP sequence SQ_ledgerId; 
    create sequence SQ_ledgerId  start with 1000 increment by 1;
    
    DROP table BENEFICIARY; 
    create table  BENEFICIARY(
    BankAccNumber number(19, 0),
    AliasName  varchar2(200),
    Amount    number(20));
     
    DROP sequence SQ_ALIASID; 
    create sequence SQ_ALIASID start with 10001 increment by 1;
     
      
     
    