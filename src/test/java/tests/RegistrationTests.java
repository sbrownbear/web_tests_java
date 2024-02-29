package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegistrationTests extends TestBase {

    TestData data = new TestData();

    @Test
    @Tag("Smoke")
    @Feature("Создание аккаунта пользователя в системе")
    @Owner("Коноплев Сергей")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "DemoQA", url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Авторизация пользователя")
    void successfulRegistrationTest() {

        registrationPage.openPage()
                .setFirstName(data.firstNameData)
                .setLastName(data.lastNameData)
                .setEmail(data.userEmailData)
                .setGender(data.genderData)
                .setNumber(data.userNumberData)
                .setBirthDay(data.dayOfBirthData, data.monthOfBirthData, data.yearOfBirthData)
                .setSubjects(data.subjectsData)
                .setHobbies(data.hobbiesData)
                .setUploadPic(data.pictureData)
                .setCurrentAddress(data.currentAddressData)
                .setState(data.stateData)
                .setCity(data.cityData)
                .setSubmit();

        registrationPage.verifyResultModalAppears()
                .verifyResults("Student Name", data.fullNameDate)
                .verifyResults("Student Email", data.userEmailData)
                .verifyResults("Gender", data.genderData)
                .verifyResults("Mobile", data.userNumberData)
                .verifyResults("Date of Birth", data.fullDateOfBirthData)
                .verifyResults("Subjects", data.subjectsData)
                .verifyResults("Hobbies", data.hobbiesData)
                .verifyResults("Picture", data.verifyPictureData)
                .verifyResults("Address", data.currentAddressData)
                .verifyResults("State and City", data.stateAndCityData);
    }

    @Test
    @Tag("Smoke")
    @Feature("Создание аккаунта пользователя в системе")
    @Owner("Коноплев Сергей")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "DemoQA", url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Авторизация пользователя")
    void unsuccessfulTest() {

        registrationPage.openPage()
                .setFirstName(data.firstNameData)
                .setLastName(data.lastNameData)
                .setEmail(data.userEmailData)
                .setGender(data.genderData)
                .setNumber(data.userEmailData) // error
                .setBirthDay(data.dayOfBirthData, data.monthOfBirthData, data.yearOfBirthData)
                .setSubjects(data.subjectsData)
                .setHobbies(data.hobbiesData)
                .setUploadPic(data.pictureData)
                .setCurrentAddress(data.currentAddressData)
                .setState(data.stateData)
                .setCity(data.cityData)
                .setSubmit();

        registrationPage.verifyResultModalAppears()
                .verifyResults("Student Name", data.fullNameDate)
                .verifyResults("Student Email", data.userEmailData)
                .verifyResults("Gender", data.genderData)
                .verifyResults("Mobile", data.userNumberData)
                .verifyResults("Date of Birth", data.fullDateOfBirthData)
                .verifyResults("Subjects", data.subjectsData)
                .verifyResults("Hobbies", data.hobbiesData)
                .verifyResults("Picture", data.verifyPictureData)
                .verifyResults("Address", data.currentAddressData)
                .verifyResults("State and City", data.stateAndCityData);
    }

    @Test
    @Tag("Smoke")
    @Feature("Создание аккаунта пользователя в системе")
    @Owner("Коноплев Сергей")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "DemoQA", url = "https://demoqa.com/automation-practice-form")
    @DisplayName("Авторизация пользователя")
    @Disabled("Пропускаем тест по какой-либо причине")
    void skipTest() {
        registrationPage.openPage()
                .setFirstName(data.firstNameData)
                .setLastName(data.lastNameData)
                .setEmail(data.userEmailData)
                .setGender(data.genderData)
                .setNumber(data.userEmailData) // error
                .setBirthDay(data.dayOfBirthData, data.monthOfBirthData, data.yearOfBirthData)
                .setSubjects(data.subjectsData)
                .setHobbies(data.hobbiesData)
                .setUploadPic(data.pictureData)
                .setCurrentAddress(data.currentAddressData)
                .setState(data.stateData)
                .setCity(data.cityData)
                .setSubmit();

        registrationPage.verifyResultModalAppears()
                .verifyResults("Student Name", data.fullNameDate)
                .verifyResults("Student Email", data.userEmailData)
                .verifyResults("Gender", data.genderData)
                .verifyResults("Mobile", data.userNumberData)
                .verifyResults("Date of Birth", data.fullDateOfBirthData)
                .verifyResults("Subjects", data.subjectsData)
                .verifyResults("Hobbies", data.hobbiesData)
                .verifyResults("Picture", data.verifyPictureData)
                .verifyResults("Address", data.currentAddressData)
                .verifyResults("State and City", data.stateAndCityData);
    }
}


