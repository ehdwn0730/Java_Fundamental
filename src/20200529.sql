#emp 테이블에서 사원번호, 사원이름, 직업을 출력
SELECT empno, ename, job
FROM emp;

#emp테이블에서사원번호,급여,부서번호를출력하세요.단,급여가많은순서대로출력
SELECT empno, sal, deptno
FROM emp
ORDER BY sal desc;

#emp 테이블에서 사원번호, 급여, 입사일을 출력. 단 급여가 적은 순서대로
SELECT empno, sal, hiredate
FROM emp
ORDER BY sal asc;

#emp테이블에서 직업, 급여를 출력. 단, 직업명으로 오름차순, 급여로 내림차순 정력해서
SELECT job, sal
FROM emp
ORDER BY sal DESC, job ASC;

#emp테이블에서 empno는 사원번호로 ename은 사원이름으로
#컬럼정보를 바꿔서 출력하시오
SELECT empno AS "사원번호", ename AS "사원이름"
FROM emp;

# AS 와 "" 생략가능
SELECT empno 사원번호, ename 사원이름
FROM emp;

# ""를 쓰는 이유는 공백을 주기 위해서
SELECT empno "사원 번호", ename "사원 이름"
FROM emp;

#emp 테이블에서 부서번호가 10번인 사원들의 급여와
#10% 인상된 급액을 같이 출력
SELECT deptno, sal, sal*1.1
FROM emp
WHERE deptno = 10;

#emp 테이블에서 부서번호가 10번인 사원들의 부서번호와
#급여와 급여+커미션 출력
SELECT deptno, sal, sal+comm
FROM emp
WHERE deptno = 10;

# null로 출력이 아닌 숫자로
SELECT deptno, sal, sal+IFNULL(comm,0)
FROM emp
WHERE deptno = 10;

#emp 테이블에서 급여가 3000이상인 사람들의 모든 정보를 출력
SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno
FROM emp
WHERE sal >3000;

#emp테이블에서 부서번호가 30번이 아닌 사람들의
#이름과 부서번호를 출력해보세요
SELECT ename, deptno
FROM emp
WHERE deptno != 30;

#emp 테이블에서 부서번호가 10번이고 급여가 3000이상인 사원들의 이름과 급여를 출력
SELECT ename, sal
FROM emp
WHERE deptno = 10 AND sal >=3000;


#emp테이블에서 직업이 salesman이거나 manager인 사원의 사원번호와
#부서번호를 출력
SELECT empno, deptno, job
FROM emp
WHERE job = 'saleman' OR job = 'manager';

# or를 and로 바꾸는 것 (or은 full scan을 조건마다 하기때문에)
SELECT empno, deptno, job
FROM emp
WHERE job != 'clerk' AND job != 'analyst';

SELECT empno, deptno, job
FROM emp
WHERE job = 'salesman'
UNION ALL
SELECT empno, deptno, job
FROM emp
WHERE job = 'manager';


#부서번호가 10번이거나 20번인 사원의 사원번호와 이름, 부서번호 출력
#1번
SELECT ename, deptno
FROM emp
WHERE deptno = 10 OR deptno = 20;
#2번
SELECT ename, deptno
FROM emp 
WHERE deptno IN (10,20);
#3번
SELECT ename, deptno
FROM emp
WHERE deptno != 30;

#급여가 1000과 2000 사이의 사원들이 사원번호, 이름, 급여를 출력
# and 이용
SELECT empno, ename, sal
FROM emp
WHERE sal >= 1000 AND sal <= 2000;

# between 이용
SELECT empno, ename, sal
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

#사원이름이 'ford' 와 'scott' 사이의 사원들의 사원번호, 이름을 출력
SELECT deptno, ename
FROM emp
WHERE ename >= 'ford' AND ename <= 'scott'
ORDER BY ename ASC;


# 사원이름이 'J'로 시작하는 사원의 사원이름과 부서번호를 출력
SELECT ename, deptno
FROM emp
WHERE ename LIKE 'J%';

#사원이름에서 'J'를 포함하는 사원의 사원이름과 부서번호를 출력하기
SELECT ename, deptno
FROM emp
WHERE ename LIKE '%J%';

#사원이름의 두번째 글자가 'A'인 사원의 이름, 급여, 입사일을 출력
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '_A%';

#사원 이름이 'ES'로 끝나는 사원의 이름, 급여, 입사일을 출력
SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '%es';

#입사년도가 81년인 사원들의 입사일과 사원번호를 출력
SELECT hiredate, empno
FROM emp
WHERE hiredate LIKE '1981%';

#커미션이 NULL인 사원의 사원이름과 커미션을 출력
SELECT ename, comm
FROM emp
WHERE comm = NULL;

#커미션이 NULL이 아닌 사원의 사원이름과 커미션을 출력
SELECT ename, comm
FROM emp
WHERE comm = IS NULL;

SELECT CONCAT(ename, '의 직업은', job, '입니다.') intro
FROM emp;

SELECT CHAR(97);

SELECT CONCAT(ename, '님')NAME
FROM emp;

SELECT LOWER(ename)
FROM emp;

SELECT upper(ename)
FROM emp;

SELECT lPAD('hi', 10, '*');

SELECT RPAD('123', 10, '0');

SELECT LENGTH('스미스');

SELECT LEFT('abcde', 3);

SELECT SUBSTRING('abcde', 2, 2);

SELECT ename, RPAD(LEFT(ename, 3), LENGTH(ename), '*') 'secretname'
FROM emp;

SELECT ename, RIGHT(ename,3)
FROM emp;

SELECT ename, LPAD(RIGHT(ename,3), LENGTH(ename), '*')
FROM emp;

SELECT ename, SUBSTRING(ename, 3, 3)
FROM emp;

SELECT FORMAT(123456.34355,2);

SELECT ename, ifnull(comm,0) 
FROM emp;

# 절대값
SELECT ABS(-50000000);

#소수점 올림
SELECT CEIL(4.56789);

#소수점 내림
SELECT FLOOR(4.99999);

#소수점 반올림
SELECT ROUND(2345.345,2);

SELECT MOD(10, 3);

SELECT TRUNCATE(123123.1234567,3);


SELECT CURDATE();
SELECT CURTIME();
SELECT NOW();

SELECT NOW(), ADDDATE(NOW(), INTERVAL 2 DAY);

testCREATE TABLE test(
id VARCHAR(50) PRIMARY KEY,
sdate DATETIME,
edate DATETIME
);

INSERT INTO test(id, sdate, edate) 
VALUES('syh1011', NOW(), adddate(NOW(), INTERVAL 2 DAY));

INSERT INTO test(id, sdate, edate) 
VALUES('syh2022', NOW(), adddate(NOW(), INTERVAL 20 DAY));

INSERT INTO test(id, sdate, edate) 
VALUES('syh3033', NOW(), adddate(NOW(), INTERVAL 40 DAY));

INSERT INTO test(id, sdate, edate) 
VALUES('syh4044', NOW(), adddate(NOW(), INTERVAL 40 hour));


SELECT id, sdate, edate
FROM test;


SELECT NOW(), SUBDATE(NOW(), INTERVAL 2 HOUR);

SELECT DATEDIFF('2020-05-29','2020-05-21');

SELECT id, DATEDIFF(edate, sdate) diff
FROM test;

SELECT id, TIMESTAMPDIFF(hour, sdate, edate)
FROM test;

SELECT id, DATE_FORMAT(sdate, '%Y/%m/%d') sdate, 
date_format(edate, '%y/%m/%d %h:%i:%s') edate, edate
FROM test;