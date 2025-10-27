package org.example.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAndroidDriver {
    private static AppiumDriver<MobileElement> driver;

    private AppiumAndroidDriver(){}

    public static AppiumDriver<MobileElement> getDriver(){
        if (driver == null || driver.getSessionId() == null){
            inicializarDriver();
        }
        return driver;
    }

    private static void inicializarDriver(){
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Nombre_Del_Dispositivo");
            capabilities.setCapability("platformName","Sistema_Operativo");
            capabilities.setCapability("newCommandTimeout",300);
            capabilities.setCapability("platformVersion", "Numero_De_Versión");
            capabilities.setCapability("appPackage","Package de la app");
            capabilities.setCapability("appActivity","Activity de la app");
            capabilities.setCapability("autoGrantPermissions", true);
            capabilities.setCapability("noReset", true);


            driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


        }catch (MalformedURLException e){
            throw new RuntimeException("Error al incializar el driver de Appium", e);
        }
    }



}
