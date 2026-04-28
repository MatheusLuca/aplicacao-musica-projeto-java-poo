# Aplicativo de Música

Projeto desenvolvido em **Java** baseado no curso da [Alura](https://www.alura.com.br/), com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)** — herança, encapsulamento, polimorfismo e organização em pacotes (camadas `model`, `service` e `view`).

A aplicação simula um pequeno reprodutor de mídia que permite cadastrar **músicas** e **podcasts**, avaliar cada faixa interativamente pelo console e exibir os dados formatados, incluindo a média das avaliações.

---

## Funcionalidades

- Cadastro de **Músicas** (faixa, artista, álbum, ano, duração, status de reprodução).
- Cadastro de **Podcasts** (título, host, convidado, categoria, número de episódios, ano e duração).
- Sistema de **avaliação interativa** via terminal (notas somadas e contadas em loop).
- Cálculo automático da **média de avaliações** para cada item.
- Impressão formatada das informações utilizando *Text Blocks* do Java.

---

## Tecnologias e Requisitos

- **Java 17+** (o projeto usa *Text Blocks* e o método `static void main` no estilo mais novo).
- **IntelliJ IDEA** (recomendado) — o projeto já vem com o arquivo `.iml` configurado.
- Nenhuma dependência externa (apenas a biblioteca padrão do Java).

---

## Estrutura do Projeto

```
aplicativo-musica/
└── src/
    └── br/com/alura/aplicativomusica/
        ├── model/
        │   ├── Audio.java        # Classe pai com atributos comuns
        │   ├── Musica.java       # Especialização de Audio
        │   └── Podcast.java      # Especialização de Audio
        ├── service/
        │   └── Calculos.java     # Lógica de avaliações e somatórios
        └── view/
            └── Main.java         # Ponto de entrada / interação com usuário
```

### Camadas

| Pacote    | Responsabilidade                                                                 |
|-----------|----------------------------------------------------------------------------------|
| `model`   | Entidades do domínio (`Audio`, `Musica`, `Podcast`).                             |
| `service` | Regras e operações auxiliares (`Calculos` para média/contagem de avaliações).    |
| `view`    | Interface com o usuário via console (`Main`).                                    |

---

## Como Executar

### Pelo IntelliJ IDEA
1. Abra a pasta do projeto no IntelliJ.
2. Aguarde a indexação e configure um JDK 17+.
3. Execute a classe `Main` em `src/br/com/alura/aplicativomusica/view/Main.java`.

### Pelo terminal
Na raiz do projeto:

```bash
# Compilar
javac -d out src/br/com/alura/aplicativomusica/model/*.java \
              src/br/com/alura/aplicativomusica/service/*.java \
              src/br/com/alura/aplicativomusica/view/*.java

# Executar
java -cp out br.com.alura.aplicativomusica.view.Main
```

---

## Como Usar

Ao rodar a aplicação:

1. Escolha o tipo de mídia:
   - `p` → Podcast
   - `m` → Música
2. Será solicitada uma **nota** para a faixa.
3. Após cada nota, digite:
   - `1` para continuar avaliando.
   - `0` para encerrar as avaliações.
4. Ao finalizar, o programa imprime os dados da mídia com a **média de avaliações** calculada.

Exemplo de saída para uma música:

```
faixa: Os meninos
tempoDuracao: 129
anoLancamento: 2001
totalAvaliacao: 0
artista: Derek D Belico atormentador
album: Os belicos da velha vila belmiro
emReproducao: false
media avaliacao: 8.50
```

---

## Conceitos Praticados

- Herança (`Musica` e `Podcast` herdam de `Audio`).
- Sobrescrita de método (`@Override` em `imprimir()`).
- Encapsulamento via *getters* e *setters*.
- Separação em camadas (model / service / view).
- Entrada de dados com `Scanner`.
- *Text Blocks* (`""" ... """`) para strings multilinhas.
- Uso de `Locale.US` para padronização de números decimais.

---

## Próximos Passos (ideias de evolução)

- Permitir cadastrar várias músicas/podcasts em uma lista.
- Criar um menu interativo persistente (não sair após uma avaliação).
- Adicionar testes unitários com JUnit.
- Persistir dados em arquivo (JSON/CSV).
- Migrar para um build tool (Maven ou Gradle).

---

## Autor

Projeto de estudos em Java desenvolvido por **Lucas** durante a graduação na **FIAP**, com base nos cursos da Alura.
