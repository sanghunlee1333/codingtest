-- 코드를 입력하세요
SELECT TO_NUMBER(TO_CHAR(SALES_DATE, 'YYYY')) AS YEAR, 
    TO_NUMBER(TO_CHAR(SALES_DATE, 'MM')) AS MONTH,
    GENDER, COUNT(DISTINCT A.USER_ID) AS USERS
FROM ONLINE_SALE A 
JOIN USER_INFO B ON A.USER_ID = B.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY TO_NUMBER(TO_CHAR(SALES_DATE, 'YYYY')), 
    TO_NUMBER(TO_CHAR(SALES_DATE, 'MM')),
    GENDER
ORDER BY YEAR, MONTH, GENDER;