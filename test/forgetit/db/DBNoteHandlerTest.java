package forgetit.db;

import org.junit.Test;

import forgetit.common.Entity;

public class DBNoteHandlerTest {

	@Test
	public void testAddNote() {

		DBNoteHandler handler = new DBNoteHandler();
		Entity entity = new Entity();
		entity.setDescription("Test");
		entity.setTitle("Test");
		handler.addNote(entity);
	}
}
