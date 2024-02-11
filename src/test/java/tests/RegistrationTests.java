package tests;

import org.junit.jupiter.api.Test;

public class RegistrationTests extends TestBase {

    @Test
    void successfulRegistrationTest() {
        String firstName = "Sergey",
                lastName = "Konoplev",
                fullName = firstName + " " + lastName,
                userEmail = "sergeyKonoplev@gmail.com",
                gender = "Male",
                userNumber = "9875036934",
                dayOfBirth = "08",
                monthOfBirth = "May",
                yearOfBirth = "1996",
                fullDateOfBirth = dayOfBirth + " " + monthOfBirth + "," + yearOfBirth,
                subjects = "Maths",
                hobbies = "Sports",
                picture = "img/1.png",
                verifyPicture = "1.png",
                currentAddress = "Russia",
                state = "NCR",
                city = "Delhi",
                stateAndCity = state + " " + city;

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(gender)
                .setNumber(userNumber)
                .setBirthDay(dayOfBirth, monthOfBirth, yearOfBirth)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setUploadPic(picture)
                .setCurrentAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .setSubmit();

        registrationPage.verifyResultModalAppears()
                .verifyResults("Student Name", fullName)
                .verifyResults("Student Email", userEmail)
                .verifyResults("Gender", gender)
                .verifyResults("Mobile", userNumber)
                .verifyResults("Date of Birth", fullDateOfBirth)
                .verifyResults("Subjects", subjects)
                .verifyResults("Hobbies", hobbies)
                .verifyResults("Picture", verifyPicture)
                .verifyResults("Address", currentAddress)
                .verifyResults("State and City", stateAndCity);
    }
}


