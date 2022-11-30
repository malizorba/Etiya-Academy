--TARİH FARKINI HESAPLAYAN FONKSIYON
------------------------------------------------------------------------------------
CREATE OR REPLACE FUNCTION DateDiff (units VARCHAR(30), start_t TIMESTAMP, end_t TIMESTAMP) 
     RETURNS INT AS $$
   DECLARE
     diff_interval INTERVAL; 
     diff INT = 0;
     years_diff INT = 0;
   BEGIN
     IF units IN ('yy', 'yyyy', 'year', 'mm', 'm', 'month') THEN
       years_diff = DATE_PART('year', end_t) - DATE_PART('year', start_t);
IF units IN ('yy', 'yyyy', 'year') THEN
         -- SQL Server does not count full years passed (only difference between year parts)
         RETURN years_diff;
       ELSE
         -- If end month is less than start month it will subtracted
         RETURN years_diff * 12 + (DATE_PART('month', end_t) - DATE_PART('month', start_t)); 
       END IF;
     END IF;
 
     -- Minus operator returns interval 'DDD days HH:MI:SS'
     diff_interval = end_t - start_t;
 
     diff = diff + DATE_PART('day', diff_interval);
 
     IF units IN ('wk', 'ww', 'week') THEN
       diff = diff/7;
       RETURN diff;
     END IF;
 
     IF units IN ('dd', 'd', 'day') THEN
       RETURN diff;
     END IF;
 
     diff = diff * 24 + DATE_PART('hour', diff_interval); 
 
     IF units IN ('hh', 'hour') THEN
        RETURN diff;
     END IF;
 
     diff = diff * 60 + DATE_PART('minute', diff_interval);
 
     IF units IN ('mi', 'n', 'minute') THEN
        RETURN diff;
     END IF;
 
     diff = diff * 60 + DATE_PART('second', diff_interval);
 
     RETURN diff;
   END;
   $$ LANGUAGE plpgsql;

   
   select datediff('year', birthday, current_date)
from customers

--ÜRÜN VE ÖDEME TÜRÜNÜ GETIREN SANAL TABLO
---------------------------------------------------------------------
CREATE VIEW Product_PaymentType AS
SELECT pr.name as "ürün adı",pt.name as "ödeme tipi" from Products pr
inner join order_details od on pr.id=od.product_id
inner join orders orr on orr.id=od.order_id
inner join payments ps on ps.id=orr.payment_id
inner join payment_types pt on pt.id=ps.payment_type_id

select * from Product_PaymentType

--TOPLAM STOK BILGISINI GETIREN FONKSIYON
---------------------------------------------------------------------
CREATE or replace function urun_toplam()
returns integer
language plpgsql 
as
$$
declare 
toplam integer;
begin 
toplam:=SUM(stock) from products;
return toplam;
end;
$$;
SELECT urun_toplam()

--SİPARİŞ VERİLEN ŞEHİRLERİ VE MÜŞTERİ NO  LARINI GETIREN SANAL TABLO
------------------------------------------------------------------------------
CREATE VIEW City__customer AS
select ci.name as "city_name",cu.customer_no from cities ci
inner join addresses addr on ci.id = addr.city_id
inner join customers cu on addr.customer_id = cu.id
inner join orders o on cu.id = o.customer_id

select * from City__customer





