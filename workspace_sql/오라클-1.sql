/* 범위주석*/
--SQL : Structured Querry language

select * from emp2;


select EMPNO, ENAME, DEPTNO
    from emp;
    
-- 이름과 급여만 출력
select  
        ENAME, 
        SAL,
        123,
        '심재원'
    from emp;


select
    deptno 
    from emp;
    
select
    distinct deptno
    from emp;
    
    
select
distinct job, deptno
from emp;


select  ename, 
        sal, 
        sal*12+comm as "s      d", 
        sal*12+comm s2,
        comm 추가수당
from emp;

select *
    from emp
    where deptno = 30
    or job = 'salesman'
    order by ename;

--Q2 p.97
    
select distinct job,
        '집가고싶다'
        from emp;


-- sal 컬럼을 기준으로 오름차순(작은 것부터 큰 순서대로) : asc


select * 
    from emp
    order by sal asc;
 
--sal 컬럼 기준으로 내림차순(큰것 부터) : desc
    
select * 
    from emp
    order by sal desc;
    
--가장 먼저 입사한 순서
    
select * 
    from emp
    order by hiredate;
    
select * 
    from emp
    order by deptno asc, sal desc;
    
-- deptno asc, sal desc; 이 상황에서 연봉이 높으면 사원번호 내침차순 정렬

select * 
    from emp
    order by deptno asc, sal desc, empno desc;
    
select 
    distinct deptno 
    from emp;

--where절 수업

--Where 기본
    
select *
    from emp
     where deptno = 30
        order by sal;

--sal이 1600인 사람만 출력.

select *
    from emp
        where sal = 1600;
    
select * 
    from emp 
        where sal > 1600; --초과

select * 
    from emp 
    where sal >= 1600; --이상

select * 
    from emp 
    where sal <= 1600; --이하

--부정

select * 
    from emp 
    where deptno != 30;
select * 
    from emp 
    where deptno <> 30;

select * 
    from emp
    where deptno = 30
        and job = 'SALESMAN';
        
-- OR
/*
 'EMP'에서 부서번호(DEPTNO)가 30이거나 직무(JOB)가 'CLERK'인 행을 표시해라.
*/
select *
    from emp
    where deptno = 30
    or
    job = 'CLERK';

select * 
    from emp
    where job = 'CLERK'
    or sal > 2000
    and deptno = 10;
    
select * 
    from emp
    where not(job = 'CLERK'
    or sal > 2000
    and deptno = 10);

 --not = '!=' = '<>' = '^='

select *
    from emp
    where sal >= 2000 
    and sal < 4000;
    
    -- 2000<=sal<4000 안되는 이유 참 또는 거짓이라는 결과가 안나옴!
    
select *
    from emp
    where deptno = 10
    or deptno = 20;

select * 
    from emp 
    where sal in ( 80*10 ,  500*10);

select *
    from emp
    order by ename;
    
--1 부서번호 10번인 사람들을 출력

select *
    from emp
    where deptno = 10;
    
--2 부서번호 10번이 아닌 사람들을 출력

select *
    from emp
    where deptno <> 10;
-- where not (deptno =10);

--3 급여가 3000 이상인 사람들을 출력
select *
    from emp
    where sal >= 3000;
    
--4 급여가 1500~3000 사이(포함)의 사람을 출력
select *
    from emp
    where (sal >= 1500 and sal <=3000);

--5 부서번호 10번인 사람 중 급여 2000이상인 사람을 출력
select *
    from emp
    where deptno = 10
    and sal >= 2000;
    
--6 부서번호 30번 중 1500~3000 사이인 사람을 출력
select *
    from emp
    where deptno = 30
    and (sal > 1500 and sal < 3000);
    
--7 부서번호 30번 중 1500~3000 사이인 사람으 ㄹ연봉이 작은 순으로 출력, 연봉이 같으면 이름순으로 출력
select *
    from emp
    where deptno = 30
    and (sal > 1500 and sal < 3000)
    order by sal, ename;
    
--8 부서번호 20, 30번 중 1500~3000 사이인 사람을 연봉이 작은순으로 출력, 연봉이 같다면 이름순으로 출력
select *
    from emp
    where deptno in (20, 30)
-- 같은 컬럼이 = 과 or로 연결되어 있는경우 in으로 변경 할 수 있다
    and (sal > 1500 and sal < 3000)
    order by sal, ename;
    
--9 부서 번호 가 20또는 30인 사람 중에 연봉이 1500이상 인 사람을 이름과 연봉만 출력 단, 연봉순으로 출력
select ename, sal
    from emp
    where deptno in (20, 30)
    and sal >= 1500
    order by sal;

--between 
select *
    from emp
    where sal between 2000 and 3000
    and deptno =20;

-- not between
select *
    from emp
    where sal not between 2000 and 3000;

-- 2000초과 3000미만 between 하지만 코드가 더 길어져서 쓰이지는 않는다.
select *
    from emp
    where sal between 2000 and 3000
    and sal <>2000
    and sal <>3000;

-- like 검색의 기본이자 끝
select *    
    from emp
    where ename like '%S%';

select *
    from emp
    where ename like '_L%';
    
select *
    from emp 
    where ename like '%A%'
           or ename like '%S%';

-- not like 
select *
    from emp
    where ename not like '%A%';
    
