SET MYSCHEMA;

INSERT INTO TABLE_DST (COLUMNS_DST)
SELECT COLUMNS_SRC
FROM TABLE_SRC
;
