# Sprint 0 - SLIM (TIME 2)



## **_Realização da primeira entrega do projeto integrador do primeiro semestre de 2021_** :rocket:



![CARD0](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/CARD0.png)



-----------------------------------

**:pushpin: _Em 28/03/2021 foi realizada a entrega de:_**

- [x] Backlog (total e da sprint);
- [x] Modelagem de dados;
- [x] Telas de Login e cadastro;
- [x] Tabelas do Banco de dados;
- [x] Escolha de tecnologias a serem utilizadas;



Tais arquivos podem ser encontrados tanto no **próprio git**, ou pelos links gerados:

---------------

:book: Backlog

![Cópia de Tecnologias utilizadas](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/C%C3%B3pia%20de%20Tecnologias%20utilizadas.png)

<a href="https://drive.google.com/file/d/1DXNG6m5TAhoHdeisg2suA9b_R5UXp1fN/view?usp=sharing" target="__blank">Clique para visualizar o Backlog total</a>

--------------------------------------------------------------------------------------------------------------------
:package: Modelagem de dados

### Entidades ###
![Entidades](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/Entidades.png)

### Métodos JPA ###
![Metodos_JPA](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/M%C3%A9todos_JPA.png)


### Implementação dos Métodos ###
![Metodos_impl](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/Implementa%C3%A7%C3%A3o_Servi%C3%A7os.png)

### Serviços ###
![Serviços](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/M%C3%A9todos_Post_Get.png)

### Tratamento de exceções ###
![exceções](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/Exce%C3%A7%C3%B5es.png)
--------------------------------------------------------------------------------------------------------------------
:desktop_computer: Telas de Login e Cadastro

### Tela inicial ###
![crud1](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/Cruds/crud1.png)

### Tela de login do Aluno e do Professor ###
![crud2](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/Cruds/crud2.png)

### Tela de Cadastro do Aluno ###
![crud3](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/Cruds/crud3.png)

### Tela de Cadastro Professor ###
![crud4](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/Cruds/crud4.png)

### Tela de login do Gestor e do Administrador ###
![crud5](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/Cruds/crud5.png)

--------------------------------------------------------------------------------------------------------------------
:dart: Banco de dados

### Representação do Banco de dados ###
![BD](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/Banco_de_dados_sprint0.jpeg)

### Código SQL ###

#### Aluno ####

CREATE TABLE public.alunos
(
    id integer NOT NULL DEFAULT nextval('clientes_id_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    celular character(11) COLLATE pg_catalog."default",
    genero character varying(9) COLLATE pg_catalog."default",
    senha character varying(12) COLLATE pg_catalog."default",
    email character varying(50) COLLATE pg_catalog."default",
    nascimento date,
    CONSTRAINT clientes_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.alunos
    OWNER to postgres;
    
    
#### Professor ####

CREATE TABLE public.professores
(
    id integer NOT NULL DEFAULT nextval('professores_id_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    celular character varying(11) COLLATE pg_catalog."default" NOT NULL,
    nascimento date NOT NULL,
    genero character varying(9) COLLATE pg_catalog."default" NOT NULL,
    senha character varying(20) COLLATE pg_catalog."default" NOT NULL,
    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT professores_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.professores
    OWNER to postgres;
    
    
#### Administrador ####

CREATE TABLE public.administrador
(
    id integer NOT NULL DEFAULT nextval('clientes_id_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    celular character(11) COLLATE pg_catalog."default",
    genero character varying(9) COLLATE pg_catalog."default",
    senha character varying(12) COLLATE pg_catalog."default",
    email character varying(50) COLLATE pg_catalog."default",
    nascimento date,
    CONSTRAINT adm_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.administrador
    OWNER to postgres;
    
    
#### Gestor ####

CREATE TABLE public.gestor
(
    id integer NOT NULL DEFAULT nextval('clientes_id_seq'::regclass),
    nome character varying(50) COLLATE pg_catalog."default" NOT NULL,
    celular character(11) COLLATE pg_catalog."default",
    genero character varying(9) COLLATE pg_catalog."default",
    senha character varying(12) COLLATE pg_catalog."default",
    email character varying(50) COLLATE pg_catalog."default",
    nascimento date,
    CONSTRAINT gestor_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE public.gestor
    OWNER to postgres;
    
-------------------------------------------------

:man_technologist: Tecnologias utilizadas

![Tecnologias utilizadas](https://github.com/DevSlim001/API_NEDUC/blob/sprint0/readassets/Tecnologias%20utilizadas.png)

----------------------------



### **DevTeam:**

- **Front-end** *(<a href="https://github.com/brennorichard" target="__blank">Brenno Richard Rabelo de Almeida</a>, <a href="https://github.com/Rafael-BD" target="__blank">Rafael Bettini Dias</a>, <a href="https://github.com/nicursino" target="__blank">Nicolas Cursino Magarifuchi</a>)*
- **Back- end** *(<a href="https://github.com/medrenan" target="__blank">Renan Alves de Medeiros</a>, <a href="https://github.com/camilaffpacheco" target="__blank">Camila Pacheco</a> e <a href="https://github.com/VGabrielMelo" target="__blank">Victor Gabriel Melo</a>)*

- **Banco de dados** *(<a href="https://github.com/CristianMateusTB" target="__blank">Cristian Mateus Teixeira Barbosa</a>)*
