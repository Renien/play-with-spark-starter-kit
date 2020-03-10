<h1 align="center">
    <br>
        Play - Spark Starter Kit
    <br>
  <h4 align="center">play-with-spark-starter-kit</h4>
</h1>

<p align="center">
       <a href="https://travis-ci.org/Renien/play-with-spark-starter-kit">
           <img src="https://api.travis-ci.org/Renien/play-with-spark-starter-kit.svg?branch=master"
                alt="Travis Build">
       </a>
       <a href="">
           <img src="https://img.shields.io/npm/l/express.svg?maxAge=2592000&style=flat-square"
                alt="License">
         </a>
    </p>

# play-with-spark-starter-kit
Play with Spark: Building Apache Spark with Play Framework


## Directory Layout

```
.
├── app
│   ├── controllers
│   │   └── HomeController.java
│   ├── guice
│   │   └── module
│   │       └── MLLibModule.java              --> Machine Learning guice module
│   ├── ml
│   │   └── ModelPrediction.scala             --> Model prediction class (word count example)
│   ├── response
│   ├── startup
│   │   └── AppLoader.java                    --> App loader module
│   └── views
│       ├── index.scala.html
│       └── main.scala.html
├── build.sbt
├── conf
│   ├── application.conf
│   ├── logback.xml
│   └── routes
├── logs
│   └── application.log
├── project
│   ├── build.properties
│   ├── plugins.sbt
│   ├── project
├── public
│   ├── images
│   │   └── favicon.png
│   ├── javascripts
│   │   └── main.js
│   ├── stylesheets
│   │   └── main.css
│   └── words.txt
├── README.md
```
## Dependencies

```
scalaVersion := "2.11.1"

libraryDependencies  ++= Seq(
  "org.apache.hadoop" % "hadoop-client" % "2.7.2",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.10.2",
  guice,
  javaWs,
  "org.apache.spark" %% "spark-core" % "2.4.0",
  "org.apache.spark" %% "spark-sql" % "2.4.0",
  "org.apache.spark" %% "spark-mllib" % "2.4.0"
)
```

## Installation

Make sure you have installed,

- JDK 1.8+
- Scala 2.11.*

## License
MIT © [Renien](https://twitter.com/RenienJoseph)
