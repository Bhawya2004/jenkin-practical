Scenario: Automatically Fetch Source Code from GitHub

Problem Statement

Developers are storing project code in GitHub.

Whenever a build is required, developers manually:

1. Open terminal.
2. Clone repository.
3. Pull latest changes.
4. Verify project contents.

This process is repetitive and difficult to track.

Objective

Use Jenkins to automatically fetch source code from GitHub.

Solution

Create a Jenkins Freestyle Job that:

1. Connects to GitHub.
2. Clones a repository.
3. Stores source code inside Jenkins workspace.
4. Displays clone logs.

Expected Outcome

Jenkins should automatically download project source code and maintain a build history.

This forms the first step of Continuous Integration.