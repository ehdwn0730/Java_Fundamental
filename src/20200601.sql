# ename 칼럼수를 검색
SELECT COUNT(ename)
FROM emp;

#comm 칼럼수를 검색. 주의)null 칼럼은 카운트하지 않음.
SELECT COUNT(comm)
FROM emp;

#모든 칼럼을 검색
SELECT COUNT(*)
FROM emp;

SELECT COUNT(empno)
FROM emp;

#sal 총합을 구함
SELECT SUM(sal)
FROM emp;

#comm 총합을 구함. 
#주의) 총합을 구하는 sum()함수는 null이 있더라도 총합을 구해줌.
SELECT SUM(comm)
FROM emp;

SELECT sal, comm, sal + IFNULL (comm,0)
FROM emp;

SELECT AVG(sal), AVG(comm), AVG(IFNULL(comm,0)),
SUM(comm)/COUNT(comm), SUM(comm) / COUNT(*)
FROM emp;

#sal를 가장 많이 받는 사람의 사원번호와 월급을 출력
SELECT empno, MAX(sal)
FROM emp;

#부서별 급여의 총합을 출력하라
SELECT deptno, sal
FROM emp
ORDER BY deptno ASC;

SELECT deptno, COUNT(deptno)
FROM emp
GROUP BY deptno;

#부서별 인원수, 월급의 평균, 원급합을 검색
SELECT deptno, COUNT(deptno), round(AVG(sal),1), SUM(sal)
FROM emp
GROUP BY deptno;

#직업별 최대 급여를 구하시오
SELECT job, MAX(sal)
FROM emp
GROUP BY deptno
order BY MAX(sal) ASC;

#급여가 1000이상인 사원들의 부서별 평균 급여의 반올림 값을
#부서번호로 내림차순 정렬해서 출력해보세요.
SELECT deptno, round(AVG(sal))
FROM emp
WHERE sal >= 1000
GROUP BY deptno
ORDER BY deptno DESC;

# 급여가 2000 이상인 사원들의 부서별 평균 급여의 반올림 값을 
#평균 급여의 반올림 값으로 오름차순 정렬해서 출력해 보세요.
SELECT deptno, round(AVG(sal)) avgsal
FROM emp
WHERE sal >= 2000
GROUP BY deptno
ORDER BY avgsal ASC;

#각 부서별 같은 업무(job)를 하는 사람의 인원수를 구해서 부서번호,
#직업(job), 인원수를 부서번호에 대해서 오름차순 정렬해서 출력하시오
SELECT deptno, job, COUNT(*) jobcount
FROM emp
GROUP BY deptno, job
ORDER BY deptno ASC, jobcount DESC;

#emp 테이블에서 부서번호와 급여가 1000이상인 사원들의 부서별 평균 급여를 출력
#단, 부서별 평균 급여가 2000이상인 부서만 출력하세요
SELECT deptno, AVG(sal) avgsal
FROM emp
WHERE sal >= 1000
GROUP BY deptno
HAVING avgsal >= 2000;


#limit a, b : a는 시작위치, b는 길이
#limit 0,10 : 처음부터 10개를 가져옴
#limit 10, 20 : 11번째 부터 20개를 가져옴
SELECT empno, ename, job
FROM emp
ORDER BY hiredate DESC
LIMIT 0,5;


SELECT empno, ename, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno;

SELECT deptno, dname, loc
FROM dept;

SELECT empno, ename, emp.deptno, dname, loc
FROM emp, dept
WHERE dept.DEPTNO = emp.deptno;

#emp 테이블의 모든 사원들의 이름, 부서번호, 부서명을 출력
SELECT ename, dept.deptno, dname
FROM emp, dept
WHERE dept.DEPTNO = emp.deptno;

# 테이블에 alias을 추가하는 경우(가장 자주 쓴다)
SELECT ename, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno= e.DEPTNO;

