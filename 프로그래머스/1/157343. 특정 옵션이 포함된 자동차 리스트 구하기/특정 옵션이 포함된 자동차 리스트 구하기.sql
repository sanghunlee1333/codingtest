-- 코드를 입력하세요
SELECT CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS 
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE('%네비게이션%')
ORDER BY CAR_ID DESC;