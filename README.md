# Student Management UI

A JavaFX application for managing student records with a clean, intuitive interface.

## Features

- **View Students**: Browse student records in a table displaying ID, first name, last name, department, major, and email
- **Add Students**: Enter student information via input fields and click "Add"
- **Edit Students**: Select a student and modify their details using the "Edit" button
- **Delete Students**: Remove selected students from the table using the "Delete" button
- **Profile Image**: Display student profile picture in the left panel
- **Clear Fields**: Reset all input fields with the "Clear" button
- **Menu Bar**: File, Edit, Theme, and Help menus for navigation

## Layout

- **Left Panel**: Student profile image display (150x150px)
- **Center**: TableView with student data columns (ID, First Name, Last Name, Department, Major, Email)
- **Right Panel**: Input fields (ID, First Name, Last Name, Department, Major, Email, Image URL) and action buttons (Clear, Add, Delete, Edit)
- **Top**: Menu bar with File, Edit, Theme, and Help menus

## Technical Details

- **Framework**: JavaFX with FXML layout
- **Language**: Java
- **Build Tool**: Maven
- **Main Application**: `UIApplication.java`
- **Data Model**: `Student.java` class with properties for ID, name, department, major, email, and image URL
