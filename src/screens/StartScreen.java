package screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StartScreen implements Screen {

		@Override
		public void displayOutput(AsciiPanel terminal) {
			terminal.write("start", 1, 1);
			terminal.writeCenter("-- press [Enter] to start --", 22);
			
		}

		@Override
		public Screen respondToUserInput(KeyEvent key) {
			return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen() : this;
		}
}
