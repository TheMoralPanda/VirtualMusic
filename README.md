# VirtualMusic
Play Virtual Music.


Technology used: 
  OpencV for Video Processing (http://opencv.org/)
  JFugue for Music Generation (http://www.jfugue.org/)
  
VIDEO PROCESSING:
  1) Video is recorded over Webcam and frame by frame is processed.
  2) Binary image is generated thresholding the color target using OpenCV Color Detection method
  3) Contour is drawn around the color target and centroid point is obtained using Moments, OpenCV.
  4) Position coordinates is tracked.
  5) Screen is split into multiple square and rendered. 
  6) when the color target is moved to the respective square area, a note is played via JFugue. ( Java web server listens for the request form opencV program. Based on the input from opencv coordinate, a note is played). 
  
MUSIC SYNTHESIS:
  1) There is a C++ music library called CFUGUE. (http://gopalakrishna.palem.in/CFugue.html)
  2) But we were unable to compile it unluckily in Mac. So we went for JFugue(little complicated).
  3) We recommend you to try using CFugue.

***************************************************************************************
Built as part of #Global INFOSYS Hackathon 2016.
#TeamName: #Divinehackers

Contact:
  1)Vigneshwar.V (haivicky@gmail.com)
  2)Gunasekaran.M (gunas.micheal@gmail.com)
  3)Ajeeth Kumar (ajeeth8055@gmail.com)