-- is null
select *
    from emp
    where comm is null;

select *
    from emp
    where mgr is null; 

select *
    from emp
    where comm is not null; 

-- union 
select *
    from emp
    where deptno = 10
        union
select *
    from emp   
    where deptno = 10;

-- union all

select *
    from emp
    where deptno = 10
        union all
select *
    from emp   
    where deptno = 10;

-- 부서번호 10번을 사원번호 내림차순desc으로 정렬하여 출력
select *
    from emp
    where deptno = 10
    order by deptno desc
union a
-- 부서번호 20번을 사원번호 오름차순으로 출력
select *
    from emp
    where deptno = 20
    order by deptno;
    
    
    
-- union all ex) 칼럼값 즉 데이터타입이 다른경우 실행이 안됨.
select empno
    from emp
union all
select ename
    from emp;

-- 사원 이름에 E가 포함된 30번 부서의 사원 중 금여가 1000~2000 사이가 아닌 사원 이름, 사원번호, 급여, 부서번호를 출력하는 SQL 구문을 작성해보시오
select ename, empno, sal, deptno
    from emp
    where ename like '%E%'
    and deptno = 30
    and not (sal > 1000 and sal < 2000);
    
-- 추가 수당이 없고/ 상급자가 있고/ 직책이 매니저, 점원인 사원 중에서/ 사원 이름의 두번째 글자가 L이 아닌/ 사원 정보를 출력하는 SQL 구문을 작성해 보세요
select * 
    from emp
        where 
         comm is null
         and mgr is not null
         and lower(job) LIKE '%ger'
         or lower(job) = 'clerk'
         and ename not like '_L%'
         order by sal;

--Q2    
select empno, ename, job, sal, deptno
    from emp
        where
         deptno = 30
         and job = 'SALESMAN';

-- 문자열 데이터를 가공하는 문자 함수(uppper, lower, intcap)
select ename, upper(ename), lower(ename) 
    from emp;
    
select , lower(ename), upper(ename)
    from emp
        where lower(ename) like lower('%aM%');
        
select upper('abc'), lower('abc'), upper(lower('abc')) from dual;

--length 글자수를 세어주는 함수 이름이 5글자인 사원행을 모두 출력하시오.
select *
    from emp
        where  length(ename)=5;

select lengthb('뿗')
    from dual;

--substr
select job, substr (job,1 ,2)
from emp;

--사원 이름을 두번째 부터 3글자만 출력
select substr (ename, 2, 3)
    from emp;

select job, substr(job, -3, 2)
    from emp;

--이름의 뒤에서 부터 3글자만 출력하기
select substr(ename, -3)
    from emp;
    
--replace
select '심재원',
    replace('심재원', '재', '제')
    from dual;
    
select *
    from emp
    where ename replace(ename, 'E', '-');

select *
    from emp
    where ename = 'ALLEN' replace(ename, 'E', '-');
    
select Rpad(substr
(ename,1, 2), 6, '*')
    from emp;
    
select Rpad(substr(ename,1,2),length(ename),'*')
    from emp;
    
select lpad(rpad(job,20),20)
from emp;

--job을 총 20자 중 가운데 정렬

select

--두 문자열을 합쳐줌!
select 2 || 'dmd' 
    from dual;
    
select empno || ' : ' || ename
    from emp;
    
select '    ab c     ', trim('   ab  c    ') 
    from dual;
    
select round(14.46),  -- 하나만 입력하면 소수점 첫째자리 반올림
       round(14.46, 1),  -- 소수점 두번째 자리 
       round(14.46,-1) --음수일 때 정수로 거슬러 올라간다
        from dual;
        
--trunc

select trunc(14.46),
        trunc(14.46, 1),
         trunc(14.46,-1),
          trunc(-14.46)    
    from dual;

-- ceil 올림, floor 내림
    
select ceil(3.14),
        floor(3.14),
         ceil(-3.14),
          floor(-3.14)
    from dual;

--mod 숫자를 나눈 나머지를 구하는 함수
select mod(6,3), mod(7,3), mod(8,3), mod(9.2,3)  
    from dual;
    
--sysdate 날짜를 나타내는 함수
select sysdate 
    from dual;

--  -------------------------    
select empno, empno + '1000' from emp;


select TO_CHAR(sysdate, 'yyyy"년" mm"월" dd"일" hh24"시" mm"분" ss"초"') 
    from dual;
    
select TO_CHAR(hiredate, 'yyyy"년" mm"월" dd"일" hh24"시" mm"분" ss"초"') 
    from emp;
    
select TO_CHAR(SAL, 'L999,999')
    from emp;
    
select to_date('2025-05-15', 'yyyy-mm-dd') - to_date('1996-03-12', 'yyyy-mm-dd')
    from dual;
    
select * 
    from emp
     where hiredate > to_date('1981-06-01', 'yyyy-mm-dd');
     
select ename, sal*12 + nvl(comm,0) as "연봉"
       from emp;
       
select *
    from emp;
    
select ENAME, DEPTNO, JOB
    from emp;
    
select *
    from emp
    where JOB = 'SALESMAN';

select *
    from emp
    where ename like '%AM%' 
        and hiredate > to_date('1985', 'yyyy');
        
select ename as "사원이름" ,to_char(sal*12+nvl(comm,0), 'L999,999') as "연봉"
    from emp                           
    order by 연봉 ;
    
