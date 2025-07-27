void main() {
  var login = {'username': 'admin', 'password': '123'};
  login['uid'] = 'u1001';
  print(login);

  //Map Constructor

  var details = new Map();
  details['Username'] = 'admin';
  details['Password'] = 'admin123';
  print(details.keys);
  print(details.values);
  print(details.length);

  var eat = {};
  print(eat.isEmpty);
  print(eat.isNotEmpty);
  print("=" * 55);

  mapFunctions();
}

//Map Properties
/**
 * Keys, Values, Length, isEmpty, isNotEmpty
 * 
 * Map - Functions
 * 
 * addAll(), clear(), remove(), forEach()
 */

void mapFunctions() {
  var m = {'name': "Maung Maung", "Id": 'A001'};
  print('Map : ${m}');

  m.addAll({'dep': 'IT', 'email': 'maungit@ams.com.mm'});
  print('Map after adding ${m}');

  dynamic res = m.remove('dep');
  print(res);

  m.forEach((k,v) => print("${k} : ${v}"));

  // m.clear();
  // print(m);
}
