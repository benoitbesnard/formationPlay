# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table company (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  constraint pk_company primary key (id)
);

create table employee (
  id                            bigint auto_increment not null,
  lastname                      varchar(255) not null,
  firstname                     varchar(255),
  age                           integer,
  enabled                       boolean,
  company_id                    bigint,
  constraint pk_employee primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  name                          varchar(50),
  constraint pk_user primary key (id)
);

alter table employee add constraint fk_employee_company_id foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_employee_company_id on employee (company_id);


# --- !Downs

alter table employee drop constraint if exists fk_employee_company_id;
drop index if exists ix_employee_company_id;

drop table if exists company;

drop table if exists employee;

drop table if exists user;

