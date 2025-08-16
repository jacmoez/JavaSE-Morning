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
      backgroundColor: Colors.grey,
      body: SafeArea(child:
      Column(
        children: [
          Text("Android Dev", style: TextStyle(
            color: Colors.white,
            fontSize: 30
          ),),
          ElevatedButton(onPressed: (){},
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.pinkAccent,
                foregroundColor: Colors.white,
                textStyle: TextStyle(fontStyle: FontStyle.italic, fontSize: 30)
              ),
              child: Text("Button One")),
          ElevatedButton(onPressed: (){}, child: Text("Button Two"))
        ],
      ),
    ),
    );
  }
}

