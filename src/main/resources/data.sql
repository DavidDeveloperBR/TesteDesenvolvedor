DROP TABLE IF EXISTS CIRCUIT;
CREATE TABLE CIRCUIT AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/circuits.csv');

DROP TABLE IF EXISTS CONSTRUCTORS;
CREATE TABLE CONSTRUCTORS AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/constructors.csv');

DROP TABLE IF EXISTS DRIVER;
CREATE TABLE DRIVER AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/drivers.csv');

DROP TABLE IF EXISTS RACES;
CREATE TABLE RACES AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/races.csv');

DROP TABLE IF EXISTS RESULTS;
CREATE TABLE RESULTS AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/results.csv');

DROP TABLE IF EXISTS PIT_STOPS;
CREATE TABLE PITSTOPS AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/pit_stops.csv');

DROP TABLE IF EXISTS QUALIFYING;
CREATE TABLE QUALIFYING AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/qualifying.csv');

DROP TABLE IF EXISTS LAP_TIMES;
CREATE TABLE LAP_TIMES AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/lap_times.csv');

DROP TABLE IF EXISTS DRIVER_STANDINGS;
CREATE TABLE DRIVER_STANDINGS AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/driver_standings.csv');

DROP TABLE IF EXISTS CONSTRUCTOR_STANDINGS;
CREATE TABLE CONSTRUCTOR_STANDINGS AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/constructor_standings.csv');

DROP TABLE IF EXISTS CONSTRUCTOR_RESULTS;
CREATE TABLE CONSTRUCTOR_RESULTS AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/constructor_results.csv');

DROP TABLE IF EXISTS SPRINT_RESULTS;
CREATE TABLE SPRINT_RESULTS AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/sprint_results.csv');

DROP TABLE IF EXISTS STATUS;
CREATE TABLE STATUS AS
    SELECT * FROM CSVREAD('src/main/resources/CSV/status.csv');


