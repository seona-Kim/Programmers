SELECT flavor
FROM (
    SELECT f.flavor, f.total_order + j.total_order AS sum
    FROM first_half f
    JOIN (
        SELECT flavor, SUM(total_order) AS total_order
        FROM july
        GROUP BY flavor
    ) j ON f.flavor = j.flavor
    ORDER BY sum DESC
)
WHERE ROWNUM <= 3;
