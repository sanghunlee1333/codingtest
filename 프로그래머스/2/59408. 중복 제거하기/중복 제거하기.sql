-- 코드를 입력하세요
SELECT COUNT(NAME) FROM (SELECT NAME FROM ANIMAL_INS GROUP BY NAME);