select to_char(sal*12+nvl(comm,0))
    from emp;


select deptno, ename, nvl(comm, 200) as "COMM"
    from emp
    where ename = 'SMITH';

-- 각 사원의 연봉을 출력한다.
-- 월급 * 12 + comm
-- ename, total_pay 출력

select ename, sal*12+nvl(comm,0) as "total_pay"
    from emp;



--조건문 "DECODE"문
select empno, ename, job, sal,
    decode( job,-- 컬럼
    /*조건*/'MANAGER', SAL*1.1,--결과값
    /*조건*/'SALESMAN', SAL*1.05,--결과값
    /*조건*/'ANALYST', SAL,--결과값
/*조건에 해당하지 않는 결과값*/SAL*1.03) AS "upsal"
from emp;


--조건문 "CASE"문
--MANAGER 월급은 10%인상, SALESMAN 월급은 5%인상,  
select empno, ename, job, sal,
    case job
        when 'MANAGER' then sal*1.1
        when 'SALESMAN' then sal*1.05
        when 'ANALYST' then sal
        else sal*1.03
    end as "upsal"
from emp;

select nvl(comm,-1),
    decode(comm, null,-1, comm) as "decode",
    case
        when comm = null then -1
        else comm
    end as "omm"
from emp;

select
    case
        when comm is null  
            then '해당 사항 없음'
        when comm = 0
            then 'f'
        when comm > 0 
            then '수당 : ' || comm + 1
    end as "come text"
from emp;

--Q1
select empno,
    Rpad(substr(empno,1,2), 4, '*') as "MASKING_EMPLOYEE" , ename,
    Rpad(substr(ename,1,1), 5, '*') as "MASKING_ENAME"
from emp
    where length(ename) >= 5
    and length(ename) < 6;
    
--Q1-1
select empno, substr(empno,1,2) || '**' as masking_empno,
        Rpad(substr(ename, 1, 1), length(ename), '*')masking_ename
from emp
    where length(ename) >= 5
    and length(ename) < 6;
    
--Q2
select empno, ename, sal,
        trunc(sal / 21.5, 2) as "DAY_PAY",
        round(sal / 21.5 / 8, 1) as "TIME_PAY"
from emp;

--Q3
select empno, ename, mgr,
        nvl(
            case 
                when mgr is null then '0000'
                when substr(mgr,1,2)=75 then '5555'
                when substr(mgr,1,2)=76 then '6666'
                when substr(mgr,1,2)=77 then '7777'
                when substr(mgr,1,2)=78 then '8888'
            end, mgr) as "CHG_MGR"
from emp;

--Q3
select empno, ename, mgr,
        nvl(
        case 
            when mgr is null then '0000'
            when mgr>=7500 and mgr<=7599 then '5555'
            when mgr>=7600 and mgr<=7699 then '6666'
            when mgr>=7700 and mgr<=7799 then '7777'
            when mgr>=7800 and mgr<=7899 then '8888'
        end, mgr) as "CHG_MGR"
from emp;
            
select empno, ename, mgr,
        case 
            when mgr is null then '0000'
            when substr(mgr,1,2)=75 then '5555'
            when substr(mgr,1,2)=76 then '6666'
            when substr(mgr,1,2)=77 then '7777'
            when substr(mgr,1,2)=78 then '8888'
            else to_char(mgr)
        end as "CHG_MGR"
from emp;

select empno, ename, mgr,
        case 
            when mgr is null then '0000'
            when substr(mgr,1,2)=75 then '5555'
            when substr(mgr,1,2)=76 then '6666'
            when substr(mgr,1,2)=77 then '7777'
            when substr(mgr,1,2)=78 then '8888'
            else to_char(mgr)
        end as "CHG_MGR"
from emp;

select empno, ename, mgr,
        case 
            
            when substr(mgr,1,2)=75 then '5555'
            when substr(mgr,1,2)=76 then '6666'
            when substr(mgr,1,2)=77 then '7777'
            when substr(mgr,1,2)=78 then '8888'
            else to_char(  nvl(mgr, '0000')   )
        end as "CHG_MGR"
from emp;

select 
    case
        when mgr is null
            then '0000'
        when substr(mgr, 2, 1) in ('5', '6', '7', '8')
            then
        lpad(substr(mgr, 2, 1), 4 , substr(mgr, 2, 1))
        else '' || mgr
    end
        
from emp;

--sum 모든값의 합을 알려주는 함수
--null 값은 0으로 계산해준다

select sal
from emp;

select sum(comm)
from emp;

--count 데이터의 개수를 알려주는 함수
--null의 개수는 계산되지 않는다.

select count(*), sum(sal)
from emp;


select count(comm), count(sal)
from emp;

--MAX MIN 최소값과 최대값

select max(sal), min(sal), min(hiredate), min(comm) 
from emp;

--이름에 A가 들어가는 사람은 몇명?

select count(ename)
from emp
        where ename like '%A%';
-- 다중행 함수(집계 함수)는 where 절에서 사용할 수 없다.        
select avg(comm)
from emp;



--group by 절 


select avg(sal), deptno
from emp
    group by deptno;


select round(avg(sal),0), deptno, count(*)
from emp
    group by deptno;

