drop database Perfumaria;
create database Perfumaria;

use Perfumaria;

create table tb_loja(
    cnpj VARCHAR(18) not null,
    faturamento DECIMAL(20,2),
    endereco VARCHAR(200),
    telefone VARCHAR(13) not null,
    franquiado boolean,
    n_funcionarios INT,
    data_inauguracao DATE,
    gerente VARCHAR(100),
    primary key(cnpj)
);

insert into tb_loja(cnpj,faturamento,endereco,telefone,franquiado,n_funcionarios,data_inauguracao,gerente) values ("12.345.678/0001-00",234.00,"Rua das pedras","11 98900-5647",true,100,"2020-05-09","Paula");

insert into tb_loja(cnpj,faturamento,endereco,telefone,franquiado,n_funcionarios,data_inauguracao,gerente) values ("11.356.168/0001-00",280.00,"Rua dos ingleses","11 92347-5962",true,50,"2024-10-09","Fernando");
insert into tb_loja(cnpj,faturamento,endereco,telefone,franquiado,n_funcionarios,data_inauguracao,gerente) values ("15.759.231/0001-00",300.00,"Rua dos espanhois","11 98567-1476",true,250,"2023-02-10","Julia");
insert into tb_loja(cnpj,faturamento,endereco,telefone,franquiado,n_funcionarios,data_inauguracao,gerente) values ("24.143.856/0001-00",3000.00,"Rua das estrelas","11 95678-1564",true,300,"2020-05-20","Juliana");
insert into tb_loja(cnpj,faturamento,endereco,telefone,franquiado,n_funcionarios,data_inauguracao,gerente) values ("56.164.520/0001-00",800.00,"Rua dos alemães","11 91468-0125",true,200,"2022-10-30","Gean");

update tb_loja set endereco - "Rua dos anjos" where cnpj = "11.356.168/0001-00";
update tb_loja set faturamento - 330.00 where cnpj = "15.759.231/0001-00";

delete from tb_loja where cnpj = "24.143.856/0001-00";
delete from tb_loja where cnpj = "56.164.520/0001-00";

select * from tb_loja;


create table tb_funcionario(
    cpf_funcionario VARCHAR(14) not null ,
    nome_funcionario VARCHAR(100),
    faltas INT,
    nascimento DATE,
    admissao DATE,
    ferias DATE,
    rg VARCHAR(10) not null,
    turno VARCHAR(10),
    beneficios VARCHAR(100),
    cargo VARCHAR(50),
    regime_trabalho VARCHAR(200),
    setor VARCHAR(15),
    estado VARCHAR(20),
    salario DECIMAL(20,0),
    primary key(cpf_funcionario)
);

insert into tb_funcionario(cpf_funcionario,nome_funcionario,faltas,nascimento,admissao,ferias,rg,turno,beneficios,cargo,regime_trabalho,setor,estado,salario) values ("123.456.789-12","Eduardo Sampaio",5,"2005-08-17","2023-09-07","2024-12-01","127899878","Matutino","VT, VR  e Seguro de Vida","Gerente","Das 9h às 16h","Contabilidade","São Paulo",20000.00);

insert into tb_funcionario(cpf_funcionario,nome_funcionario,faltas,nascimento,admissao,ferias,rg,turno,beneficios,cargo,regime_trabalho,setor,estado,salario) values ("513.852.456-15","Felipe Dias",3,"2002-04-20","2023-09-07","2024-12-01","125841592","Matutino","VT, VR  e Seguro de Vida","Vendedor","Das 9h às 16h","vendas","São Paulo",4000.00);
insert into tb_funcionario(cpf_funcionario,nome_funcionario,faltas,nascimento,admissao,ferias,rg,turno,beneficios,cargo,regime_trabalho,setor,estado,salario) values ("436.013.167-18","Ana Ferreira",1,"2000-12-01","2019-01-29","2019-12-01","157469831","Matutino","VT, VR  e Seguro de Vida","Gerente","Das 9h às 16h","Marketing","São Paulo",2500.00);
insert into tb_funcionario(cpf_funcionario,nome_funcionario,faltas,nascimento,admissao,ferias,rg,turno,beneficios,cargo,regime_trabalho,setor,estado,salario) values ("561.157.147-28","Luan Cerqueira",5,"2001-01-19","2020-03-19","2020-12-23","1253874620","Vespertino","VT, VR  e Seguro de Vida","Gerente","Das 11h às 19h","Logistica","São Paulo",3530.00);
insert into tb_funcionario(cpf_funcionario,nome_funcionario,faltas,nascimento,admissao,ferias,rg,turno,beneficios,cargo,regime_trabalho,setor,estado,salario) values ("804.024.423-16","José Silva",4,"2000-11-08","2023-04-12","2023-12-05","143679581","Vespertiino","VT, VR  e Seguro de Vida","Gerente","Das 9h às 16h","Vendas","São Paulo",4000.00);

