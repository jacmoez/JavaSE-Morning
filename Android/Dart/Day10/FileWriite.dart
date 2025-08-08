import 'dart:io';

/**
 * file name, file path
 * test.text, "မဂ်လာပါ မိတ်ဆွေ။"
 */

Future<bool> writeFile(String filePath, String msg) async {
  File f = new File(filePath);
  await f.writeAsString(msg);

  return true;
}

void main(List<String> args) async {
  String para = " Lorem ipsum dolor sit amet, consectetur adipisicing elit. Distinctio perferendis incidunt, cupiditate nesciunt harum possimus! Inventore facilis nam quam non perferendis placeat nulla esse, qui voluptate nobis maxime recusandae fugiat!";
  var bool = await writeFile("test.txt", para);
  var result = bool ? "ကြိုဆိုပါတယ်" : "မကြိုဆိုပါ။";
  print(result);
}
