# Java Simple Cli

A simple command-line interpreter (CLI) written in Java as part of an introductory Java exercise.

---

## 🛠️ Prerequisites

- **JDK 21** or higher (Java Development Kit).
- A terminal (Linux, macOS, or Windows CMD / PowerShell).

To verify your Java installation:

```bash
java -version
```

## 🚀 Quick Start

1. **Clone the repository**

```
git clone https://github.com/rlossec/java-simple-cli
cd java-simple-cli
```

2. **Compile the Java source file**:Bash

```
cd src/
javac Cli.java
```

3. **Run the program**:Bash

```
java Cli
```

## 💻 Available Commands

Once running, a `>` prompt appears. Below are the supported commands:

| **Command**       | **Arguments**        | **Description**                                                   | **Example Output**              |
| ----------------- | -------------------- | ----------------------------------------------------------------- | ------------------------------- |
| `date`            | None                 | Prints the current date in `YYYY-MM-DD` format                    | `2026-07-28`                    |
| `time`            | None                 | Prints the current time                                           | `21:50:37:123456789`            |
| `datetime`        | None                 | Prints the current date and time                                  | `2026-07-28T21:50:37.123456789` |
| `useraccount`     | None                 | Prints the current user account name                              | `frank`                         |
| `userhome`        | None                 | Prints the current user's home directory                          | `/home/frank`                   |
| `os`              | None                 | Prints the operating system name and version                      | `Linux (7.0.0-28-generic).`     |
| `printenv`        | `[VARIABLE]` Or None | Prints the value of an environment variable Or All (No arguments) | `/usr/lib/jvm/java-21`          |
| `echo`            | `[TEXT]`             | Echoes back any arguments passed to it                            | `Hello world!`                  |
| `chuck`           | None                 | Print a quote from `chuckNorris.txt`                              | `Gravity obeys Chuck Norris.`   |
| `exit` / `logout` | None                 | Exits the CLI session                                             |                                 |