select job, deptno
from emp
    where deptno = 10
    group by job, deptno
        order by job desc;

select deptno, job, count(*)
from emp
    group by deptno, job;

select deptno, job, count(*)
from emp
    group by deptno, job;

--HAVING 절 GROUP BY 를 사용한 경우에만 쓸수 있다! WHERE와 비슷하지만 단일행 함수를 사용할 수 있다.
--GROUP BY의 조건을 줄 때 사용한다
--단일행 함수를 조건으로 주고 싶을 때 사용한다!

SELECT job, deptno
from emp
    group by deptno, job
        having deptno = 10;

SELECT job, deptno, avg(sal)
from emp
    group by deptno, job;

SELECT job, deptno, avg(sal)
from emp
    group by deptno, job
        having avg(sal) > 2000
            order by avg(sal);

SELECT JOB, COUNT(*) AS "CNT"                                      --5
FROM EMP                                                           --1
    WHERE SAL > 1000 --(AND CNT >=3, AND COUNT(*) >= 3은 사용 못함   --2
        GROUP BY JOB                                               --3
            HAVING COUNT(*) >= 3                                   --4
                ORDER BY CNT DESC;                                 --6




--심화
--가운데 정렬=양쪽 공백이 같다.
--전체 길이의 반-글씨 길이의 반

--심재원 풀이
select rpad(substr (lpad(job,20), (20-length(job))/2), 20) from emp;

--선생님 풀이
select 
    lpad(job,length(job)/2 + 20/2,'-'), 
    rpad(
    lpad(job,length(job)/2 + 20/2,'-'),20,'-')

from emp;




select *
from emp, dept
    order by empno;
    
select *
from emp, dept
    where emp.deptno = dept.deptno
        order by empno;

select *
from emp e, dept d
     where e.deptno = d.deptno
        order by empno;
        
/*select deptno
from emp e, dept d
     where e.deptno = d.deptno;*/  --에러 이유 : E,D에 deptno 컬럼이 둘다 있기 때문
     
select e.deptno
from emp e, dept d
     where e.deptno = d.deptno;

select e.deptno
from emp e right outer join dept d on(e.deptno = d.deptno) ;

select *
from dept;


--null 때문에 13개만 나옴
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
    where e1.mgr = e2.empno;


select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
    where e1.mgr = e2.empno(+);
    
select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
    where e1.mgr(+) = e2.empno;


--join on 중에서 양쪽의 컬럼 명이 동일한 경우에 사용할 수 있다
    
select e.ename, d.deptno, e.deptno, sal
from emp e join dept d on(e.deptno = d.deptno)
    where sal >= 3000;


--using 에 사용한 컬럼은 select에서 소유 지정할 수 있다

select ename, deptno, sal
from emp e join dept d using (deptno)
    where sal >= 3000;
    
select *



from emp e1 join emp e2 on(e1.mgr = e2.empno);
--left(right) outer jion
--왼쪽(오른쪽) 테이블의 모든 값을 출력하는 것을 보장한다
--on과 using을 다 사용할 수 있다



select *
from emp e1 left outer join emp e2 on(e1.mgr = e2.empno), salgrade s
where salgrade;

select *
from emp e1 right outer join emp e2 on(e1.mgr = e2.empno);

select *
from emp e1 full outer join emp e2 on(e1.mgr = e2.empno);

--Q1

select e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
    where e.deptno = d.deptno
       and sal > 2000
order by d.deptno, dname;

select e.deptno, d.dname, e.empno, e.ename, e.sal
from emp e left outer join  dept d on(e.deptno = d.deptno)
       where sal > 2000
order by dname;

--Q2

select e.deptno, d.dname, floor( avg(sal) ) as "avg_sal", max(sal) as "max_sal", min(sal) as "MIN_SAL", count(d.deptno)
from emp e left outer join dept d on e.deptno = d.deptno --left outer join dept d using(deptno)
group by e.deptno, d.dname;
    

--Q3

select d.deptno, d.dname, e.empno, e.ename, e.job, e.sal
from dept d left outer join emp e on (e.deptno = d.deptno)
   order by deptno, ename;
    
--Q4

select  d.deptno, d.dname, e.empno, e.ename, e.mgr, e.sal, e.deptno, s.losal, s.hisal, s.grade, 
       e2.empno as "MGR_EMPNO", e2.ename as "MGR_ENAME"
from dept d 
         left outer join emp e on (d.deptno = e.deptno)
         left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal)
         left outer join emp e2 on (e.mgr = e2.empno)
order by d.deptno, e.empno ;


--퀴즈
--각 부서별로 급여가 가장 높은사람, 가장 낮은 사원의 급여 차이를 보고싶다
select e.deptno, d.dname, max(sal), min(sal), max(sal)-min(sal)
from emp e left outer join dept d on(d.deptno = e.deptno)
group by e.deptno, d.dname;


--서브쿼리
--select 안에 또 다른 select문을 쓸 수 있다
--SQL문 안에 select 문이 들어가는 형태
    --단일행 서브쿼리
        --select 결과가 값이 하나일때(한칸+한줄일때), 마치 조회된 값 그 자체로 활용할 수 있다.
    
select * 
from emp
    where sal> (select sal 
                from emp
                    where ename = 'JONES');
                    

select *
from emp
    where hiredate < (select hiredate
                      from emp
                            where ename = 'SCOTT');
                        
                        

