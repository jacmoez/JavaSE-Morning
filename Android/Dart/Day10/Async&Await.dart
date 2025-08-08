Future<String> show() async {
  await Future.delayed(Duration(seconds: 2));
  return "မဂ်လာပါ။ မိတ်ဆွေ။";
}

void main(List<String> args) async {
  var result = await show();
  print(result);
  print(result);
}
