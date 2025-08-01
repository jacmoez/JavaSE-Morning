import 'dart:async';

int i = 0;

void main(List<String> args) {
  var skill = ["Java", "Dart", "Flutter", "DBMS", "Spring", "DevOp"];

  //timer1();

  Timer.periodic(Duration(seconds: 2), (timer) {

    if (i < skill.length) {
      print("current skill is ${skill[i]}");
    } else {
      print("I am try skill.");
      timer.cancel();
    }
     i++;
  }
  );
 
}

timer1() {
  Timer.periodic(Duration(seconds: 1), (timer) {
    i++;
    print("No it is $i");
    if (i == 15) {
      print("Time is set to 15");
      timer.cancel();
    }
  });
}
