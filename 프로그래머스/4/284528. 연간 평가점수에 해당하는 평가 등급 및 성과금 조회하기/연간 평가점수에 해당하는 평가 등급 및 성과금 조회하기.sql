-- 코드를 작성해주세요
SELECT B.EMP_NO, B.EMP_NAME, 
    CASE
        WHEN AVG(SCORE) >= 96 THEN 'S'
        WHEN AVG(SCORE) >= 90 THEN 'A'
        WHEN AVG(SCORE) >= 80 THEN 'B'
        ELSE 'C'
    END AS GRADE,
    CASE
        WHEN AVG(SCORE) >= 96 THEN SAL * 20 / 100
        WHEN AVG(SCORE) >= 90 THEN SAL * 15 / 100
        WHEN AVG(SCORE) >= 80 THEN SAL * 10 / 100
        ELSE 0
    END AS BONUS
FROM HR_EMPLOYEES B JOIN HR_GRADE C ON B.EMP_NO = C.EMP_NO
GROUP BY B.EMP_NO, B.EMP_NAME
ORDER BY B.EMP_NO;