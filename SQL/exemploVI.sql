SELECT * FROM information_schema.columns WHERE table_name = 'banco';
SELECT column_name, data_type FROM information_schema.columns WHERE table_name = 'cliente';
SELECT column_name, data_type FROM information_schema.columns WHERE table_name = 'cliente_transacoes';

-- AVG - Media de todos os valores
SELECT AVG(valor) FROM cliente_transacoes;

-- COUNT (HAVING) - total de clientes
SELECT COUNT(numero_cliente) FROM cliente;

-- HAVING é util para quando há registros duplicados na tabela
SELECT COUNT(id), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id HAVING COUNT(id) > 150;

-- COUNT os clientes que usam o dominio gmail.com
SELECT COUNT(numero_cliente), email FROM cliente WHERE email ILIKE '%gmail.com' GROUP BY email;
SELECT COUNT(id), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id;

-- MAX 
SELECT MAX(numero_cliente) FROM cliente;
SELECT MAX(valor) FROM cliente_transacoes;
SELECT MAX(valor), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id;

-- MIN 
SELECT MIN(numero_cliente) FROM cliente;
SELECT MIN(valor) FROM cliente_transacoes;
SELECT MIN(valor), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id;

-- SUM
SELECT SUM(valor) FROM cliente_transacoes;
SELECT SUM(valor), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id;
-- ASC - ascendente
SELECT SUM(valor), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id ORDER BY tipo_transacao_id;
-- DESC - descendente
SELECT SUM(valor), tipo_transacao_id FROM cliente_transacoes GROUP BY tipo_transacao_id ORDER BY tipo_transacao_id DESC;

