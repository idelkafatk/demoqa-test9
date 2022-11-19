package guru.qa.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTest {

    @Test
    void fillFormTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("name");
        $("#userEmail").setValue("email@ru.com");
        $("#currentAddress").setValue("address");
        $("#permanentAddress").setValue("permanent");
        $("#submit").scrollIntoView(true).click();

        $("#output #name").shouldHave(text("name"));
        $("#output #email").shouldHave(text("email@ru.com"));
        $("#output #currentAddress").shouldHave(text("address"));
        $("#output #permanentAddress").shouldHave(text("permanent"));
    }
}
