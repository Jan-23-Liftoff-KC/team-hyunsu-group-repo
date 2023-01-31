-- Part 1: Test it with SQL
SELECT COLUMN_NAME, DATA_TYPE from INFORMATION_SCHEMA. COLUMNS where table_schema = 'user_registration' and table_name = 'user';
-- Part 2: Test it with SQL
SELECT name FROM employer WHERE location = "St. Louis City";
-- Part 3: Test it with SQL
DROP TABLE user;
-- Part 4: Test it with SQL
SELECT * FROM skill INNER JOIN job_skills ON skill.id = job_skills.skills_id WHERE job_skills.jobs_id IS NOT NULL ORDER BY name ASC;
