CREATE OR REPLACE FUNCTION banco_add(b_numero INTEGER, b_nome VARCHAR, b_ativo BOOLEAN)
RETURNS INTEGER
SECURITY INVOKER
LANGUAGE PLPGSQL
CALLED ON NULL INPUT
AS $$ 
DECLARE variavel_id INTEGER;
BEGIN
	IF b_nome IS NULL OR b_ativo IS NULL OR b_numero IS NULL THEN
		RETURN 0;
	END IF;
		
	SELECT INTO variavel_id numero
	FROM banco
	WHERE numero = b_numero;
	
	IF variavel_id IS NULL THEN
		INSERT INTO banco(numero, nome, ativo)
		VALUES (b_numero, b_nome, b_ativo);
	ELSE
		RETURN variavel_id;
	END IF;
	
	SELECT INTO variavel_id numero
	FROM banco
	WHERE numero = b_numero;
	
	RETURN variavel_id;
END; $$;

SELECT banco_add(5432, 'Banco Novo', FALSE);
SELECT banco_add(5433, 'Banco e Corretora Novo', TRUE);
SELECT numero, nome, ativo FROM banco WHERE numero = 5432;
SELECT numero, nome, ativo FROM banco WHERE numero = 5433;
