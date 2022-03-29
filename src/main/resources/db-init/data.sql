INSERT INTO DRIVERS (id, firstname, name, country) VALUES (1, 'Lewis', 'HAMILTON', 'United Kingdom');
INSERT INTO DRIVERS (id, firstname, name, country) VALUES (2, 'Charles', 'LECLERC', 'Monaco');

INSERT INTO TEAMS (id, name, car, country, technical_director, drivers_id)
VALUES (1, 'Mercedes','W13','Germany','Toto WOLFF', 1);

INSERT INTO TEAMS (id, name, car, country, technical_director, drivers_id)
VALUES (2, 'FERRARI','F1-75','Italy','Mattia Binotto', 2);

INSERT INTO CHAMPIONSHIP (id, name, teams_id) VALUES (100, 'F1', 1);
