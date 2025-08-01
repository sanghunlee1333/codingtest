-- 코드를 작성해주세요
SELECT 
    CASE 
        WHEN MONTH(DIFFERENTIATION_DATE) IN (1, 2, 3) THEN '1Q'
        WHEN MONTH(DIFFERENTIATION_DATE) IN (4, 5, 6) THEN '2Q'
        WHEN MONTH(DIFFERENTIATION_DATE) IN (7, 8, 9) THEN '3Q'
        ELSE '4Q'
    END AS QUARTER,
    COUNT(*) AS ECOLI_COUNT
FROM ECOLI_DATA
GROUP BY QUARTER
ORDER BY QUARTER;