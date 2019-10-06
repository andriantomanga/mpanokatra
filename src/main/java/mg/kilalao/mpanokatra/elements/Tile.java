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

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author nabil andriantomanga
 *
 */
public class Tile extends MaterialThing {

	private String id;

	private String imagePath;

	private Image image;

	public Tile(String id, String imagePath) throws IOException {
		super();
		this.id = id;
		this.imagePath = imagePath;
		this.image = ImageIO.read(new File(imagePath));

	}

	@Override
	public void draw(Graphics2D drawer) {

		if (null != image) {
			drawer.drawImage(image, rect.x, rect.y, null);
		}
	}

}
