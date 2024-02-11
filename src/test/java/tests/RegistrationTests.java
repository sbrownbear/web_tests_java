package tests;

import org.junit.jupiter.api.Test;

public class RegistrationTests extends TestBase {

    TestData data = new TestData();

    @Test
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
}


