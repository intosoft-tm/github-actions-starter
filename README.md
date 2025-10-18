# Github actions starter

## Goal

Automate CI pipelines for projects.

A release PR is created automatically from the main branch. Once merged, the release and tag are created.

## Usage
Use the CICD pipelines in your project by simply invoking reusable flows from this repository.

```
name: Example Java App CI

on:
  push:
    tags:
      - v*.*.*
  pull_request:

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

## Manual release

To create a release, create a commit with a comment like this:

git commit --allow-empty -m "chore: release 2.0.0" -m "Release-As: 2.0.0"

Read more about the release-please: https://github.com/googleapis/release-please

## Testing locally
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

### Hints

1. Release workflow is not included in the CI workflows because it needs to push tag. This triggers the CI workflow and creates a proper docker image tag.
2. Use the .actrc config file if workflows use upload action which needs a target directory.