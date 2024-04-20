# fiap-checkpoint2
### Comando "docker" para executar a aplicação a partir do docker hub com profile "dev"

```
docker run -d -p 8080:8080 -e PROFILE=dev juliocesarlb/fiap-checkpoint2
```

### Comando "docker" para executar a aplicação a partir do docker hub com profile "stg"

```
docker run -d -p 8080:8080 -e PROFILE=stg juliocesarlb/fiap-checkpoint2
```

### Comando "docker" para executar a aplicação a partir do docker hub com profile "prd"

```
docker run -d -p 8080:8080 -e PROFILE=prd juliocesarlb/fiap-checkpoint2
```
