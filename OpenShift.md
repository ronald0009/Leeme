# OpenShift

OpenShift automates the build, deployment, and management of applications.

The goal of OpenShift is to provide a great experience for both Developers and System Administrators to develop, deploy, and run containerized applications.

First of all clic on the Link for the [CLI and/or the Web Console](https://learn.openshift.com/introduction/getting-started).

## CLI

The OpenShift CLI is accessed using the command oc. From here, you can administrate the entire OpenShift cluster and deploy new applications.

```
$ oc login
$ oc whoami
```

## In the web console, what is a project?

It's a visualization of the Kubernetes namespace based on the developer access controls.

## Step by step

1.	Click on ‘Dashboard’
2.	Log in
3.	Create Project
4.	Fill in the Name field as
myproject
5.	Clic on ‘Create’
6.	Select ‘Deploy Image’ / clic on ‘Image Name’
7.	Fill the name:
openshiftroadshow/parksmap-katacoda:1.0.0
8.	Clic on the glass icon
9.	Clic on ‘Create’
10.	Clic on link ‘Continue to overview’
