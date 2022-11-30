# ToDo Next
<table>
  <tr>
    <th>Task</th>
    <th>Priority</th>
    <th>Progress</th>
  </tr>
  <tr>
    <th>- Investigate and fix performance issue.</th>
    <th>Critical</th>
    <th>In Progress</th>
  </tr>
  <tr>
    <th>-Create test itemOject similar to slimeEnemyObj.</th>
    <th>High</th>
    <th>Done</th>
  </tr>
  <tr>
    <th>-Build out object graphics.</th>
    <th>High</th>
    <th>Done for now</th>
  </tr>
  <tr>
    <th>-Build out movement/playable charactor.</th>
    <th>Normal</th>
    <th>Planning</th>
  </tr>
  <tr>
    <th>-Add inventory system.</th>
    <th>Low</th>
    <th>Not Started</th>
  </tr>
  <tr>
    <th>-Build out map generation/map builder.</th>
    <th>Normal</th>
    <th>Planning</th>
  </tr>
  <tr>
    <th>-Add hitboxes and collision (getBounds).</th>
    <th>Normal</th>
    <th>Done for now</th>
  </tr>
  <tr>
    <th>- Add weapon / gun object to shoot bullet objects.</th>
    <th>Normal</th>
    <th>Done</th>
  </tr>
  <tr>
    <th>- Add enemy ai, aggro to follow player, agro speed will be set. Will wonder at normal speed and stop randomly when isAggro is false.</th>
    <th>High</th>
    <th>Not Started</th>
  </tr>
  <tr>
    <th>- Create user input functionality.</th>
    <th>High</th>
    <th>Not Started</th>
  </tr>
</table>


# TopDown
A top down game engine built from scratch in java.
*IN PROGRESS*
Version: 0.0.0

TopDown.Game contains the main method, game loop, thanks to notch, as well rendering.
# Objects
Currently there are a number of objects in developement, the base abstract class InGameObject, the EnemyObject and ItemObject, and more objects extending from there.
There is also an object queue to manage and update each object currently in game.
Objects will have collision based on size (which should match the graphic image size). 
# World
We then have the tile and map grid to generate the world, with the window to setup the frame.
Grid size set to 40x22 each grid tile size 32x32. This fits nicely in our window resolution 1280x720

Not yet sure if I want the world to scrollnear the edge of the grid or rather load a new grid adjacient to the previous one (Like binding of isaac).


# Graphics
Graphics are being kept in mind here, in fact some objects already have graphics and are being animated. The slime enemy object is already animating between two images.
Tiles also contain the graphics for each type of tile.
Now the graphics are images are loaded in as a buffered image and rendered with Graphics.draw. Not sure how efficent this is currently.













