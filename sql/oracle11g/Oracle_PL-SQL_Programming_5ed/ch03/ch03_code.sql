SET SERVEROUTPUT ON;

DECLARE
   l_right_now   VARCHAR2 (9);
BEGIN
   l_right_now := SYSDATE;
   DBMS_OUTPUT.put_line (l_right_now);
END;
/

CREATE OR REPLACE PROCEDURE get_happy(ename_in VARCHAR2)
IS
    l_hiredate DATE;
BEGIN
    l_hiredate := SYSDATE - 2;
    INSERT INTO EMPLOYEES
        (first_name, hire_date)
    VALUES (ename_in, l_hiredate);
EXCEPTION
    WHEN DUP_VAL_IN_INDEX
    THEN
        DBMS_OUTPUT.PUT_LINE('Cannot insert.');
END;
/

DECLARE 
    l_right_now VARCHAR2(9);
BEGIN
    l_right_now := SYSDATE;
    DBMS_OUTPUT.PUT_LINE(l_right_now);
EXCEPTION
    WHEN VALUE_ERROR
    THEN
        DBMS_OUTPUT.PUT_LINE('I bet l_right_now is too small ' || 'for the default date format!');
END;
/

CREATE OR REPLACE PROCEDURE calc_totals
IS
    year_total NUMBER;
BEGIN
    year_total := 0;
    
    /* Beginning of nested block */
    DECLARE
        month_total NUMBER;
        BEGIN
            month_total := year_total / 12;
        END set_month_total;
    /* End of nested block */
END;
/

CREATE OR REPLACE PACKAGE BODY scope_demo
IS
    PROCEDURE set_global (number_in IN NUMBER)
    IS
        l_salary NUMBER := 10000;
        l_count PLS_INTEGER;
    BEGIN
        <<local_block>>
        DECLARE
            l_inner NUMBER;
        BEGIN
            SELECT COUNT ( * )
                INTO l_count
                FROM employees
                WHERE department_id = l_inner AND salary > l_salary;
        END local_block;
        
        g_global := number_in;
    END set_global;
END scope_demo;
/

CREATE OR REPLACE PACKAGE BODY scope_demo
IS
    PROCEDURE set_global (number_in IN NUMBER)
    IS
        l_salary NUMBER := 10000;
        l_count PLS_INTEGER;
    BEGIN
        <<local_block>>
        DECLARE
            l_inner NUMBER;
        BEGIN
            SELECT COUNT ( * )
                INTO set_global.l_count
                FROM employees e
                WHERE e.department_id = local_block.l_inner 
                AND e.salary > set_global.l_salary;
        END local_block;
        
        scope_demo.g_global := set_global.number_in;
    END set_global;
END scope_demo;
/

DECLARE
   first_day   DATE;
   LAST_DAY    DATE;
BEGIN
   first_day := SYSDATE;
   LAST_DAY := ADD_MONTHS (first_day, 6);
END;
/
