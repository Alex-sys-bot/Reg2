package sample;


import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Module {

    public void createFile(String pathFile, String nameFile, String extend, String sureName, String name, String patronymic, String course) throws IOException {
        File newFile = new File( pathFile + "/" + nameFile + "." + extend);
        newFile.createNewFile();
        FileWriter fw = new FileWriter(newFile);

        fw.write("Вы успешно зарегистрировались под данными: " + "" + sureName + "" + name + "" +  patronymic + "\n" + "Вы подписались на курсы по: " + course + " ");
        fw.close();
    }

    public void selPath(TextField textPath){
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Выберите путь к файлу");
        File dir = directoryChooser.showDialog(new Stage());

        if (!(dir == null)){
            textPath.setText(dir.getAbsolutePath());
        }
    }


    public void selFile(String pathFile, String nameFile, String extend) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File file = new File(pathFile + "/" + nameFile + "." + extend);

        if (!(file == null)){
            desktop.open(file);
        }
    }


}
