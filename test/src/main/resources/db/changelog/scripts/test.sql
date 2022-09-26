create sequence if not exists test_entity_id_seq;
CREATE TABLE IF NOT EXISTS test_table(
  id int  PRIMARY KEY DEFAULT nextval('test_entity_id_seq'),
  document_id varchar(45) DEFAULT NULL,
  document_date date ,
  dictionary_value_id varchar(45) DEFAULT NULL,
  dictionary_value_name varchar(45) DEFAULT NULL,
  sort_order varchar(45) DEFAULT NULL,
  test_id varchar(45) DEFAULT NULL,
  test_name varchar(45) DEFAULT 'Test'
);
insert into test_table(document_id, document_date, dictionary_value_id, dictionary_value_name, sort_order, test_id)
values ('123e4567-e89b-12d3-a456-426614174000','2022-10-23','123e4567-e89b-12d3-a456-426614174001','123e4567-e89b-12d3-a456-426614174003','something','123e4567-e89b-12d3-a456-426614174001')