Select * from tb_funcionario;

CREATE TABLE tb_cliente(
    id_cliente INT auto_increment,
    cpf_funcionario VARCHAR(14),
    dt_nascimento DATE,
    nome_cliente VARCHAR(100),
    endereco VARCHAR(200),
    email_cliente varchar(150),
    cpf_cliente VARCHAR(14) NOT NULL,
    telefone VARCHAR(13) NOT NULL,
    PRIMARY KEY(id_cliente),
    CONSTRAINT cliente_cpfFuncionario_fk FOREIGN KEY(cpf_funcionario) REFERENCES tb_funcionario(cpf_funcionario)
);

insert into tb_cliente(id_cliente,cpf_funcionario, dt_nascimento, nome_cliente, endereco, email_cliente, cpf_cliente, telefone) values (1, "123.456.789-12", "2005-11-14", "Jaíne", "Rua senac de paula", "senacspjajaine@gmail.com", "522.364.838-21", "(11) 961947275");

insert into tb_cliente(cpf_funcionario,dt_nascimento, nome_cliente, endereco, email_cliente, cpf_cliente, telefone) values ("123.456.789-12", "2004-11-04", "Priscila", "Rua santana", "priscila09@gmail.com", "547.785.012-21", "(11) 956874213");
insert into tb_cliente(cpf_funcionario,dt_nascimento, nome_cliente, endereco, email_cliente, cpf_cliente, telefone) values ("513.852.456-15","2003-09-02", "Juliano", "Rua dos ferreira", "Julianoalcantara@gmail.com", "764.156.159-11", "(11) 961947275");
insert into tb_cliente(cpf_funcionario,dt_nascimento, nome_cliente, endereco, email_cliente, cpf_cliente, telefone) values ("436.013.167-18","2002-08-24", "Filipa", "Rua dos ferreira", "Filipa@gmail.com", "123.534.876-45", "(11) 914528534");
insert into tb_cliente(cpf_funcionario,dt_nascimento, nome_cliente, endereco, email_cliente, cpf_cliente, telefone) values ("804.024.423-16","2000-12-02", "Karen", "Rua dlos andarilhos", "Karenpriscila@gmail.com", "159.326.412-85", "(11) 914356201");

select * from tb_cliente;


CREATE TABLE tb_produto(
    id_produto INT auto_increment,
    nome_produto VARCHAR(30),
    cnpj VARCHAR(18) not null,
    preco DECIMAL,
    descricao VARCHAR(500),
    disponivel BOOLEAN,
    categoria VARCHAR(50),
    materia_prima VARCHAR(50),
    essencia VARCHAR(30),
    PRIMARY KEY(id_produto),
    CONSTRAINT produto_cnpj_fk FOREIGN KEY(cnpj) REFERENCES tb_loja(cnpj)
);

insert into tb_produto(id_produto, nome_produto, cnpj, preco, descricao, disponivel, categoria, materia_prima,  essencia) values(1, "ameixa", "12.345.678/0001-00", 10.00, "morango", true, "manga", "pessego", "baunilha");

insert into tb_produto(nome_produto, cnpj, preco, descricao, disponivel, categoria, materia_prima,  essencia) values("creme de banana", "12.345.678/0001-00", 45.00, "creme com essencia de banana", true, "hidratante", "essencia de banana", "banana");
insert into tb_produto(nome_produto, cnpj, preco, descricao, disponivel, categoria, materia_prima,  essencia) values("gloss de morango", "12.345.678/0001-00", 26.00, "gloss com essencia de morango e fliter", false, "hidratante labial", "essencia de morango", "morango");
insert into tb_produto(nome_produto, cnpj, preco, descricao, disponivel, categoria, materia_prima,  essencia) values("Perfume rosas", "24.143.856/0001-00", 80.00, "perfume tropical de floral", true, "perfume floral", "rosas", "rosas");
insert into tb_produto(nome_produto, cnpj, preco, descricao, disponivel, categoria, materia_prima,  essencia) values("gloss de morango", "12.345.678/0001-00", 26.00, "gloss com essencia de morango e fliter", false, "hidratante labial", "essencia de morango", "morango");

select*from tb_produto;

