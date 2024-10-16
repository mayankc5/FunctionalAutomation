

pipeline{

agent any

tools{
    
    jdk "JDK21"
    maven "maven1"
}
stages{

  stage('Gitcheckout'){
  
  steps{
	git branch: 'main', url: 'https://github.com/mayankc5/FunctionalAutomation.git'
  
  }
  }


stage('Compile'){
  
  steps{
	bat 'mvn compile'
  
  }
  }


stage('Build'){
  
  steps{
	echo "Project Build"
  
  }
  }
  
  stage('Execution'){
  
  steps{
	bat 'mvn clean install'
  
  }
  }

}


post{

always{
echo "Project Name:"

}
  success{
  echo "Project build sucessfully"
  
  }
  
  unsuccessful{
  echo " build failed"
  }

}


}
