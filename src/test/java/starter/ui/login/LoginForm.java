package starter.ui.login;

import org.openqa.selenium.By;

public class LoginForm {
    public static By USERNAME_FIELD = By.id("username");
    public static By PASSWORD_FIELD = By.id("password");
    public static By LOGIN_BUTTON = By.id("log-in");
    public static By REMEMBER_ME = By.cssSelector("input.form-check-input");
}
