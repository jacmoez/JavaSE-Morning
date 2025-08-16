import 'package:flutter/material.dart';

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  String greeting = "မဂ်လာပါ မိတ်ဆွေ။";
  String changeValue = "ကြိူဆိုပါတယ် မိတ်ဆွေ";
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Home Page"),),
      body: Column(
        children: [
          Text(greeting, style: TextStyle(fontSize: 20),),
          ElevatedButton(onPressed: (){
            greeting = changeValue;
            setState(() {});
          },
              style: ElevatedButton.styleFrom(backgroundColor: Colors.blueAccent,
              foregroundColor: Colors.white,
                  textStyle: TextStyle(fontSize: 20)),
              child: Text("Change Value"))
        ],
      ),
    );
  }
}
