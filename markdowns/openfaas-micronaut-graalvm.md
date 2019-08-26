# OpenFaaS with Micronaut and GraalVM native images
Micronaut is a framework for building microservices and serverless functions for the JVM.
Learn more about it at [micronaut.io](https://docs.micronaut.io/latest/guide/index.html).

OpenFaaS makes it possible to run serverless code in your own docker swarm or kubernetes cluster.
In this tutorial, we will use OpenFaaS deployed in Kubernetes.

We will then create a micronaut function that showcases one of the framework's features: dependency injection (so that 
it's a little different from OpenFaaS' classical [java8 template](https://github.com/openfaas/templates/tree/master/template/java8)).

[GraalVM](https://www.graalvm.org/) is *a universal virtual machine for running applications written in JavaScript, Python, Ruby, R, JVM-based languages like Java, Scala, Groovy, Kotlin, Clojure, and LLVM-based languages such as C and C++.*

What makes it interesting for us in the context of this exercise is its ability to compile our Java code into a native image.

At this point, it only supports Java8, so we won't be able to use Java 9+ to write our function.

I'll assume you have docker and a functional OpenFaaS installation for the rest of this tutorial. If
not, head to https://docs.openfaas.com/ and come back here when you're ready.
