# TestNG Selenium Practice

A practice project for Selenium WebDriver with TestNG (Java). The tests run against the practice site https://the-internet.herokuapp.com/.

## What is covered

- Login and secure area
- JavaScript alerts and JavaScript executor
- Frames and nested frames
- Hovers
- Dropdowns
- Waits (dynamic loading)
- Multiple windows, new window, and navigation
- Key presses

## Tools

- Java
- Selenium WebDriver 4
- TestNG
- Maven

## Structure

- `src/main/java/pages`: page objects (Page Object Model)
- `src/main/java/listeners`: a WebDriver listener
- `src/main/java/Navigation`: window manager helper
- `src/test/java`: test classes grouped by topic
- `reports/index.html`: a report file from a test run

## How to run

You need Java, Maven, and Chrome.

```
mvn test
```
