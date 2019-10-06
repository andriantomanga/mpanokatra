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
package mg.kilalao.mpanokatra.ui;

import java.awt.Component;

import javax.swing.JFrame;

/**
 * @author nabil andriantomanga
 */
public class MainFrame extends JFrame {
	
	private ScenePanel scene;
	
	public MainFrame(final String mainFrameTitle) {
		initMainFrame(mainFrameTitle);
	}

	private void initMainFrame(final String mainFrameTitle) {
		setTitle(mainFrameTitle);
		setSize(1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().add(buildContentPane());
	}

	private Component buildContentPane() {
		scene = new ScenePanel();
		return scene;
	}

}