CREATE TABLE tb_carrinho(
    id_carrinho INT auto_increment,
    id_produto INT,
    cupom VARCHAR(5),
    preco DECIMAL(20,2),
    quantidade INT,
    forma_pagamento VARCHAR(20),
    PRIMARY KEY(id_carrinho),
    CONSTRAINT carrinho_produto_fk FOREIGN KEY(id_produto) REFERENCES tb_produto(id_produto)
);

insert into tb_carrinho(id_produto, id_carrinho, cupom, preco, quantidade, forma_pagamento) values (1, 1, "10PPORCENTO", 58.00, 1, "CARTÃO DE CRÉDITO");

insert into tb_carrinho(cupom, preco, quantidade, forma_pagamento) values ("5PPORCENTO", 50.00, 1, "PIX");
insert into tb_carrinho(cupom, preco, quantidade, forma_pagamento) values ("50PPORCENTO", 30.00, 2, "CARTÃO DE DÉBITO");
insert into tb_carrinho(cupom, preco, quantidade, forma_pagamento) values ("", 100.00, 3, "CARTÃO DE DÉBITO");
insert into tb_carrinho(cupom, preco, quantidade, forma_pagamento) values ("BLACKFRIDAY", 200.00, 4, "CARTÃO DE CRÉDITO");

select*from tb_carrinho;

CREATE TABLE tb_avaliacoes(
    id_avaliacao INT auto_increment,
    id_produto INT,
    id_cliente INT,
    nota  INT NOT NULL,
    comentario  VARCHAR (300),
    data_avaliacao  DATE,
    PRIMARY KEY(id_avaliacao),
    CONSTRAINT avaliacao_produto_fk FOREIGN KEY(id_produto) REFERENCES tb_produto(id_produto),
    CONSTRAINT avaliacao_cliente_fk FOREIGN KEY(id_cliente) REFERENCES tb_cliente(id_cliente)
);

insert into tb_avaliacoes(id_avaliacao,id_produto, id_cliente, nota, comentario, data_avaliacao) values (1,1,1, 5, "MUITO BOM!!", "2024-05-01");

insert into tb_avaliacoes(nota, comentario, data_avaliacao) values (5, "MUITO BOM!!", "2024-05-01");
insert into tb_avaliacoes(nota, comentario, data_avaliacao) values (5, "MUITO BOM!!", "2024-10-08");
insert into tb_avaliacoes(nota, comentario, data_avaliacao) values (5, "MUITO BOM!!", "2023-12-10");
insert into tb_avaliacoes(nota, comentario, data_avaliacao) values (4, "Perfume com cheiro maravilhoso mas um pouco doce demais!!", "2024-11-10");
insert into tb_avaliacoes(nota, comentario, data_avaliacao) values (4.5, "MUITO BOM!!", "2025-02-19");

select *from tb_avaliacoes;


CREATE TABLE tb_faturas(
    id_contas_pagar INT auto_increment,
    cnpj VARCHAR(18) not null,
    data_vencimento DATE,
    data_pagamento DATE,
    forma_pagamento varchar(50),
    contas_contabil VARCHAR(100),
    fornecedor VARCHAR(100),
    responsavel VARCHAR(100),
    centro_custo VARCHAR(100),
    valor DECIMAL(20,2),
    data_emissao DATE,
    numero_nota INT,
    PRIMARY KEY (id_contas_pagar),
    CONSTRAINT faturas_cnpj_fk FOREIGN KEY(cnpj) REFERENCES tb_loja(cnpj)
);

insert into tb_faturas(id_contas_pagar, cnpj, data_vencimento, data_pagamento, forma_pagamento, contas_contabil, fornecedor, responsavel, centro_custo, valor, data_emissao, numero_nota) values (1,"12.345.678/0001-00","2024-12-03","2024-11-02","cartao de credito","P304","Avon","Camile","ADMISSY",200.34,"2024-10-09",1245364);

