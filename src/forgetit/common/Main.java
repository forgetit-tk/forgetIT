package forgetit.common;

import forgetit.db.DBNoteHandler;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Display display = new Display();
		// new MainWindow(display);
		// display.dispose();

		DBNoteHandler handler = new DBNoteHandler();
		Entity entity = new Entity();
		entity.setDescription("Test");
		entity.setTitle("Test");
		handler.addNote(entity);
	}
}
