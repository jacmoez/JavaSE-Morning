import 'dart:convert';

import 'package:http/http.dart' as http;

const API_URL = 'https://jsonplaceholder.typicode.com/posts';

class Post {
  int? userId, id;
  String? title, body;

  Post({this.userId, this.id, this.title, this.body});
}

void main(List<String> args) async {
  var url = Uri.parse(API_URL);
  await http.get(url).then((res) {
    var rawData = res.body;
    var decodedData = jsonDecode(rawData);
    decodedData.forEach((data) {
      var post = new Post(
          userId: data["userId"],
          id: data["id"],
          title: data['title'],
          body: data['body']);
      print(post.title);
    });
  });
}
