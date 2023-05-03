package org.example;

import org.openqa.selenium.By;

public class CameraAndPhoto extends Utils{
    // Click on Leica T Mirrorless Digital Camera
    By _leicaTMirrorlessDigitalCamera = By.linkText("Leica T Mirrorless Digital Camera");
    public void leicaTMirrorlessDigitalCamera() {
        clickOnElement(_leicaTMirrorlessDigitalCamera);
    }
}
