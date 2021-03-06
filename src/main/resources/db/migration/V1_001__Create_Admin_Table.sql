CREATE EXTENSION IF  NOT EXISTS pgcrypto WITH SCHEMA public;

create table admins (
  admin_id varchar(255) primary key,
  password varchar(255) not null,
  email_address varchar(255) not null,
  role VARCHAR(100) NOT NULL,
  ${commonColumns}
);
insert into admins(admin_id, password, email_address, role) values ('admin001', '$2a$10$xRTXvpMWly0oGiu65WZlm.3YL95LGVV2ASFjDhe6WF4.Qji1huIPa', 'test@gmail.com', 'admin');