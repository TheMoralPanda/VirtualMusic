# VirtualMusic
Play Virtual Music.


<u>Technology used:</u> <br/>
  OpencV for Video Processing (http://opencv.org/)<br/>
  JFugue for Music Generation (http://www.jfugue.org/)<br/>
  
<u>VIDEO PROCESSING:</u><br/>
  1) Video is recorded over Webcam and frame by frame is processed.<br/>
  2) Binary image is generated thresholding the color target using OpenCV Color Detection method<br/>
  3) Contour is drawn around the color target and centroid point is obtained using Moments, OpenCV.<br/>
  4) Position coordinates is tracked.<br/>
  5) Screen is split into multiple square and rendered.<br/> 
  6) when the color target is moved to the respective square area, a note is played via JFugue. ( Java web server listens for the request form opencV program. Based on the input from opencv coordinate, a note is played). <br/>
  
<u>MUSIC SYNTHESIS:</u><br/>
  1) There is a C++ music library called CFUGUE. (http://gopalakrishna.palem.in/CFugue.html)<br/>
  2) But we were unable to compile it unluckily in Mac. So we went for JFugue(little complicated).<br/>
  3) We recommend you to try using CFugue.<br/>

***************************************************************************************
Built as part of #Global INFOSYS Hackathon 2016.<br/>
#TeamName: #Divinehackers<br/>

<u>Contact:</u><br/>
  1)Vigneshwar.V (haivicky@gmail.com)<br/>
  2)Gunasekaran.M (gunas.micheal@gmail.com)<br/>
  3)Ajeeth Kumar (ajeeth8055@gmail.com)
