import 'dart:convert';

import 'package:http/http.dart' as http;

import '../Day12/ModelParameterize.dart';

const API_URL = 'https://jsonplaceholder.typicode.com/posts';

void main() async {
  var url = Uri.parse(API_URL);

  await http.get(url).then((res) {
    var rawData = res.body;

    var decodeData = jsonDecode(rawData);

    decodeData.forEach((data) {

    var post = new Post(
      userId: data["userId"],
       id: data["id"], 
       title: data["title"],
        body: data["body"]);
     print(post.body);
    });
  
  });
}

