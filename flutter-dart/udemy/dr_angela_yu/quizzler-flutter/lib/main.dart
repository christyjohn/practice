import 'package:flutter/material.dart';
import 'dart:math';
import 'quiz_brain.dart';

QuizBrain quizBrain = QuizBrain();

void main() => runApp(Quizzler());

class Quizzler extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: Colors.grey.shade900,
        body: SafeArea(
          child: Padding(
            padding: EdgeInsets.symmetric(horizontal: 10.0),
            child: QuizPage(),
          ),
        ),
      ),
    );
  }
}

class QuizPage extends StatefulWidget {
  @override
  _QuizPageState createState() => _QuizPageState();
}

class _QuizPageState extends State<QuizPage> {
  List<Icon> scoreKeeper = [];

  void checkAnswer(bool userPickedAnswer) {
    bool correctAnswer = quizBrain.getQuestionAnswer();

    setState(() {
      if (userPickedAnswer == correctAnswer) {
        scoreKeeper.add(Icon(Icons.check, color: Colors.green));
      } else {
        scoreKeeper.add(Icon(Icons.close, color: Colors.red));
      }

      quizBrain.nextQuestion();
    });
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.spaceBetween,
      crossAxisAlignment: CrossAxisAlignment.stretch,
      children: <Widget>[
        Expanded(
          flex: 5,
          child: Padding(
            padding: EdgeInsets.all(10.0),
            child: Center(
              child: Text(
                quizBrain.getQuestionText(),
                textAlign: TextAlign.center,
                style: TextStyle(
                  fontSize: 25.0,
                  color: Colors.white,
                ),
              ),
            ),
          ),
        ),
        Expanded(
          child: Padding(
            padding: EdgeInsets.all(15.0),
            child: FlatButton(
              textColor: Colors.white,
              color: Colors.green,
              child: Text(
                'True',
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 20.0,
                ),
              ),
              onPressed: () {
                //The user picked true.
                checkAnswer(true);
              },
            ),
          ),
        ),
        Expanded(
          child: Padding(
            padding: EdgeInsets.all(15.0),
            child: FlatButton(
              color: Colors.red,
              child: Text(
                'False',
                style: TextStyle(
                  fontSize: 20.0,
                  color: Colors.white,
                ),
              ),
              onPressed: () {
                //The user picked false.
                checkAnswer(false);
              },
            ),
          ),
        ),
        Row(
          children: scoreKeeper,
        ),
      ],
    );
  }
}

/*
question1: 'You can lead a cow down stairs but not up stairs.', false,
question2: 'Approximately one quarter of human bones are in the feet.', true,
question3: 'A slug\'s blood is green.', true,
question4: 'Prince Harry is taller than Prince William', false
question5: 'The star sign Aquarius is represented by a tiger', True
question6: 'Meryl Streep has won only two Academy Awards', False - 3
question7: 'Marrakesh is the capital of Morocco', False - it's Rabat
question8: 'Idina Menzel sings \'let it go\' 20 times in \'Let It Go\' from Frozen', False - she sings it 21 times!
question9: 'Waterloo has the greatest number of tube platforms in London', True
question10: 'M&M stands for Mars and Moordale', False - M&M stands for Mars and Murrie
question11: 'Gin is typically included in a Long Island Iced Tea', True - as is vodka, white rum, lemon juice, triple sec, sugar syrup and Coca-Cola
question12: 'The unicorn is the national animal of Scotland', True
question13: 'There are two parts of the body that can\'t heal themselves', False - there's only one: the teeth.
question14: 'Howard Donald is the oldest member of Take That', True
question15: 'The Great Wall of China is longer than the distance between London and Beijing',True
question16: 'There are 219 episodes of Friends', False - there are 236
question17: '\'A\' is the most common letter used in the English language', False - 'E'
question18: 'A lion\'s roar can be heard up to eight kilometres away', True
question19: 'In Harry Potter, Draco Malfoy has no siblings', False - Skylar Malfoy is his younger sister
question20: 'Louis Walsh is older than Simon Cowell', True
question21: 'Monaco is the smallest country in the world', False - Vatican City is, with only 0.44 sq.km.
question22: '\'What Do You Mean\' was Justin Bieber\'s first UK number one single', True
question23: 'The river Seine in Paris is longer than the river Thames in London', True
question24: 'A cara cara navel is a type of orange', True
question25: 'There are five different blood groups', False There are four: A, B, AB, and O
question26: 'Cinderella was the first Disney princess', False
question27: 'ASOS stands for As Seen On Screen', True
question28: 'The Battle Of Hastings took place in 1066', True
question29: 'H&M stands for Hennes & Mauritz', True
question30: 'Canis lupur is the scientific name for a wolf', False - It's Canis lupus
question31: 'K is worth four points in Scrabble', False - It's worth five
question32: 'Alaska is the biggest American state in square miles', True
question33: 'Ariana Grande is 25 or under', False
question34: 'Australia is wider than the moon', True
question35: 'Queen Elizabeth II is currently the second longest reigning British monarch', False
question36: 'Madonna\'s real name is Madonna', True
question37: 'Serena Williams has one more singles tennis Grand Slam titles than sister Venus', True
question38: 'Alexander Fleming discovered penicillin', True

// Questions from https://www.cosmopolitan.com/uk/worklife/a32612392/best-true-false-quiz-questions/
*/
