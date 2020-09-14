# Botcraft

## **Dev**

To start the application use:

```
mvn spring-boot:run
```

Locally it uses H2, check [config](https://github.com/Botcrafting/botcraft/blob/master/src/main/resources/application-dev.properties)

If needed you can activate other profiles:

```
mvn spring-boot:run -Dspring.profiles.active=postgres
```

In order to develop a new feature or fix a bug follow the steps below:

- Find the related issue or open a new one [here](https://github.com/Botcrafting/botcraft/issues).
- Create a branch from develop and give it a meaningful name related to the issue.
- Commit inside your branch.
- If needed squash your commits and keep them meaningful and atomic.
- Open a PR to develop and link with the issue, select the reviewers you want to review your PR.
- Wait for your PR to be reviewed, sometimes the reviewer can ask for changes, if that's the case submit the changes and wait for approval.


