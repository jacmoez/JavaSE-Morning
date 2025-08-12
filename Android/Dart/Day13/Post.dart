class Post {
  int? ueserId, id;
  String? title, body;

  Post({this.ueserId, this.id, this.title, this.body});

  factory Post.from(dynamic data) {
    return Post(
      ueserId: data["userId"],
      id: data['id'],
      title: data['title'],
      body: data['body']
    );
  }
}

// Complex Data, Complex User Model, Complex JSON Paring 