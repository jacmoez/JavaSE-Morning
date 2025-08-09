import 'dart:io';

class FileHandler {
  Future<bool> writeFile(String filePath, String msg) async {
    File f = new File(filePath);
    await f.writeAsString(msg);
    return true;
  }

  Future<bool> appendFile(String filePath, String msg) async {
    File f = new File(filePath);
    await f.writeAsString(msg, mode: FileMode.append);
    return true;
  }

  Future<String> readFile(String filePath) async {
    try {
      File f = new File(filePath);
      if (await f.exists()) {
        var msg = await f.readAsString();
        return msg;
      } else {
        throw ("No such file!");
      }
    } catch (err) {
      print(err);
    } finally {
      print("File Readding Done!");
    }
    return "";
  }

  Future<bool> deleteFile(String filePath) async {
    try {
      File f = new File(filePath);
      if (await f.existsSync()) {
        await f.delete();
        return true;
      } else {
        throw ("You can't delete file that is doesn't exist!");
      }
    } catch (err) {
      print(err);
    } finally {
      print("File Delete Don!");
    }

    return true;
  }
}
