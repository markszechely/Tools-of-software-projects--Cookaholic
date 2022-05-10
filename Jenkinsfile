pipeline {

  agent any
  environment {
    PATH = "/usr/local/Cellar/maven/3.8.5:$PATH"
  }
  
  stages {
  
    stage("build") {
    
      steps {
        echo 'builing app'
        sh "mvn clean install"
      }    
    }
    stage("test") {
    
      steps {
        echo 'testing app'
      }
    }
    stage("deploy") {
    
      steps {
        echo 'deploying app'
      }
    }
  }
}
