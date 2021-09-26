package com.example;

import static spark.Spark.*;

public class Application {
    public static void main(String[] args) {
        port(8080);

        get("/java/spark", (req, res) -> "Hello from Java Spark!");
    }
}
