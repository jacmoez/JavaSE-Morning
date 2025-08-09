import 'FileHandler.dart';

const fileName = "forYou.txt";

void main(List<String> args) async {
  FileHandler handler = new FileHandler();

  String result = await handler.readFile(fileName);

  bool res = await handler.deleteFile(fileName);
  print(result);
  print(res);
}
