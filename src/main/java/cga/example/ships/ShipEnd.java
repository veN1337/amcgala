/* 
 * Copyright 2011 Cologne University of Applied Sciences Licensed under the
 * Educational Community License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package cga.example.ships;

import cga.framework.camera.Camera;
import cga.framework.math.Matrix;
import cga.framework.renderer.Renderer;
import cga.framework.shape.Shape;

/**
 * Ein Schiffsendstück, das zum Zusammensetzen eines Schiffs benutzt werden kann.
 * Es besitzt folgende Form:
 *            _____  
 *           / 
 *          /
 *          \
 *           \_____
 * 
 * @author Robert Giacinto
 */
public class ShipEnd extends Shape {

    private double width;
    private double height;
    private double x;
    private double y;
    private Orientation orientation;

    public ShipEnd(double width, double height, double x, double y, Orientation orientation) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    @Override
    public void render(Matrix transformation, Camera camera, Renderer renderer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}