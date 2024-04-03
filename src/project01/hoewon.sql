show tables;

create table hoewon (
  idx         int not null auto_increment primary key,	/* 고유번호 */
  id          varchar(20) not null, 	                  /* 아이디 */
  password    varchar(20) not null, 										/* 비밀번호 */
  name        varchar(20) not null, 										/* 성명 */
  Birthday    varchar(20) not null, 										/* 생일 */  
  gender      char(2) default '여자',										/* 성별 */
  phonenumber varchar(15) default 0											/* 전화번호 */
);


INSERT INTO hoewon VALUES (default,'user123', 'pass1234', '김지영', '1995-08-15', '여자', '010-1234-5678');

desc hoewon;
drop table hoewon;
select * from hoewon;

