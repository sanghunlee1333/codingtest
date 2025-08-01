-- 코드를 입력하세요
SELECT 
    A.CAR_ID, 
    A.CAR_TYPE, 
    DAILY_FEE * 30 * (100 - DISCOUNT_RATE) / 100 AS FEE
FROM CAR_RENTAL_COMPANY_CAR A
JOIN (
    SELECT CAR_TYPE, DISCOUNT_RATE 
    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
    WHERE DURATION_TYPE = '30일 이상'
    ) C
    ON A.CAR_TYPE = C.CAR_TYPE
WHERE A.CAR_TYPE IN ('SUV', '세단') -- SUV, 세단 중 하나인 자동차 들 중에서
AND NOT EXISTS (
    SELECT 1 
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY B
    WHERE A.CAR_ID = B.CAR_ID
    AND START_DATE <= TO_DATE('2022-11-30', 'YYYY-MM-DD') -- 기간 체크
    AND END_DATE >= TO_DATE('2022-11-01', 'YYYY-MM-DD')
    )
AND (DAILY_FEE * (100 - DISCOUNT_RATE) / 100 * 30 >= 500000 -- 요금 체크
AND DAILY_FEE * (100 - DISCOUNT_RATE) / 100 * 30 < 1999999)
ORDER BY FEE DESC, A.CAR_TYPE, A.CAR_ID DESC;