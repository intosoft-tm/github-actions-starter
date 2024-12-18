# Goal

Use the CICD pipelines in your project by simply invoking reusable flows from this repository.

```
name: Example Project Pipeline

on:
  workflow_dispatch:
  push:
    branches:
      - 'main'
    tags:
      - "v*.*.*"
  pull_request:
    branches:
      - 'main'

permissions:
  contents: write
  pull-requests: write
  packages: write

jobs:
  gradle-pipeline:
    name: ▶️
    uses: intosoft-tm/github-actions-starter/.github/workflows/gradle.yml@main
    secrets: inherit
    with:
      native: true
```

# Testing locally
### Install act

```bash
   curl https://raw.githubusercontent.com/nektos/act/master/install.sh | sudo bash
````

### Run act

```bash
   sudo ~/bin/act -r -s GITHUB_TOKEN
```

   - -r - reuse downloaded actions
   - -s - tell act to read GitHub token.
   
   - sudo because if you are running with podman binfmt needs rootful access 

# Hints

1. You can merge gradle or node.js with release workflow but using GitHub event you save your builders time.
2. Single jobs are much faster but can be parallelized if needed, especially if you have own runners ([ACR recommended](https://docs.github.com/en/actions/hosting-your-own-runners/managing-self-hosted-runners-with-actions-runner-controller/quickstart-for-actions-runner-controller).
3. Config is in .actrc file, I use upload action which needs target directory.