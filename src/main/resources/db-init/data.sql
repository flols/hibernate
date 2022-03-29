INSERT INTO DRIVERS (id, firstname, name, country) VALUES (44, 'Lewis', 'HAMILTON', 'GBR');
INSERT INTO DRIVERS (id, firstname, name, country) VALUES (63, 'George', 'RUSSEL', 'GBR');

INSERT INTO TEAMS (id, name, drivers_id) VALUES (1, 'Mercedes', 44);

INSERT INTO CHAMPIONSHIP (id, name, teams_id) VALUES (100, 'F1', 1);
