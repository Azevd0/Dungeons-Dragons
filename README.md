## 🎲 ProjetoDnD – Sistema de Rolagens de RPG em Java

Este projeto é uma aplicação em Java que simula jogadas de D&D 5e incluindo testes de resistência, perícias, ataques, cálculo de dano, vantagem/desvantagem e uso de atributo e proficiência.
Ele permite criar personagens com atributos próprios e interagir com um sistema completo de rolagem.

## 📌 Funcionalidades

O sistema permite:

## 👤 Criação de Personagem

Cada personagem possui:

Nome

Força

Destreza

Constituição

Inteligência

Sabedoria

Carisma

Bônus de proficiência

## 🎲 Tipos de Jogada

O personagem pode realizar:

Teste de Resistência

Teste de Perícias

Jogada de Ataque

Pular turno

## ⚔️ Vantagem e Desvantagem

O usuário escolhe:

Jogada com vantagem

Jogada com desvantagem

Jogada normal

Sistema rola automaticamente dois dados quando necessário.

## 🛡️ Testes de Resistência

Escolhe atributo (STR, DEX, CON, etc.)

Define a dificuldade (CD)

Escolhe proficiência

Resultado final mostrado com explicação

## 📚 Perícias

Lista completa de perícias dividida por atributo

Escolha entre:

Não proficiente

Proficiente

Especialista

Vantagem / desvantagem

Comparação com dificuldade

## ⚔️ Ataques

Rola o ataque contra a Classe de Armadura (CA)

Calcula dano com:

Tipo de dado (d4, d6, d8, d10, d12)

Quantidade de dados

Modificador de atributo

Bônus de ataque opcional

## 🗂️ Estrutura do Projeto
ProjetoDnD/
│
├── Main.java         # Classe principal – cria personagens e inicia turnos
└── Personagem.java   # Classe que contém todo o sistema de rolagens

## ▶️ Como usar

Execute a classe Main.

O programa cria dois personagens de exemplo.

Para cada personagem, selecione:

Tipo da jogada

Atributo

Proficiência

Dificuldade / CA

O sistema imprime cada etapa da rolagem e o resultado final.

📌 Exemplo de Saída

---Turno de Albion---

Selecione o tipo da jogada:

1 - Teste de resistência

2 - Teste de perícia

3 - Jogada de ataque

4 - Pular turno


A aplicação continua pedindo as entradas conforme as escolhas feitas.

## 🛠️ Tecnologias Utilizadas

Java 17 (ou qualquer versão compatível com Random.nextInt(min, max))

java.util.Random

java.util.Scanner

## 📈 Possíveis Melhorias Futuras

Sistema de armas e magias

Salvamento de personagens

Interface gráfica (JavaFX)

Modo totalmente automatizado (sem Scanner)

Implementar críticos (d20 = 20) e falhas críticas (d20 = 1)

Criação automática de fichas
