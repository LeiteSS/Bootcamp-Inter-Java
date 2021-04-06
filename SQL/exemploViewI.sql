SELECT numero, nome, ativo FROM banco;

CREATE OR REPLACE VIEW vw_banco AS (
	SELECT numero, nome, ativo
	FROM banco
);
SELECT numero, nome, ativo FROM vw_banco;

CREATE OR REPLACE VIEW vw_banco2 (banco_numero, banco_nome, banco_ativo) AS (
	SELECT numero, nome, ativo
	FROM banco
);
SELECT banco_numero, banco_nome, banco_ativo FROM vw_banco2;

INSERT INTO vw_banco2 (banco_numero, banco_nome, banco_ativo) VALUES (152, 'Banco Boa Ideia', TRUE);
SELECT banco_numero, banco_nome, banco_ativo FROM vw_banco2;
SELECT numero, nome, ativo FROM banco WHERE numero = 152;

UPDATE vw_banco2 SET banco_ativo = FALSE WHERE banco_numero = 152;
SELECT banco_numero, banco_nome, banco_ativo FROM vw_banco2 WHERE banco_numero = 152;

DELETE FROM vw_banco2 WHERE banco_numero = 152;
SELECT banco_numero, banco_nome, banco_ativo FROM vw_banco2 WHERE banco_numero = 152;

-- Em outra sessão essa view não existe
CREATE OR REPLACE TEMPORARY VIEW vw_agencia AS (
	SELECT nome FROM agencia
);
SELECT nome FROM vw_agencia;

CREATE OR REPLACE VIEW vw_banco_ativos AS (
	SELECT numero, nome, ativo FROM banco
	WHERE ativo IS TRUE
) WITH LOCAL CHECK OPTION;
-- NEW ROW VIOLATES CHECK OPTION FOR VIEW "VW_BANCO_ATIVOS"
INSERT INTO vw_banco_ativos (numero, nome, ativo)
VALUES (152, 'Banco Boa Ideia', FALSE);

CREATE OR REPLACE VIEW vw_bancos_com_a AS (
	SELECT numero, nome, ativo 
	FROM vw_banco_ativos
	WHERE nome ILIKE 'a%'
) WITH LOCAL CHECK OPTION;
SELECT numero, nome, ativo FROM vw_bancos_com_a;

-- NEW ROW VIOLATES CHECK OPTION FOR VIEW
INSERT INTO vw_bancos_com_a (numero, nome, ativo) VALUES (154, 'bETO Omega', TRUE);
CREATE OR REPLACE VIEW vw_bancos_com_a AS (
	SELECT numero, nome, ativo 
	FROM vw_banco_ativos
	WHERE nome ILIKE 'a%'
) WITH CASCADED CHECK OPTION;
-- NEW ROW VIOLATES CHECK OPTION FOR VIEW
INSERT INTO vw_bancos_com_a (numero, nome, ativo) VALUES (154, 'Alfa Omega', FALSE);
INSERT INTO vw_bancos_com_a (numero, nome, ativo) VALUES (153, 'Alfa Omega', TRUE);
