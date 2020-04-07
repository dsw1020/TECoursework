BEGIN;

CREATE TABLE job_titles
(
	id serial,
	title varchar(64) NOT NULL,
	CONSTRAINT pk_job_titles_id PRIMARY KEY (id)
);

CREATE TABLE dates
(
	id serial,
	date_added timestamp DEFAULT NOW() NOT NULL,
	CONSTRAINT pk_dates_id PRIMARY KEY (id)
);

CREATE TABLE departments
(
	department_number serial,
	name varchar(64) NOT NULL,
	CONSTRAINT pk_departments_department_number PRIMARY KEY (department_number)
);

CREATE TABLE employees
(
	employee_number serial,
	job_title_id integer NOT NULL,
	first_name varchar(32) NOT NULL,
	last_name varchar(32) NOT NULL,
	gender varchar(16),
	birthday_id integer NOT NULL,
	hire_date_id integer NOT NULL,
	department_id integer NOT NULL,
	CONSTRAINT pk_employees_employee_number PRIMARY KEY (employee_number),
	CONSTRAINT fk_employees_job_title_id FOREIGN KEY (job_title_id) REFERENCES job_titles (id),
	CONSTRAINT fk_employees_birthday_id FOREIGN KEY (birthday_id) REFERENCES dates (id),
	CONSTRAINT fk_employees_hire_date_id FOREIGN KEY (hire_date_id) REFERENCES dates (id),
	CONSTRAINT fk_employees_department_id FOREIGN KEY (department_id) REFERENCES departments (department_number)
);

CREATE TABLE projects
(
	project_number serial,
	name varchar(64) NOT NULL,
	start_date_id integer NOT NULL,
	CONSTRAINT pk_projects_project_number PRIMARY KEY (project_number)
);

CREATE TABLE projects_employees
(
	projects_id integer NOT NULL,
	employees_id integer NOT NULL,
	CONSTRAINT pk_projects_employees_projects_id_employees_id PRIMARY KEY (projects_id, employees_id)
);

-- Insertion

INSERT INTO departments (department_number, name) VALUES (1, 'Sales');
INSERT INTO departments (department_number, name) VALUES (2, 'Strategy and Development');
INSERT INTO departments (department_number, name) VALUES (3, 'R&D');

SELECT setval(pg_get_serial_sequence('departments', 'department_number'), 4);

INSERT INTO dates (id) VALUES (1);
INSERT INTO dates (id) VALUES (2);
INSERT INTO dates (id) VALUES (3);
INSERT INTO dates (id) VALUES (4);

INSERT INTO projects (project_number, name, start_date_id) VALUES (1, 'Hot Steel', 1);
INSERT INTO projects (project_number, name, start_date_id) VALUES (2, 'Project Maverick', 2);
INSERT INTO projects (project_number, name, start_date_id) VALUES (3, 'Project Terrapin', 3);
INSERT INTO projects (project_number, name, start_date_id) VALUES (4, 'Project Aberdeen', 4);

SELECT setval(pg_get_serial_sequence('projects', 'project_number'), 5);

INSERT INTO job_titles (id, title) VALUES (1, 'DevOps');
INSERT INTO job_titles (id, title) VALUES (2, 'Senior Developer');
INSERT INTO job_titles (id, title) VALUES (3, 'Head of Research');
INSERT INTO job_titles (id, title) VALUES (4, 'Customer Representative');

SELECT setval(pg_get_serial_sequence('job_titles', 'id'), 5);

INSERT INTO dates (id) VALUES (5);
INSERT INTO dates (id) VALUES (6);
INSERT INTO dates (id) VALUES (7);
INSERT INTO dates (id) VALUES (8);
INSERT INTO dates (id) VALUES (9);
INSERT INTO dates (id) VALUES (10);
INSERT INTO dates (id) VALUES (11);
INSERT INTO dates (id) VALUES (12);

INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (1, 1, 'Brian', 'Johnson', 'Male', 5, 5, 1);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (2, 1, 'Angela', 'Tao', 'Female', 6, 6, 1);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (3, 2, 'Becky', 'Nolan', 'Female', 7, 7, 1);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (4, 2, 'Jeremy', 'Turing', 'Male', 8, 8, 1);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (5, 4, 'James', 'Danielson', 'Male', 9, 9, 2);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (6, 4, 'Adi', 'McIntosh', 'Female', 10, 10, 2);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (7, 3, 'Miguel', 'Hernandez', 'Male', 11, 11, 3);
INSERT INTO employees (employee_number, job_title_id, first_name, last_name, gender, birthday_id, hire_date_id, department_id) VALUES (8, 3, 'Christy', 'Demello', 'Female', 12, 12, 3);

SELECT setval(pg_get_serial_sequence('dates', 'id'), 13);
SELECT setval(pg_get_serial_sequence('employees', 'employee_number'), 9);

INSERT INTO projects_employees (projects_id, employees_id) VALUES (1, 5);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (1, 8);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (2, 3);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (2, 1);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 4);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 7);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (3, 6);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (4, 2);
INSERT INTO projects_employees (projects_id, employees_id) VALUES (4, 8);

COMMIT;

select * from employees
join job_titles on employees.job_title_id = job_titles.id
join departments on employees.department_id = departments.department_number;

select * from projects_employees
join employees on projects_employees.employees_id = employees.employee_number
join projects on projects_employees.projects_id = projects.project_number;