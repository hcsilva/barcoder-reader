# Leitor de Código de Barras EAN-13

Aplicação Spring Boot simples para ler códigos de barras EAN-13 usando leitor Zebra TC21.

## 📋 Requisitos

- Java 17 ou superior
- Maven 3.6+
- Leitor Zebra TC21

## 🚀 Como executar

### Opção 1: Usando Maven

```bash
cd barcode-reader
mvn spring-boot:run
```

### Opção 2: Compilando e executando o JAR

```bash
cd barcode-reader
mvn clean package
java -jar target/barcode-reader-0.0.1-SNAPSHOT.jar
```

## 📱 Como usar

1. Acesse a aplicação em: `http://localhost:8080`
2. Clique no campo de entrada
3. Escaneie o código de barras com o leitor Zebra TC21
4. O código será automaticamente processado e exibido na tela

## ⚙️ Funcionalidades

- ✅ Leitura automática de códigos EAN-13
- ✅ Validação de 13 dígitos
- ✅ Interface responsiva e simples
- ✅ Auto-submit após escaneamento completo
- ✅ Feedback visual de sucesso/erro
- ✅ Campo limpo automaticamente para próxima leitura

## 🔧 Configuração do Leitor Zebra TC21

O leitor Zebra TC21 funciona como um teclado (HID), não sendo necessária configuração adicional.
Certifique-se de que:
- O leitor está no modo "teclado" (Keyboard Emulation)
- Está configurado para adicionar ENTER após o código (se desejar auto-submit)

## 📝 Estrutura do Projeto

```
barcode-reader/
├── src/
│   ├── main/
│   │   ├── java/com/example/barcodereader/
│   │   │   ├── BarcodeReaderApplication.java
│   │   │   └── controller/
│   │   │       └── BarcodeController.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/
│   │           └── index.html
├── pom.xml
└── README.md
```

## 🎯 Próximos passos (opcional)

- Adicionar histórico de códigos lidos
- Salvar em banco de dados
- Integrar com API de consulta de produtos
- Adicionar export para CSV/Excel
- Implementar autenticação
