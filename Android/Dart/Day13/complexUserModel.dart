import 'dart:convert';

import 'package:http/http.dart' as http;

const USER_API = 'https://randomuser.me/api/?results=5';

void main(List<String> args) async {
  var url = Uri.parse(USER_API);
  await http.get(url).then((res) {
    var decodeData = jsonDecode(res.body)['results'];
    List<dynamic> listy = decodeData as List;
    List<User> users = listy.map((e) => User.from(e)).toList();
    users.forEach((user) => print(user.location?.timezone?.description));
  });
}

class User {
  String? gender, email, phone, cell, nat;
  Name? name;
  Location? location;
  Login? login;
  Dob? dob;
  Id? id;
  Picture? picture;

  User({
    this.gender,
    this.email,
    this.phone,
    this.cell,
    this.nat,
    this.name, 
    this.location,
  });

  factory User.from(dynamic data) {
    Name name = Name.from(data['name']);
    Location location = Location.from(data['location']);

    return User(
        gender: data["gender"],
        email: data['email'],
        phone: data['phone'],
        cell: data['cell'],
        nat: data['nat'],
        name: name,
        location: location);
  }
}

class Name {
  String? title, first, last;
  Name({this.title, this.first, this.last});

  factory Name.from(dynamic data) {
    return Name(title: data["title"], first: data["first"], last: data['last']);
  }
}

class Location {
  Street? street;
  String? city, state, country;
  int? postcode;
  Coordinates? coordinates;
  Timezone? timezone;
  Location(
      {this.street,
      this.city,
      this.state,
      this.country,
      this.coordinates,
      this.timezone});

  factory Location.from(dynamic data) {
    Street street = Street.from(data["street"]);
    Coordinates coordinates = Coordinates.from(data['coordinates']);
    Timezone timezone = Timezone.from(data["timezone"]);

    return Location(
        city: data["city"],
        state: data["state"],
        country: data['country'],
        street: street,
        coordinates: coordinates,
        timezone: timezone);
  }
}

class Street {
  int? number;
  String? name;
  Street({this.name, this.number});

  factory Street.from(dynamic data) {
    return Street(number: data['number'], name: data['name']);
  }
}

class Coordinates {
  String? latitude, longitude;
  Coordinates({this.latitude, this.longitude});

  factory Coordinates.from(dynamic data) {
    return Coordinates(latitude: data['latitude'], longitude: data['latitude']);
  }
}

class Timezone {
  String? offset, description;
  Timezone({this.offset, this.description});

  factory Timezone.from(dynamic data) {
    return Timezone(offset: data['offset'], description: data["description"]);
  }
}

class Login {
  String? uuid, username, password, salt, md5, sha1, sha256;
}

class Dob {
  String? date;
  int? age;
}

class Id {
  String? name, value;
}

class Picture {
  String? large, medium, thumbnail;
}
