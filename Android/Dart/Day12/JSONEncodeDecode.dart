import 'dart:convert';

import 'package:http/http.dart' as http;

const API_URL = 'https://jsonplaceholder.typicode.com/posts';

void main(List<String> args) async {
  var url = Uri.parse(API_URL);
  await http.get(url).then((res) {
    var rawData = res.body; // String => JSON Encoded String
    var decodedData = jsonDecode(rawData); //String => decode => JSON Object
    print(decodedData.runtimeType);
  });
}
