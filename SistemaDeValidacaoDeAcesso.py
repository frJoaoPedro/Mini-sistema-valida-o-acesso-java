print("< Seja muito Bem vindo Usuário >")
print("\nEsté programa irá definir seu acesso ao arquivo x")
print("Vamos pedir seu nome, idade, e Nível de acesso")
print("Nos temos Níveis de acesso de 1 a 3, onde cada um tem permissões personalizadas")
print("porém, lembre-se que somos bem restritos quanto a menores de idade... idependente do Nível deAcesso")

nome = input("\n Ok vamos dar início agora\n primeiro digite aqui seu nome: ")
idade = int(input(" agora digite aqui a sua idade: "))
NivelDeAcesso = int(input(" Agora por fim, digite aqui seu nível de acesso: "))

if idade < 18:
    print("\n Independentemente do seu nível, acesso negado por ser menor de idade!")
elif idade >= 18 and NivelDeAcesso == 1:
    print("\n Você é Visitante, sendo assim voce ganha:Acesso Básico: \n Você so pode ler! \n Bem vindo ao arquivo X")
elif idade >= 18 and NivelDeAcesso == 2:
     print("\n Você é colaborador, sendo assim você ganha:Acesso Médio: \n Você pode ler e escrever! \n Bem vindo ao arquivo X")
elif idade >= 18 and NivelDeAcesso == 3:
    print("\n Você é adimin, Sendo assim você ganha: \n Acesso completamente liberado \n Bem vindo ao arquivo X")
else:
    print("\n Cara, o nível vai só de 1 a 3 ou você digitou algo errado. Tente novamente!")