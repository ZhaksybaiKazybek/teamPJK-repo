1. Run Spring Project Instance via system terminal:

MacOS/Linux:
source_path/deliver/gradlew bootRun

Windows:
source_path\deliver\gradlew.bat bootRun

2. Request for http://localhost:8080/... to some available endpoint with data:
- "./util/read" + "?name=myvalue"
- "./util/delete" + "?name=myvalue"
- "./util/create" + "?name=myvalue"
- "./util/update" + "?name=myvalue"

TODO:
- implement Spring JPA
- configure MySQL database connection
- realize rest api for project