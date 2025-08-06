class Transition {
  String? customerName, productName;
  int? quantity;
  double? price;
  DateTime? transcationDate;

  static final List<Transition> transcations = [];

  static bool isSeeded = false;

  Transition(this.customerName, this.productName, this.quantity, this.price)
    : transcationDate = DateTime.now();

  //Save transaction to in-memory list
  void save() {
    transcations.add(this);
  }

  //Seed sample date
  static void seedIfNeeded() {
    if (!isSeeded) {
      transcations.add(Transition("DD", "iPhone 15", 2, 999.99));
      transcations.add(Transition("BK", "MacBook Pro ", 1, 1299.99));
      isSeeded = true;
    }
  }

  static String formatDate(DateTime dt) {
    String twoDigits(int n) => n >= 10 ? '$n' : '0$n';

    String year = dt.year.toString();
    String month = twoDigits(dt.month);
    String day = twoDigits(dt.day);
    String hour = twoDigits(dt.hour);
    String minute = twoDigits(dt.minute);
    String second = twoDigits(dt.second);

    return "$year-$month-$day $hour:$minute:$second";
  }
}
