#include <SPI.h>                      //the communication interface with the modem
#include <nRF24L01.h>
#include <RF24.h>                     //the library which helps us to control the radio modem

float temp;

RF24 radio(5,10);                     //5 and 10 are a digital pin numbers to which signals CE and CSN are connected.
                                      
const byte address[6] = "00001"; 

void setup(){
  radio.begin();                      //it activates the modem.
  radio.openWritingPipe(address);        //sets the address of the receiver to which the program will send data.
  radio.setPALevel(RF24_PA_MIN); 
  radio.stopListening();
}

void loop(){
  temp = analogRead(A0);
  temp = temp * 0.48828125;
  String t = String(temp, 4);
  char text[4] = {t.charAt(0), t.charAt(1), t.charAt(2), t.charAt(3)};
  radio.write(&text, sizeof(text));
  delay(1000);
}

