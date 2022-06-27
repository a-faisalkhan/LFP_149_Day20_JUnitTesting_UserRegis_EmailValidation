package com.bridgelabz.junittest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.junit.JunitUserRegistration;

import junit.framework.Assert;

public class JunitUserRegistrationTest {

    JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.firstName("Faisal");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.firstName("FaisalA");
        assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.lastName("Ahmad");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.lastName("AhmaD");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.emailId("kfaisalit@gmail.com");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.emailId("faisal.ahmad2012.@gmail.com");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.mobileNumber("91 9988776655");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.mobileNumber("919988776655");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule1("abhtlkykl");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule1("otfdodFopt");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenPasswordRule2_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule2("sfkjsdFAjdlkg");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule2_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule2("lkjgsytrjnd");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenPasswordRule3_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule3("lk96lFKlut");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule3_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule3("bnepahjyu");
        assertEquals(false, actualResult);
    }
    
    @Test
    public void givenPasswordRule4_IsProper_ReturnTrue() {
        boolean actualResult = junitUserRegistration.passwordRule4("kh63oFS@&op");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule4_IsNotProper_ReturnFalse() {
        boolean actualResult = junitUserRegistration.passwordRule4("lsdfjslkdg");
        assertEquals(false, actualResult);
    }
}

