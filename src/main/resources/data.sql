INSERT INTO sr_university (university_name) VALUES ('КемГУ');

INSERT INTO sr_faculty (university_id, faculty_name) VALUES (1, 'ФИТ');

INSERT INTO sr_student (last_name, first_name, middle_name, date_of_birth, passport_serial, passport_number, passport_date)
VALUES ('Васильева', 'Елена', 'Сергеевна', '1998-03-24', '1000', '123456', '2018-04-10');

INSERT INTO sr_student (last_name, first_name, middle_name, date_of_birth, passport_serial, passport_number, passport_date)
VALUES ('Васильев', 'Олег', 'Петрович', '1998-10-16', '2000', '123456', '2018-04-10');

INSERT INTO sr_student_document (document_number, document_date, expired_date, university_id, student_id, faculty_id, student_form)
VALUES ('ФИТ001', '2017-09-18', null, 1, 1, 1 ,0);

INSERT INTO sr_student_document (document_number, document_date, expired_date, university_id, student_id, faculty_id, student_form)
VALUES ('ФИТ002', '2017-09-18', null, 1, 2, 1 ,0);