# RestWithSpringBoot - Calculator

Api Rest - Hello Word!
http://localhost:8080/greeting

************************************************************************************
******************************** Arithmetic Operators ******************************
Sum = http://localhost:8080/sum/numberOne/numberTwo
Subtraction = http://localhost:8080/sub/numberOne/numberTwo
Multiply = http://localhost:8080/mult/numberOne/numberTwo
Division = http://localhost:8080/dic/numberOne/numberTwo
Average = http://localhost:8080/avg/numberOne/numberTwo
Square Root = http://localhost:8080/squareRoot/number

************************************************************************************
******************************** Injecting Services ********************************
-- One Person
```
GET: http://localhost:8080/person/1

Return:
{
  "id": 2,
  "firstName": "Jordan",
  "lastName": "Silva",
  "address": "Av América - PR",
  "gender": "Male"
}
```
--------------------------------------------------------
## List People
```
GET: http://localhost:8080/person

Return:
[
  {
    "id": 9,
    "firstName": "Person Name0",
    "lastName": "Last name0",
    "address": "Some address in Brazil0",
    "gender": "Male0"
  },
  {
    "id": 10,
    "firstName": "Person Name1",
    "lastName": "Last name1",
    "address": "Some address in Brazil1",
    "gender": "Male1"
  },
  {
    "id": 11,
    "firstName": "Person Name2",
    "lastName": "Last name2",
    "address": "Some address in Brazil2",
    "gender": "Male2"
  }
]
```
