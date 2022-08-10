# Sharif AIC22 Kotlin Client

This is the implementation of java client in kotlin.

## Guide

1. add your implementation of `move()` and `getStartingNode()` functions for thief and police agents in
   files `ai/police.kt`
   and `ai/thief.kt`. (current implementation chooses an available edge at random or stays in place in case of
   insufficient balance)
2. package the client with the following command
    ```bash
    mvn package
    ```
   this creates `client.jar` at root directory.
3. zip the `jar` file and upload!