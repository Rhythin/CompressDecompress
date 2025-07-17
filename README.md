# CompressDecompress - Java File Compression Tool

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-007396?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![GZIP](https://img.shields.io/badge/GZIP-FF6B6B?style=for-the-badge&logo=gnu&logoColor=white)

A user-friendly Java desktop application for file compression and decompression using GZIP algorithm with an intuitive GUI interface.

## 🚀 Project Overview

This is a portfolio project demonstrating Java GUI development and file handling capabilities. The application provides a simple yet effective way to compress and decompress files with real-time feedback on compression ratios and file size reduction.

## ✨ Features

### Core Functionality
- **File Compression**: Compress any file type using GZIP algorithm
- **File Decompression**: Decompress .gz files back to their original format
- **Universal File Support**: Works with any file type (text, images, videos, documents, etc.)
- **Smart Extension Handling**: User can specify the original file extension during decompression

### User Experience
- **Intuitive GUI**: Clean, dark-themed interface with easy-to-use buttons
- **File Browser Integration**: Built-in file chooser for selecting files
- **Real-time Feedback**: Instant notifications for successful operations
- **Compression Statistics**: Shows original file size, compressed size, and compression ratio
- **Error Handling**: Comprehensive error messages for better user experience

### Technical Features
- **Efficient Buffer Management**: Uses 1KB buffer for optimal memory usage
- **Stream-based Processing**: Handles large files without memory overflow
- **Cross-platform Compatibility**: Works on any system with Java Runtime Environment

## 🛠️ Technologies Used

### Core Technologies
- **Java SE**: Primary programming language
- **Java Swing**: GUI framework for desktop interface
- **GZIP (java.util.zip)**: Compression algorithm implementation
- **File I/O (java.io)**: File handling and stream operations

### Development Tools
- **NetBeans IDE**: Integrated development environment
- **Ant Build System**: Project build and deployment
- **Java AWT**: Additional GUI components and event handling

## 🎯 Learning Outcomes

### Technical Skills Developed
1. **GUI Development**: Created responsive desktop applications using Java Swing
2. **File Handling**: Implemented robust file I/O operations with proper resource management
3. **Stream Processing**: Learned to work with compressed data streams
4. **Error Handling**: Implemented comprehensive exception handling
5. **User Experience Design**: Focused on creating intuitive and user-friendly interfaces

### Software Engineering Practices
- **Modular Design**: Separated concerns between GUI, compression logic, and file handling
- **Object-Oriented Programming**: Applied OOP principles for maintainable code
- **Event-Driven Programming**: Implemented action listeners and event handling
- **Resource Management**: Proper file stream closing and memory management

## 📁 Project Structure

```
CompressDecompress/
├── src/
│   ├── compress_decompress/
│   │   └── Compress_Decompress.java    # Main application entry point
│   ├── CodeFiles/
│   │   ├── Compress.java               # Compression logic
│   │   └── Decompress.java             # Decompression logic
│   └── GUI/
│       ├── View.java                   # Main GUI interface
│       └── filesizeview.java           # File size comparison dialog
├── dist/
│   └── Compress_Decompress.jar         # Compiled JAR file
├── app/
│   └── Compress_Decompress.exe         # Compiled executable
├── TestFolder/                         # Test files and examples
└── nbproject/                          # NetBeans project configuration
```

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (optional, for development)

### Running the Application

#### Option 1: Using the JAR File (Recommended)
1. Navigate to the `dist/` directory
2. Run the JAR file:
   ```bash
   java -jar Compress_Decompress.jar
   ```
   *Alternative for Windows users: Run `Compress_Decompress.exe` from the `app/` directory*

#### Option 2: From Source Code
1. Clone the repository
2. Open the project in NetBeans IDE
3. Build and run the project
4. Or compile manually:
   ```bash
   javac -cp src src/compress_decompress/Compress_Decompress.java
   java -cp src compress_decompress.Compress_Decompress
   ```

## 💡 How It Works

### Compression Process
1. User selects a file using the file browser
2. Application reads the file in 1KB chunks
3. Data is compressed using GZIP algorithm
4. Compressed file is saved as `compressedfile.gz`
5. Statistics popup shows compression ratio and file size reduction

### Decompression Process
1. User selects a `.gz` file
2. Application prompts for the original file extension
3. File is decompressed using GZIP input stream
4. Decompressed file is saved as `uncompressedfile.[extension]`
5. Success message confirms completion

## 🔧 Key Improvements Made

Throughout the development process, several enhancements were implemented:

1. **File Location Selection**: Added ability to choose file locations
2. **User Feedback**: Implemented popup messages for operation completion
3. **Extension Management**: Added custom file extension specification
4. **File Type Support**: Extended compatibility to all file types
5. **UI Enhancements**: Improved visual design and user experience
6. **Compression Analytics**: Added file size comparison and reduction statistics

## 🎯 Future Enhancements

- **Huffman Encoding**: Implement alternative compression algorithms
- **Batch Processing**: Support for compressing multiple files
- **Drag & Drop**: Enable file drag-and-drop functionality
- **Progress Bar**: Show compression/decompression progress
- **Configuration Options**: Allow users to customize compression settings

## 🤝 Contributing

This is a portfolio project, but suggestions and improvements are welcome! Feel free to:
- Report issues
- Suggest new features
- Submit pull requests

## 📄 License

This project is created for educational and portfolio purposes.

## 👨‍💻 Author

**Rhythin** - Portfolio Project

---

*This project demonstrates practical Java development skills including GUI programming, file handling, and user experience design. It serves as an example of creating functional desktop applications with modern software engineering practices.* 