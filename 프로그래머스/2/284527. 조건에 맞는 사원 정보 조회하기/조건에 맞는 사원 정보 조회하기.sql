-- 코드를 작성해주세요
SELECT SUM(SCORE) AS SCORE, A.EMP_NO, EMP_NAME, POSITION, EMAIL
FROM HR_EMPLOYEES A JOIN HR_GRADE B ON A.EMP_NO = B.EMP_NO
GROUP BY A.EMP_NO, EMP_NAME, POSITION, EMAIL
HAVING SUM(SCORE) = -- 총합 평가 점수가 가장 큰 것만 필터링
    (SELECT MAX(TOTAL_SCORE) -- 총합 평가 점수가 가장 큰 점수 1개만 조회(스칼라 서브쿼리)
        FROM ( -- 사원 별 총합 평가 점수 리스트로부터(타인들의 SUM과 비교해서 최고값인지 판단)
            SELECT EMP_NO, SUM(SCORE) AS TOTAL_SCORE 
            FROM HR_GRADE 
            GROUP BY EMP_NO
            ) AS SUB -- 서브쿼리는 별칭 필수
     );
        
