create table "ROOT".TRAIN ( ID INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), VILLE_DEPART VARCHAR(50) default 'NULL', VILLE_ARRIVEE VARCHAR(50) default 'NULL', DATE DATE default NULL, HEURE_DEPART INTEGER default NULL, PRIX_BILLET INTEGER default NULL, NB_PLACES_DISPO INTEGER default NULL ) 

create table "ROOT".RESERVATION ( ID_RESERVATION INTEGER not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), ID_TRAIN INTEGER default NULL, NUMERO_PLACE INTEGER not null )