create user jaine identified by 'teste';
-- dando permissão
grant select, insert on northwind.customers to 'jaine';

alter user 'jaine' identified by 'Teste';
-- retirando permissões
revoke select, insert on northwind.customers from 'jaine';

select * from mysql.user;

create user maria identified by "1234";
grant select on northwind.customers to maria;
create user joao identified by "1234";
create user jose identified by "1234";

-- criando grupos
create role basico;
grant select on northwind.customers to basico;
grant select on northwind.orders to basico;
grant select on northwind.products to basico;
grant select on northwind.categories to basico;

-- atribuindo user ao grupo
grant basico to maria;
grant basico to joao;
grant basico to jose;

-- ativando privilegios
flush privileges;
select * from mysql.user;
show grants;
show grants for maria;
show grants for basico;

-- retirando permissão de um grupo
revoke select on northwind.customers from basico;

-- apaggando user
drop user maria;
-- apagando grupo
drop role basico;
