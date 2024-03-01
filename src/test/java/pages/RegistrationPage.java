package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            numberInput = $("#userNumber"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            subjectInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            uploadPicInput = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            clickStateInput = $("#state"),
            stateInput = $("#stateCity-wrapper"),
            clickCityInput = $("#city"),
            cityInput = $("#stateCity-wrapper"),
            clickSubmitInput = $("#submit");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper")
                .shouldHave(text("Student Registration Form"));
        Selenide.executeJavaScript("$('#RightSide_Advertisement').remove()");
        Selenide.executeJavaScript("$('#fixedban').remove()");
        Selenide.executeJavaScript("$('footer').remove()");
        $(byText("Consent")).click();
        return this;
    }


    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setNumber(String value) {
        numberInput.setValue(value);
        return this;
    }

    public RegistrationPage setBirthDay(String day, String month, String year) {
        dateOfBirthInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationPage setSubjects(String value) {
        subjectInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setUploadPic(String value) {
        uploadPicInput.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage setCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationPage setState(String value) {
        clickStateInput.click();
        stateInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setCity(String value) {
        clickCityInput.click();
        cityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setSubmit() {
        clickSubmitInput.click();
        return this;
    }


    public RegistrationPage verifyResultModalAppears() {
        registrationResultsModal.verifyModalAppears();
        return this;
    }

    public RegistrationPage verifyResults(String key, String value) {
        registrationResultsModal.verifyResults(key, value);
        return this;
    }

}
