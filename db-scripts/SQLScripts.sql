select * from employees;
-- Command to concatenate
select first_name || ' ' || last_name as "Full Name" from employees;
-- using upper() and lower() functions to convert the case
select upper(first_name), lower(first_name) from employees;


-- alternative quote operator
select q'[it's raining in mumbai]' as "Mumbai climate" from dual;

-- use where with =, <, >, like, between, in and so on
select first_name, last_name, salary from employees where employee_id=110;
select first_name, last_name, salary from employees where salary between 1000 and 5000;
select employee_id, first_name, last_name, salary from employees 
    where employee_id in (100,110,120);
select first_name, last_name from employees where first_name like 'A%';
--2nd char must be 'a', _ matches a single character
select first_name, last_name from employees where first_name like '_a%'; 
-- list all the employees who joined between some date range
select first_name, hire_date from employees where hire_date 
    between '01-Jan-2001' and '31-Dec-2005';
-- use to_char to specify the date format
select hire_date, to_char(hire_date, 'DD-MM-YYYY') as "HIRE_DATE2" from employees;
-- sorting
select employee_id, first_name, manager_id, salary from employees order by employee_id;

-- Day2 of SQL
-- Getting the current date and time
select CURRENT_DATE, CURRENT_TIMESTAMP from dual;
-- Date manipulation 
select hire_date, ADD_MONTHS(hire_date, 6) as REVIEW_DATE from employees where EMPLOYEE_ID=102;
select MONTHS_BETWEEN(current_date, hire_date)/12 as "ExpInYrs" from employees where EMPLOYEE_ID=102;
-- using trunc function to reduce the fractional points passing a function to another function
select hire_date,
trunc(MONTHS_BETWEEN(current_date, hire_date)/12,2) as "ExpInYrs" 
from employees where EMPLOYEE_ID=102;
-- using trunc function to reduce the fractional points passing a function to another function
select first_name, hire_date,
trunc(MONTHS_BETWEEN(current_date, hire_date)/12,2) as "ExpInYrs" 
from employees;
-- using character functions - upper, lower, initcap, length, replace, substr
select 
initcap('hello everyone, today is tuesday') as "INIT", 
length('hello everyone') as "LEN", 
replace('jack and jue', 'j', 'bl') as "REPLC"
from dual;

select 25/10, round(25/10), trunc(25/10, 1), floor(25/10), ceil(25/10) from dual;
-- conversion functions - formats - YYYY-MM-DD, YYYY-MON-DD, YY-MM-DD
select to_char(current_date, 'YYYY-MON-DD') from dual;
select 
hire_date, 
to_char(hire_date, 'YYYY/MON/DD') 
from employees where employee_id=102;
-- using to_date
select to_date('2025-01-30', 'YYYY-MM-DD') from dual;
select to_char(to_date('75-Jul-29', 'RR-MM-DD'), 'YYYY-MON-DD') from dual;--1975
select to_char(to_date('25-Jul-29', 'RR-MM-DD'), 'YYYY-MON-DD') from dual;--2025
select to_char(to_date('50-Jul-29', 'RR-MM-DD'), 'YYYY-MON-DD') from dual;--1950

-- count(*), max(column), min(column), avg(column)
select count(*) from employees;
select count(*) from departments;
select max(salary) from employees;

-- total number of employees belonging to each department
select department_id, count(department_id) from employees GROUP BY department_id;
-- having is used to filter the aggregated result
select department_id, count(department_id) 
from employees GROUP BY department_id having count(department_id) > 20;