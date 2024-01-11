# BPM-Crafters Maven Parent

A common Maven parent POM for BPM Crafters projects.

[![stable](https://img.shields.io/badge/lifecycle-STABLE-green.svg)](https://github.com/holisticon#open-source-lifecycle)
[![Development branches](https://github.com/bpm-crafters/bpm-crafters-maven-parent/actions/workflows/development.yml/badge.svg)](https://github.com/bpm-crafters/bpm-crafters-maven-parent/actions/workflows/development.yml)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/dev.bpm-crafters.maven.parent/maven-parent/badge.svg)](https://maven-badges.herokuapp.com/maven-central/dev.bpm-crafters.maven.parent/maven-parent)

## About

Maven poms are quite bloated, Most of the settings (how to compile, how to deploy) are repeated over and over.
This maven-parent aims to reduce the xml in your `pom.xml` to the things you really want to express in your library or application project.

By nature of this module, it is a highly opinionated approach. It might fit your needs, but it is explicitly designed to support open source library projects we are currently building and maintaining under `bpm-crafters` organization.

### Versioning

Since this parent countless versions of other libs and plugins, it cannot have any meaningful version itself.

The semantic versioning conventions is `YEAR.MONTH.COUNT`, so the first build in September would be `version=2024.1.0` ... and counting.

## How to use?

This is a maven parent. So just include it on the top of your root `pom.xml`:

```xml
 <parent>
  <groupId>dev.bpm-crafters.maven.parent</groupId>
  <artifactId>maven-parent</artifactId>
  <version>LATEST_VERSION</version>
  <relativePath/>
</parent>
```

Carefully analyse your pom (and the effective pom) and remove duplications, unintended overwrites and possible conflicts ... and you are done.

## Features

### Kotlin only compilation

Following the [x-compile guide](https://kotlinlang.org/docs/maven.html#compile-kotlin-and-java-sources) for maven/kotlin the correct kotlin and java compilers are included.

## Versions

* kotlin: 1.9.22 - used in kotlin compiler und kotlin libs.

## Release

1. close milestone
1. on local console: `mvn gitflow:release-start` - wait for action
1. on local console: `mvn gitflow:release-finish` - wait for action - sonatype pipeline will run
1. github release - publish
