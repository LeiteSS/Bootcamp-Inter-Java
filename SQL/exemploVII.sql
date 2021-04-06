SELECT numero FROM banco;
SELECT banco_numero, numero, nome FROM agencia;
SELECT numero_cliente, nome FROM cliente;
SELECT banco_numero, agencia_numero, numero, digito, cliente_numero FROM conta_corrente;
SELECT id, nome FROM tipo_transacao; 
SELECT banco_numero, agencia_numero, conta_corrente_numero, conta_corrente_digito, cliente_numero, valor FROM cliente_transacoes;

SELECT COUNT(1) FROM banco; -- 151
SELECT COUNT(1) FROM agencia; -- 296

-- INNER JOIN
SELECT banco.numero, banco.nome, agencia.numero, agencia.nome
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero; -- 296 registros

SELECT COUNT(banco.numero) FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero; -- 296 registros

SELECT COUNT(distinct banco.numero) FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero; -- apenas 9 bancos possuem agencias

-- LEFT OUTER JOIN
SELECT banco.numero, banco.nome, agencia.numero, agencia.nome FROM banco
LEFT JOIN agencia ON agencia.banco_numero = banco.numero; -- 453 registros = 296 de registros relacionados + 157 registros nulos (sem relacionamento)

-- RIGHT OUTER JOIN
SELECT agencia.numero, agencia.nome, banco.numero, banco.nome FROM agencia
RIGHT JOIN banco ON banco.numero = agencia.banco_numero; 

-- FULL JOIN
SELECT banco.numero, banco.nome, agencia.numero, agencia.nome FROM banco
FULL JOIN agencia ON agencia.banco_numero = banco.numero; 


CREATE TABLE IF NOT EXISTS tabelaA (
	id SERIAL PRIMARY KEY,
	valor VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS tabelaB (
	id SERIAL PRIMARY KEY,
	valor VARCHAR(10)
);

INSERT INTO tabelaA (valor) VALUES ('teste1');
INSERT INTO tabelaA (valor) VALUES ('teste2');
INSERT INTO tabelaA (valor) VALUES ('teste3');
INSERT INTO tabelaA (valor) VALUES ('teste4');

INSERT INTO tabelaB (valor) VALUES ('testeA');
INSERT INTO tabelaB (valor) VALUES ('testeB');
INSERT INTO tabelaB (valor) VALUES ('testeC');
INSERT INTO tabelaB (valor) VALUES ('testeD');

-- CROSS JOIN e USANDO ALIAS
SELECT tblA.valor, tblB.valor FROM tabelaA tblA
CROSS JOIN tabelaB tblB;

DROP TABLE IF EXISTS tabelaA;
DROP TABLE IF EXISTS tabelaB;

SELECT banco.nome,
	   agencia.nome,
	   conta_corrente.numero,
	   conta_corrente.digito,
	   cliente.nome
FROM banco
JOIN agencia ON agencia.banco_numero = banco.numero
JOIN conta_corrente ON conta_corrente.banco_numero = banco.numero 
					-- ON conta_corrente.banco_numero = agencia.banco_numero 
	AND conta_corrente.agencia_numero = agencia.numero
JOIN cliente ON cliente.numero_cliente = conta_corrente.cliente_numero;
