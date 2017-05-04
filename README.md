# Jeopardy

This is the client side application to a Jeopardy game created to be used with the Bluetooth HC-05 chip or the Wifi ESP8266 chip.
## Getting Started
Clone the repository and change the addresses of both the HTTP request and the Bluetooth UUID. Then simply build and attempt to reset scores.  The Wifi portion should send a message back to confirm that the score has been reset.



### Architecture
Utilizing the following architecture with the Landtiger LPC1768 board, we are able to connect to both the Bluetooth and Wifi portion
<p align="center">
  <img src="/Pictures/Current Project.png" width="500" align="middle">
</p>


Sample image of the application

<p align="center">
  <img src="/Pictures/JeopardyBoardPage.png" width="170">
</p>

## Built With
* [Maven](https://maven.apache.org/) - Dependency Management