select e.empno, e.ename, e.job, e.sal, d.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno
        and e.deptno = 20
        and e.sal > (select avg(sal)
from emp);
                    
                    
--다중행 서브쿼리
    --select 결과가 여러 줄 일때(한칸이지만 여러줄일때) in 에서 사용 가능
    
select *
from emp
    where sal in(select max(sal)
from emp
    group by deptno);

select *
from emp;


select *
from emp, dept 
where emp.deptno = dept.deptno;

--from절 서브쿼리
select * 
from (select * from emp where deptno = 10) e, dept d
    where e.deptno = d.deptno;

--job별로 3명 이상인 부서를 구하시오

select *
from (
    select job, count(*) cnt
      from emp
      group by job)
where cnt >= 3;

--job별로 3명 이상인 부서를 구하시오
select job, count(*) as "cnt"
from emp
    group by job
    having count(*) >= 3;


select rownum, emp.*
from emp
order by sal desc;

select *
from (
        select rownum rn, emp.* 
        from emp
      ) 
    where rn > 3 and rn < 6;




select * --출력(5)
from -- 2번 테이블을 불러옴 (3)
    (
    select rownum rn, e.* --1번 앞에 순서를 정해주는 수식 (2)
    from
        (
            select emp.* --급여의 내림차순으로 정렬 (1)
            from emp
                order by sal desc
     )e
         )
where rn >= 1 and rn <= 2 ; --3번 조건문 (4)

--with 절

with e10 as (select * 
             from emp   
             where deptno=10)
select * 
from e10;

select empno, ename, job, sal,
        (select grade
         from salgrade
            where e.sal >= losal
            and e.sal <= hisal) as salgrade,
        deptno,
        (select dname
         from dept
            where e.deptno = dept.deptno) as dname
from emp e;

--Q1 전체 사원 ALLEN과 같은 직책(JOB)인 사원의 사원 정보, 부서 정보를 다음과 같이 출력하시오
--심재원 풀이
SELECT E.JOB, E.EMPNO, E.ENAME, E.SAL, D.DEPTNO, D.DNAME
FROM EMP E, DEPT D/*(
                    SELECT JOB, EMPNO, ENAME, SAL 
                    FROM EMP
                        ),
                    (
                    SELECT DEPTNO, DNAME 
                    FROM DEPT
                        WHERE DEPTNO =(
                                        SELECT DEPTNO 
                                             FROM EMP 
                      WHERE ENAME =  'ALLEN'
                      )
       )*/ 
    WHERE JOB = (
                 SELECT JOB 
                 FROM EMP 
                    WHERE ENAME =  'ALLEN'
                 )
                 AND E.DEPTNO = D.DEPTNO
                 ORDER BY SAL DESC;
 --선생님 풀이
 
 
 


--Q2 전체 사원의 평균 급여보다 많이 받는 사원의 사원 정보, 부서 정보, 급여 등급 정보를 출력하시오
--심재원 풀이
SELECT E.EMPNO, 
       E.ENAME, D.DNAME, E.HIREDATE, D.LOC, E.SAL, S.GRADE
FROM EMP E, DEPT D, SALGRADE S
    WHERE SAL > (
                 SELECT AVG(SAL)
                 FROM EMP
                 )
     AND E.DEPTNO = D.DEPTNO
     AND E.SAL >= S.LOSAL
     AND E.SAL <= S.HISAL
            ORDER BY E.SAL DESC, E.EMPNO ;

--평균 급여
(SELECT AVG(SAL)
FROM EMP); 


--선생님 풀이
SELECT E.EMPNO, 
       E.ENAME, 
       (SELECT DNAME FROM DEPT D WHERE E.DEPTNO = D.DEPTNO) DNAME, 
       E.HIREDATE, 
       (SELECT LOC FROM DEPT D WHERE E.DEPTNO = D.DEPTNO) LOC, 
       E.SAL, 
       (SELECT GRADE FROM SALGRADE S WHERE SAL BETWEEN LOSAL AND HISAL) GRADE
FROM EMP E
    WHERE SAL > (
                 SELECT AVG(SAL)
                 FROM EMP
                 )
            ORDER BY E.SAL DESC, E.EMPNO ;

--Q3 10번 부서에 근무하는 사원 중 30번 부서에 없는 직책인 사원의 사원 정보, 부서 정보를 출력하시오
--심재원 풀이
SELECT EMPNO, ENAME, JOB, E.DEPTNO, D.DNAME, D.LOC
FROM (SELECT * 
            FROM EMP
            WHERE DEPTNO = 10) E, DEPT D
            WHERE D.DEPTNO=E.DEPTNO
            AND JOB NOT IN (SELECT JOB
                            FROM EMP E, DEPT D
                                WHERE E.DEPTNO = D.DEPTNO
                                AND D.DEPTNO = 30);
--선생님 풀이
SELECT JOB, 10 FROM EMP WHERE DEPTNO = 10
UNION ALL
SELECT DISTINCT JOB, 30 FROM EMP WHERE DEPTNO = 30;

SELECT EMPNO, ENAME, JOB, E.DEPTNO, D.DNAME, D.LOC 
FROM EMP E LEFT OUTER JOIN DEPT D (D.DEPTNO = E.DEPTNO)
WHERE 
        DEPTNO = 10
        AND JOB NOT IN(
                        SELECT JOB 
                         FROM EMP 
                            WHERE DEPTNO = 30
                            );

