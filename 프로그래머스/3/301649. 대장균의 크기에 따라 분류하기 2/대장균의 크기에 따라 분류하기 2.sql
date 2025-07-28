-- 코드를 작성해주세요
WITH RANKED AS (
    SELECT 
        ID, 
        SIZE_OF_COLONY, -- 개체 크기
        ROW_NUMBER() OVER(ORDER BY SIZE_OF_COLONY DESC) 
            AS RN, -- 크기별로 내림차순해서 순서매김
        COUNT(*) OVER() AS TOTAL -- 전체 개수도 행 마다 매겨줌 
    FROM ECOLI_DATA
)
SELECT ID, 
    CASE
        WHEN RN <= TOTAL * 1 / 4 THEN 'CRITICAL'
        WHEN RN <= TOTAL * 2 / 4 THEN 'HIGH'
        WHEN RN <= TOTAL * 3 / 4 THEN 'MEDIUM'
        ELSE 'LOW'
    END AS COLONY_NAME
FROM RANKED
ORDER BY ID;