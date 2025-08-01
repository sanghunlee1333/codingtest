-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD')
FROM MEMBER_PROFILE 
WHERE TO_CHAR(DATE_OF_BIRTH, 'MM') = '03' AND GENDER = 'W'
AND TLNO IS NOT NULL
ORDER BY MEMBER_ID ASC;