# Install Postgres

brew install postgresql

### start postgres 
pg_ctl -D /usr/local/var/postgres start

### init db
initdb --locale=C -E UTF-8 /opt/homebrew/var/postgresql@14

pg_ctl -D '/opt/homebrew/var/postgresql@14' -l logfile start

psql postgres postgres

create user schema_design;
CREATE ROLE
alter user schema_design with encrypted password 'schema_design';
ALTER ROLE 
create database schema_design;
CREATE DATABASE
grant all privileges on database schema_design to schema_design;
GRANT



-----
so in class definitions we simply consider about schema design 
like how will it store in db.

-----

@MappedSuperClass - spring term
because attribute of the super class will go to
each of the subclasses.

@Id - generated id

@CreatedDate - it will let spring autmatically know to what to put there.











