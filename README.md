1. Run Spring Project Instance via system terminal:

MacOS/Linux:
source_path/deliver/gradlew bootRun

Windows:
source_path\deliver\gradlew.bat bootRun

2. Request for http://localhost:8080/... to some available endpoint with data:
- "./util/read" + "?id=myvalue"

Others with header-based data:
- (DELETE) "./util/delete" + id
- (POST) "./util/create" + ProductOrder("product","location","date")
- (PUT) "./util/update" + ProductOrder("product","location","date")

TODO:
- configure existing H2 database connection
- realize other missing api for project
