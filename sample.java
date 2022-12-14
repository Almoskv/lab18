<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.*?>
<?import javafx.scene.layout.*?>


<GridPane alignment="center" hgap="10" prefHeight="266.0" prefWidth="305.0" vgap="10" xmlns:fx="http://javafx.com/fxml/1" xmlns="http://javafx.com/javafx/8.0.202" fx:controller="lab18.Controller">
   <children>
      <Pane prefHeight="283.0" prefWidth="305.0">
         <children>
            <TextArea fx:id="chatMessage" prefHeight="266.0" prefWidth="305.0" />
            <TextField fx:id="chatText" layoutX="14.0" layoutY="227.0" prefHeight="25.0" prefWidth="216.0" />
            <Button fx:id="chatSend" layoutX="239.0" layoutY="227.0" mnemonicParsing="false" onAction="#sendMessage" prefHeight="25.0" prefWidth="55.0" text="Send" />
         </children>
      </Pane>
   </children>
</GridPane>