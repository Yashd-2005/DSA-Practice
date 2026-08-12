# Write your MySQL query statement below
select t.request_at as Day ,
    ROUND(
        Sum(
            case 
            when status ="cancelled_by_driver" 
            or status="cancelled_by_client "
            then 1 
            else 0 end )
            /
            Count(request_at),2)    as "Cancellation Rate"
from Trips t
Join Users u
On t.client_id=u.users_id 
AND u.banned='No'
JOIN Users u1

On t.driver_id=u1.users_id 
AND u1.banned='No'
where t.request_at between "2013-10-01" and "2013-10-03"
GROUP BY t.request_at
order by request_at;


