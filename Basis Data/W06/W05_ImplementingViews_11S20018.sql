USE PresDB

/*BAGIAN A*/
GO --1
CREATE VIEW PartyView AS
SELECT DISTINCT(PARTY)
FROM PRESIDENT
SELECT * FROM  PartyView
GO --2
CREATE VIEW PartyPresidenView AS 
SELECT TOP 10 PARTY, COUNT(PARTY) "JumlahPresiden" --, ROW_NUMBER() OVER (ORDER BY COUNT(PARTY) desc) "RowNumber"
FROM PRESIDENT
GROUP BY PARTY
ORDER BY COUNT(PARTY) desc;
SELECT * FROM  PartyPresidenView
Go --3
CREATE VIEW PresServView AS
select PRES_NAME, BIRTH_YR, YRS_SERV
from PRESIDENT
where BIRTH_YR > 1881 and YRS_SERV > 5
order by DEATH_AGE offset 0 rows;
SELECT * FROM  PresServView
GO --4
CREATE VIEW NotStateBornView AS
select STATE_NAME "StateBukanKelahiran"
from STATE
where STATE_NAME not in (select STATE_BORN from PRESIDENT);
select * from NotStateBornView
GO --5
CREATE VIEW StateBornPresView AS
select TOP 10 STATE_BORN, COUNT(STATE_BORN) "TotalPresiden"
from PRESIDENT
group by STATE_BORN
having COUNT(STATE_BORN) > 1
order by COUNT(STATE_BORN) desc;
select * from StateBornPresView
GO --6
CREATE VIEW PresView AS
select PRES_NAME
from PRES_HOBBY
where HOBBY = 'Riding' and PRES_NAME in (select PRES_NAME from PRES_MARRIAGE where NR_CHILDREN!=0);
--ATAU--
CREATE VIEW PresView AS
SELECT DISTINCT PRES_HOBBY.PRES_NAMEFROM PRES_HOBBY INNER JOIN PRES_MARRIAGEON PRES_HOBBY.PRES_NAME = PRES_MARRIAGE.PRES_NAMEWHERE HOBBY = 'RIDING'AND NR_CHILDREN > 0
select * from PresView
GO --7
CREATE VIEW PresUmurView AS
select PRES_NAME, (2021 - BIRTH_YR) "Usia"
from PRESIDENT
where DEATH_AGE is null and PRES_NAME in (select PRES_NAME from PRES_MARRIAGE where NR_CHILDREN!=0);
--ATAU--
CREATE VIEW PresUmurView AS
SELECT DISTINCT PRESIDENT.PRES_NAME, (2021-PRESIDENT.BIRTH_YR) AS usia
FROM PRESIDENT INNER JOIN PRES_MARRIAGE
ON PRESIDENT.PRES_NAME = PRES_MARRIAGE.PRES_NAME
WHERE PRES_MARRIAGE.NR_CHILDREN > 0
AND PRESIDENT.DEATH_AGE IS NULL
select * from PresUmurView
GO --8
CREATE VIEW PresDeath66View AS
select * from PRESIDENT
where DEATH_AGE = 66;
select * from PresDeath66View
GO --9
CREATE VIEW Winner1852View AS
select CANDIDATE, ELECTION_YEAR
from ELECTION
where ELECTION_YEAR = 1852 and WINNER_LOOSER_INDIC = 'W';
select * from Winner1852View
GO --10
CREATE VIEW WinnerVoteView AS
select ELECTION_YEAR, VOTES "JlhVote"
from ELECTION
where VOTES > 450 and WINNER_LOOSER_INDIC = 'W';
select * from WinnerVoteView
GO 
/*BAGIAN B*/
GO --modify PresServView
CREATE VIEW PresServView AS
select PRES_NAME, BIRTH_YR, YRS_SERV
from PRESIDENT
where BIRTH_YR > 1881 and YRS_SERV > 5
order by DEATH_AGE offset 0 rows
with check option --tambahan
SELECT * FROM  PresServView
INSERT INTO PRESIDENT VALUES ('Wilson M', 1882, 6, 67, 'Federalist', 'Virginia'); --tambahan
delete from PRESIDENT where PRES_NAME =  'Wilson M';
GO --modify PresUmurView
CREATE VIEW PresUmurView AS
SELECT DISTINCT PRESIDENT.PRES_NAME, (2021-PRESIDENT.BIRTH_YR) AS usia
FROM PRESIDENT INNER JOIN PRES_MARRIAGE
ON PRESIDENT.PRES_NAME = PRES_MARRIAGE.PRES_NAME
WHERE PRES_MARRIAGE.NR_CHILDREN > 0
AND PRESIDENT.DEATH_AGE IS NULL
with check option --tambahan
select * from PresUmurView
INSERT INTO PRESIDENT VALUES ('Yunki', 1867, 4, NULL, 'Demo-Rep', 'Massachusetts'); --tambahan
INSERT INTO PRES_MARRIAGE VALUES ('Yunki', 'Jena H', 28, 25, 3, 1886);
delete from PRESIDENT where PRES_NAME =  'Yunki';
delete from PRES_MARRIAGE where PRES_NAME =  'Yunki';
GO
/*BAGIAN C*/
drop view PartyPresidenView, PresView, PresUmurView, PresServView