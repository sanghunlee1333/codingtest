-- 코드를 입력하세요
SELECT C.FLAVOR FROM 
    (SELECT A.FLAVOR, A.TOTAL_ORDER + JULY_TOTAL AS TOTAL -- 맛별 총 주문량
    FROM FIRST_HALF A -- 상반기 총 주문정보에서
    LEFT OUTER JOIN -- 7월에는 없는 맛도 있으므로
        (SELECT FLAVOR, SUM(TOTAL_ORDER) AS JULY_TOTAL -- 7월 맛별 총 주문량
        FROM JULY
        GROUP BY FLAVOR
        ORDER BY FLAVOR) B
    ON A.FLAVOR = B.FLAVOR -- 맛을 기준으로 
    ORDER BY TOTAL DESC) C -- 총 주문량 내림차수
WHERE ROWNUM <= 3;
 