--부서번호가 10번인 사람들
SELECT * 
FROM EMP
WHERE DEPTNO = 10;
--30번 부서에 있는 직책
SELECT JOB
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
AND D.DEPTNO = 30 ;

--Q4직책이 SALESMAN인 사람의 최고 급여보다 많이 받는 사원의 사원 정보, 급여 등급 정보를 출력하시오
--심재원 풀이
SELECT E.EMPNO, E.ENAME, E.SAL, S.GRADE
FROM EMP E, SALGRADE S
    WHERE SAL >= LOSAL 
        AND SAL <= HISAL
        AND E.SAL > (SELECT MAX(SAL)
                     FROM(SELECT SAL
                            FROM EMP E
                                WHERE JOB = 'SALESMAN'));
               /* AND E.SAL > ALL (SELECT SAL
                     FROM(SELECT SAL
                            FROM EMP E
                                WHERE JOB = 'SALESMAN'));*/


--직책이 세일즈맨인 사람
SELECT JOB
FROM EMP
    WHERE JOB = 'SALESMAN';

--직책이 세일즈맨인 사람중 최고 급여
SELECT MAX(SAL)
FROM(SELECT SAL
     FROM EMP E
        WHERE JOB = 'SALESMAN');


--Q1 커미션이 NULL인 사원을 급여 오름차순으로 정렬
SELECT *
FROM EMP
    WHERE COMM IS NULL
        ORDER BY SAL;

--Q2 급여 등급 별 사원 수를 등급 오름차순으로 정렬
SELECT COUNT(GRADE),GRADE
FROM EMP E, SALGRADE S
    WHERE SAL >= LOSAL
    AND SAL <= HISAL
        GROUP BY GRADE
            ORDER BY GRADE;
    

/*Q3 이름, 급여, 급여 등급, 부서이름 조회
단, 급여등급 3 이상만 조회. 급여등급 내림차순, 급여이
같은 경우 급여 내림 차순*/

SELECT ENAME, SAL, GRADE, DNAME
FROM EMP E, DEPT D, SALGRADE S
    WHERE E.DEPTNO = D.DEPTNO
        AND SAL >= LOSAL
        AND SAL <= HISAL
        AND GRADE >=3
ORDER BY GRADE DESC, SAL DESC;

--Q4 부서명이 SALES인 사원 중 급여 등급이 2또는 3인 사원을 급여 내림차순으로 정렬
SELECT *
FROM EMP E, DEPT D, SALGRADE S
    WHERE DNAME = 'SALES'
        AND (GRADE = 3 OR GRADE = 2)
        AND E.DEPTNO = D.DEPTNO
        AND SAL >= LOSAL
        AND SAL <= HISAL
            ORDER BY SAL DESC;
--선생님 풀이
SELECT *
FROM EMP E LEFT OUTER JOIN DEPT D USING (DEPTNO)
           LEFT OUTER JOIN SALGRADE S ON (E.SAL >= S.LOSAL AND E.SAL <= S.HISAL)
    WHERE S.GRADE IN (2,3)
        AND D.DNAME = 'SALES'
            ORDER BY SAL DESC;
            
 ------------------------------------------------------------------------
 --테이블의 구조를 설명해준다.
 DESC EMP;
 --테이블 만들기
 CREATE TABLE EMP_DDL(
    EMPNO       NUMBER(4),
    ENAME       VARCHAR2(10),
    JOB         VARCHAR2(9),
    MGR         NUMBER(4),
    HIREDATE    DATE,
    SAL         NUMBER(7,2),
    COMM        NUMBER(7,2),
    DEPTNO      NUMBER(2)
);


DESC EMP_DDL;

SELECT * FROM EMP_DDL;

CREATE TABLE DEPT_DDL
    AS SELECT * FROM DEPT;

DESC DEPT_DDL;

SELECT *
FROM DEPT_DDL;

CREATE TABLE EMP_DDL_30
 AS SELECT * FROM EMP WHERE DEPTNO = 30;
 
SELECT * FROM EMP_DDL_30;

CREATE TABLE EMPDETP_DDL
    AS SELECT E.EMPNO, E.ENAME, E.JOB, E.MGR, E.HIREDATE,
              E.SAL, E.COMM, D.DEPTNO, D.DNAME, D.LOC
       FROM EMP E, DEPT D
            WHERE 1<>1;

SELECT *
FROM EMPDETP_DDL;

CREATE TABLE EMP_ALTER
    AS SELECT * FROM EMP;

SELECT * FROM EMP_ALTER;

DESC EMP_ALTER;

--ALTER 열(COLUMN)을 추가한다
ALTER TABLE EMP_ALTER
    ADD HP VARCHAR2(20); --VARCHAR로 적으면 자동으로 VARCHAR2로 인식한다.
    
ALTER TABLE EMP_ALTER
    ADD AGE NUMBER(3) DEFAULT 1; --디폴트값을 지정할 수 있다.
    
--RENAME 열(COLUMN)의 이름을 바꿔준다.
ALTER TABLE EMP_ALTER
    RENAME COLUMN HP TO TEL;

