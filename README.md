# TopDown
A top down game engine built from scratch in java.
*IN PROGRESS*
Version: 0.0.0

Game contains the main method, game loop, thanks to notch, as well rendering.
# Objects
Currently there are a number of objects in developement, the base abstract class InGameObject, the EnemyObject and ItemObject, and more objects extending from there.
There is also an object queue to manage and update each object currently in game.
# World
We then have the tile and map grid to generate the world, with the window to setup the frame.
Grid size set to 40x22 each grid tile size 32x32. This fits nicely in our window resolution 1280x720

Not yet sure if I want the world to scrollnear the edge of the grid or rather load a new grid adjacient to the previous one (Like binding of isaac).


# Graphics
Graphics are being kept in mind here, in fact some objects already have graphics and are being animated. The slime enemy object is already animating between two images.
Tiles also contain the graphics for each type of tile.
Now the graphics are images are loaded in as a buffered image and rendered with Graphics.draw. Not sure how efficent this is currently.


# ToDo Next
<ul>
  <li>-Create test itemOject similar to slimeEnemyObj</li>
  <li>-Build out object graphics</li>
  <li>-Build out movement/playable charactor.</li>
  <li>-Add inventory system.</li>
  <li>-Build out map generation/map builder.</li>
  <ul>










