-- 코드를 입력하세요
SELECT YEAR(OS.SALES_DATE) AS YEAR, MONTH(OS.SALES_DATE) AS MONTH, UI.GENDER, COUNT(DISTINCT(UI.USER_ID)) AS USERS
FROM ONLINE_SALE OS
INNER JOIN USER_INFO UI ON OS.USER_ID = UI.USER_ID AND UI.GENDER IS NOT NULL
GROUP BY YEAR, MONTH, UI.GENDER
ORDER BY YEAR ASC, MONTH ASC, UI.GENDER ASC;