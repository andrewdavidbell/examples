# Examples

Requires: Make, Docker, Docker Compose

## Application
# ![alt text](service_models.png)

Potential IaC technologies:
* Platform Specific
  * AWS CloudFormation
  * AWS SDK
  * AWS CDK
  * Google Cloud Deployment Manager
* Platform Agnostic
  * Terraform

Examples of cloud service models, virtualisation and the related technology:
* [IaaS](./application/IaaS/)
  * Virtual Machines
    * AWS EC2
    * Google Compute Engine
  * [Containers](./application/IaaS/containers/)
    * [Docker Compose](./application/IaaS/containers/docker-compose/)
    * [AWS ECS](./application/IaaS/containers/ecs/)
      * Fargate
    * Orchestration platforms
      * Docker Swarm
      * Kubernetes
        * KinD
        * AWS EKS
          * Fargate
        * GCP GKE
        * Service Meshes
          * Istio
          * AWS App Mesh
          * Anthos Service Mesh
        * FaaS
          * Knative
* PaaS
  * AWS Elastic Beanstalk
  * Google App Engine
* FaaS (Serverless)
  * AWS Lambda (Javascript, Python, GO)
  * Google Cloud Functions

## Example containerised workload
* [color-app](https://github.com/peterj/color-app)

## webservice
Example RESTful webservices using various programming languages and associated frameworks:
* Java
  * Spark
