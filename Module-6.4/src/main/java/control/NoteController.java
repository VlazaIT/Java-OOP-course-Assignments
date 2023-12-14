package control;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import model.Note;
import model.Notebook;

public class NoteController {
    @FXML
    private TextField titleField;
    @FXML
    private TextArea contentArea;
    @FXML
    private ListView<Note> noteListView;

    private Notebook notebook;

    public NoteController() {
        notebook = new Notebook();
    }

    @FXML
    private void initialize() {
        // Any initialization you need when the controller is loaded
    }

    @FXML
    private void addNote() {
        String title = titleField.getText();
        String content = contentArea.getText();
        Note newNote = new Note(title, content);
        notebook.addNote(newNote);
        updateNoteListView();
    }

    private void updateNoteListView() {
        noteListView.getItems().setAll(notebook.getNotes());
    }
}
