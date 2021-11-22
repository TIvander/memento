# memento
Atividade escolar utilizando padrão de projeto memento
Para utilizar o padrão de projeto memento, reutilizei o mesmo código que foi implementado no padrão state(está no meu repositório state).
Foi criado um programa que simule a fila de usuários que fazem requisições a um banco de dados. Os usuário podem ter 5 estados diferentes; Ativo, Aguardando, Executando, Inativo e Bloqueado. 
Um usuário no estado Ativo pode passar para os estados(Aguardando,Executando,Inativo e Bloqueado); 
Um usuário no estado Aguardando não é autorizado a ter o estado alterado; 
Um usuário no estado Executando pode passar apenas para o estado de "Bloqueado"; 
Um usuário no estado Inativo não é autorizado a ter o estado alterado; 
Um usuário no estado Bloqueado não é autorizado a ter o estado alterado. 
Nos casos de teste, foi instanciado um usuário em cada um dos diferentes tipos de estado.
