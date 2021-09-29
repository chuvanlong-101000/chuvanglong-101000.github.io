Sử dụng Database sakila, thực hiện các câu truy vấn:
1, Lấy tên phim, rating, special_features các bộ phim có ratig là NC-17 hoặc R, có special_features là Trailers
    
    SELECT title, rating, special_features
    FROM film
    WHERE (rating = 'NC-17' or rating = 'R')
    AND special_features = 'Trailers'

2, Lấy ra tên phim, lenght các bộ phim có lenght nhỏ hơn 70 hoặc lớn hơn 100. Sắp xếp phim theo thứ tự lenght tăng dần
    
    SELECT title, length
    FROM file
    WHERE (lenght > 100 or lenght < 70)
    ORDER BY lenght

3, Lấy ra các actor có first_name bắt đầu là chữ B và sắp xếp theo thứ tự last_name tăng dần

    SELECT *
    FROM actor 
    WHERE first_name LIKE 'B%'
    ORDER BY last_name

4, Lấy ra các bộ phim không có chứa từ 'LIFE' , không phải rating PG và sắp xếp theo thứ tự lenght giảm dần 
    
    SELECT * FROM film
    WHERE title NOT LIKE 'LIKE'
    AND rating NOT LIKE 'PG'
    ORDER BY lenght DESC

