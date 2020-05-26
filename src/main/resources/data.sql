INSERT INTO `cidades` (`id`, `estado`, `nome`) VALUES
	(1, 'Reino Unido', 'Londres'),
	(2, 'Minas', 'Uberlandia');

INSERT INTO `editora` (`id`, `nome`, `cidades_id`) VALUES
	(1, 'Pearson', 1),
	(2, 'Globo', 1),
	(3, 'Viseu', 2);


INSERT INTO `livro` (`id`, `autor`, `faturamento`, `isbn`, `lançamento`, `nome`, `editora_id`) VALUES
	(1, 'Robert Kiyosaki', 100000.00, '3465464564', '1998-03-01', 'Pai Rico, Pai Pobre', 2),
	(2, 'T. Harv Eker', 100000.00, '348969658', '2005-02-01', 'Segredos da Mente Milionaria', 3);
