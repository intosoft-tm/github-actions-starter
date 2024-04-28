# Goal

Use the cicd pipelines in your project by simply running reusable flows in this repository 

# Local run

1. Install act:

    curl https://raw.githubusercontent.com/nektos/act/master/install.sh | sudo bash

2. Create .env file with content:

```
   READ_WRITE_PACKAGES_TOKEN=
   GITHUB_TOKEN=
   SKIP_RELEASE=true
```

READ_WRITE_PACKAGES_TOKEN - token with read/write packages access

GITHUB_TOKEN - token with read/write packages access (can be same as READ_WRITE_PACKAGES_TOKEN)

SKIP_RELEASE=true - no need of running release locally 