package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils{
    // Click on Camera & photo
    By _cameraAndPhoto = By.linkText("Camera & photo");
    public void CameraAndPhoto(){
        clickOnElement(_cameraAndPhoto);
    }
}
