# Examples

## Application
# ![alt text](service_models.png)

Examples of service models, virtualisation and the related technology: 
* IaaS (use AWS CDK, Terraform)
  * Virtual Machines
    * AWS EC2
    * Google Compute Engine
  * Containerised (Consume webservice)
    * Docker Compose (shell)
    * AWS ECS (AWS CDK)
      * Fargate
    * Orchestration platforms
      * Docker Swarm
      * Kubernetes
        * KinD (shell)
        * AWS EKS (AWS CDK)
        * Service Meshes
          * Istio (Kustomise, Helm)
          * AWS App Mesh
        * FaaS
          * Knative
* PaaS
  * AWS Elastic Beanstalk
  * Google App Engine
  * FaaS (Serverless)
    * AWS Lambda (Javascript, Python, GO)
    * Google Cloud Functions

## webservice
Example RESTful webservices using various programming languages and associated frameworks:
* Java
  * Spark

The webservice image will be built and deployed to AWS ECR and Docker Hub.
