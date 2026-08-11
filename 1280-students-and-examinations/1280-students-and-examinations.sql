# Write your MySQL query statement below
select s.student_id,s.student_name,s1.subject_name,count(e.subject_name) as attended_exams
from Students s
Cross Join Subjects s1
Left join Examinations e
on s1.subject_name=e.subject_name
AND s.student_id=e.student_id
group by  s.student_id,s.student_name,s1.subject_name
order by s.student_id,s1.subject_name 
asc;