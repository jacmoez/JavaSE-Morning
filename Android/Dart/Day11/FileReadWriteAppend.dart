import 'FileHandler.dart';

void main(List<String> args) async {
  FileHandler handler = new FileHandler();
  handler.writeFile("forYou.txt", "မဂ်လာ နံနက်ခင်းလေပါ။");

  //bool result = await handler.appendFile("forYou.txt", 'အဆင်ပြေလာ၊ နေကောင်းလာ။');
  String result = await handler.readFile("forYou.txt");
  print(result);

  //var bol = await writeFile("lesson.txt", para );
  // var bol = await appendFile("lesson.txt", "\nမဂ်လာ နံနက်ခင်းလေပါ။");
  // var result = bol ? "အဆင်ပြေပါတယ်။" : "အဆင်မပြေပါ။";

  // var result = await readFile("lesson.txt");
  // print(result);
}
