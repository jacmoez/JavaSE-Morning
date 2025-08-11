import 'dart:io';
//import 'package:http/http.dart' as http;

Future<String> readFile(filePath) async {
  File f = new File(filePath);

  var data = await f.readAsString();
  return data;
}

void main(List<String> args) async {
  var filePath = "pubspecs.yaml";
  //String data = await readFile(filePath);
  await readFile(filePath)
  .then((v) => print(v))
  .catchError((err)=>print(err));
}
