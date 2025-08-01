set serveroutput on; -- this is to display console logs in the DB terminal

-- hello world program
begin 
DBMS_OUTPUT.PUT_LINE('Hello PLSQL');
end;

-- printing our name
DECLARE
name VARCHAR2(20) := 'Kishor';
    BEGIN
        DBMS_OUTPUT.PUT_LINE('Hello '||name);
    END;

-- creating procedures that are reusable
CREATE OR REPLACE PROCEDURE 
    insert_student_record(rollno number, name varchar2, email varchar2)
AS
BEGIN
    INSERT INTO STUDENTS values(rollno, name, email);
    COMMIT;
END;
-- invoking the procedure
BEGIN
    INSERT_STUDENT_RECORD(8, 'Sheela', 'sh@g');
    INSERT_STUDENT_RECORD(9, 'Nikhil', 'n@g');
    INSERT_STUDENT_RECORD(10, 'Sachin', 'sa@g');
END;

-- PROCEDURE to find the student record
CREATE OR REPLACE PROCEDURE FIND_STUDENT(roll_in number) AS
name_s varchar2(20);
email_s varchar2(20);
BEGIN
    SELECT name, email INTO name_s, email_s FROM STUDENTS WHERE roll_no=roll_in;
    DBMS_OUTPUT.PUT_LINE('Name= ' || name_s || ' Email= '||email_s);
END;
-- call the above procedure
call FIND_STUDENT(3);