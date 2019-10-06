/**
 * Copyright 2019 andriantomanga
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mg.kilalao.mpanokatra.elements;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

/**
 * Super class for all material things
 * 
 * @author nabil andriantomanga
 */
public abstract class MaterialThing {
	protected Rectangle rect = new Rectangle();

	public void setPos(final int x, final int y) {
		rect.x = x;
		rect.y = y;
	}

	public Point getPos() {
		return new Point(rect.x, rect.y);
	}

	public void setDim(final int width, final int height) {
		rect.width = width;
		rect.height = height;
	}

	public Dimension getDim() {
		return new Dimension(rect.width, rect.height);
	}

	public Rectangle getRect() {
		return (Rectangle) rect.clone();
	}

	public abstract void draw(Graphics2D drawer);

}
