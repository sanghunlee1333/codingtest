SELECT 
    CHILD.ITEM_ID, 
    CHILD.ITEM_NAME, 
    CHILD.RARITY
FROM ITEM_TREE T
JOIN ITEM_INFO PARENT ON T.PARENT_ITEM_ID = PARENT.ITEM_ID
JOIN ITEM_INFO CHILD ON T.ITEM_ID = CHILD.ITEM_ID
WHERE PARENT.RARITY = 'RARE'
ORDER BY CHILD.ITEM_ID DESC;