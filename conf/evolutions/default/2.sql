# --- !Ups

insert into company (id, name) values
    (1, 'Orange'),
    (2, 'Bouygues Telecom'),
    (3, 'SFR'),
    (4, 'Free');

insert into employee (id, lastname, firstname, age, enabled, company_id) values
    (1, 'Besnard', 'Benoît', 34, 1, 1),
    (2, 'Dupont', 'Martin', 32, 1, 1),
    (3, 'Dupond', 'Éric', 54, 1, 2),
    (4, 'Doe', 'John', 34, 1, 3),
    (5, 'Doe', 'Jane', 33, 1, 4);


# --- !Downs

delete from employee;
delete from company;