--MODIFY 열의 자료형을 변경해줌
ALTER TABLE EMP_ALTER
    MODIFY EMPNO NUMBER(5);
--수정할 때 타입의 크기가 커지는건 가능하지만 줄어드는건 안됨!
ALTER TABLE EMP_ALTER
    MODIFY EMPNO NUMBER(4);
    
SELECT * FROM EMP_ALTER;

--DROP 열(COLUMN)을 삭제해줌
ALTER TABLE EMP_ALTER
    DROP COLUMN TEL;

RENAME EMP_ALTER TO EMP_RENAME;

SELECT * FROM EMP_RENAME;

TRUNCATE TABLE EMP_RENAME;

DROP TABLE EMP_RENAME;

------------------------------------------------------------

CREATE TABLE DEPT_TEMP
    AS SELECT * FROM DEPT;

SELECT * FROM DEPT_TEMP;


--INSERT INTO 테이블에 행을 삽입해준다! 단 데이터 타입이 다르면 안됨! 데이터가 없다면 NULL이 들어간다
INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
            VALUES (50, 'DATABASE', 'SEOUL');

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)
            VALUES (50, 'DATABASE', 'SEOUL');

INSERT INTO DEPT_TEMP
            VALUES (60, 'NETWORK', 'BUSAN');

INSERT INTO DEPT_TEMP 
            VALUES(70, 'WEB', NULL);

INSERT INTO DEPT_TEMP 
            VALUES( NULL, 'MOBILE', '');
            
INSERT INTO DEPT_TEMP (DEPTNO, LOC)
            VALUES(90, 'INCHEON');
            
CREATE TABLE EMP_TEMP
    AS SELECT *
       FROM EMP
       WHERE 1<>1;

--날짜 데이터 입력하기
SELECT * FROM EMP_TEMP;

INSERT INTO EMP_TEMP (HIREDATE, ENAME, EMPNO)
            VALUES (TO_DATE('2025-05-21', 'YYYY-MM-DD') , '이순신', 2111);

INSERT INTO EMP_TEMP (HIREDATE, ENAME, EMPNO)
            VALUES (SYSDATE,  '심청이', 3111);


--VALUES 대신 SELECT를 사용해서 여러줄 삽입 가능!            
INSERT INTO EMP_TEMP
    SELECT * FROM EMP WHERE DEPTNO = 10;

----------------------------------------------------------------------
CREATE TABLE DEPT_TEMP2
AS SELECT * FROM DEPT;


--UPDATE SET 테이블 데이터 수정하기!
UPDATE DEPT_TEMP2
    SET LOC = 'SEOUL';
    
SELECT * FROM DEPT_TEMP2;

UPDATE DEPT_TEMP2
    SET DNAME = 'DATABASE',
        LOC = 'SEOUL2'
    WHERE DEPTNO =40;

--업데이트 실수 하지 않는 방법 SELECT 에서 먼저 검증하고 사용하기
SELECT * FROM DEPT_TEMP2
    WHERE DEPTNO = 40;

select * FROM EMP_TEMP;

CREATE TABLE EMP_TMP
AS SELECT * FROM EMP;

SELECT * FROM EMP_TMP;

SELECT SAL, SAL * 1.03 FROM EMP_TMP
    WHERE SAL < 1000;

UPDATE EMP_TMP
    SET SAL = SAL * 1.03
        WHERE SAL < 1000;

CREATE TABLE EMP_TEMP2
    AS SELECT * FROM EMP;
    
SELECT * FROM EMP_TEMP2;

COMMIT;          --SAVE POINT!!!

--DELETE 자료를 삭제 
DELETE EMP_TEMP2;
SELECT * FROM EMP_TEMP2;
DELETE EMP_TEMP2
    WHERE DEPTNO = 10;



--데이터 사전
SELECT * FROM DICT;


--접속한 계정의 태이블 네임을 보여준다
SELECT TABLE_NAME
FROM USER_TABLES;

--인덱스는 자료를 빠르게 찾게 해준다! 자료를 미리 정렬해둔다!
SELECT *
FROM USER_INDEXES;

SELECT * FROM USER_IND_COLUMNS;

CREATE INDEX IDX_EMP_SAL
    ON EMP(SAL);

--실행계획(PLAN)을 보고 SELECT를 쓰자! 
    --실행 계획만 볼 수 있다! 단, 실제 조회를 하지 않기 때문에 COST에 오차가 있을 수 있다!
    --실제 조회 결과를 볼 수도 있다! 단, 실제 조회 된 내용을 보여주기 때문에 느릴 수 있다! 조회 비용을 정확하게 계산할 수 있다!
SELECT /*+ INDEX(E IDX_EMP_SAL) */ --강제 힌트 INDEX를 활용하지 않을 수도 있다!
* FROM EMP E
    WHERE SAL >= 2000;

--VIEW 조회 결과를 읽기 전용 테이블을 저장해준다!
    --긴 SQL문을 저장해서 사용할때
    --필요한 정보만 보여주고 싶을 때
CREATE VIEW VW_EMP20
    AS (SELECT EMPNO, ENAME, JOB, DEPTNO
        FROM EMP
            WHERE DEPTNO = 20);
            
--SQUENCE 순서대로 숫자를 일정한 규칙대로 증가 시키는 것
    --보통은 유일하게 구분되는 값을 만들 때(PK) 사용한다