insert into tb_faturas(cnpj, data_vencimento, data_pagamento, forma_pagamento, contas_contabil, fornecedor, responsavel, centro_custo, valor, data_emissao, numero_nota) values ("12.345.678/0001-00","2024-09-03","2024-10-02","pix","P304","Natura","Andre","ADMISSY",450.34,"2024-09-01",15423679);
insert into tb_faturas(cnpj, data_vencimento, data_pagamento, forma_pagamento, contas_contabil, fornecedor, responsavel, centro_custo, valor, data_emissao, numero_nota) values ("12.345.678/0001-00","2023-12-03","2024-01-02","cartao de débito","P304","Avon","Camile","ADMISSY",150.34,"2023-12-01",1245364);
insert into tb_faturas(cnpj, data_vencimento, data_pagamento, forma_pagamento, contas_contabil, fornecedor, responsavel, centro_custo, valor, data_emissao, numero_nota) values ("56.164.520/0001-00","2024-12-23","2024-12-30","cartao de débito","P304","O boticario","Andre","ADMISSY",350.34,"2024-11-30",1234567);
insert into tb_faturas(cnpj, data_vencimento, data_pagamento, forma_pagamento, contas_contabil, fornecedor, responsavel, centro_custo, valor, data_emissao, numero_nota) values ("24.143.856/0001-00","2024-11-01","2024-10-25","cartao de débito","P304","O boticario","Camile","ADMISSY",480.34,"2024-10-20",7456872);

select * from tb_faturas;

CREATE TABLE tb_forma_pagamento(
    id_forma_pagamento INT auto_increment,
    id_cliente INT,
    pix VARCHAR(13),
    boleto VARCHAR(20),
    cvv VARCHAR(3),
    nome_cartao VARCHAR(50),
    validade DATE,
    numero_cartao VARCHAR(10),
    PRIMARY KEY (id_forma_pagamento),
    CONSTRAINT formaPagamento_cliente_fk FOREIGN KEY(id_cliente) REFERENCES tb_cliente(id_cliente)
);

insert into tb_forma_pagamento(id_forma_pagamento,id_cliente,pix,boleto,cvv,nome_cartao,validade,numero_cartao) values (1,1,"","",362,"Eduardo Prado","2025-09-01","12354154555");

insert into tb_forma_pagamento(pix,boleto,cvv,nome_cartao,validade,numero_cartao) values ("","1523647895641574",392,"Thiago Prado","2025-09-01","12354154555");
insert into tb_forma_pagamento(pix,boleto,cvv,nome_cartao,validade,numero_cartao) values ("(11) 95236-1487","",0,"Milena Cerqueira","2025-09-21","");
insert into tb_forma_pagamento(pix,boleto,cvv,nome_cartao,validade,numero_cartao) values ("(11) 91463-0125","",0,"Carmen Miranda","","");
insert into tb_forma_pagamento(pix,boleto,cvv,nome_cartao,validade,numero_cartao) values ("","1534875200343018",0,"Kauã Pereira","2024-11-21","");

Select* FROM tb_forma_pagamento;

CREATE TABLE tb_pedidos(
    id_numero_pedidos INT auto_increment,
    id_cliente INT,
    id_forma_pagamento INT,
    orcamento VARCHAR(200),
    devolucao VARCHAR(200),
    hora TIME,
    data_fp DATE,
    quantidade INT NOT NULL,
    valor DECIMAL (20,2),
    nota VARCHAR(100),
    voucher VARCHAR(20),
    PRIMARY KEY (id_numero_pedidos),
    CONSTRAINT pedidos_cliente_fk FOREIGN KEY(id_cliente) REFERENCES tb_cliente(id_cliente),
    CONSTRAINT pedido_formaPagamento_fk FOREIGN KEY(id_forma_pagamento) REFERENCES tb_forma_pagamento(id_forma_pagamento)
);

insert into tb_pedidos(id_numero_pedidos,id_cliente,id_forma_pagamento,orcamento,devolucao,hora,data_fp,quantidade,valor,nota,voucher) values (1,1,1, "Indisponível", "Não tem devolução", "18:00:00", "2024-10-31", 1, 58.00, "Sem nota", "Sem voucher");

insert into tb_pedidos(orcamento,devolucao,hora,data_fp,quantidade,valor,nota,voucher) values ("Indisponível", "Não tem devolução", "18:00:00", "2024-10-11", 1, 30.00, "Sem nota", "Sem voucher");
insert into tb_pedidos(orcamento,devolucao,hora,data_fp,quantidade,valor,nota,voucher) values ("Indisponível", "Não tem devolução", "18:00:00", "2023-11-31", 2, 50.00, "Sem nota", "DESCONTO01");
insert into tb_pedidos(orcamento,devolucao,hora,data_fp,quantidade,valor,nota,voucher) values ("Indisponível", "Não tem devolução", "19:30:00", "2024-12-15", 5, 150.00, "100,50", "");
insert into tb_pedidos(orcamento,devolucao,hora,data_fp,quantidade,valor,nota,voucher) values ("Indisponível", "Não tem devolução", "18:00:00", "2023-11-31", 3, 85.00, "Sem nota", "");

Select * from tb_pedidos;
