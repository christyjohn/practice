import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('I Am Poor'),
          backgroundColor: Colors.orange,
          centerTitle: true,
        ),
        backgroundColor: Colors.orangeAccent,
        body: Center(
          child: Image(image: AssetImage('images/poor.jpg')),
        ),
      ),
    ),
  );
}
