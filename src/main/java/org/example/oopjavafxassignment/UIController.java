package org.example.oopjavafxassignment;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class UIController {
    @FXML private ImageView profileImageView;
    @FXML private TableView<Student> studentTable;
    @FXML private TableColumn<Student, String> idColumn;
    @FXML private TableColumn<Student, String> firstNameColumn;
    @FXML private TableColumn<Student, String> lastNameColumn;
    @FXML private TableColumn<Student, String> departmentColumn;
    @FXML private TableColumn<Student, String> majorColumn;
    @FXML private TableColumn<Student, String> emailColumn;
    @FXML private TextField idField;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField departmentField;
    @FXML private TextField majorField;
    @FXML private TextField emailField;
    @FXML private TextField imageUrlField;
    @FXML private Button clearButton;
    @FXML private Button addButton;
    @FXML private Button deleteButton;
    @FXML private Button editButton;

    private ObservableList<Student> students = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("major"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        studentTable.setItems(students);
        // Set default profile image
        profileImageView.setImage(new Image(getClass().getResourceAsStream("/org/example/oopjavafxassignment/user.png")));

    }

    @FXML
    private void onClear() {
        idField.clear();
        firstNameField.clear();
        lastNameField.clear();
        departmentField.clear();
        majorField.clear();
        emailField.clear();
        imageUrlField.clear();
        studentTable.getSelectionModel().clearSelection();
        profileImageView.setImage(new Image(getClass().getResourceAsStream("/org/example/oopjavafxassignment/user.png")));
    }

    @FXML
    private void onAdd() {
        Student student = new Student(
            idField.getText(),
            firstNameField.getText(),
            lastNameField.getText(),
            departmentField.getText(),
            majorField.getText(),
            emailField.getText(),
            imageUrlField.getText()
        );
        students.add(student);
        onClear();
    }

    @FXML
    private void onDelete() {
        Student selected = studentTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            students.remove(selected);
            onClear();
        }
    }

    @FXML
    private void onEdit() {
        Student selected = studentTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setId(idField.getText());
            selected.setFirstName(firstNameField.getText());
            selected.setLastName(lastNameField.getText());
            selected.setDepartment(departmentField.getText());
            selected.setMajor(majorField.getText());
            selected.setEmail(emailField.getText());
            selected.setImageUrl(imageUrlField.getText());
            studentTable.refresh();
            onClear();
        }
    }
}