#join ~ on 표현식을 사용하는 경우
SELECT ename, d.deptno, dname
FROM emp e JOIN dept d
ON d.deptno = e.deptno;

#ansi join : join ~ using (두 테이블의 칼럼명이 같아야 사용가능)
SELECT ename, d.deptno, dname
FROM emp e JOIN dept d
USING(deptno);

#급여가 3000 에서 5000사이의 사원이름과 부서명을 출력
SELECT ename, dname
FROM emp e, dept d
WHERE d.deptno = e.DEPTNO AND 3000 <= sal AND sal <= 5000;

SELECT ename, dname
FROM emp e, dept d
WHERE d.deptno = e.DEPTNO AND sal between 3000 and 5000;


#부서명이 'accounting' 인 사원의 이름, 입사일, 부서번호 부서명을 출력
SELECT ename, hiredate, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno and dname = 'ACCOUNTING'; 

# 커미션이 null이 아닌 사원의 이름, 입사일, 부서명을 출력
# 단 입사일은 2020년 11월 20일 형식으로 출력
SELECT ename, date_format(hiredate,'$Y년%m월 %d일'), dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND comm IS NOT NULL;

# 부서명이 'ACCOUNTING' 인 사원의 이름, 입사일, 부서번호, 부서명을 출력
# 단 입사일은 2020년 11월 20일 형식으로 출력
SELECT ename, DATE_FORMAT(hiredate, '$Y년 %m월 %d일'), deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.DEPTNO AND dNAME = 'ACCOUNTING'

SELECT * FROM emp;

#데이터 추가
INSERT INTO emp(empno, ename, job, sal, hiredate, comm)
VALUES(8000, 'eric', 'clerk', 2500,'1983-02-25',NULL);

#사원번호, 부서번호, 부서명을 출력
#단, 사원이 근무하지 않는 부서명도 같이 출력하시오
SELECT empno, e.deptno, dname
FROM emp e LEFT JOIN dept d
ON d.deptno = e.deptno;


#1. emp테이블과 dept테이블을 조인하여 부서번호, 부서명, 이름, 급여를 출력.
SELECT d.deptno, dname, ename, sal
FROM emp e , dept d
WHERE d.deptno = e.deptno;

#2. 사원의 이름이 'ALLEN'인 사원의 부서명을 출력
SELECT ename, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND ename = 'ALLEN';

#3. 모든 사원의 이름, 부서번호, 부서명, 급여을 출력
#단, emp테이블에 없는 부서도 출력
SELECT ename, d.deptno, dname, sal
FROM emp e LEFT JOIN dept d
ON d.deptno = e.deptno;

#4. 사원의 이름과 급여, 급여의 등급을 출력
#emp 테이블과 salgrade 테이블을 조인
SELECT ename, sal, grade
FROM emp e, salgrade s;
WHERE sal BETWEEN losal AND hisal;

#5. 사원의 이름과 부서명, 급여의 등급을 출력
#emp 테이블과 salgrade 테이블을 조인
SELECT ename, dname, grade
FROM emp e, dept d, salgrade s
WHERE d.deptno = e.deptno AND sal BETWEEN losal AND hisal;

#'SMITH'가 근무하는 부서명을 서브쿼리를 이용해서 출력
SELECT ename, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND ename = 'SMITH';

#'ALLEN'과 같은 부서에서 근무하는 사원의 이름과 부서의 번호를 출력
SELECT ename, dname
FROM emp e, dept d
WHERE d.deptno = e.DEPTNO AND ename ='ALLEN';

SELECT ename, deptno
FROM emp
WHERE deptno = 30;

SELECT deptno
FROM emp
WHERE ename = 'ALLEN';

SELECT ename, deptno
FROM emp
WHERE deptno = (SELECT deptno
FROM emp
WHERE ename = 'ALLEN');

#직업이 'SALESMAN' 사람의 사원번호와 직업을 출력
SELECT deptno, job
FROM emp
WHERE job = 'SALESMAN'