/* CREATE SEQUENCE 시퀀스 명
   INCREMENT BY 10      -10씩 증가 OR 감소
                        -기본값 안적으면 1
   START WITH 20        -20부터 시작, 기본값 1
   MAXVALUE 90          -90까지만 증가
   MINVALIE 0           -CYCLE에서 돌아가는값
   CYCLE 또는 NO CYCLE   -생략하면 NOCYCLE
                        -CYCLE이면 MAXVALUE 도달시 MINVALUE로 돌아감
   CACHE                -메모리에 미리 다음 값을 저장*/

CREATE SEQUENCE SEQ_DEPT
START WITH 10;

SELECT SEQ_DEPT.CURRVAL --현재 값 보기
FROM DUAL;

INSERT INTO DEPT_TEMP (DEPTNO, DNAME, LOC)-- 예시
VALUES (SEQ_DEPT.NEXTVAL, '테스트', '천안');

SELECT * 
FROM DEPT_TEMP;




--PRIMARY KEY =  NOT NULL + UNIQUE ,즉 NULL과 중복 데이터를 허용하지 않는 제약조건

CREATE TABLE TABLE_PK
            (LOGIN_ID  VARCHAR2(20) PRIMARY KEY,
             LOGIN_PWD VARCHAR2(20) NOT NULL,
             TEL       VARCHAR2(20));
             
CREATE TABLE TABLE_PK
            (LOGIN_ID  VARCHAR2(20) ,
             LOGIN_PWD VARCHAR2(20) ,
             TEL       VARCHAR2(20)
             PRIMARY KET (LOGIN_ID),
             NOT NULL (LOGIN_PWD));
                        
INSERT INTO TABLE_PK
    VALUES('KION2313', '0P0P0P', '010-3765-7091');
INSERT INTO TABLE_PK
    VALUES('KION2314', '0P0P0P', '010-3765-7091');

--PRIMARY KEY로 지정했을 때 안되는것들
--이미 존재하는것
INSERT INTO TABLE_PK
    VALUES('KION2313', '0P0P0P', '010-1');
--NULL로 추가    
INSERT INTO TABLE_PK
    VALUES(NULL, '0P0P0P', '010-3765-7091');
--NULL로 변경
UPDATE TABLE_PK
SET LOGIN_ID = NULL
WHERE LOGIN_ID = 'KION2313';
-- 이미 존재하는 것으로 변경
UPDATE TABLE_PK
SET LOGIN_ID = 'KION2314'
WHERE LOGIN_ID = 'KION2313';

SELECT *
FROM TABLE_PK;

--FOREIGN KEY 내 컬럼 값이 다른 테이블의 특정 컬럼(PK)를 참조하게 제약 하는 것
    --다른 테이블의 PK로 지정된 가질 수 있다.
    --참조가 유지되는 동안 참조 값들을 변경하거나 지울 수 없다.
CREATE TABLE DEPT_FK(
   DEPTNO NUMBER(2) CONSTRAINT PK_DEPT_FK PRIMARY KEY,
   DNAME VARCHAR2(20),
   LOC VARCHAR2(13)
   );

SELECT * FROM DEPT_FK;

CREATE TABLE EMP_FK(
   EMPNO NUMBER(4) CONSTRAINT PK_EMP_FK PRIMARY KEY,
   ENAME VARCHAR2(20),
   DMPTNO NUMBER(2) CONSTRAINT FK_EMP_FK REFERENCES DEPT_FK(DEPTNO)
   );

CREATE TABLE EMP_FK(
   EMPNO NUMBER(4) CONSTRAINT PK_EMP_FK PRIMARY KEY,
   ENAME VARCHAR2(20),
   DMPTNO NUMBER(2), 
   PRIMARY KEY(EMPNO),
   FOREIGN KEY (DEPTNO) REFERENCES DEPT_FK(DEPTNO)
   );
SELECT * FROM EMP_FK;

INSERT INTO DEPT_FK
    VALUES (15, '잡부', '서울');

INSERT INTO EMP_FK
    VALUES (1234, '홍길동', 20);

UPDATE DEPT_FK
SET DEPTNO = 20
WHERE DEPTNO = 15;

DELETE DEPT_FK
WHERE DEPTNO = 15;

DELETE EMP_FK;


SELECT JOB, COUNT(*)
FROM EMP
    GROUP BY JOB
    HAVING COUNT(*) >= 3;
    
DESC DEPT;

create table tbl_todo (
    tno number primary key,
    title varchar2(4000) not null,
    dueDate date,
    finished number(1)
);
select *from tbl_todo;

create sequence seq_tbl_todo;

insert into tbl_todo (tno, title, duedate, finished)
values(seq_tbl_todo.nextval(), '연습1', null, 0 );

DELETE tbl_todo
where tno = 1;

commit;

select * from tbl_todo
where tno = 15;

update tbl_todo
set title='심재원',
    duedate = '2025-01-01',
    finished = 1
    where tno=16;

select * from emp2;

create table emp2
as select * from emp;

delete emp2
where empno = 7369;

create table movie (
    movie_id number(3) primary key,
    title varchar2(4000),
    img_url varchar2(4000),
    open_date date
);
insert into movie (movie_id, title, img_url, open_date)
values(111, '연습1', null, '2025-07-16' );

select * from movie;
commit;