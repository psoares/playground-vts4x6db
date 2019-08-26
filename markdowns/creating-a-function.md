# Creating the function
You can install micronaut using [sdkman](https://sdkman.io/). Once installed, type:
```bash
sdk install micronaut
```

This will install the latest version of micronaut, which at this time is v1.2.

Micronaut comes with its own cli tool for building applications. You can create an openFaas function by typing:

```bash
mn create-function myfunction --features openfaas
```

This will generate an example project with the following structure highlights:

```text
myfunction
    |_______ function.yml
    |_______ src
              |____ main
                      |____ java
                              

```
