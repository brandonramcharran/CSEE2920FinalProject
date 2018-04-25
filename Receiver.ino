#include <SPI.h>      //the communication interface with the modem
#include <nRF24L01.h>
#include <RF24.h>     //the library which helps us to control the radio modem


RF24 radio(5,10);     /*This object represents a modem connected to the Arduino. 
                      Arguments 5 and 10 are a digital pin numbers to which signals 
                      CE and CSN are connected.*/

int LED = 8;
const byte address[6] = "00001";

void setup(){
  Serial.begin(9600);
  radio.begin();                    //it activates the modem.
  radio.openReadingPipe(0, address);//determines the address of our modem which receive data.
  radio.setPALevel(RF24_PA_MIN);
  radio.startListening();           //enable receiving data via modem
  pinMode(LED, OUTPUT);
  }

void loop(){
  if(radio.available()){ 
    char text[32] = "";
    radio.read(&text, sizeof(text));
    Serial.print(text);Serial.println(" degrees Fahrenheit");
    String t(text);
    float temp = t.toFloat();
    if(temp > 77){
      digitalWrite(LED, HIGH);       //turns LED on once temperature reaches 77 degrees Fahrenheit
    }
    else{
      digitalWrite(LED, LOW);       //Otherwise the LED stays off
    }
  }
}

