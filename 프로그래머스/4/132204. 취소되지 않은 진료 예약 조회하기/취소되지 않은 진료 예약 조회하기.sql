-- 코드를 입력하세요
-- 2022년 4월 13일 
-- 취소되지 않은 
-- 흉부외과(CS) 진료 예약 내역을 조회하는 SQL문을 작성해주세요. 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 항목이 출력되도록 작성해주세요. 결과는 진료예약일시를 기준으로 오름차순 정렬해주세요.
SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, A.MCDP_CD, D.DR_NAME, A.APNT_YMD
FROM PATIENT P
INNER JOIN APPOINTMENT A ON A.APNT_CNCL_YN = 'N' AND A.APNT_YMD LIKE '2022-04-13%' AND P.PT_NO = A.PT_NO
INNER JOIN DOCTOR D ON A.MDDR_ID = D.DR_ID
ORDER BY A.APNT_YMD ASC;