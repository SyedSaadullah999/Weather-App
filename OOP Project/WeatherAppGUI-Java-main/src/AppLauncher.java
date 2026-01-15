import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run(){
                // displaying our weather app graphical Uesr Interface
                new WeatherAppGui().setVisible(true);
                //Just to check that class is created Corrected
                //System.out.println(WeatherApp.getLocationData("Tokyo"));
                //System.out.println(WeatherApp.getCurrentTime());

            }
        });
    }
}
