import 'package:http/http.dart' as http;

const API_URL = 'https://jsonplaceholder.typicode.com/posts';

void main(List<String> args) async {
  var url = Uri.parse(API_URL);
  // var req = await http.get(url);

  http.Response res = await http.get(url);

  print(res.body);
}
