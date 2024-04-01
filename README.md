# BANKING API

## Overview

A java spring boot REST API that has the basic banking operations

## Features

- Create an account
- Deposit an amount of money
- Withdraw an amount of money
- Delete an account
- Get all bank accounts
- Get an account by its ID

## Project Set-up

To run this project, follow these steps:

1. **Clone the repository**

```shell
git clone https://github.com/cedricahenkorah/banking-api.git
```

2. **Navigate to the project directory**

```shell
cd banking-api
```

3. **Set up your application properties to use sql**

```shell
spring.datasource.url=jdbc:mysql://localhost:[port]/[db]
spring.datasource.username=
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

4. **Build and run the project**

```shell
./mvnw clean spring-boot:run
```

5. **Make requests from your postman app or cli**