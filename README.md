# About

The code in this repository was originally written in Java by Rameez Shaikh for 
[this article](https://medium.com/swlh/spring-boot-security-jwt-hello-world-example-b479e457664c). However, no GitHub repository
was provided, and the code contained in the article no longer worked due to changes in the io.jsonwebtoken:jjwt dependency.

This repository contains the code posted in the article converted to Kotlin, with the necessary modifications to make it work.

## Usage
```bash
curl -d '{"username":"javainuse","password":"password"}' -H "Content-Type: application/json" -X POST localhost:8080/authenticate

curl localhost:8080/hello -H "Authorization: Bearer <token>"
```


## Disclaimer 
I am providing this code as-is, with the explicit understanding that I am not the author of the code, 
am not affiliated with Rameez Shaikh in any way and am not responsible nor liable for any consequences of using the 
code provided in this respository. Use at your own risk.




