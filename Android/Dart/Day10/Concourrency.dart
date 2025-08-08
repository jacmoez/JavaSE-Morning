import 'dart:isolate';

void work(String message) {
  print("Working on $message");
}

void main(List<String> args) {
  Isolate.spawn(work, "First Core 1 ");
  Isolate.spawn(work, "Second Core 2 ");
  Isolate.spawn(work, "Third Core 3 ");
  Isolate.spawn((msg) => print("Working on $msg"), "Four Core 4 ");
}

void main1() {
  print("Working on First Core");
  print("Working on Second Core");
  print("Working on Third Core");
  print("Working on Four Core");
}

/**
 * Concourrency 
 * 
 * 8 Core -> Single Thread 
 * 
 * Logical Processor -> 16 
 * 
 * Thread -> Concourrency 
 * 
 * Message Passing 
 * 
 * Erlang Actor Model 
 * 
 * 100K Nodejs, 1M > Erlang 
 * 
 */
