-- 코드를 입력하세요
SELECT AO.ANIMAL_ID, AO.NAME
FROM ANIMAL_OUTS AO
INNER JOIN ANIMAL_INS AI ON AO.ANIMAL_ID = AI.ANIMAL_ID
ORDER BY DATEDIFF(AO.DATETIME, AI.DATETIME) DESC
LIMIT 2;

-- '입양을 간 동물' 중, '보호기간이 가장 긴' 동물 '두 마리'의 '아이디'와 '이름'을 '보호기간이 긴 순으로' 조회