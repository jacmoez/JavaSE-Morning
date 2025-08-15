import 'package:flutter/material.dart';

///  void main() Widget
///  stateless widget
///
///  Material App
///
///  stateful widget
///
///  Scaffold Widget

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
      // backgroundColor: Colors.black12,
      body: SafeArea(child:
      Column(
        children: [
          Text("Android Developer", style: TextStyle(
            color: Colors.black,
            fontSize: 20
          ),),
        ElevatedButton(
            onPressed: (){},
            style: ElevatedButton.styleFrom(
              // backgroundColor: Colors.pinkAccent,
              // foregroundColor: Colors.white
            ),
            child: Text("Button One")),
          ElevatedButton(onPressed: (){}, child: Text("Button Two"))
        ],
      ),
    )
    );
  }
}

