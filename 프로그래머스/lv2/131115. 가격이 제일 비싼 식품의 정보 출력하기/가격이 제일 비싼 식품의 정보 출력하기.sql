-- 코드를 입력하세요
-- SELECT * FROM FOOD_PRODUCT ORDER BY PRICE DESC LIMIT 1;
SELECT
    *
FROM
    FOOD_PRODUCT
WHERE
    PRICE = (
        SELECT
            MAX(PRICE)
        FROM
            FOOD_PRODUCT
    );