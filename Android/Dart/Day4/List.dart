void main() {
  var num_list = [1, 2, 3];

  print(num_list);

  var lst = new List.empty(growable: true);
  lst.add(12);
  lst.add(13);
  lst.add(14);
  print("The first element of the list is: ${lst.first}");
  print("The element is Empty: ${lst.isEmpty}");
  print("The element is Not Empty: ${lst.isNotEmpty}");
  print("The element is length: ${lst.length}");
  print("The last element of the list is: ${lst.last}");
  print("The list values in reverse order: ${lst.reversed}");
  //print("The list has only one element: ${lst.single}");
  print("=" * 55);

  insertList();
}

void insertList() {
  List l = [1, 2, 3];
  l.add(12);
  l.addAll([55, 66, 40, 33]);
  print(l);

  l.insert(1, 23);
  print(l);

  l.insertAll(0, [120, 130, 133]);
  print(l);

  //Update
  List ls = [1, 2, 3];
  ls[0] = 123;
  print(ls);

  List lis = [1, 2, 3, 4, 5, 6, 7, 8, 9];
  print('The value of list before replacing ${lis}');

  lis.replaceRange(0, 3, [11, 23, 44]);
  print('The value of list aftere replacing ${lis}');

  bool res = lis.remove(4);
  print('The value of list after removing the list element ${lis}');
  print(res);

  dynamic result = lis.removeAt(5);
  print("The value of the element ${result}");
}
