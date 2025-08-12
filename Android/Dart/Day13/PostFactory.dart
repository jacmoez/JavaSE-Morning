import 'dart:convert';

import 'Post.dart';
import 'package:http/http.dart' as http;

const API_URL = 'https://jsonplaceholder.typicode.com/posts';

void main() async {
  var url = Uri.parse(API_URL);

  await http.get(url).then((res) {
    var rawData = res.body;
    List decodeData = jsonDecode(rawData) as List;
    List<Post> posts = decodeData.map((e) => Post.from(e)).toList();
    posts.forEach((e) => print(e.body));
 
  });
}
