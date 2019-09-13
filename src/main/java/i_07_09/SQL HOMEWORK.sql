create database hr;
use hr;

CREATE TABLE EMP
(EMPNO INT(4) NOT NULL primary key,
ENAME VARCHAR(10),
JOB VARCHAR(9),
MGR INT(4),
HIREDATE DATE,
SAL INT(4),
COMM INT(4),
DEPTNO INT(2));

INSERT INTO EMP VALUES
(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20),
(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30),
(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30),
(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20),
(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30),
(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30),
(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10),
(7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000, NULL, 20),
(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10),
(7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30),
(7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100, NULL, 20),
(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30),
(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20),
(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);


CREATE TABLE DEPT
(DEPTNO INT(2) AUTO_INCREMENT PRIMARY KEY ,
DNAME VARCHAR(14),
CITY VARCHAR(13) );


INSERT INTO DEPT VALUES
(10, 'ACCOUNTING', 'NEW YORK'),
(20, 'RESEARCH', 'DALLAS'),
(30, 'SALES', 'CHICAGO'),
(40, 'OPERATIONS', 'BOSTON');

CREATE TABLE SALGRADE
(GRADE INT,
LOSAL INT,
HISAL INT);

INSERT INTO SALGRADE VALUES
(1, 700, 1200),
(2, 1201, 1400),
(3, 1401, 2000),
(4, 2001, 3000),
(5, 3001, 9999);


SELECT ename, deptno, job, sal FROM emp WHERE empno=7902;
SELECT ename, job, sal FROM emp WHERE job in (SELECT job FROM emp GROUP BY job HAVING COUNT(*) > 1);
SELECT ename, job, sal*12 AS "Annual Salary" FROM emp;  
SELECT ename, job, sal+ifnull(15,0) AS "Monthly Income" FROM emp WHERE sal > 2000;
SELECT empno, ename, job, hiredate FROM emp WHERE job in (SELECT job FROM emp GROUP BY job HAVING COUNT(*) > 1) AND hiredate > '1982-03-20';  
INSERT INTO emp VALUES ('8000', 'HUNTER', 'CLERK', 7782, '1982-01-23', '1300', NULL, '10');
INSERT INTO emp VALUES ('8001', 'HELENA', 'CLERK', 7782, '1982-01-23', '1300', NULL, '10');
INSERT INTO emp VALUES ('8002', 'JOHN', 'CLERK', 7781, '1982-01-23', '1300', NULL, '20');
INSERT INTO emp VALUES ('8003', 'HUNTER', 'CLERK', 7782, '1982-01-23', '1300', NULL, '10');
INSERT INTO emp VALUES ('8004', 'FELICIA', 'MANAGER', 7782, '1982-01-23', '1300', NULL, '30');
INSERT INTO emp VALUES ('8005', 'DEXTER', 'SALESMAN', 7782, '1982-01-23', '1300', NULL, '10');
INSERT INTO emp VALUES ('8006', 'RICCI', 'CLERK', 7782, '1982-01-23', '1300', NULL, '10');
INSERT INTO emp VALUES ('8007', 'ANITTA', 'CLERK', 7782, '1982-01-23', '1300', NULL, '20');
INSERT INTO emp VALUES ('8009', 'PHILLIP', 'SALESMAN', 7782, '1982-01-23', '1300', NULL, '10');
INSERT INTO emp VALUES ('8008', 'CARA', 'MANAGER', 7782, '1982-01-23', '1300', NULL, '30');
SELECT ename, deptno, sal, sal*15/100 AS "Bonus" FROM emp WHERE deptno = 20;
SELECT deptno, dname FROM dept;
SELECT CONCAT (empno,' ',ename), job, hiredate FROM emp  ORDER BY empno DESC;
SELECT CONCAT (empno,' ',ename), job, sal+ifnull(15,0) AS "Monthly Income" FROM emp ORDER BY deptno;
SELECT ename, job FROM emp;
SELECT dname, deptno FROM dept ORDER BY dname;
SELECT ename FROM emp WHERE job IN('manager') ORDER BY deptno;
SELECT ename FROM emp WHERE hiredate BETWEEN '1980-12-17' AND '1981-06-12';
SELECT empno, ename, job, sal+ifnull(15,0) AS "Monthly Income" FROM emp WHERE empno IN(7499,7902,7876);
SELECT ename FROM emp WHERE hiredate BETWEEN '1980-01-01' AND '1980-12-31';
SELECT ename FROM emp WHERE ename LIKE 'F%' AND LENGTH(ename)=7;
SELECT ename FROM emp WHERE deptno = 20 AND comm IS NULL;
SELECT ename FROM emp WHERE job = 'salesman' AND comm IS NOT NULL;
SELECT ename FROM emp WHERE job = 'manager' AND sal>1500 UNION ALL SELECT ename FROM emp WHERE job ='analyst';
SELECT ename FROM emp WHERE hiredate < '1982-01-01' AND comm IS NULL;
SELECT ename FROM emp WHERE job IN ('manager','president') AND sal>3000;
SELECT ename, job, (sal+ifnull(15,0))*12 AS "Yearly Income" FROM emp WHERE job !='manager' AND deptno = 30;
SELECT deptno, ename, hiredate, sal FROM emp WHERE deptno IN(20,30) AND hiredate BETWEEN '1981-01-01' AND '1981-12-31';



