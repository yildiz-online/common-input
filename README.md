# Yildiz-Engine common-input

This is the official repository of The Common Input library, part of the Yildiz-Engine project.
The common input library is a set of utility and helper classes to manage and translate the different control inputs,...

## Features

* Model for keyboard, controller, mouse, steering wheel.
* Translate between controller types.
* ...

## Requirements

To build this module, you will need the latest Java JDK and Maven 3.

## Coding Style and other information

Project website:
https://engine.yildiz-games.be

Issue tracker:
https://yildiz.atlassian.net

Wiki:
https://yildiz.atlassian.net/wiki

Quality report:
https://sonarcloud.io/dashboard/index/be.yildiz-games:common-input

## License

All source code files are licensed under the permissive MIT license
(http://opensource.org/licenses/MIT) unless marked differently in a particular folder/file.

## Build instructions

Go to your root directory, where you POM file is located.

Then invoke maven

	mvn clean install

This will compile the source code, then run the unit tests, and finally build a jar file.

## Usage

In your maven project, add the dependency

```xml
<dependency>
    <groupId>be.yildiz-games</groupId>
    <artifactId>common-input</artifactId>
    <version>LATEST</version>
</dependency>
```
Replace LATEST by the expected version.

## Contact
Owner of this repository: Grégory Van den Borre