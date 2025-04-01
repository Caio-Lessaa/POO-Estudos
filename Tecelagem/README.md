# Sistema de Gerenciamento de Funcionários - Tecelagem  

## 📌 Sobre o Projeto  

Este projeto em **Java** implementa um sistema de gerenciamento de funcionários para uma tecelagem, considerando três categorias principais:  

- **Administrativo**: Salário fixo com descontos por faltas.  
- **Produção**: Pagamento por hora, com adicional noturno.  
- **Vendas**: Salário fixo com comissão por vendas.  

O projeto faz uso de **herança** e **polimorfismo** para estruturar a hierarquia de classes de forma eficiente, evitando repetição de código, além da utilização de **classes abstratas**.  

---  

## ✨ Funcionalidades  

Cada tipo de funcionário possui métodos específicos para calcular seu salário e registrar atividades:  

### 📌 Todos os Funcionários:  
- `salarioLiquido()`: Calcula o salário líquido.  
- `hollerith()`: Imprime o demonstrativo de pagamento.  
- `novoMes()`: Reseta as informações acumuladas do mês.  

### 📌 Administrativo:  
- `registrarFalta()`: Acumula faltas para desconto no salário.  

### 📌 Produção:  
- `registrarHorasDiurnas(int horas)`: Acumula horas diurnas trabalhadas.  
- `registrarHorasNoturnas(int horas)`: Acumula horas noturnas trabalhadas (30% de acréscimo no valor da hora).  

### 📌 Vendas:  
- `registrarVenda(double valor)`: Acumula o valor das vendas para calcular a comissão (3% sobre o total de vendas).  

---  

## 🏗️ Estrutura do Projeto  

O projeto é composto pelas seguintes classes:  

- **Funcionario** (Classe abstrata base)  
- **Administrativo** (Extende `Funcionario`)  
- **Producao** (Extende `Funcionario`)  
- **Vendas** (Extende `Funcionario`)  
- **Main** (Classe principal para testes)  

---  

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java
- **Paradigma:** Orientação a Objetos (Herança, Polimorfismo, Encapsulamento)

---

## 👨‍💻 Autor
Projeto desenvolvido por mim (Caio Lessa) como exercício de prática em **Java** e **POO**.
