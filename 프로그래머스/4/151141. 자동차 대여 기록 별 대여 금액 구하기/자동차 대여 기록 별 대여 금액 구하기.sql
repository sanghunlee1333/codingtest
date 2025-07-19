-- 코드를 입력하세요
SELECT HISTORY_ID, 
    A.DAILY_FEE * (END_DATE - START_DATE + 1) * 
    (100 - NVL(C.DISCOUNT_RATE, 
               CASE
                    WHEN END_DATE - START_DATE + 1 >= 90 THEN 10
                    WHEN END_DATE - START_DATE + 1 >= 30 THEN 7
                    WHEN END_DATE - START_DATE + 1 >= 7 THEN 5
                    ELSE 0
               END
        )
    ) / 100 AS FEE 
FROM CAR_RENTAL_COMPANY_CAR A
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY B ON A.CAR_ID = B.CAR_ID
LEFT OUTER JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN C ON A.CAR_TYPE = C.CAR_TYPE 
    AND C.DURATION_TYPE = 
        CASE
            WHEN (END_DATE - START_DATE + 1) >= 90 THEN '90일 이상'
            WHEN (END_DATE - START_DATE + 1) >= 30 THEN '30일 이상'
            WHEN (END_DATE - START_DATE + 1) >= 7 THEN '7일 이상'
            ELSE '없음'
        END
WHERE A.CAR_TYPE = '트럭'
ORDER BY FEE DESC, HISTORY_ID DESC;