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
package org.amcgala.example.gameoflife;

import org.amcgala.Framework;

public class GameOfLifeMain extends Framework {

    public GameOfLifeMain(int width, int height) {
        super(width, height);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        GameOfLifeMain gol = new GameOfLifeMain(250, 250);
        gol.start();
        gol.show();
    }

    @Override
    public void initGraph() {
        Field field = new Field(10, -110, -120);
        registerInputEventHandler(field);
        add(field);
    }
}
