/*
 * public class SQLD_20230527 {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * 1. FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY
 * 
 * 2. DML SELECT, INSERT, UPDATE, DELETE
 * 
 * DDL CREATE, ALTER, MODIFY, DROP
 * 
 * TCL ROLLBACK, COMMIT
 * 
 * DCL GRANT, REVOKE
 * 
 * 3. DISTINCT (집약) -> 중복제거
 * 
 * 4. AS + as 생략가능 + 컬럼명에 띄어쓰기
 * 
 * FROM에서 AS 사용 절대 불가
 * 
 * 5. CONCAT + SQL 서버 || ORACLE0.80 concat ((),()) 인수가 딱 2개만 가능
 * 
 * 6. 논리 연산자 and or not
 * 
 * A and B 짜장면 짱뽕 두개 먹겠다 A or B 짜장면 짬뽕 둘중 하나 A not B 둘다 안먹겠다.
 * 
 * 7. 연산순위 1. not 2. and 3. or 나오 ~
 * 
 * 8. SQL 연산자 BETWEEN 1 AND 2 A IN (1,2,3) LIKE _ 미지의 한글자 % 0이상의 글자 ESCAPE @_ ->
 * 아무문자나 됨 ROWNUM (ORACLE) TOP 상위 (n) 갯수를 가져온다.(SQL SERVER) ROWNUM SELECT FROM
 * WHERE ORDER BY
 * 
 * 9. NULL 5문제 넘게나옴
 * 
 * 1. NULL의 정의 >> 부재, 모르는 값 2. NULL +2, NULL -4 = UNKNOW 알수없음 값 3. 정렬상의 의미
 * ORACLE NULL이 마지막 SQL NULL이 먼저 4. NVL. NVL2, ISNULL 널뛰기 NULL IF 같이 놀자 COALESCE
 * 널아닌 첫번째값 무제한
 * 
 * 10. 정렬 1. 정렬의 특성 >> 가장 마지막에 실행 >> 성능이 느려질 가능성 >> NULL 값과의 관계 오라클에서는 무한대의 값 2.
 * 컬럼 번호 정렬 3. 인수 두개 정렬
 * 
 * 11. 숫자 함수 >> ROUND >> CEIL / CEILING
 * 
 * 12. UPPER, LOWER 대문자 소문자 LPAD, PRAD, LTRIM RTRIM
 * 
 * 13. TO_CHAR, TO_DATE 실습 형변환 >> 다음중 데이터의 형변환을 일으키는 함수는 ? 이런식으로 문제나옴 SYSDATE
 * ORACLE / GETDATE SQL 날짜데이터 +100 은 DAY로 들어간다
 * 
 * 14. case , when , then , else -> else 가 없는 경우, 조건 1 , 조건2가 만족하지않는 경우 null로
 * 출력된다.
 * 
 * 15. 집계함수 >> null과의 관계 >> sum은 null 미포함 >> count는 포함한다.
 * 
 * 16. GROUP BY 집약기능 >> WHERE 다음에 실행됨 >> 그룹 수준 정보 바꾼다.
 * 
 * 17. JOIN >> 1. NATURAL JOIN , USING -> 유징은 ALIAS 사용 안됨 >> 중복된 컬럼 하나 >> 제일 앞에
 * 등장 >> 2. left outer JOIN a left outer join B
 * 
 * 18. 서브쿼리 >> select from where (group by) having order by
 * 
 * 19. 집합 연산자 union, intercept, minus, union all 정렬작업 o 정렬작업이 있기때문에 느리다. union
 * all이 가장 빠름
 * 
 * 20. DDL -> TCL >> TRUMCATE 입주민 철거 구조가 남아있다. VS DROP 건물 철거 구조도 삭제 >> TRUMCATE
 * DDL VS DELETE DML >> ROLLBACK, COMMIT
 * 
 * 21. DML >> INSERT, UPDATE, DELETE / MARGE >> TCL, COMMIT ROLLBACK >> MARGE
 * 
 * 22. 제약조건 중요함 PK -> UNIQUE + NOT NULL 합친것 UNIQUE
 * 
 * 23. DCL >> GRANT , REVOKE >> ROLE 특징 >> 객체
 * 
 * 24. VIEW >> 독편보 >> 독립성,편리성, 보안성
 * 
 * 25. 그룹함수 주용 >> ROLL UP , CUBE, GROUPING SETS QL
 * 
 * 26. TCL COMMIT, ROLL BACK , AUTO COMMIT
 * 
 * 
 * }
 * 
 * }
 */