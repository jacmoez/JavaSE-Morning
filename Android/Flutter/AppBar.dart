import 'package:flutter/material.dart';

void main(){
  runApp(Appli());
}

class Appli extends StatelessWidget {
  const Appli({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Flash(),
    );
  }
}

class Flash extends StatefulWidget {
  const Flash({super.key});

  @override
  State<Flash> createState() => _FlashState();
}

class _FlashState extends State<Flash> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(

      appBar: AppBar(title: Text("Android Dev"), actions: [
        ElevatedButton(onPressed: (){}, child: Text("One")),
        SizedBox(width: 10,),
        ElevatedButton(onPressed: (){}, child: Text("Two"))
      ],),
      body: Column(
        children: [
          ElevatedButton(onPressed: (){}, child: Text("Button One")),

        ],
      ),
      drawer: Container(),
    );
  }
}

