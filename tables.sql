create table if not exists groups
(
    id          uuid not null
        constraint groups_pk primary key,
    name        varchar,
    description varchar,
    user_id     uuid
);

create table if not exists skills
(
    id          uuid not null
        constraint skills_pk primary key,
    description varchar,
    name        varchar
);

create table if not exists users
(
    id         uuid not null
        constraint users_pk primary key,
    login      varchar not null,
    first_name varchar not null,
    last_name  varchar not null,
    patronymic varchar
);

create table if not exists user_groups
(
    id            uuid    not null
        constraint user_groups_pk primary key,
    user_id       uuid not null,
    group_id      uuid not null,
    skill_id      uuid not null,
    status        varchar,
    id_connection varchar,
    state         boolean
);

alter table user_groups
    add constraint user_groups_user_fk
        foreign key (user_id)
            references users;

alter table user_groups
    add constraint user_groups_skill_fk
        foreign key (skill_id)
            references skills;

alter table user_groups
    add constraint user_groups_group_fk
        foreign key (group_id)
            references groups;

alter table groups
    add constraint groups_group_fk
        foreign key (user_id)
            references users;

