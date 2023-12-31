-- 코드를 입력하세요
SELECT 
    UGU.USER_ID, 
    UGU.NICKNAME, 
    CONCAT_WS(' ', 
              UGU.CITY, 
              UGU.STREET_ADDRESS1, 
              UGU.STREET_ADDRESS2) AS `전체주소`,
    CONCAT_WS('-', 
              SUBSTR(UGU.TLNO, 1, 3), 
              SUBSTR(UGU.TLNO, 4, LENGTH(UGU.TLNO) - 7), 
              SUBSTR(UGU.TLNO, -4, 4)) AS `전화번호`
FROM USED_GOODS_USER UGU
INNER JOIN USED_GOODS_BOARD UGB ON UGU.USER_ID = UGB.WRITER_ID
GROUP BY UGU.USER_ID
HAVING COUNT(*) >= 3
ORDER BY UGU.USER_ID DESC;