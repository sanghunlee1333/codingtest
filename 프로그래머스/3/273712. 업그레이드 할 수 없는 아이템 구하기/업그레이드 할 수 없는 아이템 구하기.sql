-- 코드를 작성해주세요
SELECT A.ITEM_ID, ITEM_NAME, RARITY FROM ITEM_INFO A
LEFT OUTER JOIN ITEM_TREE B ON A.ITEM_ID = B.PARENT_ITEM_ID
WHERE PARENT_ITEM_ID IS NULL
ORDER BY A.ITEM_ID DESC;