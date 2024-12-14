package ru.rrenat358.lesson_07.uiReg;



//ParaBank | Register for Free Online Account Access
//https://parabank.parasoft.com/parabank/register.htm


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class UiRegTest {

    String BASE_URL = "https://parabank.parasoft.com/parabank/register.htm";

    SelenideElement login = $("customer.username");

    SelenideElement submit = $(new ByAttribute("value","Register"));



    public UiRegTest open() {
        Selenide.open(BASE_URL);
        submit.shouldBe(Condition.visible, Duration.ofSeconds(30));


        return this;
    }


    public UiRegTest reg(Acc acc) {
        login.val(acc.getLogin());
        submit.click();
        return this;
    }

}
