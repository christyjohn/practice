import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.teal,
        body: SafeArea(
          child: Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: <Widget>[
              Container(
                color: Colors.red,
                width: 100.0,
              ),
              SizedBox(
                width: 30.0,
              ),
              Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  Container(
                    color: Colors.yellow,
                    height: 100.0,
                    width: 100.0,
                  ),
                  Container(
                    color: Colors.green,
                    height: 100.0,
                    width: 100.0,
                  ),
                ],
              ),
              SizedBox(
                width: 30.0,
              ),
              Container(
                color: Colors.blue,
                width: 100.0,
              ),
            ],
          ),
        ),
      ),
    );
  }
}