#Alg Project
Contains Coords and LinearEquation, two libraries of functions.  Read more below:

##Coords
Library of functions that play around with basic coordinate geometry.

* #####```getX()```
  - Returns x value of a Coords object as a double.

* #####```getY()```
  - Returns y value of a Coords object as a double.

* #####```equals()```
  - Accepts the name of another Coords object as a parameter in the form: ```equals(Coords other)```
  - Returns a boolean; true if two Coords objects are equal to each other, false if not.

* #####```setX()```
  - Parameter is passed in as an x-value.

* #####```setY()```
  - Parameter is passed in as a y-value.

* #####```translate()```
  - If two parameters are passed in; the first is applied to the existing x value as a horizontal shift, and the second is applied to the existing y value as a vertical shift.
  - If one parameter is passed in, that value mutates both the existing x and y values.

* #####```reflectOnXAxis()```
  - Mutates the value of a Coords object's coordinates to reflect a reflection over the x-axis.

* #####```reflectOnYAxis()```
  - Mutates the value of a Coords object's coordinates to reflect a reflection over the y-axis.

* #####```reflectOnOrigin()```
  - Mutates the value of a Coords object's coordinates to reflect a reflection over the origin.

* #####```dilate()```
  - Parameter passed in as the dilation factor; must be a double.
  - Dilates the value of the coordinates in the Coords object.

* #####```distanceFromOrigin()```
  - Calculates the distance between the coordinates of a Coords object and the origin.

* #####```distanceFrom()```
  - Requires a Coords object as a parameter.  Calculates the distance between the coordinates of two Coords objects.

* #####```slopeOfLineConnectingTo()```
  - Requires a Coords object as a parameter.
  - Calculates the slope of a line connecting the coordinates of two Coords objects.  See example below:

  ````java
  double slope = pt3.slopeOfLineConnectingTo(pt4);
  System.out.println(slope);
  ````

##LinearEquation
Library of functions that play around with linear equations.

* ##### ```LinearEquation()```
  - This is our constructor
  - Accepts three parameters
    * first parameter: x coefficient
    * second parameter: y coefficient
    * third parameter: constant
  - Also accepts another LinearEquation object as a single parameter (copycat constructor)

* ##### ```isVertical()```
  - boolean method; returns true if a LinearEquation object is vertical, false if it is not.

* ##### ```isHorizontal()```
  - boolean method; returns true if a LinearEquation object is horizontal, false if it is not.

* ##### ```slope()```
  - Calculates the slope of a LinearEquation objects

* ##### ```yIntercept()```
  - Calculates the y-intercept of a LinearEquation object

* ##### ```xIntercept()```
  - Calculates the x-intercept of a LinearEquation object
  
* ##### ```yInterceptCoords()```
  - Returns the coordinates of the point where a LinearEquation object meets the y-axis as a Coords object

* ##### ```xInterceptCoords()```
  - Returns the coordinates of the point where a LinearEquation object meets the x-axis as a Coords object

* ##### ```pointOfIntersection()```
  - Returns a the point of intersection of two LinearEquation objects as a Coords object
  - Requires a LinearEquation object as a parameter
