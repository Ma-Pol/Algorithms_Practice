-- 코드를 입력하세요
SELECT P.*
FROM PLACES P
INNER JOIN (
        SELECT HOST_ID
        FROM PLACES
        GROUP BY HOST_ID
        HAVING COUNT(*) >= 2
    ) H ON P.HOST_ID = H.HOST_ID;
