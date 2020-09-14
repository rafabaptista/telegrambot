# Telegrambot

## **Dev**

To start the application use:

```
mvn spring-boot:run
```

If needed you can activate other profiles:

```
mvn spring-boot:run -Dspring.profiles.active=postgres
```

To setup your Bot Telegram Api Key, search for constant into *ValueConstant.java* (I recommend you to use a System/User environment variable for it):

```
public static String BOT_API_KEY = "<YOUR_BOT_TELEGRAM_API_KEY>";
```

After deploy your application, update the URL constant into *UrlConstant.java* with your base url:

```
public static String BOT_API_BASE_URL = "<API_BASE_URL>";
```

In order to develop a new feature or fix a bug follow the steps below:

- Create a branch from develop and give it a meaningful name related to the issue.
- Commit inside your branch.
- If needed squash your commits and keep them meaningful and atomic.
- Open a PR to develop and link with the issue, select the reviewers you want to review your PR.
- Wait for your PR to be reviewed, sometimes the reviewer can ask for changes, if that's the case submit the changes and wait for approval.


