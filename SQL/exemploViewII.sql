CREATE TABLE IF NOT EXISTS funcionarios (
	id SERIAL,
	nome VARCHAR(50),
	gerente INTEGER,
	PRIMARY KEY(id),
	FOREIGN KEY (gerente) REFERENCES funcionarios(id)
);

INSERT INTO funcionarios (nome, gerente) VALUES ('Anselmo', null);
INSERT INTO funcionarios (nome, gerente) VALUES ('Beatriz', 1);
INSERT INTO funcionarios (nome, gerente) VALUES ('Magno', 1);
INSERT INTO funcionarios (nome, gerente) VALUES ('Crenilda', 2);
INSERT INTO funcionarios (nome, gerente) VALUES ('Vagner', 4);

SELECT id, nome, gerente FROM funcionarios;

SELECT id, nome, gerente FROM funcionarios WHERE gerente IS null
UNION ALL
SELECT id, nome, gerente FROM funcionarios WHERE id = 999; -- Apenas para exemplificar

CREATE OR REPLACE RECURSIVE VIEW vw_funcs (id, gerente, funcionario) AS (
	SELECT id, gerente, nome
	FROM funcionarios
	WHERE gerente IS null
	
	UNION ALL 
	
	SELECT funcionarios.id, funcionarios.gerente, funcionarios.nome 
	FROM funcionarios
	JOIN vw_funcs ON vw_funcs.id = funcionarios.gerente
);
SELECT id, gerente, funcionario FROM vw_funcs;
