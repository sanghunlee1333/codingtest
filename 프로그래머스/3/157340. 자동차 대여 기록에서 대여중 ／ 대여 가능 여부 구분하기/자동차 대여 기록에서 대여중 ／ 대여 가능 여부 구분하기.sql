-- 코드를 입력하세요
SELECT A.CAR_ID, 
    CASE 
        WHEN A.CAR_ID IN 
            (SELECT CAR_ID
                FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
                WHERE TO_DATE('2022-10-16', 'YYYY-MM-DD') 
                    BETWEEN START_DATE AND END_DATE
            ) -- 대여기간에 2022-10-16이 포함된 자동차 ID THEN '대여 가능'
        THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM 
    (SELECT DISTINCT CAR_ID 
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    ) A
ORDER BY A.CAR_ID DESC;