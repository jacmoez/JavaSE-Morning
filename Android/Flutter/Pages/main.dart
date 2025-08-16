import 'package:flutter/material.dart';
import 'Pages/Flash.dart';
import 'Pages/Home.dart';

void main(){
  runApp(Appli());
}

class Appli extends StatelessWidget {
  const Appli({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
     //home: Flash(),
      home: Home(),
    );
  }
}
