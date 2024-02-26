EX1:
Porcentagem de eleitores

EX2:
Bubble Sort

EX3:
Fatorial

EX4:
Soma dos multiplois de 3 e 5

EX5:
Rest de veículos


Endpoints

GET /veiculos
Recupera uma lista de todos os veículos.

Resposta: Uma lista de objetos VeiculoResponseDTO representando todos os veículos.

----------------------------------------------------------------------------------------

GET /veiculos?marca={marca}&ano={ano}
Recupera uma lista de veículos filtrada por marca e ano.

Parâmetros:

marca (opcional): A marca do veículo.
ano (opcional): O ano do veículo.
Resposta: Uma lista de objetos VeiculoResponseDTO representando os veículos filtrados.

----------------------------------------------------------------------------------------

GET /veiculos/{id}
Recupera um veículo pelo seu ID.

Variáveis de Caminho:

id: O ID do veículo.
Resposta: Um objeto VeiculoResponseDTO representando o veículo.

----------------------------------------------------------------------------------------

POST /veiculos
Cria um novo veículo.

Corpo da Requisição: Um objeto VeiculoRequestDTO representando o veículo a ser criado.

Resposta: Status 200 OK em caso de criação bem-sucedida.

----------------------------------------------------------------------------------------

PUT /veiculos/{id}
Atualiza um veículo existente.

Variáveis de Caminho:

id: O ID do veículo a ser atualizado.
Corpo da Requisição: Um objeto VeiculoRequestDTO com as novas informações do veículo.

Resposta: Status 200 OK em caso de atualização bem-sucedida.

----------------------------------------------------------------------------------------

PATCH /veiculos/{id}
Atualiza parcialmente um veículo existente.

Variáveis de Caminho:

id: O ID do veículo a ser atualizado parcialmente.
Corpo da Requisição: Um objeto VeiculoRequestDTO com as informações do veículo que devem ser atualizadas.

Resposta: Status 200 OK em caso de atualização parcial bem-sucedida.

----------------------------------------------------------------------------------------

DELETE /veiculos/{id}
Exclui um veículo pelo seu ID.

Variáveis de Caminho:

id: O ID do veículo a ser excluído.
Resposta: Status 200 OK em caso de exclusão bem-sucedida.

----------------------------------------------------------------------------------------

GET /veiculos?marca={marca}
Recupera a quantidade de veículos por marca.

Parâmetros:

marca: A marca dos veículos a serem contados.
Resposta: Um objeto GenericResponse contendo a quantidade de veículos da marca especificada.

----------------------------------------------------------------------------------------

GET /veiculos?ano={ano}
Recupera a quantidade de veículos por década de ano.

Parâmetros:

ano: O ano dos veículos a serem contados pela década.
Resposta: Um objeto GenericResponse contendo a quantidade de veículos da década do ano especificado.



OBS: não foi implementado front-end e nem feito testes unitários, tais requisitos exigem um tempo a mais de que não dispus no momento. 
Att.
Fábio Fernandes da Silva